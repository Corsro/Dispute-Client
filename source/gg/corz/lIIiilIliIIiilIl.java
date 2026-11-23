package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class lIIiilIliIIiilIl {
   public final iiIIliiIIlIlii[] liiililIll;
   private static final int IiiililIll = 128;
   public static final String iIiililIll = "/assets/corzclient/c2visuals/butterfly/";
   public final Matrix4f IIIIiilIll;
   private static final int iliililIll = 65536;
   public final int lIIIiilIll;
   private static final int lliililIll = 4194304;
   public final Map<String, lliIiiililiIiiil> iiiililIll;
   private static final String[] IlIIiilIll = new String[]{IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>()};
   private static final int[][] llIIiilIll = new int[][]{{1, 0, 2, 3}, {5, 1, 3, 7}, {4, 5, 7, 6}, {0, 4, 6, 2}, {5, 4, 0, 1}, {3, 2, 6, 7}};
   private static final float[][] ilIIiilIll = new float[][]{{0.0F, 0.0F, -1.0F}, {1.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 1.0F}, {-1.0F, 0.0F, 0.0F}, {0.0F, -1.0F, 0.0F}, {0.0F, 1.0F, 0.0F}};
   private static final String IliililIll = "/assets/corzclient/";
   public final Vector3f iIIIiilIll;

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) ^ 'ꨦ') - var5) ^ var5) ^ 25284) ^ var5))))))) >>> 5 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) ^ 'ꨦ') - var5) ^ var5) ^ 25284) ^ var5))))))) << 11) - var5) + var5) + 12193) - 4967) + var5) ^ '苽'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean lIiiIiIlilli(String assetPath) {
      long var4 = 2662754788821005124L;

      try {
         InputStream var1 = lIIiilIliIIiilIl.class.getResourceAsStream(IIiilIiiiIii<invokedynamic>() + assetPath);

         try {
            var4 ^= ((long)(var1 != null ? 1 : 0) << 32 ^ var4) & -1L << 32;
         } catch (Throwable var7) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var1 != null) {
            var1.close();
         }
      } catch (IOException var8) {
         return false;
      }

      return (boolean)((int)(var4 >>> 32));
   }

   public int IiIlliIliiIl(String name) {
      for(int var2 = 0; var2 < this.liiililIll.length; ++var2) {
         if (this.liiililIll[var2].liiIiIiIIl.equals(name)) {
            return var2;
         }
      }

      return -1;
   }

   private static String iliIiiliiiii(JsonObject o, String key) {
      JsonElement var2 = o.get(key);
      if (var2 != null && var2.isJsonPrimitive()) {
         return var2.getAsString();
      } else {
         throw new IOException(IIiilIiiiIii<invokedynamic>() + key);
      }
   }

   static JsonObject IlIlllIlilIl(String limit, int path) {
      try {
         InputStream var2 = lIIiilIliIIiilIl.class.getResourceAsStream(limit);

         JsonObject var5;
         try {
            if (var2 == null) {
               throw new IOException(IIiilIiiiIii<invokedynamic>() + limit);
            }

            byte[] var3 = var2.readNBytes(path + 1);
            if (var3.length > path) {
               throw new IOException(IIiilIiiiIii<invokedynamic>() + limit);
            }

            JsonElement var4 = JsonParser.parseString(new String(var3, StandardCharsets.UTF_8));
            if (!var4.isJsonObject()) {
               throw new IOException(IIiilIiiiIii<invokedynamic>() + limit);
            }

            var5 = var4.getAsJsonObject();
         } catch (Throwable var7) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var2 != null) {
            var2.close();
         }

         return var5;
      } catch (RuntimeException var8) {
         throw new IOException(IIiilIiiiIii<invokedynamic>() + limit + IIiilIiiiIii<invokedynamic>() + var8.getMessage(), var8);
      }
   }

   public Matrix4f[] Iilllilliill() {
      Matrix4f[] var1 = new Matrix4f[this.liiililIll.length];
      Arrays.setAll(var1, (i) -> new Matrix4f());
      return var1;
   }

   private static float[] IIIilIIiiIIi(JsonObject key, String fallback, float o) {
      return key.has(fallback) ? lIIlIiiliIIlIiil.iliIiiliiiii(key.get(fallback)) : new float[]{o, o, o};
   }

   private lIIiilIliIIiilIl(iiIIliiIIlIlii[] bones, Map<String, lliIiiililiIiiil> clips, Matrix4f camera, Vector3f shift) {
      this.liiililIll = bones;
      this.iiiililIll = Collections.unmodifiableMap(clips);
      this.IIIIiilIll = camera;
      this.iIIIiilIll = shift;
      this.lIIIiilIll = Arrays.stream(bones).mapToInt((b) -> b.iIIliIiIIl.length / (((-1533581209 ^ -39) >>> 15 | (-1533581209 ^ -39) << 17) ^ 796702425)).sum();
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) << 6 | (char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) >>> 10) - var5))))) + '\ue2f5') - var5) - '鎘') - '샡') + var5) >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) << 6 | (char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) >>> 10) - var5))))) + '\ue2f5') - var5) - '鎘') - '샡') + var5) << 9) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) << 6 | (char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) >>> 10) - var5))))) + '\ue2f5') - var5) - '鎘') - '샡') + var5) >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) << 6 | (char)((char)((char)(~((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - 16527) + var5) >>> 10) - var5))))) + '\ue2f5') - var5) - '鎘') - '샡') + var5) << 9) << 10) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IlIillllllIillll IilliliilIIi(iiIiliiIIlilii knife) {
      if (knife != null && !knife.IliIlllilIi()) {
         JsonObject var1 = IlIlllIlilIl(knife.IiIlliIliiIl(), (--437000875 >>> 9 | --437000875 << 23) ^ 1435239949);

         try {
            return new IlIillllllIillll(knife.IIlllIlliIll(iliIiiliiiii(var1, IIiilIiiiIii<invokedynamic>()), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>()), knife.IIlllIlliIll(iliIiiliiiii(var1, IIiilIiiiIii<invokedynamic>()), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>()), knife.IIlllIlliIll(iliIiiliiiii(var1, IIiilIiiiIii<invokedynamic>()), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>()));
         } catch (IllegalArgumentException var3) {
            throw new IOException(var3.getMessage(), var3);
         }
      } else {
         throw new IOException(IIiilIiiiIii<invokedynamic>());
      }
   }

   lIIiilIliIIiilIl IliIlllilIi(Vector3f by) {
      return by != null && by.isFinite() && by.lengthSquared() != 0.0F ? new lIIiilIliIIiilIl(this.liiililIll, this.iiiililIll, (new Matrix4f()).translation(by).mul(this.IIIIiilIll), (new Vector3f(this.iIIIiilIll)).add(by)) : this;
   }

   public static lIIiilIliIIiilIl Ililllililil(JsonObject animation, JsonObject geometry) {
      JsonObject var2 = animation.getAsJsonArray(IIiilIiiiIii<invokedynamic>()).get(0).getAsJsonObject();
      JsonObject var3 = var2.getAsJsonObject(IIiilIiiiIii<invokedynamic>());
      float var4 = lIIlIiiliIIlIiil.IIIllIIliIIl(var3.get(IIiilIiiiIii<invokedynamic>()));
      float var5 = lIIlIiiliIIlIiil.IIIllIIliIIl(var3.get(IIiilIiiiIii<invokedynamic>()));
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F) && !(var4 > 8192.0F) && !(var5 > 8192.0F)) {
         JsonArray var6 = var2.getAsJsonArray(IIiilIiiiIii<invokedynamic>());
         if (var6.size() > 256) {
            throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
         } else {
            LinkedHashMap var7 = new LinkedHashMap();

            for(JsonElement var9 : var6) {
               JsonObject var10 = var9.getAsJsonObject();
               if (var7.put(var10.get(IIiilIiiiIii<invokedynamic>()).getAsString(), var10) != null) {
                  throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
               }
            }

            LinkedHashMap var27 = new LinkedHashMap();
            ArrayList var28 = new ArrayList();

            while(!var7.isEmpty()) {
               int var29 = var7.size();
               Iterator var11 = var7.entrySet().iterator();

               while(var11.hasNext()) {
                  Map.Entry var12 = (Map.Entry)var11.next();
                  JsonObject var13 = (JsonObject)var12.getValue();
                  if (!var13.has(IIiilIiiiIii<invokedynamic>()) || var27.containsKey(var13.get(IIiilIiiiIii<invokedynamic>()).getAsString())) {
                     var27.put((String)var12.getKey(), var28.size());
                     var28.add(var13);
                     var11.remove();
                  }
               }

               if (var29 == var7.size()) {
                  throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
               }
            }

            iiIIliiIIlIlii[] var30 = new iiIIliiIIlIlii[var28.size()];
            int var31 = 0;

            for(int var32 = 0; var32 < var30.length; ++var32) {
               JsonObject var34 = (JsonObject)var28.get(var32);
               String var14 = var34.get(IIiilIiiiIii<invokedynamic>()).getAsString();
               int var15 = var34.has(IIiilIiiiIii<invokedynamic>()) ? (Integer)var27.get(var34.get(IIiilIiiiIii<invokedynamic>()).getAsString()) : -1;
               float[] var16 = IIIilIIiiIIi(var34, IIiilIiiiIii<invokedynamic>(), 0.0F);
               float[] var17 = IIIilIIiiIIi(var34, IIiilIiiiIii<invokedynamic>(), 0.0F);
               float[] var18 = var15 < 0 ? new float[]{0.0F, 24.0F, 0.0F} : IIIilIIiiIIi((JsonObject)var28.get(var15), IIiilIiiiIii<invokedynamic>(), 0.0F);
               float[] var19 = new float[]{(var16[0] - var18[0]) / 16.0F, (var18[1] - var16[1]) / 16.0F, (var16[2] - var18[2]) / 16.0F};
               int var20 = var14.equals(IIiilIiiiIii<invokedynamic>()) ? 1 : (var14.equals(IIiilIiiiIii<invokedynamic>()) ? -1 : 0);
               ArrayList var21 = new ArrayList();
               if (var20 == 0 && var34.has(IIiilIiiiIii<invokedynamic>())) {
                  for(JsonElement var23 : var34.getAsJsonArray(IIiilIiiiIii<invokedynamic>())) {
                     ++var31;
                     if (var31 > 4096) {
                        throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
                     }

                     IIlilIliiIli(var23.getAsJsonObject(), var16, var4, var5, var21);
                  }
               }

               float[] var49 = new float[var21.size()];

               for(int var51 = 0; var51 < var49.length; ++var51) {
                  var49[var51] = (Float)var21.get(var51);
               }

               float[] var52 = null;
               if (var20 != 0 && var34.has(IIiilIiiiIii<invokedynamic>()) && !var34.getAsJsonArray(IIiilIiiiIii<invokedynamic>()).isEmpty()) {
                  JsonObject var24 = var34.getAsJsonArray(IIiilIiiiIii<invokedynamic>()).get(0).getAsJsonObject();
                  float[] var25 = IIIilIIiiIIi(var24, IIiilIiiiIii<invokedynamic>(), 0.0F);
                  float[] var26 = IIIilIIiiIIi(var24, IIiilIiiiIii<invokedynamic>(), 0.0F);
                  var52 = new float[]{(var25[0] + var26[0] / 2.0F - var16[0]) / 16.0F, (var16[1] - var25[1]) / 16.0F, (var25[2] + var26[2] / 2.0F - var16[2]) / 16.0F};
               }

               var30[var32] = new iiIIliiIIlIlii(var14, var15, var19, var17, var49, var20, var52);
            }

            LinkedHashMap var33 = new LinkedHashMap();
            JsonObject var35 = geometry.getAsJsonObject(IIiilIiiiIii<invokedynamic>());
            if (var35.size() > 128) {
               throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
            } else {
               for(Map.Entry var38 : var35.entrySet()) {
                  String var41 = (String)var38.getKey();
                  if (var41.startsWith(IIiilIiiiIii<invokedynamic>()) || var41.startsWith(IIiilIiiiIii<invokedynamic>()) || var41.startsWith(IIiilIiiiIii<invokedynamic>()) || var41.startsWith(IIiilIiiiIii<invokedynamic>())) {
                     JsonObject var44 = ((JsonElement)var38.getValue()).getAsJsonObject();
                     float var45 = var44.has(IIiilIiiiIii<invokedynamic>()) ? lIIlIiiliIIlIiil.IIIllIIliIIl(var44.get(IIiilIiiiIii<invokedynamic>())) : 0.0F;
                     lIIlIiiliIIlIiil[][] var46 = new lIIlIiiliIIlIiil[var30.length][3];
                     JsonObject var47 = var44.has(IIiilIiiiIii<invokedynamic>()) && var44.get(IIiilIiiiIii<invokedynamic>()).isJsonObject() ? var44.getAsJsonObject(IIiilIiiiIii<invokedynamic>()) : new JsonObject();

                     for(Map.Entry var50 : var47.entrySet()) {
                        Integer var53 = (Integer)var27.get(var50.getKey());
                        if (var53 != null && !((String)var50.getKey()).equals(IIiilIiiiIii<invokedynamic>())) {
                           JsonObject var54 = ((JsonElement)var50.getValue()).getAsJsonObject();
                           String[] var55 = new String[]{IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>()};

                           for(int var56 = 0; var56 < 3; ++var56) {
                              if (var54.has(var55[var56])) {
                                 var46[var53][var56] = lIIlIiiliIIlIiil.IliIlllilIi(var54.get(var55[var56]));
                                 var45 = Math.max(var45, var46[var53][var56].iIlIlllllill());
                              }
                           }
                        }
                     }

                     if (var45 > 300.0F || var45 < 0.0F) {
                        throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
                     }

                     var33.put(var41, new lliIiiililiIiiil(var41, Math.max(0.05F, var45), var46, Iiilliiliiil(var44)));
                  }
               }

               if (var33.containsKey(IIiilIiiiIii<invokedynamic>()) && var33.containsKey(IIiilIiiiIii<invokedynamic>()) && var33.containsKey(IIiilIiiiIii<invokedynamic>())) {
                  Matrix4f[] var37 = new Matrix4f[var30.length];

                  for(int var39 = 0; var39 < var30.length; ++var39) {
                     iiIIliiIIlIlii var42 = var30[var39];
                     var37[var39] = var42.iiiIiIiIIl < 0 ? new Matrix4f() : new Matrix4f(var37[var42.iiiIiIiIIl]);
                     var37[var39].translate(var42.IIIliIiIIl[0], var42.IIIliIiIIl[1], var42.IIIliIiIIl[2]);
                     IiIiliIiiiIi(var37[var39], var42.lIIliIiIIl);
                  }

                  Integer var40 = (Integer)var27.get(IIiilIiiiIii<invokedynamic>());
                  if (var40 == null) {
                     throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
                  } else {
                     Matrix4f var43 = (new Matrix4f()).rotateZ((float)Math.PI).mul((new Matrix4f(var37[var40])).invert());
                     return new lIIiilIliIIiilIl(var30, var33, var43);
                  }
               } else {
                  throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
               }
            }
         }
      } else {
         throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
      }
   }

   public boolean IIlllIlliIll(int root, int bone) {
      for(int var3 = root; var3 >= 0; var3 = this.liiililIll[var3].iiiIiIiIIl) {
         if (var3 == bone) {
            return true;
         }
      }

      return false;
   }

   static JsonObject IIIllIIliIIl(String name) {
      return IlIlllIlilIl(IIiilIiiiIii<invokedynamic>() + name, -1722365911 * -23 + -75 ^ 963904518);
   }

   private static float IlIillIiilIi(float degrees) {
      return degrees * ((float)Math.PI / 180F);
   }

   public float[] Illlllllilll() {
      float[] var1 = new float[this.liiililIll.length * 9];

      for(int var2 = 0; var2 < this.liiililIll.length; ++var2) {
         Arrays.fill(var1, var2 * 9 + 6, var2 * 9 + 9, 1.0F);
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '썎') - var5) + '鰘') + 4372) + '잍'))) ^ var5) + var5) + var5) + '蕌') << 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '썎') - var5) + '鰘') + 4372) + '잍'))) ^ var5) + var5) + var5) + '蕌') >>> 10) << 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '썎') - var5) + '鰘') + 4372) + '잍'))) ^ var5) + var5) + var5) + '蕌') << 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '썎') - var5) + '鰘') + 4372) + '잍'))) ^ var5) + var5) + var5) + '蕌') >>> 10) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IiIiliIiiiIi(Matrix4f m, float[] r) {
      m.rotateZYX(IlIillIiilIi(r[2]), IlIillIiilIi(r[1]), IlIillIiilIi(r[0]));
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(var4[var5] + var5) ^ var5))) + var5))))) >>> 7 | (char)(-((char)(-((char)((char)(~((char)((char)(var4[var5] + var5) ^ var5))) + var5))))) << 9) ^ var5) + 27668) ^ 12069));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIillIiliIil(float[] pose, Matrix4f[] out) {
      for(int var3 = 0; var3 < this.liiililIll.length; ++var3) {
         iiIIliiIIlIlii var4 = this.liiililIll[var3];
         int var5 = var3 * 9;
         Matrix4f var6 = out[var3];
         if (var4.iiiIiIiIIl < 0) {
            var6.identity();
         } else {
            var6.set(out[var4.iiiIiIiIIl]);
         }

         var6.translate(var4.IIIliIiIIl[0] + pose[var5] / 16.0F, var4.IIIliIiIIl[1] - pose[var5 + 1] / 16.0F, var4.IIIliIiIIl[2] + pose[var5 + 2] / 16.0F);
         IiIiliIiiiIi(var6, var4.lIIliIiIIl);
         var6.rotateZYX(IlIillIiilIi(pose[var5 + 5]), IlIillIiilIi(pose[var5 + 4]), IlIillIiilIi(pose[var5 + 3]));
         var6.scale(pose[var5 + 6], pose[var5 + 7], pose[var5 + 8]);
      }

   }

   private static void IIlilIliiIli(JsonObject out, float[] bonePivot, float tw, float c, List<Float> th) {
      float[] var5 = IIIilIIiiIIi(out, IIiilIiiiIii<invokedynamic>(), 0.0F);
      float[] var6 = IIIilIIiiIIi(out, IIiilIiiiIii<invokedynamic>(), 0.0F);
      float[] var7 = out.has(IIiilIiiiIii<invokedynamic>()) ? IIIilIIiiIIi(out, IIiilIiiiIii<invokedynamic>(), 0.0F) : bonePivot;
      float var8 = out.has(IIiilIiiiIii<invokedynamic>()) ? lIIlIiiliIIlIiil.IIIllIIliIIl(out.get(IIiilIiiiIii<invokedynamic>())) : 0.0F;
      Matrix4f var9 = (new Matrix4f()).translate((var7[0] - bonePivot[0]) / 16.0F, (bonePivot[1] - var7[1]) / 16.0F, (var7[2] - bonePivot[2]) / 16.0F);
      IiIiliIiiiIi(var9, IIIilIIiiIIi(out, IIiilIiiiIii<invokedynamic>(), 0.0F));
      Matrix3f var10 = new Matrix3f(var9);
      JsonElement var11 = out.get(IIiilIiiiIii<invokedynamic>());
      if (var11 != null) {
         float[][] var12 = null;
         if (var11.isJsonArray()) {
            float var13 = lIIlIiiliIIlIiil.IIIllIIliIIl(var11.getAsJsonArray().get(0));
            float var14 = lIIlIiiliIIlIiil.IIIllIIliIIl(var11.getAsJsonArray().get(1));
            float var15 = var6[0];
            float var16 = var6[1];
            float var17 = var6[2];
            var12 = new float[][]{{var13 + var17, var14 + var17, var15, var16}, {var13 + var17 + var15, var14 + var17, var17, var16}, {var13 + 2.0F * var17 + var15, var14 + var17, var15, var16}, {var13, var14 + var17, var17, var16}, {var13 + var17, var14, var15, var17}, {var13 + var17 + var15, var14 + var17, var15, -var17}};
         }

         for(int var30 = 0; var30 < 6; ++var30) {
            int var32 = 0;
            float[] var31;
            if (var12 != null) {
               var31 = var12[var30];
            } else {
               JsonObject var33 = var11.getAsJsonObject().getAsJsonObject(IlIIiilIll[var30]);
               if (var33 == null) {
                  continue;
               }

               JsonArray var35 = var33.getAsJsonArray(IIiilIiiiIii<invokedynamic>());
               JsonArray var18 = var33.getAsJsonArray(IIiilIiiiIii<invokedynamic>());
               if (var33.has(IIiilIiiiIii<invokedynamic>())) {
                  float var19 = lIIlIiiliIIlIiil.IIIllIIliIIl(var33.get(IIiilIiiiIii<invokedynamic>()));
                  if (var19 % 90.0F != 0.0F) {
                     throw new IllegalArgumentException(IIiilIiiiIii<invokedynamic>());
                  }

                  var32 = Math.floorMod(Math.round(var19 / 90.0F), 4);
               }

               var31 = new float[]{lIIlIiiliIIlIiil.IIIllIIliIIl(var35.get(0)), lIIlIiiliIIlIiil.IIIllIIliIIl(var35.get(1)), lIIlIiiliIIlIiil.IIIllIIliIIl(var18.get(0)), lIIlIiiliIIlIiil.IIIllIIliIIl(var18.get(1))};
            }

            Vector3f var34 = (new Vector3f(ilIIiilIll[var30])).mul(var10).normalize();

            for(int var36 = 0; var36 < 4; ++var36) {
               int var37 = llIIiilIll[var30][var36];
               float var38 = var5[0] - var7[0] + ((var37 & 1) == 0 ? -var8 : var6[0] + var8);
               float var20 = var7[1] - var5[1] - var6[1] + ((var37 & 2) == 0 ? -var8 : var6[1] + var8);
               float var21 = var5[2] - var7[2] + ((var37 & 4) == 0 ? -var8 : var6[2] + var8);
               Vector3f var22 = (new Vector3f(var38 / 16.0F, var20 / 16.0F, var21 / 16.0F)).mulPosition(var9);
               int var23 = Math.floorMod(var36 - var32, 4);
               float var24 = (var31[0] + (var23 != 0 && var23 != 3 ? 0.0F : var31[2])) / tw;
               float var25 = (var31[1] + (var23 >= 2 ? var31[3] : 0.0F)) / c;

               for(float var29 : new float[]{var22.x, var22.y, var22.z, var24, var25, var34.x, var34.y, var34.z}) {
                  th.add(var29);
               }
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6977340774594443255L ^ Long.rotateLeft(5857217478213941452L, 54) ^ -6150171136952460353L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -9032524644594925380L ^ Long.rotateLeft(-5917612591871658839L, 43) ^ -3669136572595782954L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8722180252160630453L ^ Long.rotateLeft(-6047408493903059445L, 28) ^ -2647927311794567431L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7826572883803660213L ^ Long.rotateLeft(-3713535629852299494L, 12) ^ -1098394583312518767L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1657307187034227968L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2063235481881476326L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2963481942115214137L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1386078883984000854L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 863332950570277026L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8669407963805804075L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   private lIIiilIliIIiilIl(iiIIliiIIlIlii[] clips, Map<String, lliIiiililiIiiil> bones, Matrix4f camera) {
      this(clips, bones, camera, new Vector3f());
   }

   private static List<IIIilIIilIIilIIi> Iiilliiliiil(JsonObject clip) {
      if (clip.has(IIiilIiiiIii<invokedynamic>()) && clip.get(IIiilIiiiIii<invokedynamic>()).isJsonObject()) {
         ArrayList var1 = new ArrayList();

         for(Map.Entry var3 : clip.getAsJsonObject(IIiilIiiiIii<invokedynamic>()).entrySet()) {
            float var4;
            try {
               var4 = lIIlIiiliIIlIiil.IIIllIIliIIl(new JsonPrimitive((String)var3.getKey()));
            } catch (RuntimeException var10) {
               continue;
            }

            if (!(var4 < 0.0F) && !(var4 > 300.0F)) {
               JsonArray var5 = new JsonArray();
               if (((JsonElement)var3.getValue()).isJsonArray()) {
                  var5 = ((JsonElement)var3.getValue()).getAsJsonArray();
               } else {
                  var5.add((JsonElement)var3.getValue());
               }

               for(JsonElement var7 : var5) {
                  if (var1.size() >= 128) {
                     break;
                  }

                  if (var7.isJsonObject() && var7.getAsJsonObject().has(IIiilIiiiIii<invokedynamic>())) {
                     JsonElement var8 = var7.getAsJsonObject().get(IIiilIiiiIii<invokedynamic>());
                     if (var8.isJsonPrimitive()) {
                        String var9 = var8.getAsString();
                        if (var9.matches(IIiilIiiiIii<invokedynamic>()) && !var9.contains(IIiilIiiiIii<invokedynamic>())) {
                           var1.add(new IIIilIIilIIilIIi(var4, var9));
                        }
                     }
                  }
               }
            }
         }

         var1.sort(Comparator.comparingDouble(IIIilIIilIIilIIi::IliIlllilIi));
         return List.copyOf(var1);
      } else {
         return List.of();
      }
   }

   public static lIIiilIliIIiilIl iIlIlllllill(iiIiliiIIlilii knife) {
      if (knife == null) {
         throw new IOException(IIiilIiiiIii<invokedynamic>());
      } else if (knife.IliIlllilIi()) {
         return liiiIIllIl();
      } else {
         IlIillllllIillll var1 = IilliliilIIi(knife);
         lIIiilIliIIiilIl var2 = Ililllililil(IlIlllIlilIl(IIiilIiiiIii<invokedynamic>() + var1.IliIlllilIi(), (-319569719 >>> 23 | -319569719 << 9) ^ 43 ^ -406744078), IlIlllIlilIl(IIiilIiiiIii<invokedynamic>() + var1.liiiIIllIl(), (1915613724 >>> 7 | 1915613724 << 25) * 723362913 ^ -1904680604));
         return var2.IliIlllilIi(illIIIlIilIIIl.IliIlllilIi(knife, var2));
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) >>> 15 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) << 1) ^ var5) >>> 8 | (char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) >>> 15 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) << 1) ^ var5) << 8))) - var5) ^ 4569) + '셩'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIIiilIliIIiilIl liiiIIllIl() {
      return Ililllililil(IIIllIIliIIl(IIiilIiiiIii<invokedynamic>()), IIIllIIliIIl(IIiilIiiiIii<invokedynamic>()));
   }
}
