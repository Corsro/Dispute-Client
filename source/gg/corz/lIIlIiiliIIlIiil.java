package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIIlIiiliIIlIiil {
   private final iiIIIiilIIlIIiil[] lllIiillil;

   public void lIiiIiIlilli(float out, float[] time, int offset) {
      int var4 = 0;
      int var5 = this.lllIiillil.length;

      while(var4 < var5) {
         int var6 = var4 + var5 >>> 1;
         if (this.lllIiillil[var6].IIiiIillil <= out) {
            var4 = var6 + 1;
         } else {
            var5 = var6;
         }
      }

      if (var4 == 0) {
         System.arraycopy(this.lllIiillil[0].lIiiIillil, 0, time, offset, 3);
      } else {
         iiIIIiilIIlIIiil var14 = this.lllIiillil[var4 - 1];
         if (var4 == this.lllIiillil.length) {
            System.arraycopy(var14.iIiiIillil, 0, time, offset, 3);
         } else {
            iiIIIiilIIlIIiil var7 = this.lllIiillil[var4];
            float var8 = (out - var14.IIiiIillil) / (var7.IIiiIillil - var14.IIiiIillil);

            for(int var9 = 0; var9 < 3; ++var9) {
               float var10 = var14.iIiiIillil[var9];
               float var11 = var7.lIiiIillil[var9];
               if (!var14.IliiIillil && !var7.IliiIillil) {
                  time[offset + var9] = var10 + (var11 - var10) * var8;
               } else {
                  float var12 = this.lllIiillil[Math.max(0, var4 - 2)].iIiiIillil[var9];
                  float var13 = this.lllIiillil[Math.min(this.lllIiillil.length - 1, var4 + 1)].lIiiIillil[var9];
                  time[offset + var9] = 0.5F * (2.0F * var10 + (-var12 + var11) * var8 + (2.0F * var12 - 5.0F * var10 + 4.0F * var11 - var13) * var8 * var8 + (-var12 + 3.0F * var10 - 3.0F * var11 + var13) * var8 * var8 * var8);
               }
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') << 4) + var5))) << 4 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') << 4) + var5))) >>> 12) + '\udf82') >>> 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') << 4) + var5))) << 4 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - '젛') ^ '븶') + var5) ^ 29593) ^ 30302) ^ '됟') << 4) + var5))) >>> 12) + '\udf82') << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float[] IilliliilIIi() {
      float[] var1 = new float[this.lllIiillil.length];

      for(int var2 = 0; var2 < this.lllIiillil.length; ++var2) {
         var1[var2] = this.lllIiillil[var2].IIiiIillil;
      }

      return var1;
   }

   public static lIIlIiiliIIlIiil IliIlllilIi(JsonElement value) {
      if (!value.isJsonObject()) {
         return new lIIlIiiliIIlIiil(new iiIIIiilIIlIIiil[]{new iiIIIiilIIlIIiil(0.0F, iliIiiliiiii(value), iliIiiliiiii(value), false)});
      } else {
         JsonObject var1 = value.getAsJsonObject();
         if (!var1.has(IIlllIlliIll<invokedynamic>()) && !var1.has(IIlllIlliIll<invokedynamic>())) {
            if (var1.size() != 0 && var1.size() <= 4096) {
               ArrayList var2 = new ArrayList();
               var1.entrySet().forEach((keys) -> var2.add(liiiIIllIl(IIIllIIliIIl(new JsonPrimitive((String)keys.getKey())), (JsonElement)keys.getValue())));
               var2.sort(Comparator.comparingDouble(iiIIIiilIIlIIiil::IliIlllilIi));
               float var3 = -1.0F;

               for(iiIIIiilIIlIIiil var5 : var2) {
                  if (var5.IIiiIillil < 0.0F || var5.IIiiIillil > 300.0F || var5.IIiiIillil <= var3) {
                     throw new IllegalArgumentException(IIlllIlliIll<invokedynamic>());
                  }

                  var3 = var5.IIiiIillil;
               }

               return new lIIlIiiliIIlIiil((iiIIIiilIIlIIiil[])var2.toArray((x$0) -> new iiIIIiilIIlIIiil[x$0]));
            } else {
               throw new IllegalArgumentException(IIlllIlliIll<invokedynamic>());
            }
         } else {
            return new lIIlIiiliIIlIiil(new iiIIIiilIIlIIiil[]{liiiIIllIl(0.0F, var1)});
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2433015521459967162L ^ Long.rotateLeft(5942045266824898047L, 38) ^ -6443853958044534073L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5259633525949499032L ^ Long.rotateLeft(-3364895956836713917L, 58) ^ 8697115568524310963L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8690202293015435522L ^ Long.rotateLeft(-8473055675410295869L, 4) ^ 8330624626390724835L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5630132855376128558L ^ Long.rotateLeft(-6888597850230699080L, 30) ^ -6809500111679585198L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6778463501026754896L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7632050111876714160L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7017677468729199373L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2958107912682482909L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1582348735119645737L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1645365615881388170L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '豬') - var5) >>> 1 | (char)((char)((char)(var4[var5] - var5) - '豬') - var5) << 15) + var5) + var5))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '豬') - var5) >>> 1 | (char)((char)((char)(var4[var5] - var5) - '豬') - var5) << 15) + var5) + var5))) >>> 6) + var5))) << 13 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '豬') - var5) >>> 1 | (char)((char)((char)(var4[var5] - var5) - '豬') - var5) << 15) + var5) + var5))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '豬') - var5) >>> 1 | (char)((char)((char)(var4[var5] - var5) - '豬') - var5) << 15) + var5) + var5))) >>> 6) + var5))) >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static iiIIIiilIIlIIiil liiiIIllIl(float value, JsonElement time) {
      if (!time.isJsonObject()) {
         float[] var6 = iliIiiliiiii(time);
         return new iiIIIiilIIlIIiil(value, var6, var6, false);
      } else {
         JsonObject var2 = time.getAsJsonObject();
         JsonElement var3 = var2.has(IIlllIlliIll<invokedynamic>()) ? var2.get(IIlllIlliIll<invokedynamic>()) : var2.get(IIlllIlliIll<invokedynamic>());
         JsonElement var4 = var2.has(IIlllIlliIll<invokedynamic>()) ? var2.get(IIlllIlliIll<invokedynamic>()) : var3;
         String var5 = var2.has(IIlllIlliIll<invokedynamic>()) ? var2.get(IIlllIlliIll<invokedynamic>()).getAsString() : IIlllIlliIll<invokedynamic>();
         if (!var5.equals(IIlllIlliIll<invokedynamic>()) && !var5.equals(IIlllIlliIll<invokedynamic>())) {
            throw new IllegalArgumentException(IIlllIlliIll<invokedynamic>() + var5);
         } else {
            return new iiIIIiilIIlIIiil(value, iliIiiliiiii(var3), iliIiiliiiii(var4), var5.equals(IIlllIlliIll<invokedynamic>()));
         }
      }
   }

   static float IIIllIIliIIl(JsonElement value) {
      float var1 = value.getAsFloat();
      if (Float.isFinite(var1) && !(Math.abs(var1) > 100000.0F)) {
         return var1;
      } else {
         throw new IllegalArgumentException(IIlllIlliIll<invokedynamic>());
      }
   }

   static float[] iliIiiliiiii(JsonElement value) {
      if (value == null) {
         throw new IllegalArgumentException(IIlllIlliIll<invokedynamic>());
      } else if (value.isJsonArray()) {
         JsonArray var2 = value.getAsJsonArray();
         if (var2.size() != (-1045510712 - -45 ^ -57 ^ 1045510705)) {
            throw new IllegalArgumentException(IIlllIlliIll<invokedynamic>());
         } else {
            return new float[]{IIIllIIliIIl(var2.get(0)), IIIllIIliIIl(var2.get(1)), IIIllIIliIIl(var2.get(2))};
         }
      } else {
         float var1 = IIIllIIliIIl(value);
         return new float[]{var1, var1, var1};
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] - 19923))) << 11 | (char)(~((char)(var4[var5] - 19923))) >>> 5) + var5) - '鰷') - var5))) + var5) << 7 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] - 19923))) << 11 | (char)(~((char)(var4[var5] - 19923))) >>> 5) + var5) - '鰷') - var5))) + var5) >>> 9) - '꧉'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float iIlIlllllill() {
      return this.lllIiillil[this.lllIiillil.length - 1].IIiiIillil;
   }

   private lIIlIiiliIIlIiil(iiIIIiilIIlIIiil[] keys) {
      this.lllIiillil = keys;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) << 1 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) >>> 15) + var5) + 25680) << 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) << 1 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) >>> 15) + var5) + 25680) >>> 4) + var5) + 2716) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) << 1 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) >>> 15) + var5) + 25680) << 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) << 1 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) >>> 1 | (char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10))))))) ^ var5) << 15))) - 9372) + 'ꨝ'))) >>> 15) + var5) + 25680) >>> 4) + var5) + 2716) ^ var5) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) << 13) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) << 13) ^ var5) - var5) >>> 15) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) << 13) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) >>> 2 | (char)((char)((char)((char)(var4[var5] - var5) + '졙') + '莝') ^ 29122) << 14) - var5) + var5) + var5) ^ var5) << 7))) + var5) << 3) << 13) ^ var5) - var5) >>> 15) << 6) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
