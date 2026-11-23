package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer.Form;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIiIiIlliIiIiIll {
   private static volatile lIiIiIlliIiIiIll ilIlililll;
   private static final Pattern IiiIililll;
   private final Set<String> lIllililll;
   private final boolean IiIlililll;
   private static final Pattern iliIililll;
   private static final Pattern lIIlililll;
   private static final Pattern iIIlililll;
   private static final Pattern IIIlililll;
   private static final Pattern liiIililll;
   public static final Pattern lliIililll;
   private static final Pattern iiiIililll;
   private final Map<String, String> iIllililll;
   private static final int llIlililll = 14;
   private final Set<iIiIiIIlIliIiIIl> iiIlililll;
   private final Set<String> Illlililll;
   public static final String iIiIililll = "/assets/corzclient/config-policy.json";
   public static final Pattern IliIililll;
   private final Map<String, IllllIillllllIil> liIlililll;
   private static final Pattern IlIlililll;
   private final Map<String, Set<String>> IIllililll;

   public ilIIlIliIiIIlIli Iiilliiliiil(String infrastructure, boolean id, boolean banRisk) {
      int[] var10 = new int[10];
      int var6 = System.identityHashCode(var10) + 623052039;
      int var8 = (System.identityHashCode(var10) ^ 1287500875) + -1267333728;
      int var9 = System.identityHashCode(var10) + -526589741;
      ilIIlIliIiIIlIli var4 = this.qim881s4ntme<invokedynamic>(this, infrastructure, id, 0);
      ilIIlIliIiIIlIli var10000;
      if (banRisk && var4 == ilIIlIliIiIIlIli.iIIiiiIlIi) {
         var10000 = ilIIlIliIiIIlIli.llIiiiIlIi;
         if ((var9 | 1434865458) + (var9 & 1434865458) - (var9 + 1434865458) != 0) {
            throw new VerifyError("Inconsistent flow at 54517");
         }
      } else {
         var10000 = var4;
      }

      return var10000;
   }

   public Map<String, String> IIlllIlliIll() {
      return this.iIllililll;
   }

   public boolean Illillliilli(ilIIlIliIiIIlIli code, int role) {
      int[] var8 = new int[11];
      int var4 = System.identityHashCode(var8) + 1920204071;
      int var6 = System.identityHashCode(var8) ^ 1657783922 ^ 791148308;
      int var7 = System.identityHashCode(var8) + 1090712545;
      boolean var10000;
      if (this.u06uqx4rjdwg<invokedynamic>(this, code, 0) && role.31x3qwgb1gboz<invokedynamic>(role, 0)) {
         var10000 = true;
         if (role - role != 0) {
            IIIilIIiiIIi = ~IIIilIIiiIIi;
            throw null;
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   public boolean IlIlllIlilIl() {
      return this.IiIlililll;
   }

   static lIiIiIlliIiIiIll liiiIIllIl() {
      try {
         InputStream var0 = lIiIiIlliIiIiIll.class.3phwhobbb4ez4<invokedynamic>(lIiIiIlliIiIiIll.class, illIlIilIl<invokedynamic>(), 0);

         lIiIiIlliIiIiIll var6;
         label62: {
            try {
               if (var0 == null) {
                  var6 = false.2ncdpqpz7cxir<invokedynamic>(0);
                  break label62;
               }

               String var10000 = new String(var0.1b7err7863y7y<invokedynamic>(var0, 0), StandardCharsets.UTF_8);
               var6 = var10000.jc1fwvhq2cve<invokedynamic>(var10000, 0);
            } catch (Throwable var4) {
               if (var0 != null) {
                  try {
                     var0.3qv7dc3cf35fr<invokedynamic>(var0, 0);
                  } catch (Throwable var3) {
                     var4.h2b74tp0blb7<invokedynamic>(var4, var3, 0);
                  }
               }

               throw var4;
            }

            if (var0 != null) {
               var0.3qv7dc3cf35fr<invokedynamic>(var0, 0);
            }

            return var6;
         }

         if (var0 != null) {
            var0.3qv7dc3cf35fr<invokedynamic>(var0, 0);
         }

         return var6;
      } catch (Exception var5) {
         return false.2ncdpqpz7cxir<invokedynamic>(0);
      }
   }

   public static String iIIIlIlIIl(String value) {
      if (value == null) {
         return null;
      } else {
         Matcher var10000 = IiiIililll.3c2xsfm59le71<invokedynamic>(IiiIililll, value, 0);
         if (var10000.1y83vg8xklk07<invokedynamic>(var10000, 0)) {
            return illIlIilIl<invokedynamic>();
         } else {
            Pattern var2 = iliIililll;
            String var3 = var2.3c2xsfm59le71<invokedynamic>(var2, value.3fkwd0i2exkzr<invokedynamic>(value, Form.NFKC, 0), 0).2t4b31c2gznc6<invokedynamic>(var2.3c2xsfm59le71<invokedynamic>(var2, value.3fkwd0i2exkzr<invokedynamic>(value, Form.NFKC, 0), 0), "", 0);
            String var1 = var3.1m78o796spm8d<invokedynamic>(var3, 0);
            if (var1.2sfxjj95pghsy<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
               return illIlIilIl<invokedynamic>();
            } else {
               if (!var1.3pxv1ucbb0g2f<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
                  Matcher var4 = liiIililll.3c2xsfm59le71<invokedynamic>(liiIililll, var1, 0);
                  if (!var4.1y83vg8xklk07<invokedynamic>(var4, 0)) {
                     if (!var1.2sfxjj95pghsy<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
                        var4 = iiiIililll.3c2xsfm59le71<invokedynamic>(iiiIililll, var1, 0);
                        if (!var4.1y83vg8xklk07<invokedynamic>(var4, 0)) {
                           var4 = IIIlililll.3c2xsfm59le71<invokedynamic>(IIIlililll, var1, 0);
                           if (!var4.1y83vg8xklk07<invokedynamic>(var4, 0)) {
                              var4 = lIIlililll.3c2xsfm59le71<invokedynamic>(lIIlililll, var1, 0);
                              if (!var4.1y83vg8xklk07<invokedynamic>(var4, 0)) {
                                 var4 = iIIlililll.3c2xsfm59le71<invokedynamic>(iIIlililll, var1, 0);
                                 if (var4.1y83vg8xklk07<invokedynamic>(var4, 0)) {
                                    return illIlIilIl<invokedynamic>();
                                 }

                                 return null;
                              }
                           }
                        }
                     }

                     return illIlIilIl<invokedynamic>();
                  }
               }

               return illIlIilIl<invokedynamic>();
            }
         }
      }
   }

   public static String llIIlilIIl(JsonElement node, int depth) {
      int[] var11 = new int[18];
      int var6;
      int var7 = (var6 = System.identityHashCode(var11)) + -1870659056;
      int var8;
      int var9 = (var8 = System.identityHashCode(var11) ^ 4147304) + -2101212182;
      int var10 = System.identityHashCode(var11) + 1948768738;
      if (node != null && !node.k5azpu4kerfu<invokedynamic>(node, 0)) {
         if (depth > (((-1281896769 << 23 | -1281896769 >>> 9) ^ -15) + -99 ^ -1608109123)) {
            return illIlIilIl<invokedynamic>();
         } else if (node.9tft70udran5<invokedynamic>(node, 0)) {
            JsonPrimitive var19 = node.9jmi2zzgda8l<invokedynamic>(node, 0);
            String var20;
            if (var19.3m1cu9hxpt102<invokedynamic>(var19, 0)) {
               var20 = node.2naea9j6vdfwn<invokedynamic>(node, 0).3mx74urzj7n6h<invokedynamic>(node.2naea9j6vdfwn<invokedynamic>(node, 0), 0);
               if ((var9 - var8 - -2101212182 ^ 1) == 0) {
                  throw new VerifyError("Inconsistent flow at 50363");
               }
            } else {
               var20 = null;
            }

            return var20;
         } else if (node.2bn3gcgud0cl6<invokedynamic>(node, 0)) {
            JsonArray var14 = node.6c1f88q2ejl3<invokedynamic>(node, 0);
            Iterator var15 = var14.1y21bufg8zg5l<invokedynamic>(var14, 0);

            while(var15.77nnbf8qvsdq<invokedynamic>(var15, 0)) {
               JsonElement var16 = (JsonElement)var15.8jx0m5nviyi1<invokedynamic>(var15, 0);
               String var5 = var16.qisfxiyt8y3c<invokedynamic>(var16, depth + 1, 0);
               if (var5 != null) {
                  return var5;
               }

               if (!(var11 != var11 ^ true)) {
                  throw new VerifyError("Inconsistent flow at 20612");
               }
            }

            return null;
         } else {
            Class var10000 = node.1ohrmj4st2j22<invokedynamic>(node, 0).30jn7780iebn6<invokedynamic>(node.1ohrmj4st2j22<invokedynamic>(node, 0), 0);
            Iterator var2 = var10000.3htrdellqtvwc<invokedynamic>(var10000, 0);

            while(var2.77nnbf8qvsdq<invokedynamic>(var2, 0)) {
               Map.Entry var3 = (Map.Entry)var2.8jx0m5nviyi1<invokedynamic>(var2, 0);
               var10000 = (String)var3.1jxz7zjvggvl5<invokedynamic>(var3, 0);
               String var4 = var10000.3mx74urzj7n6h<invokedynamic>(var10000, 0);
               if (var4 == null) {
                  var10000 = (JsonElement)var3.bkveeebq6cpp<invokedynamic>(var3, 0);
                  var4 = var10000.qisfxiyt8y3c<invokedynamic>(var10000, depth + 1, 0);
               }

               if (var4 != null) {
                  return var4;
               }

               if ((var7 - var6 - -1870659056 ^ 1) == 0) {
                  throw null;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public static lIiIiIlliIiIiIll IliIlllilIi() {
      lIiIiIlliIiIiIll var0 = ilIlililll;
      if (var0 == null) {
         var0 = false.328vc8u3eqkrr<invokedynamic>(0);
         ilIlililll = var0;
      }

      return var0;
   }

   private static Set<String> lIiiIiIlilli(JsonObject o, String key) {
      JsonObject var11 = o;
      int[] var10 = new int[8];
      int var6 = System.identityHashCode(var10) ^ -39539691;
      int var8 = System.identityHashCode(var10) ^ 1209388850 ^ 613707376;
      int var9 = System.identityHashCode(var10) + -185800072;
      HashSet var2 = new HashSet();
      if (!o.1o8lh7v4xfz7j<invokedynamic>(o, key, 0)) {
         return var2;
      } else {
         JsonArray var10000 = o.1n19bma6wqim5<invokedynamic>(o, key, 0);
         Iterator var3 = var10000.1y21bufg8zg5l<invokedynamic>(var10000, 0);

         while(var3.77nnbf8qvsdq<invokedynamic>(var3, 0)) {
            JsonElement var4 = (JsonElement)var3.8jx0m5nviyi1<invokedynamic>(var3, 0);
            var2.2w801qwihcd9a<invokedynamic>(var2, var4.2naea9j6vdfwn<invokedynamic>(var4, 0).98odfdkmfe8h<invokedynamic>(var4.2naea9j6vdfwn<invokedynamic>(var4, 0), 0), 0);
            if ((System.identityHashCode(var11) ^ System.identityHashCode(var11)) != 0) {
               throw null;
            }
         }

         return var2;
      }
   }

   public static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "lIlIliIlIl";
         Object[] var6 = new Object[]{var4, var0, var2, var3, var1.hashCode()};
         MethodHandle var7 = MethodHandles.insertArguments(var5, 0, var6).asCollector(Object[].class, var2.parameterCount()).asType(var2);
         if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
            throw new BootstrapMethodError();
         } else {
            var4.setTarget(var7);
            return var4;
         }
      }
   }

   public static lIiIiIlliIiIiIll iIlIlllllill() {
      return new lIiIiIlliIiIiIll(false, false.2nqrf4ksybbo8<invokedynamic>(0), iIiIiIIlIliIiIIl.class.2pgxlk5sq0zbu<invokedynamic>(iIiIiIIlIliIiIIl.class, 0), false.2nqrf4ksybbo8<invokedynamic>(0), false.2iq7k9luugejl<invokedynamic>(0), false.2nqrf4ksybbo8<invokedynamic>(0), false.2iq7k9luugejl<invokedynamic>(0));
   }

   public static boolean IIIIllIIIl(String s) {
      int[] var13 = new int[14];
      int var9 = System.identityHashCode(var13) ^ 397297847;
      int var11 = (System.identityHashCode(var13) ^ 1149081070) + -125907073;
      int var12 = System.identityHashCode(var13) + -133593487;
      long var6 = 1822293571366756034L;
      if (s == null) {
         return false;
      } else {
         String[] var1 = s.1do4f7q3lky8z<invokedynamic>(s, illIlIilIl<invokedynamic>(), -1, 0);
         var6 ^= ((long)var1.length << 32 ^ var6) & -1L << 32;
         var6 ^= (0L ^ var6) & -1L >>> 32;

         while((int)var6 < (int)(var6 >>> 32)) {
            String var4 = var1[(int)var6];
            String var5 = var4.1m78o796spm8d<invokedynamic>(var4, 0);
            if (!var5.t8hpy2l5jtr1<invokedynamic>(var5, 0)) {
               Matcher var10000 = IlIlililll.3c2xsfm59le71<invokedynamic>(IlIlililll, var5, 0);
               if (!var10000.34mt34minnzsm<invokedynamic>(var10000, 0)) {
                  return false;
               }
            }

            var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32;
            if (((var12 | ~var12) + 1 ^ 1) == 0) {
               IlIillIiilIi = ~IlIillIiilIi;
               throw null;
            }
         }

         return true;
      }
   }

   private static Object lIlIliIlIl(MutableCallSite var0, MethodHandles.Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = IllIllllIl(var3, var4 ^ var6, 125).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -124739909) != (Integer.rotateLeft(-1694565198 ^ var16, var16 & 31) ^ -124739909)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -506122749) != (Integer.rotateLeft(-579161048 ^ var16, var16 & 31) ^ -506122749)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1836163319) != (Integer.rotateLeft(-280232374 ^ var16, var16 & 31) ^ 1836163319)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -22159218) != (Integer.rotateLeft(-1521385872 ^ var16, var16 & 31) ^ -22159218)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1881401573) != (Integer.rotateLeft(364364182 ^ var16, var16 & 31) ^ -1881401573)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1684077528) != (Integer.rotateLeft(-961226014 ^ var16, var16 & 31) ^ 1684077528)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1394473594) != (Integer.rotateLeft(-1536246156 ^ var16, var16 & 31) ^ -1394473594)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                     } else {
                        var12 = var1.findStaticGetter(var9, var7[2], IiIIlliIIl(var7[3], var11));
                     }
                  } else {
                     var12 = var1.findSetter(var9, var7[2], IiIIlliIIl(var7[3], var11));
                  }
               } else {
                  var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
               }
            } else {
               var12 = var1.findStaticSetter(var9, var7[2], IiIIlliIIl(var7[3], var11));
            }
         } else {
            var12 = var1.findGetter(var9, var7[2], IiIIlliIIl(var7[3], var11));
         }
      } else {
         var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), new Class[]{Integer.TYPE});
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   public IllllIillllllIil IIillIiliIil(String id) {
      return (IllllIillllllIil)this.liIlililll.mbumwmlgmiqc<invokedynamic>(this.liIlililll, id, 0);
   }

   private static Set<String> iliIiiliiiii(JsonElement el) {
      int[] var9 = new int[13];
      int var5 = System.identityHashCode(var9) ^ -1132336720;
      int var7 = System.identityHashCode(var9) ^ -201251945 ^ 1890692914;
      int var8 = System.identityHashCode(var9) + 1514868535;
      HashSet var1 = new HashSet();
      if (el != null && el.2bn3gcgud0cl6<invokedynamic>(el, 0)) {
         JsonArray var10000 = el.6c1f88q2ejl3<invokedynamic>(el, 0);
         Iterator var2 = var10000.1y21bufg8zg5l<invokedynamic>(var10000, 0);

         while(var2.77nnbf8qvsdq<invokedynamic>(var2, 0)) {
            JsonElement var3 = (JsonElement)var2.8jx0m5nviyi1<invokedynamic>(var2, 0);
            var1.2w801qwihcd9a<invokedynamic>(var1, var3.2naea9j6vdfwn<invokedynamic>(var3, 0), 0);
            if ((var8 & ~var8 ^ 1) == 0) {
               throw null;
            }
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      String var17 = var3;
      int[] var13 = new int[15];
      int var9 = System.identityHashCode(var13) ^ -319728032;
      int var11 = (System.identityHashCode(var13) ^ 145936620) + -627574077;
      int var12 = System.identityHashCode(var13) + -1783416126;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)(~((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) - var5) + var5) - '턊'))) >>> 12 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) - var5) + var5) - '턊'))) << 4))))))) >>> 12 | (char)(~((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) - var5) + var5) - '턊'))) >>> 12 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) + var5) - var5) + var5) - '턊'))) << 4))))))) << 4))))) - var5));
         ++var5;
         if ((System.identityHashCode(var17) ^ System.identityHashCode(var17)) != 0) {
            throw new VerifyError("Inconsistent flow at 1722");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IIIllIIliIIl(String s) {
      if (s == null) {
         return "";
      } else {
         String var1 = s.3fkwd0i2exkzr<invokedynamic>(s, Form.NFKC, 0);
         String var10000 = iliIililll.3c2xsfm59le71<invokedynamic>(iliIililll, var1, 0).2t4b31c2gznc6<invokedynamic>(iliIililll.3c2xsfm59le71<invokedynamic>(iliIililll, var1, 0), "", 0).1m78o796spm8d<invokedynamic>(iliIililll.3c2xsfm59le71<invokedynamic>(iliIililll, var1, 0).2t4b31c2gznc6<invokedynamic>(iliIililll.3c2xsfm59le71<invokedynamic>(iliIililll, var1, 0), "", 0), 0);
         var1 = var10000.2oe8e68ed1rhh<invokedynamic>(var10000, illIlIilIl<invokedynamic>(), illIlIilIl<invokedynamic>(), 0);
         return var1.2shf2m7ye5mcz<invokedynamic>(var1, Locale.ROOT, 0);
      }
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5930824443258099388L ^ Long.rotateLeft(3594848592103574193L, 1) ^ -2630117296613601217L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5635918166620848565L ^ Long.rotateLeft(7031354945219682111L, 56) ^ 4117367942648202610L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6672069176134216593L ^ Long.rotateLeft(4875044623230085378L, 34) ^ -4516415750637342521L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6622400643945329700L ^ Long.rotateLeft(-9018859009966196843L, 56) ^ 3982254721356134602L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6898578198048669197L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 501911845986112609L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4210436281105902851L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1267718777059036666L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5971061104664969827L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4445555590511297452L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lilIliilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiIllIiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIiIlIliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lliIliliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiiIlliiIl<invokedynamic>());
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

   public static Class IiIIlliIIl(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   public boolean IIiilIiiiIii(String id) {
      int[] var9 = new int[5];
      int var5 = System.identityHashCode(var9) ^ 32761825;
      int var6;
      int var7 = (var6 = System.identityHashCode(var9) ^ -1468671067) + 149122401;
      int var8 = System.identityHashCode(var9) + -1465803001;
      Collection var10000 = this.IIllililll.3f219z20oi500<invokedynamic>(this.IIllililll, 0);
      Iterator var2 = var10000.3amowcplfawds<invokedynamic>(var10000, 0);

      while(var2.77nnbf8qvsdq<invokedynamic>(var2, 0)) {
         Set var3 = (Set)var2.8jx0m5nviyi1<invokedynamic>(var2, 0);
         if (var3.185otjyq3iq72<invokedynamic>(var3, id, 0)) {
            return true;
         }

         if ((var7 - var6 - 149122401 ^ 1) == 0) {
            throw null;
         }
      }

      return false;
   }

   public Set<String> Illlllllilll() {
      return this.Illlililll;
   }

   public static lIiIiIlliIiIiIll IilliliilIIi(String json) {
      String var16 = json;
      int[] var15 = new int[22];
      int var11 = System.identityHashCode(var15) ^ -912538297;
      int var12;
      int var13 = (var12 = System.identityHashCode(var15) ^ 921822636) ^ 1124527748;
      int var14 = System.identityHashCode(var15) + 1775447442;

      try {
         Class var10000 = json.181f9g0jeilgb<invokedynamic>(json, 0);
         JsonObject var1 = var10000.1ohrmj4st2j22<invokedynamic>(var10000, 0);
         if (var1.1o8lh7v4xfz7j<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0) && (Integer.rotateLeft(var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0).2sqmw1tpiqhx5<invokedynamic>(var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0), 0) ^ 1660173458 * -1963413621 * -1205604855 + 39 ^ -1501868132, var14 & 31) ^ System.identityHashCode(var16) ^ System.identityHashCode(var16)) == 0) {
            if (var1.1o8lh7v4xfz7j<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
               var10000 = var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0);
               if (var10000.2w4hsgdfxjh2g<invokedynamic>(var10000, 0)) {
                  LinkedHashMap var2 = new LinkedHashMap();
                  var10000 = var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0).30jn7780iebn6<invokedynamic>(var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0), 0);
                  Class var3 = var10000.3htrdellqtvwc<invokedynamic>(var10000, 0);

                  while(var3.77nnbf8qvsdq<invokedynamic>(var3, 0)) {
                     Map.Entry var4 = (Map.Entry)var3.8jx0m5nviyi1<invokedynamic>(var3, 0);
                     JsonElement var30 = (JsonElement)var4.bkveeebq6cpp<invokedynamic>(var4, 0);
                     if (!var30.2w4hsgdfxjh2g<invokedynamic>(var30, 0)) {
                        return false.2ncdpqpz7cxir<invokedynamic>(0);
                     }

                     var30 = (JsonElement)var4.bkveeebq6cpp<invokedynamic>(var4, 0);
                     JsonObject var5 = var30.1ohrmj4st2j22<invokedynamic>(var30, 0);
                     String var32 = var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0).2naea9j6vdfwn<invokedynamic>(var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0), 0);
                     ilIIlIliIiIIlIli var6 = var32.2votun7at8uhy<invokedynamic>(var32, 0);
                     if (var5.1o8lh7v4xfz7j<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0)) {
                        var32 = var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0).2naea9j6vdfwn<invokedynamic>(var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0), 0);
                        if (var14 - var14 != 0) {
                           throw null;
                        }
                     } else {
                        var32 = illIlIilIl<invokedynamic>();
                     }

                     String var7 = var32;
                     if (!var7.3ua2bwgyr215g<invokedynamic>(var7, illIlIilIl<invokedynamic>(), 0) && !var7.3ua2bwgyr215g<invokedynamic>(var7, illIlIilIl<invokedynamic>(), 0)) {
                        return false.2ncdpqpz7cxir<invokedynamic>(0);
                     }

                     label217: {
                        if (var5.1o8lh7v4xfz7j<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0)) {
                           JsonElement var34 = var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0);
                           if (var34.9tft70udran5<invokedynamic>(var34, 0)) {
                              var34 = var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0);
                              var32 = var34.2naea9j6vdfwn<invokedynamic>(var34, 0);
                              if (var16 != var16) {
                                 IIlilIliiIli = ~IIlilIliiIli;
                                 throw null;
                              }
                              break label217;
                           }
                        }

                        var32 = null;
                     }

                     String var8;
                     label212: {
                        var8 = var32;
                        if (var5.1o8lh7v4xfz7j<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0)) {
                           JsonElement var37 = var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0);
                           if (var37.9tft70udran5<invokedynamic>(var37, 0)) {
                              var32 = var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0).2naea9j6vdfwn<invokedynamic>(var5.dbywyyn5q70d<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0), 0);
                              if ((var13 ^ var12 ^ 1124527748 ^ 1) == 0) {
                                 throw null;
                              }
                              break label212;
                           }
                        }

                        var32 = null;
                     }

                     String var9 = var32;
                     var2.3hwmdiyf90jjk<invokedynamic>(var2, (String)var4.1jxz7zjvggvl5<invokedynamic>(var4, 0), new IllllIillllllIil((String)var4.1jxz7zjvggvl5<invokedynamic>(var4, 0), var6, var7.3ua2bwgyr215g<invokedynamic>(var7, illIlIilIl<invokedynamic>(), 0), var5.17y5bwzn06k66<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0), var5.17y5bwzn06k66<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0), var5.17y5bwzn06k66<invokedynamic>(var5, illIlIilIl<invokedynamic>(), 0), var8, var9), 0);
                     if ((var13 ^ var12 ^ 1124527748) != 0) {
                        Illillliilli = ~Illillliilli;
                        throw null;
                     }
                  }

                  label202: {
                     var3 = iIiIiIIlIliIiIIl.class.21ayi20svf01k<invokedynamic>(iIiIiIIlIliIiIIl.class, 0);
                     if (var1.1o8lh7v4xfz7j<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
                        JsonElement var39 = var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0);
                        if (var39.2w4hsgdfxjh2g<invokedynamic>(var39, 0)) {
                           var40 = var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0);
                           if (!(var16 != var16 ^ true)) {
                              Iilililiiili = ~Iilililiiili;
                              throw null;
                           }
                           break label202;
                        }
                     }

                     var40 = null;
                  }

                  JsonObject var19 = var40;
                  if (var19 != null && var19.1o8lh7v4xfz7j<invokedynamic>(var19, illIlIilIl<invokedynamic>(), 0)) {
                     JsonElement var41 = var19.dbywyyn5q70d<invokedynamic>(var19, illIlIilIl<invokedynamic>(), 0);
                     if (var41.2bn3gcgud0cl6<invokedynamic>(var41, 0)) {
                        JsonArray var42 = var19.1n19bma6wqim5<invokedynamic>(var19, illIlIilIl<invokedynamic>(), 0);
                        Class var20 = var42.1y21bufg8zg5l<invokedynamic>(var42, 0);

                        while(var20.77nnbf8qvsdq<invokedynamic>(var20, 0)) {
                           JsonElement var22 = (JsonElement)var20.8jx0m5nviyi1<invokedynamic>(var20, 0);
                           var3.2w801qwihcd9a<invokedynamic>(var3, var22.2naea9j6vdfwn<invokedynamic>(var22, 0).1yv6xlbckkkmc<invokedynamic>(var22.2naea9j6vdfwn<invokedynamic>(var22, 0), 0), 0);
                           if ((var14 ^ var14 ^ 1) == 0) {
                              throw null;
                           }
                        }

                        var20 = new LinkedHashMap();
                        if (var1.1o8lh7v4xfz7j<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
                           JsonElement var43 = var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0);
                           if (var43.2w4hsgdfxjh2g<invokedynamic>(var43, 0)) {
                              Set var44 = var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0).30jn7780iebn6<invokedynamic>(var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0), 0);
                              Iterator var23 = var44.3htrdellqtvwc<invokedynamic>(var44, 0);

                              while(var23.77nnbf8qvsdq<invokedynamic>(var23, 0)) {
                                 Map.Entry var25 = (Map.Entry)var23.8jx0m5nviyi1<invokedynamic>(var23, 0);
                                 String var10001 = (String)var25.1jxz7zjvggvl5<invokedynamic>(var25, 0);
                                 JsonElement var10002 = (JsonElement)var25.bkveeebq6cpp<invokedynamic>(var25, 0);
                                 var20.3hwmdiyf90jjk<invokedynamic>(var20, var10001, var10002.25nsep709t4jn<invokedynamic>(var10002, 0), 0);
                                 if (var15 != var15) {
                                    throw null;
                                 }
                              }
                           }
                        }

                        LinkedHashMap var24 = new LinkedHashMap();
                        if (var1.1o8lh7v4xfz7j<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0)) {
                           JsonElement var45 = var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0);
                           if (var45.2w4hsgdfxjh2g<invokedynamic>(var45, 0)) {
                              Set var46 = var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0).30jn7780iebn6<invokedynamic>(var1.2fdcmeiyrlk3t<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0), 0);
                              Iterator var26 = var46.3htrdellqtvwc<invokedynamic>(var46, 0);

                              while(var26.77nnbf8qvsdq<invokedynamic>(var26, 0)) {
                                 Map.Entry var27 = (Map.Entry)var26.8jx0m5nviyi1<invokedynamic>(var26, 0);
                                 var24.3hwmdiyf90jjk<invokedynamic>(var24, ((String)var27.1jxz7zjvggvl5<invokedynamic>(var27, 0)).2shf2m7ye5mcz<invokedynamic>((String)var27.1jxz7zjvggvl5<invokedynamic>(var27, 0), Locale.ROOT, 0), ((JsonElement)var27.bkveeebq6cpp<invokedynamic>(var27, 0)).2naea9j6vdfwn<invokedynamic>((JsonElement)var27.bkveeebq6cpp<invokedynamic>(var27, 0), 0), 0);
                                 if ((var13 ^ var12 ^ 1124527748) != 0) {
                                    IiIiliIiiiIi = ~IiIiliIiiiIi;
                                    throw null;
                                 }
                              }
                           }
                        }

                        Map var10003 = var2.1q0er45z05np<invokedynamic>(var2, 0);
                        Set var10006 = var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0).25nsep709t4jn<invokedynamic>(var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0), 0);
                        JsonElement var10008 = var1.dbywyyn5q70d<invokedynamic>(var1, illIlIilIl<invokedynamic>(), 0);
                        return new lIiIiIlliIiIiIll(true, var10003, var3, var20, var10006, var24, var10008.25nsep709t4jn<invokedynamic>(var10008, 0));
                     }
                  }

                  return false.2ncdpqpz7cxir<invokedynamic>(0);
               }
            }

            return false.2ncdpqpz7cxir<invokedynamic>(0);
         } else {
            return false.2ncdpqpz7cxir<invokedynamic>(0);
         }
      } catch (Exception var17) {
         return false.2ncdpqpz7cxir<invokedynamic>(0);
      }
   }

   public boolean Iliilliiilii(String id) {
      int[] var7 = new int[24];
      int var3 = System.identityHashCode(var7) + 1841410709;
      int var5 = System.identityHashCode(var7) ^ 1087545876 ^ -1037655098;
      int var6 = System.identityHashCode(var7) + -1402817148;
      boolean var10000;
      if (this.IiIlililll && this.lIllililll.185otjyq3iq72<invokedynamic>(this.lIllililll, id, 0)) {
         var10000 = true;
         if ((var6 & ~var6 ^ 1) == 0) {
            IIiilIiiiIii = ~IIiilIiiiIii;
            throw null;
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      MethodHandles.Lookup var14 = var0;
      int[] var13 = new int[3];
      int var9 = System.identityHashCode(var13) + 2084953108;
      int var11 = System.identityHashCode(var13) ^ 1592413568 ^ 640373096;
      int var12 = System.identityHashCode(var13) + -640060992;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) << 12) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) << 12) ^ var5) >>> 6) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) << 12) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\uee3a') + var5) + var5) - 17319) << 15) + var5) << 12) ^ var5) >>> 6) >>> 1));
         ++var5;
         if (!(var14 != var14 ^ true)) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIiIiIlliIiIiIll(boolean extraAllowed, Map<String, IllllIillllllIil> modules, Set<iIiIiIIlIliIiIIl> removed, Map<String, Set<String>> localTypes, Set<String> aliases, Map<String, String> sections, Set<String> available) {
      this.IiIlililll = extraAllowed;
      this.liIlililll = modules;
      this.iiIlililll = removed;
      this.IIllililll = localTypes;
      this.lIllililll = aliases;
      this.iIllililll = sections;
      this.Illlililll = available;
   }

   public IIIlllilIIllli IIIilIIiiIIi(String type, String settingName, iIiIiIIlIliIiIIl moduleId) {
      int[] var14 = new int[24];
      int var10 = System.identityHashCode(var14) ^ -153232292;
      int var12 = (System.identityHashCode(var14) ^ 114170951) + -1600209217;
      int var13 = System.identityHashCode(var14) + 292283515;
      long var7 = 2270213005120368886L;
      if (this.IiIlililll && settingName != null) {
         IllllIillllllIil var4 = (IllllIillllllIil)this.liIlililll.mbumwmlgmiqc<invokedynamic>(this.liIlililll, type, 0);
         if (var4 == null) {
            return IIIlllilIIllli.iillilIIIl;
         } else {
            String var5 = settingName.98odfdkmfe8h<invokedynamic>(settingName, 0);
            Set var10000 = var4.lxe4uhm7bub4<invokedynamic>(var4, 0);
            if (var10000.185otjyq3iq72<invokedynamic>(var10000, var5, 0)) {
               return IIIlllilIIllli.iillilIIIl;
            } else {
               byte var19;
               if (var4.3g2qz9a40rl73<invokedynamic>(var4, 0) != ilIIlIliIiIIlIli.IiIiiiIlIi && var4.3g2qz9a40rl73<invokedynamic>(var4, 0) != ilIIlIliIiIIlIli.ilIiiiIlIi) {
                  var19 = 1;
                  if ((var13 ^ var13 ^ 1) == 0) {
                     throw null;
                  }
               } else {
                  var19 = 0;
               }

               var7 ^= ((long)var19 << 32 ^ var7) & -1L << 32;
               if ((int)(var7 >>> 32) != 0) {
                  Set var20 = var4.3n2kry85rharw<invokedynamic>(var4, 0);
                  if (var20.185otjyq3iq72<invokedynamic>(var20, var5, 0)) {
                     return IIIlllilIIllli.IIililIIIl;
                  }
               }

               if ((int)(var7 >>> 32) != 0) {
                  Set var21 = var4.38semo66x1sny<invokedynamic>(var4, 0);
                  if (var21.185otjyq3iq72<invokedynamic>(var21, var5, 0)) {
                     return IIIlllilIIllli.lIililIIIl;
                  }
               }

               if (var4.16pvg86ych567<invokedynamic>(var4, 0)) {
                  return IIIlllilIIllli.iillilIIIl;
               } else if (moduleId != null && !this.iiIlililll.185otjyq3iq72<invokedynamic>(this.iiIlililll, moduleId, 0)) {
                  Matcher var22 = IliIililll.3c2xsfm59le71<invokedynamic>(IliIililll, settingName, 0);
                  if (!var22.1y83vg8xklk07<invokedynamic>(var22, 0)) {
                     var22 = lliIililll.3c2xsfm59le71<invokedynamic>(lliIililll, settingName, 0);
                     if (!var22.1y83vg8xklk07<invokedynamic>(var22, 0)) {
                        return IIIlllilIIllli.lIililIIIl;
                     }
                  }

                  return IIIlllilIIllli.iillilIIIl;
               } else {
                  return IIIlllilIIllli.iillilIIIl;
               }
            }
         }
      } else {
         return IIIlllilIIllli.iillilIIIl;
      }
   }

   public boolean IIlilIliiIli(ilIIlIliIiIIlIli role) {
      int[] var7 = new int[20];
      int var3 = System.identityHashCode(var7) ^ -1207054062;
      int var5 = (System.identityHashCode(var7) ^ -1912793046) + 2044016101;
      int var6 = System.identityHashCode(var7) + 1594314114;
      boolean var10000;
      if (role == ilIIlIliIiIIlIli.iIIiiiIlIi) {
         var10000 = true;
         if (!(var7 != var7 ^ true)) {
            throw null;
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   public boolean IiIiliIiiiIi(ilIIlIliIiIIlIli role, boolean want) {
      int[] var8 = new int[6];
      int var4 = System.identityHashCode(var8) ^ 1899762288;
      int var5;
      int var6 = (var5 = System.identityHashCode(var8) ^ 195409997) ^ -2074417311;
      int var7 = System.identityHashCode(var8) + -1179468003;
      boolean var10000;
      switch (role.3mtspgiqq5zu3<invokedynamic>(role, 0)) {
         case 0:
            var10000 = true;
            if ((var6 ^ var5 ^ -2074417311 ^ 1) == 0) {
               Iliilliiilii = ~Iliilliiilii;
               throw null;
            }
            break;
         case 1:
         case 2:
            if (!want) {
               var10000 = true;
               if ((var7 & ~var7 ^ 1) == 0) {
                  throw null;
               }
            } else {
               var10000 = false;
               if (((var7 | ~var7) + 1 ^ 1) == 0) {
                  Iiiiliiiiiii = ~Iiiiliiiiiii;
                  throw null;
               }
            }
            break;
         case 3:
            var10000 = want;
            if ((System.identityHashCode(role) ^ System.identityHashCode(role)) != 0) {
               throw new VerifyError("Inconsistent flow at 23672");
            }
            break;
         case 4:
            var10000 = false;
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   static {
      String var10000 = illIlIilIl<invokedynamic>();
      IliIililll = var10000.mleonjbjrals<invokedynamic>(var10000, 2, 0);
      var10000 = illIlIilIl<invokedynamic>();
      lliIililll = var10000.mleonjbjrals<invokedynamic>(var10000, 2, 0);
      var10000 = illIlIilIl<invokedynamic>();
      iliIililll = var10000.ce37x0x3krt1<invokedynamic>(var10000, 0);
      var10000 = illIlIilIl<invokedynamic>();
      IiiIililll = var10000.ce37x0x3krt1<invokedynamic>(var10000, 0);
      var10000 = illIlIilIl<invokedynamic>();
      liiIililll = var10000.mleonjbjrals<invokedynamic>(var10000, 2, 0);
      var10000 = illIlIilIl<invokedynamic>();
      iiiIililll = var10000.mleonjbjrals<invokedynamic>(var10000, 2, 0);
      var10000 = illIlIilIl<invokedynamic>();
      IIIlililll = var10000.ce37x0x3krt1<invokedynamic>(var10000, 0);
      var10000 = illIlIilIl<invokedynamic>();
      lIIlililll = var10000.ce37x0x3krt1<invokedynamic>(var10000, 0);
      var10000 = illIlIilIl<invokedynamic>();
      iIIlililll = var10000.mleonjbjrals<invokedynamic>(var10000, 2, 0);
      var10000 = illIlIilIl<invokedynamic>();
      IlIlililll = var10000.ce37x0x3krt1<invokedynamic>(var10000, 0);
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      String var15 = var1;
      int[] var13 = new int[23];
      int var9 = System.identityHashCode(var13) ^ 938561064;
      int var11 = (System.identityHashCode(var13) ^ 854362209) + 1076416426;
      int var12 = System.identityHashCode(var13) + 113653944;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) << 13 | (char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) >>> 3) - var5))) + var5) ^ var5) >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) << 13 | (char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) >>> 3) - var5))) + var5) ^ var5) << 4) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) << 13 | (char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) >>> 3) - var5))) + var5) ^ var5) >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) << 13 | (char)((char)((char)((char)(var4[var5] - 25707) ^ '\uef2b') << 9 | (char)((char)(var4[var5] - 25707) ^ '\uef2b') >>> 7) - var5) >>> 3) - var5))) + var5) ^ var5) << 4) << 3));
         ++var5;
         if ((System.identityHashCode(var15) ^ System.identityHashCode(var15) ^ 1) == 0) {
            throw new VerifyError("Inconsistent flow at 6269");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iiiiliiiiiii(IIIlllilIIllli v, JsonElement scope) {
      int[] var11 = new int[23];
      int var6;
      int var7 = (var6 = System.identityHashCode(var11)) ^ 1097827081;
      int var8;
      int var9 = (var8 = System.identityHashCode(var11) ^ 554027106) + -670934411;
      int var10 = System.identityHashCode(var11) + -1685269720;
      if (v != null && v != IIIlllilIIllli.iillilIIIl && scope != null && !scope.k5azpu4kerfu<invokedynamic>(scope, 0)) {
         if (v == IIIlllilIIllli.IIililIIIl) {
            if (!scope.9tft70udran5<invokedynamic>(scope, 0)) {
               return false;
            } else {
               JsonPrimitive var3 = scope.9jmi2zzgda8l<invokedynamic>(scope, 0);
               if (var3.akt73vdu6qt1<invokedynamic>(var3, 0)) {
                  double var4 = var3.1iz0csxqcis03<invokedynamic>(var3, 0);
                  boolean var17;
                  if (var4 == var4.2zl6n5ba4pciu<invokedynamic>(var4, 0) && var4.1lmadc3zbxuri<invokedynamic>(var4, 0) <= Double.longBitsToDouble(-5252989538532802135L ^ -664740371830881879L) && ((int)var4).31x3qwgb1gboz<invokedynamic>((int)var4, 0)) {
                     var17 = true;
                     if (var9 - var8 - -670934411 != 0) {
                        IIIIllIIIl = ~IIIIllIIIl;
                        throw null;
                     }
                  } else {
                     var17 = false;
                  }

                  return var17;
               } else if (!var3.3m1cu9hxpt102<invokedynamic>(var3, 0)) {
                  return false;
               } else {
                  String var14 = var3.3i044qowdly7u<invokedynamic>(var3, 0);
                  boolean var16;
                  if (var14.3mx74urzj7n6h<invokedynamic>(var14, 0) == null) {
                     String var15 = var3.3i044qowdly7u<invokedynamic>(var3, 0);
                     if (var15.28d7dshhu8wrc<invokedynamic>(var15, 0)) {
                        var16 = true;
                        if ((var7 ^ var6 ^ 1097827081) != 0) {
                           iIIIlIlIIl = ~iIIIlIlIIl;
                           throw null;
                        }

                        return var16;
                     }
                  }

                  var16 = false;
                  return var16;
               }
            }
         } else {
            boolean var10000;
            if (scope.qisfxiyt8y3c<invokedynamic>(scope, 0, 0) == null) {
               var10000 = true;
               if (var11 != var11) {
                  llIIlilIIl = ~llIIlilIIl;
                  throw null;
               }
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[21];
      int var9 = System.identityHashCode(var13) ^ 1752437671;
      int var11 = (System.identityHashCode(var13) ^ 1674836113) + 2073103819;
      int var12 = System.identityHashCode(var13) + 578756877;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') << 6) + 23177))) >>> 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') << 6) + 23177))) << 13) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') << 6) + 23177))) >>> 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] ^ 5610) + var5) - var5) + var5) + '뱞') << 6) + 23177))) << 13) << 13))) ^ '\uea0a') ^ var5));
         ++var5;
         if ((var12 | 1704552515) + (var12 & 1704552515) - (var12 + 1704552515) != 0) {
            IiIIlliIIl = ~IiIIlliIIl;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Map<String, IllllIillllllIil> IiIlliIliiIl() {
      return this.liIlililll;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      MethodType var16 = var2;
      int[] var13 = new int[9];
      int var9 = System.identityHashCode(var13) + -368970080;
      int var11 = (System.identityHashCode(var13) ^ 1978118638) + -2047971791;
      int var12 = System.identityHashCode(var13) + -1647339817;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) >>> 10) - '섋') + '鰩') + 15641))) ^ 18425) >>> 15 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) >>> 10) - '섋') + '鰩') + 15641))) ^ 18425) << 1) ^ '겮') << 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) >>> 10) - '섋') + '鰩') + 15641))) ^ 18425) >>> 15 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') << 5 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + '詤') >>> 11) ^ '\uf5a6') - '캤') - var5) << 15) >>> 10) - '섋') + '鰩') + 15641))) ^ 18425) << 1) ^ '겮') >>> 8));
         ++var5;
         if ((System.identityHashCode(var16) ^ System.identityHashCode(var16)) != 0) {
            iiIIlIIlIl = ~iiIIlIIlIl;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Set<String> Iilllilliill() {
      return this.lIllililll;
   }

   public ilIIlIliIiIIlIli Ililllililil(String infrastructure, boolean id) {
      int[] var9 = new int[19];
      int var5 = System.identityHashCode(var9) + 1865924939;
      int var7 = System.identityHashCode(var9) ^ 69884296 ^ -1366270537;
      int var8 = System.identityHashCode(var9) + -1944313113;
      if (this.IiIlililll && !id) {
         IllllIillllllIil var3 = (IllllIillllllIil)this.liIlililll.mbumwmlgmiqc<invokedynamic>(this.liIlililll, infrastructure, 0);
         ilIIlIliIiIIlIli var10000;
         if (var3 == null) {
            var10000 = ilIIlIliIiIIlIli.IlIiiiIlIi;
            if ((var8 ^ var8 ^ 1) == 0) {
               lIlIliIlIl = ~lIlIliIlIl;
               throw null;
            }
         } else {
            var10000 = var3.3g2qz9a40rl73<invokedynamic>(var3, 0);
         }

         return var10000;
      } else {
         return ilIIlIliIiIIlIli.IiIiiiIlIi;
      }
   }

   private static String IllIllllIl(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var3[var5] = (byte)(var3[var5] - (var1 ^ var2) ^ var5);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   public boolean IlIillIiilIi(iIiIiIIlIliIiIIl type) {
      int[] var7 = new int[5];
      int var2;
      int var3 = (var2 = System.identityHashCode(var7)) ^ -1058311172;
      int var5 = (System.identityHashCode(var7) ^ 834784941) + 1431419457;
      int var6 = System.identityHashCode(var7) + 1117282176;
      boolean var10000;
      if (type != null && !this.iiIlililll.185otjyq3iq72<invokedynamic>(this.iiIlililll, type, 0)) {
         var10000 = false;
      } else {
         var10000 = true;
         if ((var3 ^ var2 ^ -1058311172) != 0) {
            IllIllllIl = ~IllIllllIl;
            throw null;
         }
      }

      return var10000;
   }

   public boolean Iilililiiili(String section, String id) {
      int[] var9 = new int[22];
      int var5 = System.identityHashCode(var9) ^ -1266169306;
      int var6;
      int var7 = (var6 = System.identityHashCode(var9) ^ -1901054750) ^ -96385215;
      int var8 = System.identityHashCode(var9) + -875480748;
      Set var3 = (Set)this.IIllililll.mbumwmlgmiqc<invokedynamic>(this.IIllililll, section, 0);
      boolean var10000;
      if (var3 != null && var3.185otjyq3iq72<invokedynamic>(var3, id, 0)) {
         var10000 = true;
         if ((var7 ^ var6 ^ -96385215) != 0) {
            throw new VerifyError("Inconsistent flow at 28151");
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }
}
