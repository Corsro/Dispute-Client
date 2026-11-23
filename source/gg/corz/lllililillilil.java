package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lllililillilil {
   public long iIIlilIliIlIlilIli;
   public int iilIilIliIIiIilIli;
   public boolean IlllilIlillllilIli;
   public String ilIIilIliIiIIilIli;
   public long IiIlilIliliIlilIli;
   public String IliIilIlilliIilIli;
   public String IlIIilIlillIIilIli;
   public String lIiIilIliiIiIilIli;
   public long llIlilIliilIlilIli;
   public String lllIilIliillIilIli;
   public boolean liiIilIliiiiIilIli;
   public boolean iliIilIliIiiIilIli;
   public boolean lIllilIliiIllilIli;
   public long iiIlilIliIIllilIli;
   public List<String> iIlIilIliIllIilIli = new ArrayList();
   public String IilIilIlililIilIli;
   public String IIlIilIlilIlIilIli;
   public String liIIilIliiiIIilIli;
   public long IIIlilIlilIIlilIli;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) >>> 8) ^ var5) - var5) - var5) - '\uf8a7') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) >>> 8) ^ var5) - var5) - var5) - '\uf8a7') << 3) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) >>> 8) ^ var5) - var5) - var5) - '\uf8a7') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3))))) + 11897) ^ 7979) ^ '\uee78') >>> 12) << 12) >>> 8) ^ var5) - var5) - var5) - '\uf8a7') << 3) << 6) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2380202162417390246L ^ Long.rotateLeft(-8502462920481403101L, 8) ^ 3989986356314132178L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1762372397044686729L ^ Long.rotateLeft(-7251875893439216832L, 33) ^ -6360970935399730334L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5441756149018290301L ^ Long.rotateLeft(650495394863816172L, 43) ^ -8877891853930448457L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2475865542824953471L ^ Long.rotateLeft(-1765399101445745426L, 34) ^ -7791915449325491417L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2666694390895703394L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2467799542816750905L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6882785840246464675L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8662270744640252987L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1565434247365765921L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6463552359210647192L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   private static String liiiIIllIl(JsonObject o, String k) {
      return o.has(k) && o.get(k).isJsonPrimitive() ? o.get(k).getAsString() : null;
   }

   private static int iIlIlllllill(JsonObject k, String o, int d) {
      try {
         return k.has(o) && k.get(o).isJsonPrimitive() ? k.get(o).getAsInt() : d;
      } catch (Exception var4) {
         return d;
      }
   }

   private static long IilliliilIIi(JsonObject d, String o, long k) {
      try {
         return d.has(o) && d.get(o).isJsonPrimitive() ? d.get(o).getAsLong() : k;
      } catch (Exception var5) {
         return k;
      }
   }

   private static boolean lIiiIiIlilli(JsonObject o, String k, boolean d) {
      try {
         return o.has(k) && o.get(k).isJsonPrimitive() ? o.get(k).getAsBoolean() : d;
      } catch (Exception var4) {
         return d;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') << 9 | (char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') >>> 7) - '\ued65') >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') << 9 | (char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') >>> 7) - '\ued65') << 2) ^ var5) ^ 21292))) << 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') << 9 | (char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') >>> 7) - '\ued65') >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') << 9 | (char)((char)((char)((char)(var4[var5] ^ 586) >>> 3 | (char)(var4[var5] ^ 586) << 13) - 26135) - '詜') >>> 7) - '\ued65') << 2) ^ var5) ^ 21292))) >>> 15)) + '\uef95') - '팛') - 'Ꚏ') ^ var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '즢') + var5) - var5) ^ var5))) - var5) ^ '\ufdcc') - 5955) - var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) - var5))) ^ var5) >>> 14 | (char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) - var5))) ^ var5) << 2) ^ var5) << 12 | (char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) - var5))) ^ var5) >>> 14 | (char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) - var5))) ^ var5) << 2) ^ var5) >>> 4) ^ var5) + '\uf622') - 15060))) - var5) - '\ued49'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lllililillilil IliIlllilIi(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         lllililillilil var1 = new lllililillilil();
         var1.IlIIilIlillIIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.ilIIilIliIiIIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.liIIilIliiiIIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.IIlIilIlilIlIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         if (o.has(iliIiiliiiii<invokedynamic>()) && o.get(iliIiiliiiii<invokedynamic>()).isJsonArray()) {
            for(JsonElement var3 : o.getAsJsonArray(iliIiiliiiii<invokedynamic>())) {
               if (var3.isJsonPrimitive()) {
                  var1.iIlIilIliIllIilIli.add(var3.getAsString());
               }
            }
         }

         var1.lllIilIliillIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.IilIilIlililIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.iilIilIliIIiIilIli = iIlIlllllill(o, iliIiiliiiii<invokedynamic>(), 1);
         var1.lIiIilIliiIiIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.IliIilIlilliIilIli = liiiIIllIl(o, iliIiiliiiii<invokedynamic>());
         var1.iliIilIliIiiIilIli = lIiiIiIlilli(o, iliIiiliiiii<invokedynamic>(), false);
         var1.liiIilIliiiiIilIli = lIiiIiIlilli(o, iliIiiliiiii<invokedynamic>(), false);
         var1.IIIlilIlilIIlilIli = IilliliilIIi(o, iliIiiliiiii<invokedynamic>(), 0L);
         var1.iIIlilIliIlIlilIli = IilliliilIIi(o, iliIiiliiiii<invokedynamic>(), 0L);
         var1.llIlilIliilIlilIli = IilliliilIIi(o, iliIiiliiiii<invokedynamic>(), 0L);
         var1.IiIlilIliliIlilIli = IilliliilIIi(o, iliIiiliiiii<invokedynamic>(), 0L);
         var1.iiIlilIliIIllilIli = IilliliilIIi(o, iliIiiliiiii<invokedynamic>(), 0L);
         var1.lIllilIliiIllilIli = lIiiIiIlilli(o, iliIiiliiiii<invokedynamic>(), false);
         var1.IlllilIlillllilIli = lIiiIiIlilli(o, iliIiiliiiii<invokedynamic>(), false);
         return var1;
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '\ude01') + '輶') << 5 | (char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '\ude01') + '輶') >>> 11) >>> 2 | (char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '\ude01') + '輶') << 5 | (char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '\ude01') + '輶') >>> 11) << 14) - 'ｋ') + var5)))) ^ 'ｧ') + '躪') ^ var5))) - var5) - '腶'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
