package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIlIllIliIlIllIl {
   @SerializedName("createdAt")
   public String iIIiilIiIl;
   @SerializedName("minecraftVersion")
   public String liililIiIl;
   @SerializedName("name")
   public String iiililIiIl;
   @SerializedName("content")
   public JsonObject ilIiilIiIl = new JsonObject();
   @SerializedName("updatedAt")
   public String IlIiilIiIl;
   @SerializedName("clientVersion")
   public String IiililIiIl;
   @SerializedName("description")
   public String IIIiilIiIl;
   @SerializedName("tags")
   public List<String> llIiilIiIl;
   @SerializedName("author")
   public String lIIiilIiIl;
   private static final Gson llililIiIl = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
   @SerializedName("formatVersion")
   public int ilililIiIl = 1;

   public String IilliliilIIi() {
      return llililIiIl.toJson(this);
   }

   public lIlIllIliIlIllIl IIlllIlliIll() {
      return iliIiiliiiii(JsonParser.parseString(this.IilliliilIIi()).getAsJsonObject());
   }

   public byte[] iIlIlllllill() {
      return llililIiIl.toJson(this).getBytes(StandardCharsets.UTF_8);
   }

   public static lIlIllIliIlIllIl iliIiiliiiii(JsonObject root) {
      lIlIllIliIlIllIl var1 = new lIlIllIliIlIllIl();
      var1.ilililIiIl = root.has(Illlllllilll<invokedynamic>()) ? root.get(Illlllllilll<invokedynamic>()).getAsInt() : 1;
      var1.IiililIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      var1.liililIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      var1.iiililIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      var1.IIIiilIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      var1.lIIiilIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      var1.iIIiilIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      var1.IlIiilIiIl = IiIlliIliiIl(root, Illlllllilll<invokedynamic>());
      if (root.has(Illlllllilll<invokedynamic>()) && root.get(Illlllllilll<invokedynamic>()).isJsonArray()) {
         var1.llIiilIiIl = new ArrayList();

         for(JsonElement var3 : root.getAsJsonArray(Illlllllilll<invokedynamic>())) {
            if (var3.isJsonPrimitive()) {
               var1.llIiilIiIl.add(var3.getAsString());
            }
         }
      }

      if (root.has(Illlllllilll<invokedynamic>()) && root.get(Illlllllilll<invokedynamic>()).isJsonObject()) {
         var1.ilIiilIiIl = root.getAsJsonObject(Illlllllilll<invokedynamic>()).deepCopy();
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2629747843860149933L ^ Long.rotateLeft(-6585574991467213136L, 25) ^ -8936789930692908989L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2885121663519945830L ^ Long.rotateLeft(8533110849762872976L, 63) ^ -4038629372917709273L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1204181675584117467L ^ Long.rotateLeft(8832672202068074659L, 37) ^ 7961528494025578738L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5554983462991846905L ^ Long.rotateLeft(-1644411361795076041L, 6) ^ -8983394738211306222L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2126931494224558130L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 638649325737339970L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4297152400631413657L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1787822186499100179L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2253238841739620921L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8532655774566123235L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   private static String IiIlliIliiIl(JsonObject k, String o) {
      return k.has(o) && k.get(o).isJsonPrimitive() ? k.get(o).getAsString() : null;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) + var5) ^ var5) >>> 5 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) + var5) ^ var5) << 11) ^ '칪') - 13467) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) + var5) ^ var5) >>> 5 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) + var5) ^ var5) << 11) ^ '칪') - 13467) >>> 2) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIIllIIliIIl() {
      return IlIlllIlilIl(this.iIlIlllllill());
   }

   public JsonObject liiiIIllIl(String key) {
      if (!this.ilIiilIiIl.has(key) || !this.ilIiilIiIl.get(key).isJsonObject()) {
         this.ilIiilIiIl.add(key, new JsonObject());
      }

      return this.ilIiilIiIl.getAsJsonObject(key);
   }

   public static String IlIlllIlilIl(byte[] bytes) {
      long var8 = -6402550536337174918L;
      long var10 = 8529577427040438045L;

      try {
         MessageDigest var1 = MessageDigest.getInstance(Illlllllilll<invokedynamic>());
         byte[] var2 = var1.digest(bytes);
         StringBuilder var3 = new StringBuilder(var2.length * 2);
         byte[] var4 = var2;
         var8 ^= ((long)var2.length << 32 ^ var8) & -1L << 32;

         for(long var14 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            var10 ^= ((long)var4[(int)var14] << 32 ^ var10) & -1L << 32;
            var3.append(Character.forDigit((int)(var10 >>> 32) >> 4 & 15, 16)).append(Character.forDigit((int)(var10 >>> 32) & 15, 16));
         }

         return var3.toString();
      } catch (Exception var12) {
         return "";
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(~((char)(var4[var5] + '膶'))) << 5 | (char)(~((char)(var4[var5] + '膶'))) >>> 11))))))) >>> 2 | (char)(~((char)(-((char)(-((char)((char)(~((char)(var4[var5] + '膶'))) << 5 | (char)(~((char)(var4[var5] + '膶'))) >>> 11))))))) << 14) - 13374))) - '\ue3dd') << 7 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(~((char)(var4[var5] + '膶'))) << 5 | (char)(~((char)(var4[var5] + '膶'))) >>> 11))))))) >>> 2 | (char)(~((char)(-((char)(-((char)((char)(~((char)(var4[var5] + '膶'))) << 5 | (char)(~((char)(var4[var5] + '膶'))) >>> 11))))))) << 14) - 13374))) - '\ue3dd') >>> 9) - '\udff5') ^ var5) - var5))) ^ 30660)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) << 15) + 22336) ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) << 15) + 22336) ^ var5) << 1))) - var5))) - 3355) << 13 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) << 15) + 22336) ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))) + '\ue718') + var5) - '룈')) << 15) + 22336) ^ var5) << 1))) - var5))) - 3355) >>> 3) ^ 8691))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIlIllIliIlIllIl lIiiIiIlilli(byte[] resultOut, iliiIIllIiiiIIll[] bytes) {
      JsonObject[] var2 = new JsonObject[1];
      iliiIIllIiiiIIll var3 = lIlIiiliIlIiil.liiiIIllIl(resultOut, var2);
      if (bytes != null && bytes.length > 0) {
         bytes[0] = var3;
      }

      return !var3.IliIlllilIi() ? null : iliIiiliiiii(var2[0]);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ '뙸') ^ 26871)) + '\ue1d6') - var5))))))) + 2071) << 8 | (char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ '뙸') ^ 26871)) + '\ue1d6') - var5))))))) + 2071) >>> 8) + var5) - '趾') >>> 14 | (char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ '뙸') ^ 26871)) + '\ue1d6') - var5))))))) + 2071) << 8 | (char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ '뙸') ^ 26871)) + '\ue1d6') - var5))))))) + 2071) >>> 8) + var5) - '趾') << 2))) - 22234));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject IliIlllilIi() {
      if (!this.ilIiilIiIl.has(Illlllllilll<invokedynamic>()) || !this.ilIiilIiIl.get(Illlllllilll<invokedynamic>()).isJsonObject()) {
         this.ilIiilIiIl.add(Illlllllilll<invokedynamic>(), new JsonObject());
      }

      return this.ilIiilIiIl.getAsJsonObject(Illlllllilll<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) << 3) ^ 24509))) - '\uec62') << 11 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) << 3) ^ 24509))) - '\uec62') >>> 5) - var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) << 3) ^ 24509))) - '\uec62') << 11 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3))) ^ var5) << 3) ^ 24509))) - '\uec62') >>> 5) - var5) << 14) - 27417) ^ 22769) - '돊'))) - '쒂'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
