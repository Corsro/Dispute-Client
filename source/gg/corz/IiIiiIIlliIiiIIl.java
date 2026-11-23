package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_12079;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7920;
import net.minecraft.class_8685;

public final class IiIiiIIlliIiiIIl {
   private static final ExecutorService llIiIlilIl = Executors.newFixedThreadPool(2, (r) -> {
      Thread var1 = new Thread(r, IlIillIiilIi<invokedynamic>());
      var1.setDaemon(true);
      return var1;
   });
   private static final Set<String> IlIiIlilIl = ConcurrentHashMap.newKeySet();
   private static final Map<String, class_8685> lIIiIlilIl = new ConcurrentHashMap();
   private static final Set<String> iIIiIlilIl = ConcurrentHashMap.newKeySet();
   private static final int iiilIlilIl = 128;
   private static final Map<String, class_8685> IIIiIlilIl = new LinkedHashMap();

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') >>> 12) ^ 32138))) - 29665) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') >>> 12) ^ 32138))) - 29665) << 9) ^ var5) ^ 713) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') >>> 12) ^ 32138))) - 29665) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) << 1 | (char)((char)(var4[var5] + '\uf6fe') >>> 5 | (char)(var4[var5] + '\uf6fe') << 11) >>> 15) ^ var5) - var5) + 27004) + 3607) ^ '诹') >>> 12) ^ 32138))) - 29665) << 9) ^ var5) ^ 713) >>> 7) + 21569) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(String name) {
      return name != null && !name.isEmpty() && liiiIIllIl(name) != null;
   }

   private static String[] IiIlliIliiIl(String uuid) {
      try {
         String var1 = Illlllllilll(IlIillIiilIi<invokedynamic>() + uuid);
         if (var1 == null) {
            return null;
         } else {
            JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
            JsonArray var3 = var2.getAsJsonArray(IlIillIiilIi<invokedynamic>());
            if (var3 != null && !var3.isEmpty()) {
               String var4 = var3.get(0).getAsJsonObject().get(IlIillIiilIi<invokedynamic>()).getAsString();
               String var5 = new String(Base64.getDecoder().decode(var4), StandardCharsets.UTF_8);
               JsonObject var6 = JsonParser.parseString(var5).getAsJsonObject().getAsJsonObject(IlIillIiilIi<invokedynamic>());
               if (var6 == null) {
                  return null;
               } else {
                  JsonObject var7 = var6.getAsJsonObject(IlIillIiilIi<invokedynamic>());
                  if (var7 != null && var7.has(IlIillIiilIi<invokedynamic>())) {
                     String var8 = var7.get(IlIillIiilIi<invokedynamic>()).getAsString();
                     String var9 = "";
                     if (var7.has(IlIillIiilIi<invokedynamic>()) && var7.getAsJsonObject(IlIillIiilIi<invokedynamic>()).has(IlIillIiilIi<invokedynamic>())) {
                        var9 = var7.getAsJsonObject(IlIillIiilIi<invokedynamic>()).get(IlIillIiilIi<invokedynamic>()).getAsString();
                     }

                     return new String[]{var8, var9};
                  } else {
                     return null;
                  }
               }
            } else {
               return null;
            }
         }
      } catch (Throwable var10) {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') >>> 2 | (char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') << 14))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') >>> 2 | (char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') << 14))) << 12) ^ var5) + 8288) - var5))) ^ var5) - 24899))) - 24385) >>> 4 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') >>> 2 | (char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') << 14))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') >>> 2 | (char)((char)(~((char)((char)(~((char)(var4[var5] + 12734))) - 8234))) + '쏫') << 14))) << 12) ^ var5) + 8288) - var5))) ^ var5) - 24899))) - 24385) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static byte[] IIlllIlliIll(String url) {
      try {
         HttpURLConnection var1 = (HttpURLConnection)URI.create(url).toURL().openConnection();
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setRequestProperty(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>());
         if (var1.getResponseCode() != 200) {
            return null;
         } else {
            InputStream var2 = var1.getInputStream();

            byte[] var3;
            try {
               var3 = var2.readAllBytes();
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

            return var3;
         }
      } catch (Throwable var7) {
         return null;
      }
   }

   private static String Illlllllilll(String url) {
      HttpURLConnection var1 = (HttpURLConnection)URI.create(url).toURL().openConnection();
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setRequestProperty(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>());
      if (var1.getResponseCode() != 200) {
         return null;
      } else {
         InputStream var2 = var1.getInputStream();

         String var3;
         try {
            var3 = new String(var2.readAllBytes(), StandardCharsets.UTF_8);
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

         return var3;
      }
   }

   private static void lIiiIiIlilli(String name) {
      String var1 = IliIlllilIi(name);
      if (!lIIiIlilIl.containsKey(var1) && !IlIiIlilIl.contains(var1) && iIIiIlilIl.add(var1)) {
         llIiIlilIl.submit(() -> {
            long var8 = 3869627771313409077L;

            try {
               String var2 = IlIlllIlilIl(name);
               if (var2 == null) {
                  IIIllIIliIIl(var1);
                  return;
               }

               String[] var3 = IiIlliIliiIl(var2);
               if (var3 == null || var3[0] == null) {
                  IIIllIIliIIl(var1);
                  return;
               }

               var8 ^= ((long)IlIillIiilIi<invokedynamic>().equalsIgnoreCase(var3[1]) << 32 ^ var8) & -1L << 32;
               byte[] var5 = IIlllIlliIll(var3[0]);
               if (var5 == null) {
                  IIIllIIliIIl(var1);
                  return;
               }

               class_1011 var6;
               try {
                  var6 = iliIiiliiiii(class_1011.method_4309(new ByteArrayInputStream(var5)));
               } catch (Throwable var10) {
                  IIIllIIliIIl(var1);
                  return;
               }

               class_310 var7 = class_310.method_1551();
               if (var7 == null) {
                  IIIllIIliIIl(var1);
                  return;
               }

               var7.execute(() -> {
                  try {
                     class_2960 var4 = class_2960.method_60655(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>() + var1.replaceAll(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>()));
                     var7.method_1531().method_4616(var4, new class_1043(() -> IlIillIiilIi<invokedynamic>() + var1, var6));
                     lIIiIlilIl.put(var1, class_8685.method_74884(new iIlilIIlIllilIIl(var4), (class_12079.class_12081)null, (class_12079.class_12081)null, k ? class_7920.field_41122 : class_7920.field_41123));
                  } catch (Throwable var8) {
                     IlIiIlilIl.add(var1);
                  } finally {
                     iIIiIlilIl.remove(var1);
                  }

               });
            } catch (Throwable var11) {
               IIIllIIliIIl(var1);
            }

         });
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4045015872524385329L ^ Long.rotateLeft(-1711416588002012734L, 53) ^ 8272769402293830415L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3675018979650985790L ^ Long.rotateLeft(-1518976236032920851L, 54) ^ 957260545833812924L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4944994717946780376L ^ Long.rotateLeft(-1647979797011884223L, 20) ^ 1510011719059776873L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7136679546730913784L ^ Long.rotateLeft(-4296413841142965771L, 11) ^ 9026805453701023279L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2672851489342085143L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -519144257684137458L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3300290645456806123L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -311135826895200813L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8246784596212633513L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5667168169931287030L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIiliIiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlilIliiIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illillliilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilililiiili<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiilIiiiIii<invokedynamic>());
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

   public static void Iilllilliill() {
      IIIiIlilIl.clear();
   }

   private IiIiiIIlliIiiIIl() {
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') << 10 | (char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') >>> 6) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') << 10 | (char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') >>> 6) ^ var5))) >>> 11) + var5) + 3989) - var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') << 10 | (char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') >>> 6) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') << 10 | (char)((char)((char)(var4[var5] - var5) + 32101) ^ 'ꆪ') >>> 6) ^ var5))) >>> 11) + var5) + 3989) - var5) >>> 10) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_8685 IilliliilIIi(String name) {
      if (name != null && !name.isEmpty()) {
         String var1 = IliIlllilIi(name);
         class_640 var2 = liiiIIllIl(name);
         if (var2 != null) {
            try {
               class_8685 var3 = var2.method_52810();
               if (var3 != null) {
                  if (IIIiIlilIl.size() >= 128 && !IIIiIlilIl.containsKey(var1)) {
                     Iterator var7 = IIIiIlilIl.keySet().iterator();
                     if (var7.hasNext()) {
                        var7.next();
                        var7.remove();
                     }
                  }

                  IIIiIlilIl.put(var1, var3);
                  return var3;
               }
            } catch (Exception var5) {
            }
         }

         class_8685 var6 = (class_8685)IIIiIlilIl.get(var1);
         if (var6 != null) {
            return var6;
         } else {
            class_8685 var4 = (class_8685)lIIiIlilIl.get(var1);
            if (var4 != null) {
               return var4;
            } else {
               lIiiIiIlilli(name);
               return null;
            }
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)(~((char)((char)(var4[var5] + var5) + var5))))) + var5))))) - var5) - 22004) - '듂'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_640 liiiIIllIl(String name) {
      try {
         class_310 var1 = class_310.method_1551();
         if (var1 == null) {
            return null;
         } else {
            class_634 var2 = var1.method_1562();
            return var2 == null ? null : var2.method_2874(name);
         }
      } catch (Exception var3) {
         return null;
      }
   }

   private static void IIIllIIliIIl(String k) {
      IlIiIlilIl.add(k);
      iIIiIlilIl.remove(k);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') << 6) << 4 | (char)((char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') << 6) >>> 12) ^ '躦') + var5) ^ 21426) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') << 6) << 4 | (char)((char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ 15737))) ^ '\uf104') - '잒') << 6) >>> 12) ^ '躦') + var5) ^ 21426) ^ var5) >>> 15) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_1011 iliIiiliiiii(class_1011 img) {
      long var5 = -3937185984735949709L;
      long var7 = -6368435196277417176L;
      if (img.method_4307() == 64 && img.method_4323() == 32) {
         class_1011 var1 = new class_1011(64, 64, true);
         var1.method_4317(img);
         img.close();
         var5 ^= (4294967296L ^ var5) & -1L << 32;

         for(var5 ^= (32L ^ var5) & -1L >>> 32; (int)var5 < 64 && (int)(var5 >>> 32) != 0; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            for(var7 ^= (0L ^ var7) & -1L << 32; (int)(var7 >>> 32) < 32; var7 += 4294967296L) {
               if (var1.method_61940((int)var5, (int)(var7 >>> 32)) >>> 24 < 128) {
                  var5 ^= (0L ^ var5) & -1L << 32;
                  break;
               }
            }
         }

         if ((int)(var5 >>> 32) != 0) {
            for(long var11 = var5 ^ (32L ^ var5) & -1L >>> 32; (int)var11 < 64; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
               for(var7 ^= (0L ^ var7) & -1L << 32; (int)(var7 >>> 32) < 32; var7 += 4294967296L) {
                  var1.method_61941((int)var11, (int)(var7 >>> 32), var1.method_61940((int)var11, (int)(var7 >>> 32)) & 16777215);
               }
            }
         }

         return var1;
      } else {
         return img;
      }
   }

   private static String IlIlllIlilIl(String name) {
      try {
         String var1 = Illlllllilll(IlIillIiilIi<invokedynamic>() + URLEncoder.encode(name, StandardCharsets.UTF_8));
         if (var1 != null && !var1.isBlank()) {
            JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
            return var2.has(IlIillIiilIi<invokedynamic>()) ? var2.get(IlIillIiilIi<invokedynamic>()).getAsString() : null;
         } else {
            return null;
         }
      } catch (Throwable var3) {
         return null;
      }
   }

   private static String IliIlllilIi(String name) {
      return name == null ? "" : name.toLowerCase(Locale.ROOT);
   }
}
