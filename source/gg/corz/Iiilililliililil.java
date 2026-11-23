package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class Iiilililliililil {
   private static final Map<String, iliiIIiIiiiIIi> iiIlIlllil = new LinkedHashMap<String, iliiIIiIiiiIIi>(-71994267 ^ -91 ^ -55 ^ -71994343, 0.75F, true) {
      protected boolean removeEldestEntry(Map.Entry<String, iliiIIiIiiiIIi> e) {
         return this.size() > (-(-750225636 * -49 << 17 | -750225636 * -49 >>> 15) + -79 ^ -1732845217);
      }
   };
   private static final Map<String, Long> llllIlllil = new ConcurrentHashMap();
   private static final long lillIlllil = 250L;
   private static volatile long IlllIlllil = 0L;
   private static final long IillIlllil = 120L;
   private static final int illlIlllil = 7;
   private static final Pattern IiIlIlllil = Pattern.compile(Iilililiiili<invokedynamic>());
   private static final Pattern liIlIlllil = Pattern.compile(Iilililiiili<invokedynamic>());
   private static volatile iliiIIiIiiiIIi iIllIlllil;
   private static final ExecutorService IIllIlllil = Executors.newCachedThreadPool((r) -> {
      Thread var1 = new Thread(r, Iilililiiili<invokedynamic>());
      var1.setDaemon(true);
      return var1;
   });
   private static volatile String lIllIlllil = "";

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') >>> 3 | (char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') << 13) >>> 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') >>> 3 | (char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') << 13) << 14))))))))) - 7996) - 32133) ^ var5) << 10 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') >>> 3 | (char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') << 13) >>> 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') >>> 3 | (char)((char)((char)((char)((char)(var4[var5] + '콵') + var5) ^ 16997) - var5) ^ '핈') << 13) << 14))))))))) - 7996) - 32133) ^ var5) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3502590183256872455L ^ Long.rotateLeft(-2626068207835010415L, 62) ^ -3973998302478260708L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5096515300248430806L ^ Long.rotateLeft(3247352836263435246L, 29) ^ -4493882484773486063L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5437801346146512905L ^ Long.rotateLeft(-2560943774357244776L, 11) ^ -1686582505508004380L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1466317947110068914L ^ Long.rotateLeft(4111109934654729447L, 33) ^ 4389485722046954434L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1846138201309945292L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3690044304632202328L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1664512737642894855L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 802192362360900618L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3559582685323031509L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6524517982454552788L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiilIiiiIii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iliilliiilii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiiiliiiiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIIllIIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIIlIlIIl<invokedynamic>());
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

   private static long IIillIiliIil(String min, String sec) {
      return Long.parseLong(min) * (302278593490554133L ^ 302278593490544501L) + Math.round(Double.parseDouble(sec.replace((char)(~(-459295253 + 83) ^ 459295227), (char)((176528991 << 27 | 176528991 >>> 5) * 652835029 ^ 'a' ^ -413346539))) * Double.longBitsToDouble(24707068854953286L ^ 4672632990533838150L));
   }

   static iliiIIiIiiiIIi liiiIIllIl(String trackKey) {
      iliiIIiIiiiIIi var1 = iIllIlllil;
      return var1 != null && var1.IliIlllilIi().equals(trackKey) ? var1 : null;
   }

   private static String IiIlliIliiIl(JsonObject durSec, int tol, double o) {
      JsonElement var4 = durSec.get(Iilililiiili<invokedynamic>());
      if (var4 != null && var4.isJsonPrimitive()) {
         String var5 = var4.getAsString();
         if (var5.isBlank()) {
            return null;
         } else {
            return tol > (-((-466814390 << 15 | -466814390 >>> 17) * -13) ^ 1525074715) && durSec.has(Iilililiiili<invokedynamic>()) && durSec.get(Iilililiiili<invokedynamic>()).isJsonPrimitive() && Math.abs(durSec.get(Iilililiiili<invokedynamic>()).getAsDouble() - (double)tol) > o ? null : var5;
         }
      } else {
         return null;
      }
   }

   private static String Illlllllilll(String a) {
      String var1 = a == null ? "" : a;

      for(String var5 : new String[]{Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>()}) {
         int var6 = var1.indexOf(var5);
         if (var6 > 0) {
            var1 = var1.substring(0, var6);
         }
      }

      return var1.trim();
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) << 14 | (char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) >>> 2) + '\uf6a6') + 13739))) - 20009) ^ var5) ^ var5) - var5))) >>> 5 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) << 14 | (char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) >>> 2) + '\uf6a6') + 13739))) - 20009) ^ var5) ^ var5) - var5))) << 11) + '냇') ^ var5)) + var5) - var5) - 'ꀷ') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) << 14 | (char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) >>> 2) + '\uf6a6') + 13739))) - 20009) ^ var5) ^ var5) - var5))) >>> 5 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) << 14 | (char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) >>> 2) + '\uf6a6') + 13739))) - 20009) ^ var5) ^ var5) - var5))) << 11) + '냇') ^ var5)) + var5) - var5) - 'ꀷ') >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static IlIilIilllIilIil IlIillIiilIi(long start, List<String> spans, List<long[]> words, String text) {
      int var5 = spans.size();
      long[] var6 = new long[var5];
      long[] var7 = new long[var5];

      for(int var8 = 0; var8 < var5; ++var8) {
         var6[var8] = ((long[])words.get(var8))[0];
         var7[var8] = ((long[])words.get(var8))[1];
      }

      long var10 = var5 == 0 ? start : var7[var5 - 1];
      return new IlIilIilllIilIil(start, var10, text, (String[])spans.toArray(new String[0]), var6, var7);
   }

   private static String lIiiIiIlilli(String mustArtist, List<String> req, int durSec, String errors, int[] urls) {
      int var5 = req.size();
      LinkedBlockingQueue var6 = new LinkedBlockingQueue();
      ArrayList var7 = new ArrayList(var5);
      String[] var8 = new String[var5];
      boolean[] var9 = new boolean[var5];
      int var10 = var5;
      long var11 = 0L;
      long var13 = System.currentTimeMillis() + 8000L;

      try {
         for(int var15 = 0; var15 < var5; ++var15) {
            CompletableFuture var17 = iliIiiliiiii((String)req.get(var15));
            var7.add(var17);
            var17.whenComplete((res, ex) -> var6.offer(IIIllIIliIIl(var15, res, ex, durSec, errors)));
         }

         while(true) {
            int var27 = -1;
            boolean var16 = true;

            for(int var28 = 0; var28 < var5 && var27 < 0; ++var28) {
               if (!var9[var28]) {
                  var16 = false;
               } else if (var8[var28] != null) {
                  var27 = var28;
               }
            }

            long var29 = System.currentTimeMillis();
            if (var27 >= 0 && (var16 || var29 - var11 >= 250L)) {
               String var33 = var8[var27];
               return var33;
            }

            if (var10 == 0) {
               Object var32 = null;
               return (String)var32;
            }

            if (!mustArtist.equals(lIllIlllil)) {
               Object var31 = null;
               return (String)var31;
            }

            if (var29 >= var13) {
               urls[0] += var10;
               String var30 = var27 >= 0 ? var8[var27] : null;
               return var30;
            }

            long var19 = Math.min(120L, var13 - var29);
            if (var27 >= 0) {
               var19 = Math.min(var19, 250L - (var29 - var11));
            }

            for(liiiIlliiiiIll var21 = (liiiIlliiiiIll)var6.poll(Math.max(1L, var19), TimeUnit.MILLISECONDS); var21 != null; var21 = (liiiIlliiiiIll)var6.poll()) {
               if (!var9[var21.IliIlllilIi()]) {
                  var9[var21.IliIlllilIi()] = true;
                  --var10;
                  if (var21.iIlIlllllill()) {
                     int var10002 = urls[0]++;
                  }

                  if (var21.liiiIIllIl() != null) {
                     var8[var21.IliIlllilIi()] = var21.liiiIIllIl();
                     if (var11 == 0L) {
                        var11 = System.currentTimeMillis();
                     }
                  }
               }
            }
         }
      } finally {
         for(CompletableFuture var24 : var7) {
            var24.cancel(true);
         }

      }
   }

   private static CompletableFuture<HttpResponse<String>> iliIiiliiiii(String url) {
      HttpRequest var1 = HttpRequest.newBuilder(URI.create(url)).timeout(Duration.ofSeconds(-2190325867984182076L ^ -2190325867984182077L)).header(Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>()).GET().build();
      return IiIiIIliliIiIIli.iliIIiIlIi.sendAsync(var1, BodyHandlers.ofString(StandardCharsets.UTF_8));
   }

   private static void IIIilIIiiIIi(String s0, long seg, long words, List<String> s1, List<long[]> spans) {
      String[] var7 = s0.trim().split(Iilililiiili<invokedynamic>());
      int var8 = 0;
      double var9 = (double)0.0F;

      for(String var14 : var7) {
         if (!var14.isEmpty()) {
            ++var8;
            var9 += (double)var14.length() + (double)2.0F;
         }
      }

      if (var8 != 0) {
         double var21 = (double)0.0F;

         for(String var16 : var7) {
            if (!var16.isEmpty()) {
               long var17 = seg + Math.round((double)(words - seg) * (var21 / var9));
               var21 += (double)var16.length() + (double)2.0F;
               long var19 = seg + Math.round((double)(words - seg) * (var21 / var9));
               s1.add(var16);
               spans.add(new long[]{var17, var19});
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') << 6))) ^ 182) + '\udfee'))) ^ var5))) - '\uedda') >>> 2 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') << 6))) ^ 182) + '\udfee'))) ^ var5))) - '\uedda') << 14) >>> 6 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') << 6))) ^ 182) + '\udfee'))) ^ var5))) - '\uedda') >>> 2 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] ^ '뜮'))) - 28916) - var5) + '찹') << 6))) ^ 182) + '\udfee'))) ^ var5))) - '\uedda') << 14) << 10) - '킺') ^ var5) - 1315));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static void iIlIlllllill(String artist, String durSec, int title) {
      if (durSec != null && !durSec.isBlank() && title > 1) {
         String var3 = IliIlllilIi(artist, durSec);
         String var4 = var3 + Iilililiiili<invokedynamic>() + title;
         long var5 = System.currentTimeMillis();
         synchronized(iiIlIlllil) {
            iliiIIiIiiiIIi var8 = iIllIlllil;
            boolean var9 = var8 != null && var8.IliIlllilIi().equals(var3);
            if (var9 && var8.liiiIIllIl().length > 0) {
               lIllIlllil = var4;
               return;
            }

            iliiIIiIiiiIIi var10 = (iliiIIiIiiiIIi)iiIlIlllil.get(var4);
            Long var11 = (Long)llllIlllil.get(var4);
            boolean var12 = var11 != null && var5 - var11 < 60000L;
            if (var4.equals(lIllIlllil) && (var11 == null || var12) && (IlllIlllil == 0L || var5 - IlllIlllil < 20000L)) {
               if (!var9 && var10 != null && var10.liiiIIllIl().length > 0) {
                  iIllIlllil = var10;
               }

               return;
            }

            lIllIlllil = var4;
            IlllIlllil = 0L;
            if (var10 != null && (var10.liiiIIllIl().length > 0 || var12)) {
               iIllIlllil = var10;
               return;
            }

            if (var11 != null) {
               llllIlllil.put(var4, var5);
            }

            if (var8 != null && !var9) {
               iIllIlllil = null;
            }
         }

         IIllIlllil.submit(() -> {
            try {
               if (!var4.equals(lIllIlllil)) {
                  return;
               }

               IlIilIilllIilIil[] var5 = IilliliilIIi(var4, artist == null ? "" : artist, durSec, title);
               if (var5 == null) {
                  return;
               }

               iliiIIiIiiiIIi var6 = new iliiIIiIiiiIIi(var3, var5);
               synchronized(iiIlIlllil) {
                  iiIlIlllil.put(var4, var6);
                  if (var5.length == 0) {
                     llllIlllil.put(var4, System.currentTimeMillis());
                  } else {
                     llllIlllil.remove(var4);
                  }

                  if (var4.equals(lIllIlllil)) {
                     iIllIlllil = var6;
                  }
               }
            } catch (Throwable var12) {
               synchronized(iiIlIlllil) {
                  if (var4.equals(lIllIlllil)) {
                     IlllIlllil = System.currentTimeMillis();
                  }
               }
            }

         });
      }
   }

   private static String IIlllIlliIll(String s) {
      return URLEncoder.encode(s.trim(), StandardCharsets.UTF_8);
   }

   static String IliIlllilIi(String title, String artist) {
      return ((title == null ? "" : title) + Iilililiiili<invokedynamic>() + (artist == null ? "" : artist)).toLowerCase(Locale.ROOT);
   }

   private static String Iilllilliill(String t) {
      long var3 = 4483198024612698694L;
      String var1 = t.replaceAll(Iilililiiili<invokedynamic>(), "");
      var3 ^= ((long)var1.indexOf(Iilililiiili<invokedynamic>()) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) > 0) {
         var1 = var1.substring(0, (int)(var3 >>> 32));
      }

      var1 = var1.trim();
      return var1.isEmpty() ? t.trim() : var1;
   }

   private static liiiIlliiiiIll IIIllIIliIIl(int ex, HttpResponse<String> i, Throwable mustArtist, int res, String durSec) {
      if (mustArtist == null && i != null) {
         if (i.statusCode() == (((-202401378 - -3) * -59 >>> 17 | (-202401378 - -3) * -59 << 15) ^ -873274761)) {
            return new liiiIlliiiiIll(ex, (String)null, false);
         } else if (i.statusCode() != (((-151416214 >>> 15 | -151416214 << 17) ^ 23) * -65 - -107 ^ -1515284145)) {
            return new liiiIlliiiiIll(ex, (String)null, true);
         } else {
            try {
               return new liiiIlliiiiIll(ex, IlIlllIlilIl(JsonParser.parseString((String)i.body()), res, durSec), false);
            } catch (RuntimeException var6) {
               return new liiiIlliiiiIll(ex, (String)null, true);
            }
         }
      } else {
         return new liiiIlliiiiIll(ex, (String)null, true);
      }
   }

   private static IlIilIilllIilIil Iiilliiliiil(long next, long start, String body) {
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      Matcher var7 = liIlIlllil.matcher(body);
      ArrayList var8 = new ArrayList();
      ArrayList var9 = new ArrayList();

      while(var7.find()) {
         var8.add(new int[]{var7.start(), var7.end()});
         var9.add(IIillIiliIil(var7.group(1), var7.group(2)));
      }

      if (!var8.isEmpty()) {
         ArrayList var20 = new ArrayList();
         ArrayList var21 = new ArrayList();
         String var22 = body.substring(0, ((int[])var8.get(0))[0]).trim();
         if (!var22.isEmpty()) {
            var20.add(next);
            var21.add(var22);
         }

         for(int var13 = 0; var13 < var8.size(); ++var13) {
            var20.add((Long)var9.get(var13));
            var21.add(body.substring(((int[])var8.get(var13))[1], var13 + 1 < var8.size() ? ((int[])var8.get(var13 + 1))[0] : body.length()));
         }

         long var23 = Math.min(start, (Long)var20.get(var20.size() - 1) + 1200L);

         for(int var15 = 0; var15 < var21.size(); ++var15) {
            long var16 = (Long)var20.get(var15);
            long var18 = var15 + 1 < var20.size() ? (Long)var20.get(var15 + 1) : Math.max(var16 + 200L, var23);
            IIIilIIiiIIi((String)var21.get(var15), var16, var18, var5, var6);
         }

         String var24 = String.join(Iilililiiili<invokedynamic>(), var5);
         return IlIillIiilIi(next, var5, var6, var24);
      } else {
         String var10 = body.replaceAll(Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>()).trim();
         if (!var10.isEmpty() && !var10.equals(Iilililiiili<invokedynamic>())) {
            int var11 = var10.replace(Iilililiiili<invokedynamic>(), "").length();
            long var12 = Math.max(250L, start - next - 120L);
            long var14 = Math.min(var12, Math.max(700L, (long)var11 * 75L + 350L));
            IIIilIIiiIIi(var10, next, next + var14, var5, var6);
            return IlIillIiilIi(next, var5, var6, var10);
         } else {
            return new IlIilIilllIilIil(next, next, "", new String[0], new long[0], new long[0]);
         }
      }
   }

   private static String IlIlllIlilIl(JsonElement e, int mustArtist, String durSec) {
      if (e == null) {
         return null;
      } else if (e.isJsonObject()) {
         return IiIlliIliiIl(e.getAsJsonObject(), mustArtist, (double)3.5F);
      } else if (!e.isJsonArray()) {
         return null;
      } else {
         String var3 = null;
         double var4 = Double.MAX_VALUE;

         for(JsonElement var7 : e.getAsJsonArray()) {
            if (var7.isJsonObject()) {
               JsonObject var8 = var7.getAsJsonObject();
               if (durSec != null && !durSec.isEmpty()) {
                  JsonElement var9 = var8.get(Iilililiiili<invokedynamic>());
                  if (var9 == null || !var9.isJsonPrimitive() || !var9.getAsString().toLowerCase(Locale.ROOT).contains(durSec.toLowerCase(Locale.ROOT))) {
                     continue;
                  }
               }

               String var12 = IiIlliIliiIl(var8, mustArtist, (double)6.0F);
               if (var12 != null) {
                  double var10 = var8.has(Iilililiiili<invokedynamic>()) && var8.get(Iilililiiili<invokedynamic>()).isJsonPrimitive() ? Math.abs(var8.get(Iilililiiili<invokedynamic>()).getAsDouble() - (double)mustArtist) : (double)5.0F;
                  if (var10 < var4) {
                     var4 = var10;
                     var3 = var12;
                  }
               }
            }
         }

         return var3;
      }
   }

   private Iiilililliililil() {
   }

   static IlIilIilllIilIil[] Ililllililil(String songMs, long lrc) {
      ArrayList var3 = new ArrayList();

      record Raw(long t, String body) {
         private final long iIiIIIIiil;
         private final String IliIIIIiil;

         public String liiiIIllIl() {
            return this.IliIIIIiil;
         }

         public long IliIlllilIi() {
            return this.iIiIIIIiil;
         }

         Raw(long t, String body) {
            this.iIiIIIIiil = t;
            this.IliIIIIiil = body;
         }
      }

      for(String var7 : songMs.split(Iilililiiili<invokedynamic>())) {
         Matcher var8 = IiIlIlllil.matcher(var7);
         ArrayList var9 = new ArrayList();

         int var10;
         for(var10 = 0; var8.find() && var8.start() == var10; var10 = var8.end()) {
            var9.add(IIillIiliIil(var8.group(1), var8.group(2)));
         }

         if (!var9.isEmpty()) {
            String var11 = var7.substring(var10).trim();

            for(long var13 : var9) {
               var3.add(new Raw(var13, var11));
            }
         }
      }

      var3.sort(Comparator.comparingLong(Raw::IliIlllilIi));
      IlIilIilllIilIil[] var15 = new IlIilIilllIilIil[var3.size()];

      for(int var16 = 0; var16 < var3.size(); ++var16) {
         long var17 = ((Raw)var3.get(var16)).IliIlllilIi();
         long var18 = var16 + 1 < var3.size() ? ((Raw)var3.get(var16 + 1)).IliIlllilIi() : Math.max(var17 + 4000L, lrc);
         var15[var16] = Iiilliiliiil(var17, var18, ((Raw)var3.get(var16)).liiiIIllIl());
      }

      return var15;
   }

   private static IlIilIilllIilIil[] IilliliilIIi(String artist, String req, String title, int durSec) {
      String var4 = Illlllllilll(req);
      String var5 = Iilllilliill(title);
      String var6 = Iilililiiili<invokedynamic>() + IIlllIlliIll(req) + Iilililiiili<invokedynamic>() + IIlllIlliIll(title) + Iilililiiili<invokedynamic>() + durSec;
      String var7 = Iilililiiili<invokedynamic>() + IIlllIlliIll(var4) + Iilililiiili<invokedynamic>() + IIlllIlliIll(var5) + Iilililiiili<invokedynamic>() + durSec;
      String var8 = Iilililiiili<invokedynamic>() + IIlllIlliIll(title) + Iilililiiili<invokedynamic>() + IIlllIlliIll(var4);
      String var9 = Iilililiiili<invokedynamic>() + IIlllIlliIll(var5) + Iilililiiili<invokedynamic>() + IIlllIlliIll(var4);
      ArrayList var10 = new ArrayList(5);
      var10.add(Iilililiiili<invokedynamic>() + IIlllIlliIll(req) + Iilililiiili<invokedynamic>() + IIlllIlliIll(title) + Iilililiiili<invokedynamic>() + durSec);
      var10.add(var6);
      if (!var7.equals(var6)) {
         var10.add(var7);
      }

      var10.add(var8);
      if (!var9.equals(var8)) {
         var10.add(var9);
      }

      int[] var11 = new int[]{0};
      int var12 = var10.size();
      String var13 = lIiiIiIlilli(artist, var10, durSec, (String)null, var11);
      String[][] var14 = new String[][]{{Iilililiiili<invokedynamic>() + IIlllIlliIll(var4 + Iilililiiili<invokedynamic>() + var5), null}, {Iilililiiili<invokedynamic>() + IIlllIlliIll(var5), var4}};

      for(int var15 = 0; var15 < var14.length && var13 == null; ++var15) {
         if (!artist.equals(lIllIlllil)) {
            return null;
         }

         ++var12;
         var13 = lIiiIiIlilli(artist, List.of(var14[var15][0]), durSec, var14[var15][1], var11);
      }

      if (var13 == null && !artist.equals(lIllIlllil)) {
         return null;
      } else if (var13 == null && var11[0] > 0) {
         throw new IOException(Iilililiiili<invokedynamic>() + var11[0] + Iilililiiili<invokedynamic>() + var12 + Iilililiiili<invokedynamic>());
      } else {
         return var13 == null ? new IlIilIilllIilIil[0] : Ililllililil(var13, (long)durSec * 1000L);
      }
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + 'ꅳ') + 9384) + var5) - '\uf708')))))) + var5) + 10655))))) - var5) + 14586));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '톔'))) - var5) - var5) + '裓'))) + var5) ^ 31620) - var5))))) + 21736));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
