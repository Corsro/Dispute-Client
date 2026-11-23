package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIIIIillIIIIil {
   public static final int lillillIiiillillIi = 1;
   private static final int iIilillIiIlilillIi = 16;
   private static final long llilillIiililillIi = 253402300799999L;
   public static final int IIilillIilIilillIi = 16384;

   private static String Iiilliiliiil(String arm, String context) {
      return arm + '\n' + context;
   }

   private static boolean IIillIiliIil(String text) {
      return text != null && text.getBytes(StandardCharsets.UTF_8).length <= 16384;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) << 14 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) >>> 2) >>> 9 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) << 14 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) >>> 2) << 7) ^ var5) - var5) ^ '鈲') + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) << 14 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) >>> 2) >>> 9 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) << 14 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + var5) ^ var5) ^ var5) << 15) >>> 2) << 7) ^ var5) - var5) ^ '鈲') + var5) >>> 9))) + '\uec54') ^ var5))) ^ '逨'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static lliiliiliili IIIllIIliIIl(JsonObject o) {
      lliilIlliliilIll var1 = new lliilIlliliilIll();
      if (o == null) {
         return var1.IlIillIiilIi();
      } else {
         var1.IiIiliIiiiIi(new lliiliiliili(IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<invokedynamic>())), 2), IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<invokedynamic>())), 2), IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<invokedynamic>())), 4), Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)0.0F), Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)8.0F), Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)12.0F), IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<invokedynamic>())), 2)));
         return var1.IlIillIiilIi();
      }
   }

   private static Set<String> Ililllililil(List<lliililliliilill> refs, int k) {
      long var6 = 562712271416770622L;
      HashSet var2 = new HashSet();
      Iterator var3 = refs.iterator();

      for(long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < k && var3.hasNext(); var8 += 4294967296L) {
         lliililliliilill var5 = (lliililliliilill)var3.next();
         var2.add(Iiilliiliiil(var5.IliIlllilIi(), var5.liiiIIllIl()));
      }

      return var2;
   }

   private static String Illlllllilll(String name) {
      long var4 = -135921877717161089L;
      if (name == null) {
         return "";
      } else {
         String var1 = name.toLowerCase(Locale.ROOT);
         if (var1.length() > 16) {
            return "";
         } else {
            for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < var1.length(); var4 += 4294967296L) {
               var4 ^= ((long)var1.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
               if (((int)var4 < 97 || (int)var4 > 122) && ((int)var4 < 48 || (int)var4 > 57) && (int)var4 != 95) {
                  return "";
               }
            }

            return var1;
         }
      }
   }

   private static double IIlllIlliIll(double mean, lIlIIliIlIIl arm, String f) {
      return IiIIIlliIIIl.Iliilliiilii(mean, (double)-1.0F, (double)1.0F, iliilIIlIiiilIIl.liiiIIllIl(arm, f));
   }

   private static double[] IiIiliIiiiIi(JsonArray size, int fallback, double a) {
      long var6 = 4863474438567769819L;
      double[] var4 = new double[fallback];

      for(long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < fallback; var8 += 4294967296L) {
         var4[(int)(var8 >>> 32)] = size != null && (int)(var8 >>> 32) < size.size() ? Iilililiiili(size.get((int)(var8 >>> 32)), a) : a;
      }

      return var4;
   }

   private static JsonArray Iiiiliiiiiii(JsonElement e) {
      return e != null && e.isJsonArray() ? e.getAsJsonArray() : null;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) ^ '骪') - var5) - 16440))) + '\ue00f') - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String Iilllilliill(String uuid) {
      if (uuid != null && !uuid.isEmpty() && uuid.length() <= 36) {
         try {
            return UUID.fromString(uuid).toString();
         } catch (IllegalArgumentException var2) {
            return "";
         }
      } else {
         return "";
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)var4[var5] - 17362) ^ 19892) - var5))) ^ '큛') ^ '\uea7f') + '膤') + '鎆') ^ var5) + var5) ^ var5) + var5))) - '\uf750') - '\ue02c') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6598512804967099689L ^ Long.rotateLeft(-2819965912167804793L, 6) ^ 5178178529792064744L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8186858221021710284L ^ Long.rotateLeft(8245548769688586644L, 12) ^ 2378236148141506717L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1665272966889506958L ^ Long.rotateLeft(-913926416820187541L, 7) ^ 1171680828400300087L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7359288295929857821L ^ Long.rotateLeft(-293045198434740088L, 28) ^ -2219741829467305603L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8098556069292598458L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -548065260428524966L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6252092211209564081L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5282905410535574759L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5067225686958434731L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5922809143497755070L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(llIIlilIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIIlliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiIIlIIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIlIliIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IllIllllIl<invokedynamic>());
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

   private static Map<String, double[]> IilliliilIIi(String key, Map<String, double[]> arms) {
      long var10 = 6156594003986140023L;
      if (key != null && arms != null) {
         var10 ^= ((long)key.indexOf(124) << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) < 0) {
            return null;
         } else {
            lIlIIliIlIIl var3 = iliilIIlIiiilIIl.Illlllllilll(key.substring(0, (int)(var10 >>> 32)));
            if (var3 != null && iliilIIlIiiilIIl.IilliliilIIi(key.substring((int)(var10 >>> 32) + 1))) {
               List var4 = iliilIIlIiiilIIl.IliIlllilIi(var3);
               LinkedHashMap var5 = new LinkedHashMap();

               for(Map.Entry var7 : arms.entrySet()) {
                  String var8 = (String)var7.getKey();
                  double[] var9 = (double[])var7.getValue();
                  if (var8 != null && var9 != null && var9.length >= 2 && var4.contains(var8) && !var5.containsKey(var8)) {
                     if (var5.size() >= 8) {
                        break;
                     }

                     var5.put(var8, new double[]{IiIlliIliiIl(var9[0]), IIlllIlliIll(var9[1], var3, var8)});
                  }
               }

               return var5.isEmpty() ? null : var5;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static String lIiiIiIlilli(ililllilIiilllil s, Set<String> dropped) {
      JsonObject var2 = new JsonObject();
      var2.addProperty(iIIIlIlIIl<invokedynamic>(), 1);
      var2.addProperty(iIIIlIlIIl<invokedynamic>(), s.IilliliilIIi());
      var2.addProperty(iIIIlIlIIl<invokedynamic>(), s.lIiiIiIlilli());
      var2.addProperty(iIIIlIlIIl<invokedynamic>(), s.iliIiiliiiii());
      var2.addProperty(iIIIlIlIIl<invokedynamic>(), s.IIIllIIliIIl());
      JsonObject var3 = new JsonObject();
      var3.add(iIIIlIlIIl<invokedynamic>(), IIIilIIiiIIi(s.IlIlllIlilIl().IliIlllilIi()));
      var3.add(iIIIlIlIIl<invokedynamic>(), IIIilIIiiIIi(s.IlIlllIlilIl().liiiIIllIl()));
      var3.addProperty(iIIIlIlIIl<invokedynamic>(), s.IlIlllIlilIl().iIlIlllllill());
      var3.addProperty(iIIIlIlIIl<invokedynamic>(), s.IlIlllIlilIl().IilliliilIIi());
      var3.addProperty(iIIIlIlIIl<invokedynamic>(), s.IlIlllIlilIl().lIiiIiIlilli());
      var3.addProperty(iIIIlIlIIl<invokedynamic>(), s.IlIlllIlilIl().iliIiiliiiii());
      var3.addProperty(iIIIlIlIIl<invokedynamic>(), s.IlIlllIlilIl().IIIllIIliIIl());
      var2.add(iIIIlIlIIl<invokedynamic>(), var3);
      JsonObject var4 = new JsonObject();
      var4.add(iIIIlIlIIl<invokedynamic>(), IlIillIiilIi(s.IiIlliIliiIl().IliIlllilIi()));
      var4.add(iIIIlIlIIl<invokedynamic>(), IlIillIiilIi(s.IiIlliIliiIl().liiiIIllIl()));
      var4.add(iIIIlIlIIl<invokedynamic>(), IlIillIiilIi(s.IiIlliIliiIl().iIlIlllllill()));
      var4.addProperty(iIIIlIlIIl<invokedynamic>(), s.IiIlliIliiIl().IilliliilIIi());
      var4.addProperty(iIIIlIlIIl<invokedynamic>(), s.IiIlliIliiIl().lIiiIiIlilli());
      var4.addProperty(iIIIlIlIIl<invokedynamic>(), s.IiIlliIliiIl().iliIiiliiiii());
      var4.add(iIIIlIlIIl<invokedynamic>(), IlIillIiilIi(s.IiIlliIliiIl().IIIllIIliIIl()));
      var2.add(iIIIlIlIIl<invokedynamic>(), var4);
      JsonObject var5 = new JsonObject();

      for(Map.Entry var7 : s.IIlllIlliIll().entrySet()) {
         JsonObject var8 = new JsonObject();

         for(Map.Entry var10 : ((Map)var7.getValue()).entrySet()) {
            if (!dropped.contains(Iiilliiliiil((String)var7.getKey(), (String)var10.getKey()))) {
               JsonArray var11 = new JsonArray();
               var11.add(new JsonPrimitive(((double[])var10.getValue())[0]));
               var11.add(new JsonPrimitive(((double[])var10.getValue())[1]));
               var8.add((String)var10.getKey(), var11);
            }
         }

         if (var8.size() > 0) {
            var5.add((String)var7.getKey(), var8);
         }
      }

      var2.add(iIIIlIlIIl<invokedynamic>(), var5);
      var2.add(iIIIlIlIIl<invokedynamic>(), IlIillIiilIi(s.Illlllllilll()));
      return var2.toString();
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 20007) + var5) + var5) - 15034) ^ var5))) ^ var5) ^ var5))) - var5) - var5) ^ 'ꊷ'))) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static Map<String, Map<String, double[]>> IlIlllIlilIl(JsonObject o) {
      LinkedHashMap var1 = new LinkedHashMap();
      if (o == null) {
         return var1;
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for(Map.Entry var4 : o.entrySet()) {
            JsonObject var5 = Iliilliiilii((JsonElement)var4.getValue());
            if (var5 != null) {
               LinkedHashMap var6 = new LinkedHashMap();

               for(Map.Entry var8 : var5.entrySet()) {
                  JsonArray var9 = Iiiiliiiiiii((JsonElement)var8.getValue());
                  if (var9 != null && var9.size() >= 2) {
                     var6.put((String)var8.getKey(), new double[]{Iilililiiili(var9.get(0), (double)0.0F), Iilililiiili(var9.get(1), Double.NaN)});
                  }
               }

               Map var10 = IilliliilIIi((String)var4.getKey(), var6);
               if (var10 != null) {
                  lIlIIliIlIIl var11 = iliilIIlIiiilIIl.Illlllllilll(((String)var4.getKey()).substring(0, ((String)var4.getKey()).indexOf(124)));
                  List var12 = (List)var2.computeIfAbsent(var11, (k) -> new ArrayList());
                  if (var1.remove(var4.getKey()) != null) {
                     var12.remove(var4.getKey());
                  }

                  var1.put((String)var4.getKey(), var10);
                  var12.add((String)var4.getKey());

                  while(var12.size() > 16) {
                     var1.remove(var12.remove(0));
                  }
               }
            }
         }

         return var1;
      }
   }

   private static double Iilililiiili(JsonElement e, double fallback) {
      if (e != null && e.isJsonPrimitive()) {
         JsonPrimitive var3 = e.getAsJsonPrimitive();
         if (!var3.isNumber()) {
            return fallback;
         } else {
            try {
               return var3.getAsDouble();
            } catch (RuntimeException var5) {
               return fallback;
            }
         }
      } else {
         return fallback;
      }
   }

   private static double IiIlliIliiIl(double n) {
      return Double.isNaN(n) ? (double)0.0F : IiIIIlliIIIl.IIiilIiiiIii(n, (double)0.0F, (double)1000000.0F);
   }

   private static int[] IIlilIliiIli(JsonArray size, int a) {
      long var4 = 8819716146248810513L;
      int[] var2 = new int[a];

      for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < a; var6 += 4294967296L) {
         var2[(int)(var6 >>> 32)] = size != null && (int)(var6 >>> 32) < size.size() ? Illillliilli(Iilililiiili(size.get((int)(var6 >>> 32)), (double)0.0F)) : 0;
      }

      return var2;
   }

   public static ililllilIiilllil liiiIIllIl(String json) {
      long var11 = 2724303257607750913L;
      if (json != null && json.length() <= 16384) {
         JsonObject var1;
         try {
            JsonElement var2 = JsonParser.parseString(json);
            if (var2 == null || !var2.isJsonObject()) {
               return null;
            }

            var1 = var2.getAsJsonObject();
         } catch (StackOverflowError | RuntimeException var14) {
            return null;
         }

         try {
            if (Iilililiiili(var1.get(iIIIlIlIIl<invokedynamic>()), Double.NaN) != (double)1.0F) {
               return null;
            } else {
               String var15 = Illlllllilll(IIiilIiiiIii(var1.get(iIIIlIlIIl<invokedynamic>())));
               String var3 = Iilllilliill(IIiilIiiiIii(var1.get(iIIIlIlIIl<invokedynamic>())));
               long var4 = (long)IiIIIlliIIIl.Iliilliiilii(Iilililiiili(var1.get(iIIIlIlIIl<invokedynamic>()), (double)0.0F), (double)0.0F, 2.53402300799999E14, (double)0.0F);
               var11 ^= ((long)Illillliilli(Iilililiiili(var1.get(iIIIlIlIIl<invokedynamic>()), (double)0.0F)) << 32 ^ var11) & -1L << 32;
               iilIlIilIIiIlIil var7 = iliIiiliiiii(Iliilliiilii(var1.get(iIIIlIlIIl<invokedynamic>())));
               lliiliiliili var8 = IIIllIIliIIl(Iliilliiilii(var1.get(iIIIlIlIIl<invokedynamic>())));
               Map var9 = IlIlllIlilIl(Iliilliiilii(var1.get(iIIIlIlIIl<invokedynamic>())));
               int[] var10 = lillililiillilil.liiiIIllIl(IIlilIliiIli(Iiiiliiiiiii(var1.get(iIIIlIlIIl<invokedynamic>())), 6)).IliIlllilIi();
               return new ililllilIiilllil(1, var15, var3, var4, (int)(var11 >>> 32), var7, var8, var9, var10);
            }
         } catch (RuntimeException var13) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String IIiilIiiiIii(JsonElement e) {
      return e != null && e.isJsonPrimitive() && e.getAsJsonPrimitive().isString() ? e.getAsString() : null;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 32764))) - var5) + var5) - 8384) ^ '윩') ^ var5) + '踨') - var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 32764))) - var5) + var5) - 8384) ^ '윩') ^ var5) + '踨') - var5) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int Illillliilli(double v) {
      return Double.isNaN(v) ? 0 : (int)Math.round(IiIIIlliIIIl.IIiilIiiiIii(v, (double)0.0F, (double)1000000.0F));
   }

   private IIIIIillIIIIil() {
   }

   private static JsonArray IIIilIIiiIIi(double[] a) {
      long var7 = 6825389242666712230L;
      JsonArray var1 = new JsonArray();
      double[] var2 = a;
      var7 ^= ((long)a.length << 32 ^ var7) & -1L << 32;

      for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         double var5 = var2[(int)var10];
         var1.add(new JsonPrimitive(var5));
      }

      return var1;
   }

   static ililllilIiilllil iIlIlllllill(ililllilIiilllil r) {
      IiIIIlliIIIl var1 = new IiIIIlliIIIl();
      var1.Iiilliiliiil(r.IlIlllIlilIl());
      lliilIlliliilIll var2 = new lliilIlliliilIll();
      var2.IiIiliIiiiIi(r.IiIlliIliiIl());
      LinkedHashMap var3 = new LinkedHashMap();
      if (r.IIlllIlliIll() != null) {
         for(Map.Entry var5 : r.IIlllIlliIll().entrySet()) {
            Map var6 = IilliliilIIi((String)var5.getKey(), (Map)var5.getValue());
            if (var6 != null) {
               var3.put((String)var5.getKey(), var6);
            }
         }
      }

      long var7 = Math.max(0L, Math.min(253402300799999L, r.iliIiiliiiii()));
      return new ililllilIiilllil(1, Illlllllilll(r.IilliliilIIi()), Iilllilliill(r.lIiiIiIlilli()), var7, lillililiillilil.iliIiiliiiii(r.IIIllIIliIIl()), var1.Ililllililil(), var2.IlIillIiilIi(), var3, lillililiillilil.liiiIIllIl(r.Illlllllilll()).IliIlllilIi());
   }

   public static String IliIlllilIi(ililllilIiilllil r) {
      long var10 = 6379791400311389493L;
      long var12 = -3738406896646989731L;
      if (r == null) {
         return null;
      } else {
         ililllilIiilllil var1 = iIlIlllllill(r);
         String var2 = lIiiIiIlilli(var1, Set.of());
         if (IIillIiliIil(var2)) {
            return var2;
         } else {
            ArrayList var3 = new ArrayList();
            var10 ^= (0L ^ var10) & -1L << 32;

            for(Map.Entry var6 : var1.IIlllIlliIll().entrySet()) {
               for(Map.Entry var8 : ((Map)var6.getValue()).entrySet()) {
                  String var10003 = (String)var6.getKey();
                  String var10004 = (String)var8.getKey();
                  double var10005 = ((double[])var8.getValue())[0];
                  int var10006 = (int)(var10 >>> 32);
                  var10 += 4294967296L;
                  var3.add(new lliililliliilill(var10003, var10004, var10005, var10006));
               }
            }

            var3.sort(Comparator.comparingDouble(lliililliliilill::iIlIlllllill).thenComparingInt(lliililliliilill::IilliliilIIi));
            var10 ^= (1L ^ var10) & -1L >>> 32;
            var12 ^= ((long)var3.size() << 32 ^ var12) & -1L << 32;
            String var14 = lIiiIiIlilli(var1, Ililllililil(var3, (int)(var12 >>> 32)));

            while((int)var10 < (int)(var12 >>> 32)) {
               var12 ^= ((long)((int)var10 + (int)(var12 >>> 32) >>> 1) ^ var12) & -1L >>> 32;
               String var9 = lIiiIiIlilli(var1, Ililllililil(var3, (int)var12));
               if (IIillIiliIil(var9)) {
                  var12 ^= ((long)((int)var12) << 32 ^ var12) & -1L << 32;
                  var14 = var9;
               } else {
                  var10 ^= ((long)((int)var12 + 1) ^ var10) & -1L >>> 32;
               }
            }

            if (!IIillIiliIil(var14)) {
               var14 = lIiiIiIlilli(var1, Ililllililil(var3, (int)var10));
            }

            return IIillIiliIil(var14) ? var14 : null;
         }
      }
   }

   private static JsonArray IlIillIiilIi(int[] a) {
      long var6 = 4817671937902723561L;
      long var8 = 6199395505199169700L;
      JsonArray var1 = new JsonArray();
      int[] var2 = a;
      var6 ^= ((long)a.length << 32 ^ var6) & -1L << 32;

      for(long var11 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         var8 ^= ((long)var2[(int)var11] << 32 ^ var8) & -1L << 32;
         var1.add(new JsonPrimitive((int)(var8 >>> 32)));
      }

      return var1;
   }

   private static iilIlIilIIiIlIil iliIiiliiiii(JsonObject o) {
      IiIIIlliIIIl var1 = new IiIIIlliIIIl();
      if (o == null) {
         return var1.Ililllililil();
      } else {
         double[] var2 = IiIiliIiiiIi(Iiiiliiiiiii(o.get(iIIIlIlIIl<invokedynamic>())), 3, (double)0.0F);
         double[] var3 = IiIiliIiiiIi(Iiiiliiiiiii(o.get(iIIIlIlIIl<invokedynamic>())), 3, (double)0.0F);
         var1.Iiilliiliiil(new iilIlIilIIiIlIil(var2, var3, Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)1.0F), Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)1.0F), Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)1.0F), Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)0.0F), Illillliilli(Iilililiiili(o.get(iIIIlIlIIl<invokedynamic>()), (double)0.0F))));
         return var1.Ililllililil();
      }
   }

   private static JsonObject Iliilliiilii(JsonElement e) {
      return e != null && e.isJsonObject() ? e.getAsJsonObject() : null;
   }
}
