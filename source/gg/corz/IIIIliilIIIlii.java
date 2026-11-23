package gg.corz;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record IIIIliilIIIlii(String schematicName, int width, int height, int length, int contentCells, long contentDigest, String hash) {
   private final int IililIiIIl;
   private final long IIiilIiIIl;
   private final String lllilIiIIl;
   private final String lIiilIiIIl;
   private final int iililIiIIl;
   private final int lililIiIIl;
   private final int illilIiIIl;

   public String IilliliilIIi(IIIIliilIIIlii other) {
      if (other == null) {
         return Iiilliiliiil<invokedynamic>();
      } else if (this.lIiilIiIIl.equals(other.lIiilIiIIl)) {
         return null;
      } else if (!this.lllilIiIIl.equals(other.lllilIiIIl)) {
         return Iiilliiliiil<invokedynamic>() + other.lllilIiIIl + Iiilliiliiil<invokedynamic>() + this.lllilIiIIl + Iiilliiliiil<invokedynamic>();
      } else {
         return this.illilIiIIl == other.illilIiIIl && this.IililIiIIl == other.IililIiIIl && this.lililIiIIl == other.lililIiIIl ? Iiilliiliiil<invokedynamic>() : Iiilliiliiil<invokedynamic>() + other.illilIiIIl + Iiilliiliiil<invokedynamic>() + other.IililIiIIl + Iiilliiliiil<invokedynamic>() + other.lililIiIIl + Iiilliiliiil<invokedynamic>() + this.illilIiIIl + Iiilliiliiil<invokedynamic>() + this.IililIiIIl + Iiilliiliiil<invokedynamic>() + this.lililIiIIl + Iiilliiliiil<invokedynamic>();
      }
   }

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.lllilIiIIl);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.illilIiIIl);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.IililIiIIl);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.lililIiIIl);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.iililIiIIl);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), Long.toHexString(this.IIiilIiIIl));
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.lIiilIiIIl);
      return var1;
   }

   public static IIIIliilIIIlii iliIiiliiiii(JsonObject o) {
      if (o != null && o.has(Iiilliiliiil<invokedynamic>())) {
         try {
            long var1 = 0L;
            if (o.has(Iiilliiliiil<invokedynamic>())) {
               try {
                  var1 = Long.parseUnsignedLong(o.get(Iiilliiliiil<invokedynamic>()).getAsString(), 16);
               } catch (Exception var4) {
               }
            }

            return new IIIIliilIIIlii(o.has(Iiilliiliiil<invokedynamic>()) ? o.get(Iiilliiliiil<invokedynamic>()).getAsString() : "", IIIllIIliIIl(o, Iiilliiliiil<invokedynamic>()), IIIllIIliIIl(o, Iiilliiliiil<invokedynamic>()), IIIllIIliIIl(o, Iiilliiliiil<invokedynamic>()), IIIllIIliIIl(o, Iiilliiliiil<invokedynamic>()), var1, o.get(Iiilliiliiil<invokedynamic>()).getAsString());
         } catch (Exception var5) {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) << 3 | (char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 13))) + 15655) - var5))) + 26660) - '蟴') - var5) + 30745) + '\uf23e'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Ililllililil() {
      return this.lIiilIiIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4957180722433587746L ^ Long.rotateLeft(-854287055964027757L, 11) ^ -7956050668852185518L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6833687376620893328L ^ Long.rotateLeft(5339059017277476303L, 16) ^ 6673653413020612786L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7504902416709675637L ^ Long.rotateLeft(415958533107437477L, 63) ^ 6603839031011563781L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2422092031305877395L ^ Long.rotateLeft(8119281641213904461L, 39) ^ -6446282126878019774L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2742944619951122752L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2621248643696814394L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5900028513212515392L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4123252200021732259L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7652895631819020987L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3076093563127565434L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) >>> 5 | (char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) << 11))) << 3 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) >>> 5 | (char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) << 11))) >>> 13))))))) ^ 4382))) ^ '蘋') - 7762) << 2 | (char)((char)((char)(~((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) >>> 5 | (char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) << 11))) << 3 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) >>> 5 | (char)((char)((char)(var4[var5] + var5) ^ 6462) << 11 | (char)((char)(var4[var5] + var5) ^ 6462) >>> 5) << 11))) >>> 13))))))) ^ 4382))) ^ '蘋') - 7762) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill(IIIIliilIIIlii o) {
      return o != null && this.lIiilIiIIl.equals(o.lIiilIiIIl);
   }

   public int Illlllllilll() {
      return this.lililIiIIl;
   }

   public String IlIlllIlilIl() {
      return this.lllilIiIIl;
   }

   public int IIlllIlliIll() {
      return this.IililIiIIl;
   }

   public IIIIliilIIIlii(String contentDigest, int height, int width, int length, int contentCells, long schematicName, String hash) {
      this.lllilIiIIl = contentDigest;
      this.illilIiIIl = height;
      this.IililIiIIl = width;
      this.lililIiIIl = length;
      this.iililIiIIl = contentCells;
      this.IIiilIiIIl = schematicName;
      this.lIiilIiIIl = hash;
   }

   public int Iilllilliill() {
      return this.iililIiIIl;
   }

   public static IIIIliilIIIlii IliIlllilIi(String width, int contentCells, int contentDigest, int height, int length, long schematicName) {
      String var7 = width == null ? "" : width;
      String var8 = var7 + '|' + contentCells + 'x' + contentDigest + 'x' + height + '|' + length + '|' + Long.toHexString(schematicName);
      return new IIIIliilIIIlii(var7, contentCells, contentDigest, height, length, schematicName, liiiIIllIl(var8));
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) + '첮') + var5) ^ var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) + '첮') + var5) ^ var5) << 8) - 27430) + '럭') - '\ue4a0') ^ '\ue8ee') << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) + '첮') + var5) ^ var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) + '첮') + var5) ^ var5) << 8) - 27430) + '럭') - '\ue4a0') ^ '\ue8ee') >>> 13) - '蝅'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) << 4 | (char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) >>> 12) << 8 | (char)((char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) << 4 | (char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) >>> 12) >>> 8) - var5) - '\uea4e') ^ var5) + 13677) - var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) << 4 | (char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) >>> 12) << 8 | (char)((char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) << 4 | (char)((char)(~((char)(var4[var5] - 10816))) >>> 10 | (char)(~((char)(var4[var5] - 10816))) << 6) >>> 12) >>> 8) - var5) - '\uea4e') ^ var5) + 13677) - var5) << 9) ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IIIllIIliIIl(JsonObject k, String o) {
      return k.has(o) ? k.get(o).getAsInt() : 0;
   }

   public int IiIlliIliiIl() {
      return this.illilIiIIl;
   }

   private static String liiiIIllIl(String seed) {
      long var5 = -5972881049646595492L;

      try {
         MessageDigest var1 = MessageDigest.getInstance(Iiilliiliiil<invokedynamic>());
         byte[] var2 = var1.digest(seed.getBytes(StandardCharsets.UTF_8));
         StringBuilder var3 = new StringBuilder(16);

         for(long var8 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var8 >>> 32) < 8; var8 += 4294967296L) {
            var3.append(Character.forDigit(var2[(int)(var8 >>> 32)] >> 4 & 15, 16)).append(Character.forDigit(var2[(int)(var8 >>> 32)] & 15, 16));
         }

         return var3.toString();
      } catch (Exception var7) {
         return Integer.toHexString(seed.hashCode());
      }
   }

   public long IIillIiliIil() {
      return this.IIiilIiIIl;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) << 6 | (char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) >>> 10) ^ '탳') >>> 4 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) << 6 | (char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) >>> 10) ^ '탳') << 12) + '랗') - 1525))) - var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) << 6 | (char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) >>> 10) ^ '탳') >>> 4 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) << 6 | (char)((char)(~((char)((char)(var4[var5] ^ var5) + 13673))) - 379) >>> 10) ^ '탳') << 12) + '랗') - 1525))) - var5) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
