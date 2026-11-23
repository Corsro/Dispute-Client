package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIiliIllIliliIll implements IIiliIlllIiliIll {
   private static final int IillIiilll = 8000;
   private static final String lillIiilll = "/build/sessions";
   private static final int illlIiilll = 6000;

   public void iIlIlllllill(String memberId, String sessionId) {
      JsonObject var3 = new JsonObject();
      var3.addProperty(IIlllIlliIll<invokedynamic>(), sessionId);

      try {
         this.lIiiIiIlilli(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>() + IiIlliIliiIl(memberId) + IIlllIlliIll<invokedynamic>(), var3);
      } catch (Exception var5) {
      }

   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)(var4[var5] - var5))))))) - 'ﲣ') + var5))) >>> 10 | (char)(-((char)((char)((char)(-((char)(-((char)(~((char)(var4[var5] - var5))))))) - 'ﲣ') + var5))) << 6) - var5) - 30568) - var5));
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
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - var5) + var5) ^ '詠') - '\udb92') << 15 | (char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - var5) + var5) ^ '詠') - '\udb92') >>> 1))))) ^ var5) << 12 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - var5) + var5) ^ '詠') - '\udb92') << 15 | (char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - var5) + var5) ^ '詠') - '\udb92') >>> 1))))) ^ var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String iliIiiliiiii(InputStream in) {
      if (in == null) {
         return "";
      } else {
         try {
            InputStream var1 = in;

            String var2;
            try {
               var2 = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            } catch (Throwable var5) {
               if (in != null) {
                  try {
                     var1.close();
                  } catch (Throwable var4) {
                     var5.addSuppressed(var4);
                  }
               }

               throw var5;
            }

            if (in != null) {
               in.close();
            }

            return var2;
         } catch (Exception var6) {
            return "";
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5392135200324240381L ^ Long.rotateLeft(6971563525210102773L, 25) ^ -7830918889298378918L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8881233040918217264L ^ Long.rotateLeft(-2152125888066603068L, 51) ^ 5150243204220849436L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1309677217011838077L ^ Long.rotateLeft(4612842728941417948L, 4) ^ -516428345814980414L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -611453849697258372L ^ Long.rotateLeft(-5335847670493410732L, 34) ^ -2658245999696847247L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5633920726495446225L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8558752217749399437L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6188892010889704095L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5413739623114486876L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8489469498737012642L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5759258101573777474L;
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

   public iIIlIiIlIlIi<iiIilllIIlilll> IliIlllilIi(String displayName, String buildHash, String uuid, String roomId) {
      JsonObject var5 = new JsonObject();
      var5.addProperty(IIlllIlliIll<invokedynamic>(), buildHash);
      var5.addProperty(IIlllIlliIll<invokedynamic>(), uuid);
      if (roomId != null) {
         var5.addProperty(IIlllIlliIll<invokedynamic>(), roomId);
      }

      lliiIIliiliiIIli var6 = this.lIiiIiIlilli(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>() + IiIlliIliiIl(displayName) + IIlllIlliIll<invokedynamic>(), var5);
      if (var6 == null) {
         return iIIlIiIlIlIi.<iiIilllIIlilll>liiiIIllIl(IIlllIlliIll<invokedynamic>());
      } else if (var6.lIiiIiIlIi == 409) {
         return iIIlIiIlIlIi.<iiIilllIIlilll>liiiIIllIl(IIlllIlliIll<invokedynamic>());
      } else {
         return var6.lIiiIiIlIi >= 400 ? iIIlIiIlIlIi.liiiIIllIl(IlIlllIlilIl(var6)) : iIIlIiIlIlIi.IliIlllilIi(IIIllIIliIIl(var6.iIiiIiIlIi));
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15) >>> 9 | (char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15) << 7))) - var5)) + '轅') << 10 | (char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15) >>> 9 | (char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15) << 7))) - var5)) + '轅') >>> 6) - 23228) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static iiIilllIIlilll IIIllIIliIIl(JsonObject j) {
      return new iiIilllIIlilll(j.has(IIlllIlliIll<invokedynamic>()) ? j.get(IIlllIlliIll<invokedynamic>()).getAsString() : null, j.has(IIlllIlliIll<invokedynamic>()) ? j.get(IIlllIlliIll<invokedynamic>()).getAsString() : null, j.has(IIlllIlliIll<invokedynamic>()) ? j.get(IIlllIlliIll<invokedynamic>()).getAsString() : null, j.has(IIlllIlliIll<invokedynamic>()) ? j.get(IIlllIlliIll<invokedynamic>()).getAsString() : null);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - var5) - 14011) ^ '떜') - 9346))))) + '\uef9b') - 21784) + 19746) - 'ꈾ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - '\ueeb6') >>> 4 | (char)(var4[var5] - '\ueeb6') << 12) ^ 32294))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] - '\ueeb6') >>> 4 | (char)(var4[var5] - '\ueeb6') << 12) ^ 32294))) << 8))) ^ '챘') - 12304))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIIlIiIlIlIi<ilIillIiIiIillIi> liiiIIllIl(String retainedDoc, String selfState, JsonObject outbox, JsonArray sessionId, long memberId, JsonObject sinceSeq, long knownRetainedVersion, long retainedVersion) {
      JsonObject var12 = new JsonObject();
      var12.addProperty(IIlllIlliIll<invokedynamic>(), selfState);
      if (outbox != null) {
         var12.add(IIlllIlliIll<invokedynamic>(), outbox);
      }

      if (sessionId != null && !sessionId.isEmpty()) {
         var12.add(IIlllIlliIll<invokedynamic>(), sessionId);
      }

      var12.addProperty(IIlllIlliIll<invokedynamic>(), memberId);
      var12.addProperty(IIlllIlliIll<invokedynamic>(), retainedVersion);
      if (sinceSeq != null) {
         JsonObject var13 = new JsonObject();
         var13.addProperty(IIlllIlliIll<invokedynamic>(), knownRetainedVersion);
         var13.add(IIlllIlliIll<invokedynamic>(), sinceSeq);
         var12.add(IIlllIlliIll<invokedynamic>(), var13);
      }

      lliiIIliiliiIIli var17 = this.lIiiIiIlilli(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>() + IiIlliIliiIl(retainedDoc) + IIlllIlliIll<invokedynamic>(), var12);
      if (var17 == null) {
         return iIIlIiIlIlIi.<ilIillIiIiIillIi>liiiIIllIl(IIlllIlliIll<invokedynamic>());
      } else if (var17.lIiiIiIlIi == 404) {
         return iIIlIiIlIlIi.<ilIillIiIiIillIi>liiiIIllIl(IIlllIlliIll<invokedynamic>());
      } else if (var17.lIiiIiIlIi >= 400) {
         return iIIlIiIlIlIi.<ilIillIiIiIillIi>liiiIIllIl(IlIlllIlilIl(var17));
      } else {
         JsonObject var14 = var17.iIiiIiIlIi;
         JsonObject var15 = null;
         if (var14.has(IIlllIlliIll<invokedynamic>()) && var14.get(IIlllIlliIll<invokedynamic>()).isJsonObject()) {
            var15 = var14.getAsJsonObject(IIlllIlliIll<invokedynamic>());
         }

         ilIillIiIiIillIi var16 = new ilIillIiIiIillIi(var14.has(IIlllIlliIll<invokedynamic>()) ? var14.get(IIlllIlliIll<invokedynamic>()).getAsString() : null, var14.has(IIlllIlliIll<invokedynamic>()) ? var14.get(IIlllIlliIll<invokedynamic>()).getAsString() : null, var14.has(IIlllIlliIll<invokedynamic>()) && var14.get(IIlllIlliIll<invokedynamic>()).getAsBoolean(), var14.has(IIlllIlliIll<invokedynamic>()) ? var14.get(IIlllIlliIll<invokedynamic>()).getAsLong() : System.currentTimeMillis(), var14.has(IIlllIlliIll<invokedynamic>()) && var14.get(IIlllIlliIll<invokedynamic>()).isJsonArray() ? var14.getAsJsonArray(IIlllIlliIll<invokedynamic>()) : new JsonArray(), var15, var14.has(IIlllIlliIll<invokedynamic>()) && var14.get(IIlllIlliIll<invokedynamic>()).isJsonArray() ? var14.getAsJsonArray(IIlllIlliIll<invokedynamic>()) : new JsonArray(), var14.has(IIlllIlliIll<invokedynamic>()) ? var14.get(IIlllIlliIll<invokedynamic>()).getAsLong() : memberId);
         return iIIlIiIlIlIi.<ilIillIiIiIillIi>IliIlllilIi(var16);
      }
   }

   private static String IlIlllIlilIl(lliiIIliiliiIIli r) {
      return r.iIiiIiIlIi != null && r.iIiiIiIlIi.has(IIlllIlliIll<invokedynamic>()) ? r.iIiiIiIlIi.get(IIlllIlliIll<invokedynamic>()).getAsString() : IIlllIlliIll<invokedynamic>();
   }

   private boolean IilliliilIIi() {
      return IIIIIllllIIIIlll.iiIIiiilll != null && !IIIIIllllIIIIlll.iiIIiiilll.isBlank();
   }

   private static String IiIlliIliiIl(String s) {
      return URLEncoder.encode(s == null ? "" : s, StandardCharsets.UTF_8);
   }

   private lliiIIliiliiIIli lIiiIiIlilli(String path, String method, JsonObject body) {
      long var11 = -4055043261926601986L;
      if (!this.IilliliilIIi()) {
         return null;
      } else {
         HttpURLConnection var4 = null;

         OutputStream var6;
         try {
            var4 = (HttpURLConnection)URI.create(IIIIIllllIIIIlll.iiIIiiilll + method).toURL().openConnection();
            var4.setRequestMethod(path);
            var4.setRequestProperty(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>());
            var4.setConnectTimeout(6000);
            var4.setReadTimeout(8000);
            String var5 = IIIIIllllIIIIlll.Ililllililil();
            if (var5 != null) {
               var4.setRequestProperty(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>() + var5);
            }

            if (body != null) {
               var4.setRequestProperty(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>());
               var4.setDoOutput(true);
               var6 = var4.getOutputStream();

               try {
                  var6.write(body.toString().getBytes(StandardCharsets.UTF_8));
               } catch (Throwable var20) {
                  if (var6 != null) {
                     try {
                        var6.close();
                     } catch (Throwable var18) {
                        var20.addSuppressed(var18);
                     }
                  }

                  throw var20;
               }

               if (var6 != null) {
                  var6.close();
               }
            }

            var11 ^= ((long)var4.getResponseCode() << 32 ^ var11) & -1L << 32;
            String var7 = iliIiiliiiii((int)(var11 >>> 32) < 400 ? var4.getInputStream() : var4.getErrorStream());

            JsonObject var8;
            try {
               var8 = JsonParser.parseString(var7).getAsJsonObject();
            } catch (Exception var19) {
               var8 = new JsonObject();
            }

            lliiIIliiliiIIli var9 = new lliiIIliiliiIIli((int)(var11 >>> 32), var8);
            return var9;
         } catch (Exception var21) {
            var6 = null;
         } finally {
            if (var4 != null) {
               var4.disconnect();
            }

         }

         return var6;
      }
   }
}
