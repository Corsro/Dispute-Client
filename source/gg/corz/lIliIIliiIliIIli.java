package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIliIIliiIliIIli {
   public static final int IIllIiIlIi = 1;
   private int IlllIiIlIi;
   private final LinkedHashMap<Long, IlliIIilllliIIil> llllIiIlIi = new LinkedHashMap();
   private static final Gson lillIiIlIi = (new GsonBuilder()).setPrettyPrinting().create();
   private static final long IillIiIlIi = 2097151L;
   private static final int illlIiIlIi = 21;
   private String lIllIiIlIi = "";
   private int iIllIiIlIi;

   public List<IlliIIilllliIIil> Iiiiliiiiiii(Set<Long> schematicCells) {
      ArrayList var2 = new ArrayList();

      for(Map.Entry var4 : this.llllIiIlIi.entrySet()) {
         if (((IlliIIilllliIIil)var4.getValue()).iIlIIiIIil && !schematicCells.contains(var4.getKey())) {
            var2.add((IlliIIilllliIIil)var4.getValue());
         }
      }

      return var2;
   }

   public static lIliIIliiIliIIli Illillliilli(String json) {
      try {
         JsonObject var1 = JsonParser.parseString(json).getAsJsonObject();
         if (var1.has(IIIIllIIIl<invokedynamic>()) && var1.get(IIIIllIIIl<invokedynamic>()).getAsInt() == 1) {
            lIliIIliiIliIIli var2 = new lIliIIliiIliIIli(var1.has(IIIIllIIIl<invokedynamic>()) ? var1.get(IIIIllIIIl<invokedynamic>()).getAsString() : "", var1.has(IIIIllIIIl<invokedynamic>()) ? var1.get(IIIIllIIIl<invokedynamic>()).getAsInt() : 0, var1.has(IIIIllIIIl<invokedynamic>()) ? var1.get(IIIIllIIIl<invokedynamic>()).getAsInt() : 0);
            if (var1.has(IIIIllIIIl<invokedynamic>())) {
               for(JsonElement var4 : var1.getAsJsonArray(IIIIllIIIl<invokedynamic>())) {
                  IlliIIilllliIIil var5 = (IlliIIilllliIIil)lillIiIlIi.fromJson(var4, IlliIIilllliIIil.class);
                  if (var5 != null && var5.IIIIIiIIil != null) {
                     var2.IlIlllIlilIl(var5);
                  }
               }
            }

            return var2;
         } else {
            return null;
         }
      } catch (Exception var6) {
         return null;
      }
   }

   public List<IlliIIilllliIIil> iliIiiliiiii() {
      return new ArrayList(this.llllIiIlIi.values());
   }

   public static float IIiilIiiiIii(float deg) {
      float var1 = deg % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public boolean IiIlliIliiIl(int dz, int dx, int dy) {
      return this.llllIiIlIi.remove(Ililllililil(dz, dx, dy)) != null;
   }

   public lIliIIliiIliIIli() {
   }

   public static long Ililllililil(int dz, int dx, int dy) {
      return ((long)dz & 2097151L) << 42 | ((long)dx & 2097151L) << 21 | (long)dy & 2097151L;
   }

   public String IIlilIliiIli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIIIllIIIl<invokedynamic>(), 1);
      var1.addProperty(IIIIllIIIl<invokedynamic>(), this.lIllIiIlIi);
      var1.addProperty(IIIIllIIIl<invokedynamic>(), this.iIllIiIlIi);
      var1.addProperty(IIIIllIIIl<invokedynamic>(), this.IlllIiIlIi);
      JsonArray var2 = new JsonArray();

      for(IlliIIilllliIIil var4 : this.llllIiIlIi.values()) {
         var2.add(lillIiIlIi.toJsonTree(var4));
      }

      var1.add(IIIIllIIIl<invokedynamic>(), var2);
      return lillIiIlIi.toJson(var1);
   }

   public List<IlliIIilllliIIil> IIIllIIliIIl() {
      ArrayList var1 = new ArrayList();

      for(IlliIIilllliIIil var3 : this.llllIiIlIi.values()) {
         if (var3.iIlIIiIIil) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private static int IiIiliIiiiIi(int v) {
      return v << 11 >> 11;
   }

   public void IlIlllIlilIl(IlliIIilllliIIil e) {
      if (e != null) {
         long var2 = Ililllililil(e.IiiiilIIil, e.liiiilIIil, e.iiiiilIIil);
         this.llllIiIlIi.remove(var2);
         this.llllIiIlIi.put(var2, e);
      }
   }

   public String IliIlllilIi() {
      return this.lIllIiIlIi;
   }

   public static int IIIilIIiiIIi(long k) {
      return IiIiliIiiiIi((int)(k >> 21 & 2097151L));
   }

   public int IilliliilIIi() {
      return this.llllIiIlIi.size();
   }

   public void IIillIiliIil() {
      this.llllIiIlIi.clear();
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) >>> 6 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) << 10) ^ '럐') ^ var5) - 23373) - '뚜'))) << 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) >>> 6 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) << 10) ^ '럐') ^ var5) - 23373) - '뚜'))) >>> 10) << 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) >>> 6 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) << 10) ^ '럐') ^ var5) - 23373) - '뚜'))) << 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) >>> 6 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 4362) << 10) ^ '럐') ^ var5) - 23373) - '뚜'))) >>> 10) >>> 2) - 16237))))) ^ '\uec5a') - 20899) - '킷') + var5) ^ 5449));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double Iilililiiili(Integer rowKey, int recordedIndex, double recordedCount) {
      return rowKey != null ? (double)rowKey : (double)recordedIndex + Math.max((double)0.0F, recordedCount);
   }

   public static int IlIillIiilIi(long k) {
      return IiIiliIiiiIi((int)(k & 2097151L));
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) >>> 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) << 11) << 12 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) >>> 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) << 11) >>> 4) - var5) ^ '轥') - 21407) + var5) + var5) ^ '\uec5a') ^ var5) - 24951) ^ 1494) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) >>> 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) << 11) << 12 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) >>> 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) >>> 1 | (char)((char)((char)(~((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) ^ var5) << 15) + 11103) << 11) >>> 4) - var5) ^ '轥') - 21407) + var5) + var5) ^ '\uec5a') ^ var5) - 24951) ^ 1494) ^ var5) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Illlllllilll(int dx, int dy, int dz) {
      return this.llllIiIlIi.containsKey(Ililllililil(dx, dy, dz));
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8460509865908654675L ^ Long.rotateLeft(770117290043079683L, 8) ^ -5771961029916338111L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4956036143254606861L ^ Long.rotateLeft(-6308123627758684377L, 42) ^ 4660636561082263102L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5276211049186885013L ^ Long.rotateLeft(-6234255927877010035L, 57) ^ 298984503140217338L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3840310276227940654L ^ Long.rotateLeft(-867137524440465171L, 26) ^ -4103662131314369506L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7353298225721436617L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7578515169810647298L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5150470455066502609L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5773306997715962615L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6854666901699670218L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5956783054887366714L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIIIlIlIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, llIIlilIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIIlliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iiIIlIIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIlIliIlIl<invokedynamic>());
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

   public int liiiIIllIl() {
      return this.iIllIiIlIi;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) << 2) ^ var5) - var5) << 10 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) << 2) ^ var5) - var5) >>> 6) << 5 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) << 2) ^ var5) - var5) << 10 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) >>> 4 | (char)((char)(-((char)(~var4[var5]))) << 15 | (char)(-((char)(~var4[var5]))) >>> 1) << 12))))))) ^ '틡'))) ^ var5) ^ var5))))) << 2) ^ var5) - var5) >>> 6) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int Iiilliiliiil(long k) {
      return IiIiliIiiiIi((int)(k >> 42 & 2097151L));
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5) - var5) ^ '\ude37') << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5) - var5) ^ '\ude37') >>> 10) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5) - var5) ^ '\ude37') << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5) - var5) ^ '\ude37') >>> 10) + var5))) << 15) ^ '\ue71b'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIliIIliiIliIIli(String schematicName, int mirror, int rotation) {
      this.lIllIiIlIi = schematicName == null ? "" : schematicName;
      this.iIllIiIlIi = mirror;
      this.IlllIiIlIi = rotation;
   }

   public int Iilllilliill(int dy, int dx, int dz) {
      long var9 = 1523770755513941158L;
      long var4 = Ililllililil(dy, dx, dz);
      var9 ^= (0L ^ var9) & -1L << 32;

      for(Long var8 : this.llllIiIlIi.keySet()) {
         if (var8 == var4) {
            return (int)(var9 >>> 32);
         }

         var9 += 4294967296L;
      }

      return -1;
   }

   public IlliIIilllliIIil IIlllIlliIll(int dz, int dy, int dx) {
      return (IlliIIilllliIIil)this.llllIiIlIi.get(Ililllililil(dz, dy, dx));
   }

   public boolean lIiiIiIlilli() {
      return this.llllIiIlIi.isEmpty();
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - '鹀') >>> 10 | (char)(var4[var5] - '鹀') << 6) + var5))) << 14 | (char)(-((char)((char)((char)(var4[var5] - '鹀') >>> 10 | (char)(var4[var5] - '鹀') << 6) + var5))) >>> 2))) - 2188) ^ var5))))) + 10938))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iliilliiilii(String mir, int rot, int schematic) {
      return this.lIllIiIlIi.equals(mir == null ? "" : mir) && this.iIllIiIlIi == rot && this.IlllIiIlIi == schematic;
   }

   public int iIlIlllllill() {
      return this.IlllIiIlIi;
   }
}
