package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
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
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_310;

public final class IlliIilllliIil {
   private static final HttpClient iIlIlliIiIllIlliIi = HttpClient.newBuilder().connectTimeout(Duration.ofMillis(6000L)).build();
   private static final int liIIlliIiiiIIlliIi = 6000;
   private static final int IIlIlliIilIlIlliIi = 8000;

   private static lliIiIliliIiIl IIillIiliIil(JsonObject o) {
      long var4 = 671237001409839795L;
      Integer var1 = o.has(iIlllIllll<invokedynamic>()) && o.get(iIlllIllll<invokedynamic>()).isJsonPrimitive() ? o.get(iIlllIllll<invokedynamic>()).getAsInt() : null;
      var4 ^= ((long)(o.has(iIlllIllll<invokedynamic>()) ? o.get(iIlllIllll<invokedynamic>()).getAsInt() : 0) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(o.has(iIlllIllll<invokedynamic>()) && o.get(iIlllIllll<invokedynamic>()).getAsBoolean() ? 1 : 0) ^ var4) & -1L >>> 32;
      return new lliIiIliliIiIl(o.get(iIlllIllll<invokedynamic>()).getAsString(), var1, (int)(var4 >>> 32), (boolean)((int)var4));
   }

   public static void Iiilliiliiil(String id, Consumer<IllllIllllllIl<List<lliIiIliliIiIl>>> cb) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            iilIliilIIiIliil var1 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(id) + iIlllIllll<invokedynamic>(), (JsonObject)null, true);
            if (var1 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var1.lilIiIilil >= 400) {
               return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1));
            } else {
               ArrayList var2 = new ArrayList();
               if (var1.iilIiIilil.has(iIlllIllll<invokedynamic>()) && var1.iilIiIilil.get(iIlllIllll<invokedynamic>()).isJsonArray()) {
                  for(JsonElement var4 : var1.iilIiIilil.getAsJsonArray(iIlllIllll<invokedynamic>())) {
                     if (var4.isJsonObject()) {
                        var2.add(IIillIiliIil(var4.getAsJsonObject()));
                     }
                  }
               }

               return IllllIllllllIl.IliIlllilIi(var2);
            }
         }
      }, cb);
   }

   private static boolean liiiIIllIl() {
      return IIIIIllllIIIIlll.iiIIiiilll != null && !IIIIIllllIIIIlll.iiIIiiilll.isBlank();
   }

   public static void IiIiliIiiiIi(String reason, String cb, String id, Consumer<IllllIllllllIl<Boolean>> details) {
      IIlilIliiIli(() -> {
         JsonObject var3 = new JsonObject();
         var3.addProperty(iIlllIllll<invokedynamic>(), cb);
         if (id != null) {
            var3.addProperty(iIlllIllll<invokedynamic>(), id);
         }

         iilIliilIIiIliil var4 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(reason) + iIlllIllll<invokedynamic>(), var3, true);
         if (var4 == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            return var4.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var4), Iiiiliiiiiii(var4)) : IllllIllllllIl.IliIlllilIi(Boolean.TRUE);
         }
      }, details);
   }

   private static String Iiiiliiiiiii(iilIliilIIiIliil r) {
      if (r.iilIiIilil.has(iIlllIllll<invokedynamic>())) {
         return r.iilIiIilil.get(iIlllIllll<invokedynamic>()).getAsString();
      } else {
         return r.iilIiIilil.has(iIlllIllll<invokedynamic>()) && r.iilIiIilil.get(iIlllIllll<invokedynamic>()).isJsonArray() && r.iilIiIilil.getAsJsonArray(iIlllIllll<invokedynamic>()).size() > 0 ? r.iilIiIilil.getAsJsonArray(iIlllIllll<invokedynamic>()).get(0).getAsString() : iIlllIllll<invokedynamic>() + r.lilIiIilil + iIlllIllll<invokedynamic>();
      }
   }

   private static String Iliilliiilii(iilIliilIIiIliil r) {
      return r.iilIiIilil.has(iIlllIllll<invokedynamic>()) ? r.iilIiIilil.get(iIlllIllll<invokedynamic>()).getAsString() : iIlllIllll<invokedynamic>();
   }

   public static void Iilllilliill(String id, Consumer<IllllIllllllIl<Boolean>> cb) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            iilIliilIIiIliil var1 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(id), (JsonObject)null, true);
            if (var1 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var1.lilIiIilil == 401) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var1.lilIiIilil == 403) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var1.lilIiIilil == 404) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               return var1.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1)) : IllllIllllllIl.IliIlllilIi(Boolean.TRUE);
            }
         }
      }, cb);
   }

   public static void IIlllIlliIll(String visibility, String id, Consumer<IllllIllllllIl<lllililillilil>> cb) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            JsonObject var2 = new JsonObject();
            var2.addProperty(iIlllIllll<invokedynamic>(), id);
            iilIliilIIiIliil var3 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(visibility), var2, true);
            if (var3 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var3.lilIiIilil == 403) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               return var3.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var3), Iiiiliiiiiii(var3)) : IllllIllllllIl.IliIlllilIi(lllililillilil.IliIlllilIi(var3.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>())));
            }
         }
      }, cb);
   }

   public static void iIlIlllllill(Map<String, String> cb, Consumer<IllllIllllllIl<Ilillillilli>> params) {
      IIlilIliiIli(() -> {
         iilIliilIIiIliil var1 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + llIIlilIIl(cb), (JsonObject)null, true);
         if (var1 == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            return var1.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1)) : IllllIllllllIl.IliIlllilIi(Ilillillilli.IliIlllilIi(var1.iilIiIilil));
         }
      }, params);
   }

   private static iilIliilIIiIliil IIiilIiiiIii(String auth, String method, JsonObject body, boolean pathSuffix) {
      try {
         HttpRequest.Builder var4 = HttpRequest.newBuilder(URI.create(IIIIIllllIIIIlll.iiIIiiilll + method)).timeout(Duration.ofMillis(8000L)).header(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         if (pathSuffix) {
            String var5 = IIIIIllllIIIIlll.Ililllililil();
            if (var5 != null) {
               var4.header(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + var5);
            }
         }

         if (body != null) {
            var4.header(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            var4.method(auth, BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8));
         } else {
            var4.method(auth, BodyPublishers.noBody());
         }

         java.net.http.HttpResponse var10 = iIlIlliIiIllIlliIi.send(var4.build(), BodyHandlers.ofString(StandardCharsets.UTF_8));

         JsonObject var6;
         try {
            var6 = JsonParser.parseString((String)var10.body()).getAsJsonObject();
         } catch (Exception var8) {
            var6 = new JsonObject();
         }

         return new iilIliilIIiIliil(var10.statusCode(), var6);
      } catch (Exception var9) {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8126481191420380891L ^ Long.rotateLeft(-4369385005409725935L, 32) ^ -8115069149573137988L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1461535088059328373L ^ Long.rotateLeft(-4824574249233111325L, 10) ^ -4827480988048291842L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4300946993054185369L ^ Long.rotateLeft(993858728290057592L, 59) ^ -4321642342767948157L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3415494166205608184L ^ Long.rotateLeft(-1164909527032763156L, 2) ^ 3387787376020669407L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6802495618549468850L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1338850485936252497L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8360416458812172952L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1841947366907383267L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 967105783612788395L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2125079341466270933L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lllllillll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iillllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iilllIIill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIilliIill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ilillllill<invokedynamic>());
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

   public static void lIiiIiIlilli(String id, Consumer<IllllIllllllIl<List<JsonObject>>> cb) {
      IIlilIliiIli(() -> {
         iilIliilIIiIliil var1 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(id) + iIlllIllll<invokedynamic>(), (JsonObject)null, true);
         if (var1 == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else if (var1.lilIiIilil >= 400) {
            return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1));
         } else {
            ArrayList var2 = new ArrayList();
            JsonArray var3 = var1.iilIiIilil.getAsJsonArray(iIlllIllll<invokedynamic>());
            if (var3 != null) {
               for(JsonElement var5 : var3) {
                  if (var5.isJsonObject()) {
                     var2.add(var5.getAsJsonObject());
                  }
               }
            }

            return IllllIllllllIl.IliIlllilIi(var2);
         }
      }, cb);
   }

   private static String Iilililiiili(InputStream in) {
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

   public static void Illlllllilll(String like, boolean cb, Consumer<IllllIllllllIl<Long>> id) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            iilIliilIIiIliil var2 = Illillliilli(cb ? iIlllIllll<invokedynamic>() : iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(like) + iIlllIllll<invokedynamic>(), (JsonObject)null, true);
            if (var2 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var2.lilIiIilil == 401) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var2.lilIiIilil >= 400) {
               return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var2), Iiiiliiiiiii(var2));
            } else {
               long var3 = var2.iilIiIilil.has(iIlllIllll<invokedynamic>()) ? var2.iilIiIilil.get(iIlllIllll<invokedynamic>()).getAsLong() : 0L;
               return IllllIllllllIl.IliIlllilIi(var3);
            }
         }
      }, id);
   }

   public static void Ililllililil(String maxUses, Integer id, Consumer<IllllIllllllIl<lliIiIliliIiIl>> cb) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            JsonObject var2 = new JsonObject();
            if (id != null) {
               var2.addProperty(iIlllIllll<invokedynamic>(), id);
            }

            iilIliilIIiIliil var3 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(maxUses) + iIlllIllll<invokedynamic>(), var2, true);
            if (var3 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var3.lilIiIilil == 403) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               return var3.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var3), Iiiiliiiiiii(var3)) : IllllIllllllIl.IliIlllilIi(IIillIiliIil(var3.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>())));
            }
         }
      }, cb);
   }

   public static void IiIlliIliiIl(String profile, lIlIllIliIlIllIl id, String cb, Consumer<IllllIllllllIl<lllililillilil>> changelog) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            lIlIllIliIlIllIl var3 = IliIlllilIi(id);
            if (var3 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               JsonObject var4 = new JsonObject();
               var4.addProperty(iIlllIllll<invokedynamic>(), new String(var3.iIlIlllllill(), StandardCharsets.UTF_8));
               if (cb != null) {
                  var4.addProperty(iIlllIllll<invokedynamic>(), cb);
               }

               iilIliilIIiIliil var5 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(profile) + iIlllIllll<invokedynamic>(), var4, true);
               if (var5 == null) {
                  return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               } else if (var5.lilIiIilil == 403) {
                  return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               } else {
                  return var5.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var5), Iiiiliiiiiii(var5)) : IllllIllllllIl.IliIlllilIi(lllililillilil.IliIlllilIi(var5.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>())));
               }
            }
         }
      }, changelog);
   }

   public static void iliIiiliiiii(String versionId, String id, Consumer<IllllIllllllIl<iIlIiillIllIiill>> cb) {
      IIlilIliiIli(() -> {
         String var2 = iIlllIllll<invokedynamic>() + iIIIlIlIIl(versionId) + iIlllIllll<invokedynamic>();
         LinkedHashMap var3 = new LinkedHashMap();
         if (id != null) {
            var3.put(iIlllIllll<invokedynamic>(), id);
         }

         var3.put(iIlllIllll<invokedynamic>(), IIIIIllllIIIIlll.IIillIiliIil());
         iilIliilIIiIliil var4 = Illillliilli(iIlllIllll<invokedynamic>(), var2 + llIIlilIIl(var3), (JsonObject)null, true);
         if (var4 == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else if (var4.lilIiIilil == 404) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else if (var4.lilIiIilil >= 400) {
            return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var4), Iiiiliiiiiii(var4));
         } else {
            JsonObject var5 = var4.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>());
            String var6 = var4.iilIiIilil.has(iIlllIllll<invokedynamic>()) && var4.iilIiIilil.get(iIlllIllll<invokedynamic>()).isJsonPrimitive() ? var4.iilIiIilil.get(iIlllIllll<invokedynamic>()).getAsString() : null;
            if (var6 != null && var5 != null) {
               byte[] var7 = var6.getBytes(StandardCharsets.UTF_8);
               String var8 = var5.has(iIlllIllll<invokedynamic>()) ? var5.get(iIlllIllll<invokedynamic>()).getAsString() : "";
               String var9 = lIlIllIliIlIllIl.IlIlllIlilIl(var7);
               return !var9.equalsIgnoreCase(var8) ? IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>()) : IllllIllllllIl.IliIlllilIi(new iIlIiillIllIiill(var7, var5));
            } else {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            }
         }
      }, cb);
   }

   private IlliIilllliIil() {
   }

   private static iilIliilIIiIliil Illillliilli(String method, String body, JsonObject auth, boolean pathSuffix) {
      long var10 = -5852550268405934176L;
      if (!liiiIIllIl()) {
         return null;
      } else if (iIlllIllll<invokedynamic>().equals(method)) {
         return IIiilIiiiIii(method, body, auth, pathSuffix);
      } else {
         HttpURLConnection var4 = null;

         String var6;
         try {
            var4 = (HttpURLConnection)URI.create(IIIIIllllIIIIlll.iiIIiiilll + body).toURL().openConnection();
            var4.setRequestMethod(method);
            var4.setRequestProperty(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            var4.setConnectTimeout(6000);
            var4.setReadTimeout(8000);
            if (pathSuffix) {
               String var5 = IIIIIllllIIIIlll.Ililllililil();
               if (var5 != null) {
                  var4.setRequestProperty(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + var5);
               }
            }

            if (auth != null) {
               var4.setRequestProperty(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               var4.setDoOutput(true);
               OutputStream var22 = var4.getOutputStream();

               try {
                  var22.write(auth.toString().getBytes(StandardCharsets.UTF_8));
               } catch (Throwable var19) {
                  if (var22 != null) {
                     try {
                        var22.close();
                     } catch (Throwable var17) {
                        var19.addSuppressed(var17);
                     }
                  }

                  throw var19;
               }

               if (var22 != null) {
                  var22.close();
               }
            }

            var10 ^= ((long)var4.getResponseCode() << 32 ^ var10) & -1L << 32;
            var6 = Iilililiiili((int)(var10 >>> 32) < 400 ? var4.getInputStream() : var4.getErrorStream());

            JsonObject var7;
            try {
               var7 = JsonParser.parseString(var6).getAsJsonObject();
            } catch (Exception var18) {
               var7 = new JsonObject();
            }

            iilIliilIIiIliil var8 = new iilIliilIIiIliil((int)(var10 >>> 32), var7);
            return var8;
         } catch (Exception var20) {
            var6 = null;
         } finally {
            if (var4 != null) {
               var4.disconnect();
            }

         }

         return var6;
      }
   }

   public static void IilliliilIIi(String cb, Consumer<IllllIllllllIl<lllililillilil>> id) {
      IIlilIliiIli(() -> {
         iilIliilIIiIliil var1 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(cb), (JsonObject)null, true);
         if (var1 == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else if (var1.lilIiIilil == 404) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            return var1.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1)) : IllllIllllllIl.IliIlllilIi(lllililillilil.IliIlllilIi(var1.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>())));
         }
      }, id);
   }

   public static void IIIilIIiiIIi(String id, String cb, Consumer<IllllIllllllIl<Boolean>> code) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            iilIliilIIiIliil var2 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>() + iIIIlIlIIl(id) + iIlllIllll<invokedynamic>() + iIIIlIlIIl(cb), (JsonObject)null, true);
            if (var2 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               return var2.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var2), Iiiiliiiiiii(var2)) : IllllIllllllIl.IliIlllilIi(var2.iilIiIilil.has(iIlllIllll<invokedynamic>()) && var2.iilIiIilil.get(iIlllIllll<invokedynamic>()).getAsBoolean());
            }
         }
      }, code);
   }

   public static void IlIlllIlilIl(lIlIllIliIlIllIl changelog, List<String> visibility, String tags, String profile, Consumer<IllllIllllllIl<lllililillilil>> cb) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            lIlIllIliIlIllIl var4 = IliIlllilIi(changelog);
            if (var4 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               JsonObject var5 = new JsonObject();
               var5.addProperty(iIlllIllll<invokedynamic>(), new String(var4.iIlIlllllill(), StandardCharsets.UTF_8));
               var5.addProperty(iIlllIllll<invokedynamic>(), IIIIllIIIl());
               if (tags != null) {
                  var5.addProperty(iIlllIllll<invokedynamic>(), tags);
               }

               if (profile != null) {
                  var5.addProperty(iIlllIllll<invokedynamic>(), profile);
               }

               if (visibility != null) {
                  JsonArray var6 = new JsonArray();

                  for(String var8 : visibility) {
                     var6.add(var8);
                  }

                  var5.add(iIlllIllll<invokedynamic>(), var6);
               }

               iilIliilIIiIliil var9 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>(), var5, true);
               if (var9 == null) {
                  return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               } else if (var9.lilIiIilil == 401) {
                  return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               } else if (var9.lilIiIilil == 409) {
                  return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               } else {
                  return var9.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var9), Iiiiliiiiiii(var9)) : IllllIllllllIl.IliIlllilIi(lllililillilil.IliIlllilIi(var9.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>())));
               }
            }
         }
      }, cb);
   }

   // $FF: synthetic method
   private static CallSite lIilliIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6) ^ 17960) >>> 8 | (char)((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6) ^ 17960) << 8) - var5) + var5) + '쇸') ^ var5) ^ var5) - 9841) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String IIIIllIIIl() {
      try {
         String var0 = class_310.method_1551().method_1548().method_1676();
         return var0 != null && !var0.isBlank() ? var0 : iIlllIllll<invokedynamic>();
      } catch (Throwable var1) {
         return iIlllIllll<invokedynamic>();
      }
   }

   private static <T> void IIlilIliiIli(Callable<IllllIllllllIl<T>> cb, Consumer<IllllIllllllIl<T>> work) {
      Thread var2 = new Thread(() -> {
         IllllIllllllIl var2;
         try {
            var2 = (IllllIllllllIl)cb.call();
         } catch (Exception var5) {
            var2 = IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         }

         try {
            work.accept(var2);
         } catch (Exception var4) {
         }

      }, iIlllIllll<invokedynamic>());
      var2.setDaemon(true);
      var2.start();
   }

   private static String llIIlilIIl(Map<String, String> params) {
      long var5 = 8331924571931190772L;
      if (params != null && !params.isEmpty()) {
         StringBuilder var1 = new StringBuilder(iIlllIllll<invokedynamic>());
         var5 ^= (4294967296L ^ var5) & -1L << 32;

         for(Map.Entry var4 : params.entrySet()) {
            if (var4.getValue() != null && !((String)var4.getValue()).isEmpty()) {
               if ((int)(var5 >>> 32) == 0) {
                  var1.append('&');
               }

               var1.append(iIIIlIlIIl((String)var4.getKey())).append('=').append(iIIIlIlIIl((String)var4.getValue()));
               var5 ^= (0L ^ var5) & -1L << 32;
            }
         }

         return var1.length() == 1 ? "" : var1.toString();
      } else {
         return "";
      }
   }

   // $FF: synthetic method
   private static CallSite iilllIIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) + var5))) ^ 28260) << 10 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) + var5))) ^ 28260) >>> 6))) ^ '빹') - var5) - '\udd36') + '蟈'))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) + var5))) ^ 28260) << 10 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) + var5))) ^ 28260) >>> 6))) ^ '빹') - var5) - '\udd36') + '蟈'))) >>> 13) ^ var5) ^ '쁥')));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIlIllIliIlIllIl IliIlllilIi(lIlIllIliIlIllIl profile) {
      return profile != null && lIiIiIlliIiIiIll.IliIlllilIi().IlIlllIlilIl() ? iilIliIlIIiIliIl.IiIlliIliiIl(profile) : null;
   }

   // $FF: synthetic method
   private static CallSite Ilillllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9) ^ '꺤'))) + var5) + var5) + '엹') >>> 13 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9) ^ '꺤'))) + var5) + var5) + '엹') << 3) ^ 'ﲃ') - '춽') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9) ^ '꺤'))) + var5) + var5) + '엹') >>> 13 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9) ^ '꺤'))) + var5) + var5) + '엹') << 3) ^ 'ﲃ') - '춽') << 4) ^ var5) - var5))) - '裧'))) - 1923) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String iIIIlIlIIl(String s) {
      return URLEncoder.encode(s == null ? "" : s, StandardCharsets.UTF_8);
   }

   public static void IIIllIIliIIl(Consumer<IllllIllllllIl<Ilillillilli>> cb) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            iilIliilIIiIliil var0 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>(), (JsonObject)null, true);
            if (var0 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var0.lilIiIilil == 401) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else {
               return var0.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var0), Iiiiliiiiiii(var0)) : IllllIllllllIl.IliIlllilIi(Ilillillilli.IliIlllilIi(var0.iilIiIilil));
            }
         }
      }, cb);
   }

   public static void IlIillIiilIi(String cb, Consumer<IllllIllllllIl<iIlIiillIllIiill>> code) {
      IIlilIliiIli(() -> {
         if (IIIIIllllIIIIlll.Ililllililil() == null) {
            return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
         } else {
            JsonObject var1 = new JsonObject();
            var1.addProperty(iIlllIllll<invokedynamic>(), cb);
            iilIliilIIiIliil var2 = Illillliilli(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>(), var1, true);
            if (var2 == null) {
               return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
            } else if (var2.lilIiIilil >= 400) {
               return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var2), Iiiiliiiiiii(var2));
            } else {
               JsonObject var3 = var2.iilIiIilil.getAsJsonObject(iIlllIllll<invokedynamic>());
               String var4 = var2.iilIiIilil.has(iIlllIllll<invokedynamic>()) && var2.iilIiIilil.get(iIlllIllll<invokedynamic>()).isJsonPrimitive() ? var2.iilIiIilil.get(iIlllIllll<invokedynamic>()).getAsString() : null;
               if (var4 != null && var3 != null) {
                  byte[] var5 = var4.getBytes(StandardCharsets.UTF_8);
                  String var6 = var3.has(iIlllIllll<invokedynamic>()) ? var3.get(iIlllIllll<invokedynamic>()).getAsString() : "";
                  String var7 = lIlIllIliIlIllIl.IlIlllIlilIl(var5);
                  return !var7.equalsIgnoreCase(var6) ? IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>()) : IllllIllllllIl.IliIlllilIi(new iIlIiillIllIiill(var5, var3));
               } else {
                  return IllllIllllllIl.liiiIIllIl(iIlllIllll<invokedynamic>(), iIlllIllll<invokedynamic>());
               }
            }
         }
      }, code);
   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) >>> 1) - 22885) << 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) >>> 1) - 22885) >>> 2) ^ 1028))) ^ 6816) + '\uee9e') ^ var5) ^ 24148) ^ var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) >>> 1) - 22885) << 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 3643) ^ var5) - '￨') - 'Ｕ') - var5))) >>> 1) - 22885) >>> 2) ^ 1028))) ^ 6816) + '\uee9e') ^ var5) ^ 24148) ^ var5) + var5) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '鎌') + '鹆') ^ var5) ^ var5) << 15 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '鎌') + '鹆') ^ var5) ^ var5) >>> 1) - '\ue4db') + var5))) ^ '쫋'))) + 993) + var5) ^ var5) + 22885) ^ var5) ^ '냕'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
