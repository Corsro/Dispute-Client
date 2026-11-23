package gg.corz;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lilllIiliilllIil {
   private static volatile Path iIiIiIlIil = null;
   private static final String iilIiIlIil = "preset-seal.key";
   private static final String IIiIiIlIil = "corz-own-preset-v1";
   private static Path lIiIiIlIil = null;
   private static volatile Path IliIiIlIil;
   private static final String IilIiIlIil = "sources.json";
   private static volatile byte[] IiiIiIlIil;
   private static volatile Path iliIiIlIil;
   private static volatile Path lliIiIlIil;
   private static final String lilIiIlIil = "ownSeal";
   public static final String IllIiIlIil = ".corz.json";
   private static final String lllIiIlIil = "active.txt";
   private static final String illIiIlIil = ".backup.corz.json";

   public static String Iilililiiili(String slug) {
      lIlIllIliIlIllIl var1 = iliIiiliiiii(slug);
      if (var1 == null) {
         return null;
      } else {
         lIlIllIliIlIllIl var2 = var1.IIlllIlliIll();
         var2.iiililIiIl = (var1.iiililIiIl == null ? iIIilIlIil<invokedynamic>() : var1.iiililIiIl) + iIIilIlIil<invokedynamic>();
         var2.iIIiilIiIl = illIlIilIl();
         return IIlllIlliIll(var2);
      }
   }

   private static void IIiIllIiIl(String slug) {
      JsonObject var1 = IIllllIlll();
      if (var1.has(slug) && var1.get(slug).isJsonObject() && var1.getAsJsonObject(slug).has(iIIilIlIil<invokedynamic>())) {
         var1.getAsJsonObject(slug).remove(iIIilIlIil<invokedynamic>());
         iIlllIllll(var1);
      }

   }

   // $FF: synthetic method
   private static CallSite Illillllil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) << 1 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) >>> 15) >>> 6 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) << 1 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) >>> 15) << 10))))) >>> 6 | (char)(~((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) << 1 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) >>> 15) >>> 6 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) << 1 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf1d1') << 11 | (char)(var4[var5] - '\uf1d1') >>> 5) ^ 31120) ^ var5) ^ var5) ^ var5))) << 10))) ^ var5) >>> 15) << 10))))) << 10) ^ var5) - 'ꋧ') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static JsonObject IIllllIlll() {
      try {
         Path var0 = iIlIlllllill().resolve(iIIilIlIil<invokedynamic>());
         if (!Files.exists(var0, new LinkOption[0])) {
            return new JsonObject();
         } else {
            JsonElement var1 = JsonParser.parseString(Files.readString(var0));
            return var1.isJsonObject() ? var1.getAsJsonObject() : new JsonObject();
         }
      } catch (Exception var2) {
         return new JsonObject();
      }
   }

   private static byte[] IlIllllIll(Path file) {
      try {
         if (!Files.isRegularFile(file, new LinkOption[0])) {
            return null;
         } else {
            String var1 = Files.readString(file, StandardCharsets.US_ASCII).trim();
            return var1.length() == 64 ? HexFormat.of().parseHex(var1) : null;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIilliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udc1b') << 11 | (char)(var4[var5] ^ '\udc1b') >>> 5) - var5) ^ var5) - var5) ^ var5) - var5) - 4277))))) + var5) + var5) ^ 27308) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIliliIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) + '싌') + var5) >>> 15 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) + '싌') + var5) << 1) ^ var5) - '줌') - var5) ^ '\ue6db') + var5) + var5) ^ 16682) - '혭') + '饽') + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IIIIllIIIl() {
      try {
         Path var0 = iIlIlllllill().resolve(iIIilIlIil<invokedynamic>());
         if (!Files.exists(var0, new LinkOption[0])) {
            return null;
         } else {
            String var1 = Files.readString(var0).trim();
            return var1.isEmpty() ? null : var1;
         }
      } catch (IOException var2) {
         return null;
      }
   }

   public static boolean IlIlllIlilIl(String slug) {
      try {
         Path var1 = IiIIlliIIl(slug);
         return Files.isRegularFile(var1, new LinkOption[0]) && iIiIlIliIl(slug, Files.readAllBytes(var1));
      } catch (IOException var2) {
         return false;
      }
   }

   private lilllIiliilllIil() {
   }

   private static byte[] lIIlliIIll() {
      Path var0 = ilIllIiIll();
      byte[] var1 = IiiIiIlIil;
      if (var1 != null && var0.equals(iliIiIlIil)) {
         return var1;
      } else {
         synchronized(lilllIiliilllIil.class) {
            byte[] var3 = IlIllllIll(var0);
            if (var3 == null) {
               byte[] var4 = new byte[32];
               (new SecureRandom()).nextBytes(var4);

               try {
                  iiIIlIIlIl(var0, HexFormat.of().formatHex(var4).getBytes(StandardCharsets.US_ASCII));
               } catch (IOException var7) {
                  return null;
               }

               var3 = IlIllllIll(var0);
            }

            if (var3 != null) {
               IiiIiIlIil = var3;
               iliIiIlIil = var0;
            }

            return var3;
         }
      }
   }

   public static void iilllIIill(String m, IillilIilillilIi slug) {
      JsonObject var2 = IIllllIlll();
      JsonObject var3 = var2.has(m) && var2.get(m).isJsonObject() ? var2.getAsJsonObject(m) : null;
      JsonObject var4 = new JsonObject();
      var4.addProperty(iIIilIlIil<invokedynamic>(), slug.lllIillIIi.name());
      if (slug.illIillIIi != null) {
         var4.addProperty(iIIilIlIil<invokedynamic>(), slug.illIillIIi);
      }

      if (slug.IilIillIIi != null) {
         var4.addProperty(iIIilIlIil<invokedynamic>(), slug.IilIillIIi);
      }

      if (slug.lilIillIIi != null) {
         var4.addProperty(iIIilIlIil<invokedynamic>(), slug.lilIillIIi);
      }

      if (slug.iilIillIIi != null) {
         var4.addProperty(iIIilIlIil<invokedynamic>(), slug.iilIillIIi);
      }

      if (slug.lllIillIIi == ilIIIllIiIIIll.IlIIlIIilllIIlIIil && var3 != null && var3.has(iIIilIlIil<invokedynamic>())) {
         var4.add(iIIilIlIil<invokedynamic>(), var3.get(iIIilIlIil<invokedynamic>()));
      }

      var2.add(m, var4);
      iIlllIllll(var2);
   }

   private static boolean iIiIlIliIl(String bytes, byte[] slug) {
      JsonObject var2 = IIllllIlll();
      if (var2.has(bytes) && var2.get(bytes).isJsonObject()) {
         JsonObject var3 = var2.getAsJsonObject(bytes);
         if (!ilIIIllIiIIIll.IlIIlIIilllIIlIIil.name().equals(lIilliIill(var3, iIIilIlIil<invokedynamic>()))) {
            return false;
         } else {
            String var4 = lIilliIill(var3, iIIilIlIil<invokedynamic>());
            if (var4 == null) {
               return false;
            } else {
               String var5 = lliIliliIl(bytes, slug);
               return var5 != null && MessageDigest.isEqual(var5.getBytes(StandardCharsets.UTF_8), var4.getBytes(StandardCharsets.UTF_8));
            }
         }
      } else {
         return false;
      }
   }

   public static byte[] llIIlilIIl() {
      Path var0 = iIlIlllllill().resolve(iIIilIlIil<invokedynamic>());
      return Files.exists(var0, new LinkOption[0]) ? Files.readAllBytes(var0) : null;
   }

   public static void Iiiiliiiiiii(String slug) {
      iiIIlIIlIl(iIlIlllllill().resolve(iIIilIlIil<invokedynamic>()), slug.getBytes(StandardCharsets.UTF_8));
   }

   public static Path IiIIlliIIl(String slug) {
      return iIlIlllllill().resolve(slug + iIIilIlIil<invokedynamic>());
   }

   private static void lilIliilIl(String fresh, byte[] slug, boolean bytes) {
      JsonObject var3 = IIllllIlll();
      JsonObject var4 = !bytes && var3.has(fresh) && var3.get(fresh).isJsonObject() ? var3.getAsJsonObject(fresh) : new JsonObject();
      var4.addProperty(iIIilIlIil<invokedynamic>(), ilIIIllIiIIIll.IlIIlIIilllIIlIIil.name());
      String var5 = lliIliliIl(fresh, slug);
      if (var5 != null) {
         var4.addProperty(iIIilIlIil<invokedynamic>(), var5);
      } else {
         var4.remove(iIIilIlIil<invokedynamic>());
      }

      var3.add(fresh, var4);
      iIlllIllll(var3);
   }

   private static String lliIliliIl(String slug, byte[] bytes) {
      return IiiIlliiIl(iIIilIlIil<invokedynamic>(), slug, bytes);
   }

   private static void IlIillIiilIi(String slug, lIlIllIliIlIllIl fresh, boolean profile) {
      IiIiliIiiiIi(fresh);
      byte[] var3 = fresh.iIlIlllllill();
      IIiIllIiIl(slug);
      iiIIlIIlIl(IiIIlliIIl(slug), var3);
      lilIliilIl(slug, var3, profile);
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1085453783297230573L ^ Long.rotateLeft(429973271594505097L, 62) ^ -5151110816949244370L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5847242192401724966L ^ Long.rotateLeft(-6561456046911955003L, 8) ^ -7046067950983961938L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7319438337294263255L ^ Long.rotateLeft(1406587790305141814L, 2) ^ -350616310268596899L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1894054140580849306L ^ Long.rotateLeft(3460401824379326780L, 49) ^ 1601815498880298192L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4619904471198659881L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1714777771712508019L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3752476620343279374L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1583092575502021156L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2219270845114307864L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -641883800282651702L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(llIililIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIilliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiIilIIlil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIliliIlil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillllil<invokedynamic>());
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

   static Path iiiIlIIIll() {
      return ilIllIiIll().toAbsolutePath().getParent();
   }

   public static List<IlIIillllIIill> lIiiIiIlilli() {
      ArrayList var0 = new ArrayList();
      Path var1 = iIlIlllllill();

      try {
         Stream var2 = Files.list(var1);

         try {
            var2.filter((p) -> p.getFileName().toString().endsWith(iIIilIlIil<invokedynamic>())).filter((p) -> !p.getFileName().toString().equals(iIIilIlIil<invokedynamic>())).forEach((out) -> {
               try {
                  byte[] var2 = Files.readAllBytes(out);
                  lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(var2, (iliiIIllIiiiIIll[])null);
                  if (var3 != null) {
                     var0.add(new IlIIillllIIill(out, var3));
                  }
               } catch (IOException var4) {
               }

            });
         } catch (Throwable var6) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if (var2 != null) {
            var2.close();
         }
      } catch (IOException var7) {
      }

      var0.sort(Comparator.comparing((e) -> e.IIIIilIIilIIIilIIi.IlIiilIiIl == null ? "" : e.IIIIilIIilIIIilIIi.IlIiilIiIl).reversed());
      return var0;
   }

   public static liiilIliiiilIl IIIllIIliIIl(String slug) {
      Path var1 = IiIIlliIIl(slug);
      if (!Files.exists(var1, new LinkOption[0])) {
         return null;
      } else {
         byte[] var2 = Files.readAllBytes(var1);
         lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(var2, (iliiIIllIiiiIIll[])null);
         return var3 == null ? null : new liiilIliiiilIl(slug, var3, iIiIlIliIl(slug, var2));
      }
   }

   private static String lIlIliIlIl(String name) {
      long var4 = -684844606349530624L;
      String var1 = IllIllllIl(name);
      String var2 = var1;

      StringBuilder var10000;
      int var10001;
      for(long var6 = var4 ^ (8589934592L ^ var4) & -1L << 32; Files.exists(IiIIlliIIl(var2), new LinkOption[0]); var2 = var10000.append(var10001).toString()) {
         var10000 = (new StringBuilder()).append(var1).append(iIIilIlIil<invokedynamic>());
         var10001 = (int)(var6 >>> 32);
         var6 += 4294967296L;
      }

      return var2;
   }

   private static void iIlllIllll(JsonObject all) {
      iiIIlIIlIl(iIlIlllllill().resolve(iIIilIlIil<invokedynamic>()), (new GsonBuilder()).setPrettyPrinting().create().toJson(all).getBytes(StandardCharsets.UTF_8));
   }

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') << 4 | (char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') >>> 12) - 21300))) >>> 12 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') << 4 | (char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') >>> 12) - 21300))) << 4) + '醆') - var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') << 4 | (char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') >>> 12) - 21300))) >>> 12 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') << 4 | (char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + 9988) ^ '쐠') + '騜') >>> 12) - 21300))) << 4) + '醆') - var5) << 2) ^ 28589) + var5) - 29661) ^ 31877) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IiIlliIliiIl(String slug) {
      return Files.exists(IiIIlliIIl(slug), new LinkOption[0]);
   }

   private static Path ilIllIiIll() {
      Path var0 = iIiIiIlIil;
      if (var0 != null) {
         return var0;
      } else if (lIiIiIlIil != null) {
         return lIiIiIlIil.resolve(iIIilIlIil<invokedynamic>());
      } else {
         Path var1 = liIlliiIll();
         return (var1 != null ? var1 : IilliliilIIi()).resolve(iIIilIlIil<invokedynamic>()).resolve(iIIilIlIil<invokedynamic>());
      }
   }

   public static IillilIilillilIi lllllillll(String slug) {
      IillilIilillilIi var1 = new IillilIilillilIi();
      JsonObject var2 = IIllllIlll();
      if (var2.has(slug) && var2.get(slug).isJsonObject()) {
         JsonObject var3 = var2.getAsJsonObject(slug);

         try {
            var1.lllIillIIi = ilIIIllIiIIIll.valueOf(var3.get(iIIilIlIil<invokedynamic>()).getAsString());
         } catch (Exception var5) {
         }

         var1.illIillIIi = lIilliIill(var3, iIIilIlIil<invokedynamic>());
         var1.IilIillIIi = lIilliIill(var3, iIIilIlIil<invokedynamic>());
         var1.lilIillIIi = lIilliIill(var3, iIIilIlIil<invokedynamic>());
         var1.iilIillIIi = lIilliIill(var3, iIIilIlIil<invokedynamic>());
      }

      return var1;
   }

   static String Iiilliiliiil(lIlIllIliIlIllIl profile) {
      String var1 = lIlIliIlIl(profile.iiililIiIl);
      IlIillIiilIi(var1, profile, true);
      return var1;
   }

   public static String Illlllllilll(lIlIllIliIlIllIl profile, String communityId) {
      String var2 = Iilllilliill(communityId);
      return IIillIiliIil(var2 != null && !IlIlllIlilIl(var2) ? var2 : lIlIliIlIl(profile.iiililIiIl), profile);
   }

   public static String Iilllilliill(String communityId) {
      if (communityId != null && !communityId.isBlank()) {
         for(Map.Entry var2 : IIllllIlll().entrySet()) {
            if (((JsonElement)var2.getValue()).isJsonObject()) {
               String var3 = lIilliIill(((JsonElement)var2.getValue()).getAsJsonObject(), iIIilIlIil<invokedynamic>());
               if (communityId.equals(var3) && IiIlliIliiIl((String)var2.getKey())) {
                  return (String)var2.getKey();
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static void Ililllililil(String slug, lIlIllIliIlIllIl profile) {
      IIillIiliIil(slug, profile);
   }

   // $FF: synthetic method
   private static CallSite iiIilIIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 3 | (char)(var4[var5] << 3 | var4[var5] >>> 13) << 13) - '\ueda9') + 22974) - var5) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 3 | (char)(var4[var5] << 3 | var4[var5] >>> 13) << 13) - '\ueda9') + 22974) - var5) ^ var5) + var5) << 11) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 3 | (char)(var4[var5] << 3 | var4[var5] >>> 13) << 13) - '\ueda9') + 22974) - var5) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 3 | (char)(var4[var5] << 3 | var4[var5] >>> 13) << 13) - '\ueda9') + 22974) - var5) ^ var5) + var5) << 11) >>> 7) ^ 21574) - '聱') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void Iillllilll(String oldSlug, String newSlug) {
      JsonObject var2 = IIllllIlll();
      if (var2.has(oldSlug)) {
         JsonElement var3 = var2.remove(oldSlug);
         var2.add(newSlug, var3);
         iIlllIllll(var2);
      }
   }

   private static String IIillIiliIil(String slug, lIlIllIliIlIllIl profile) {
      IiIiliIiiiIi(profile);
      IIiIllIiIl(slug);
      iiIIlIIlIl(IiIIlliIIl(slug), profile.iIlIlllllill());
      return slug;
   }

   public static lIlIllIliIlIllIl iliIiiliiiii(String slug) {
      Path var1 = IiIIlliIIl(slug);
      return !Files.exists(var1, new LinkOption[0]) ? null : lIlIllIliIlIllIl.lIiiIiIlilli(Files.readAllBytes(var1), (iliiIIllIiiiIIll[])null);
   }

   public static Path iIlIlllllill() {
      Path var0 = lIiIiIlIil != null ? lIiIiIlIil : IilliliilIIi().resolve(iIIilIlIil<invokedynamic>()).resolve(iIIilIlIil<invokedynamic>());
      if (!var0.equals(lliIiIlIil)) {
         try {
            Files.createDirectories(var0);
            lliIiIlIil = var0;
         } catch (IOException var2) {
         }
      }

      return var0;
   }

   public static lIlIllIliIlIllIl Iliilliiilii(byte[] resultOut, iliiIIllIiiiIIll[] bytes, String[] slugOut) {
      lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(resultOut, bytes);
      if (var3 == null) {
         return null;
      } else {
         String var4 = IIlllIlliIll(var3);
         if (slugOut != null && slugOut.length > 0) {
            slugOut[0] = var4;
         }

         return var3;
      }
   }

   public static boolean IIlilIliiIli(String slug) {
      long var3 = -5370982412892754174L;
      var3 ^= ((long)Files.deleteIfExists(IiIIlliIIl(slug)) << 32 ^ var3) & -1L << 32;

      try {
         JsonObject var2 = IIllllIlll();
         if (var2.remove(slug) != null) {
            iIlllIllll(var2);
         }
      } catch (IOException var5) {
      }

      return (boolean)((int)(var3 >>> 32));
   }

   private static String illIlIilIl() {
      return OffsetDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS).toString();
   }

   public static String IIlllIlliIll(lIlIllIliIlIllIl profile) {
      return IIillIiliIil(lIlIliIlIl(profile.iiililIiIl), profile);
   }

   public static void IliIlllilIi(Path dir) {
      lIiIiIlIil = dir;
   }

   static String IiiIlliiIl(String label, String bytes, byte[] context) {
      byte[] var3 = lIIlliIIll();
      if (var3 == null) {
         return null;
      } else {
         try {
            Mac var4 = Mac.getInstance(iIIilIlIil<invokedynamic>());
            var4.init(new SecretKeySpec(var3, iIIilIlIil<invokedynamic>()));
            var4.update((label + iIIilIlIil<invokedynamic>() + bytes + iIIilIlIil<invokedynamic>()).getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(var4.doFinal(context));
         } catch (Exception var5) {
            return null;
         }
      }
   }

   public static lIlIllIliIlIllIl IIiilIiiiIii(byte[] resultOut, iliiIIllIiiiIIll[] bytes) {
      return Iliilliiilii(resultOut, bytes, (String[])null);
   }

   private static Path liIlliiIll() {
      try {
         String var0 = System.getProperty(iIIilIlIil<invokedynamic>(), "").toLowerCase(Locale.ROOT);
         if (var0.contains(iIIilIlIil<invokedynamic>())) {
            String var1 = System.getenv(iIIilIlIil<invokedynamic>());
            if (var1 != null && !var1.isBlank()) {
               return Path.of(var1);
            }
         }

         String var4 = System.getProperty(iIIilIlIil<invokedynamic>());
         if (var4 != null && !var4.isBlank()) {
            if (var0.contains(iIIilIlIil<invokedynamic>())) {
               return Path.of(var4, iIIilIlIil<invokedynamic>(), iIIilIlIil<invokedynamic>());
            } else {
               String var2 = System.getenv(iIIilIlIil<invokedynamic>());
               return var2 != null && !var2.isBlank() ? Path.of(var2) : Path.of(var4, iIIilIlIil<invokedynamic>());
            }
         } else {
            return null;
         }
      } catch (Exception var3) {
         return null;
      }
   }

   private static Path IilliliilIIi() {
      Path var0 = IliIiIlIil;
      if (var0 != null) {
         return var0;
      } else {
         try {
            Class var1 = Class.forName(iIIilIlIil<invokedynamic>());
            Object var2 = var1.getMethod(iIIilIlIil<invokedynamic>()).invoke((Object)null);
            Path var3 = (Path)var1.getMethod(iIIilIlIil<invokedynamic>()).invoke(var2);
            IliIiIlIil = var3;
            return var3;
         } catch (Throwable var4) {
            return Path.of(System.getProperty(iIIilIlIil<invokedynamic>()), iIIilIlIil<invokedynamic>());
         }
      }
   }

   private static void IiIiliIiiiIi(lIlIllIliIlIllIl profile) {
      profile.IlIiilIiIl = illIlIilIl();
      if (profile.iIIiilIiIl == null) {
         profile.iIIiilIiIl = profile.IlIiilIiIl;
      }

   }

   private static String IllIllllIl(String name) {
      String var1 = llIllIlilIllIl.IiIlliIliiIl(name == null ? "" : name);
      return var1.isEmpty() ? iIIilIlIil<invokedynamic>() : var1;
   }

   static void IIIilIIiiIIi(String slug, lIlIllIliIlIllIl profile) {
      IlIillIiilIi(slug, profile, false);
   }

   public static void iIIIlIlIIl(byte[] currentStateBytes) {
      iiIIlIIlIl(iIlIlllllill().resolve(iIIilIlIil<invokedynamic>()), currentStateBytes);
   }

   static void iiIIlIIlIl(Path bytes, byte[] dest) {
      Files.createDirectories(bytes.getParent());
      Path var2 = bytes.resolveSibling(bytes.getFileName().toString() + iIIilIlIil<invokedynamic>());
      Files.write(var2, dest, new OpenOption[0]);

      try {
         Files.move(var2, bytes, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } catch (IOException var4) {
         Files.move(var2, bytes, StandardCopyOption.REPLACE_EXISTING);
      }

   }

   public static String Illillliilli(String slug, String newName) {
      long var8 = -5225494902262777847L;
      Path var2 = IiIIlliIIl(slug);
      if (!Files.exists(var2, new LinkOption[0])) {
         return null;
      } else {
         byte[] var3 = Files.readAllBytes(var2);
         lIlIllIliIlIllIl var4 = lIlIllIliIlIllIl.lIiiIiIlilli(var3, (iliiIIllIiiiIIll[])null);
         if (var4 == null) {
            return null;
         } else {
            var8 ^= ((long)iIiIlIliIl(slug, var3) << 32 ^ var8) & -1L << 32;
            var4.iiililIiIl = newName;
            String var6 = lIlIliIlIl(newName);
            byte[] var7 = var4.iIlIlllllill();
            IIiIllIiIl(var6);
            iiIIlIIlIl(IiIIlliIIl(var6), var7);
            if (!var6.equals(slug)) {
               Files.deleteIfExists(var2);
               Iillllilll(slug, var6);
            }

            if ((int)(var8 >>> 32) != 0) {
               lilIliilIl(var6, var7, false);
            } else {
               IIiIllIiIl(var6);
            }

            return var6;
         }
      }
   }

   private static String lIilliIill(JsonObject k, String o) {
      return k.has(o) && k.get(o).isJsonPrimitive() ? k.get(o).getAsString() : null;
   }

   static void liiiIIllIl(Path file) {
      iIiIiIlIil = file;
      IiiIiIlIil = null;
      iliIiIlIil = null;
   }
}
