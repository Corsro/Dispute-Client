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
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIlIiiliIlIiil {
   private static boolean IIlllIlliIll(JsonElement el) {
      int[] var6 = new int[16];
      int var1;
      int var2 = (var1 = System.identityHashCode(var6)) + -2070221728;
      int var4 = System.identityHashCode(var6) ^ 452001063 ^ -850475942;
      int var5 = System.identityHashCode(var6) + 428114564;
      boolean var10000;
      if (el != null && el.2lpz8vh3ss1r1<invokedynamic>(el, 0) && ((JsonPrimitive)el).2bjmvlm506ajp<invokedynamic>((JsonPrimitive)el, 0)) {
         var10000 = true;
         if ((var2 - var1 - -2070221728 ^ 1) == 0) {
            throw new VerifyError("Inconsistent flow at 21355");
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   private static boolean IiIlliIliiIl(JsonElement el) {
      int[] var6 = new int[28];
      int var1;
      int var2 = (var1 = System.identityHashCode(var6)) + 903146184;
      int var4 = System.identityHashCode(var6) ^ 899193684 ^ -873056477;
      int var5 = System.identityHashCode(var6) + 6151736;
      boolean var10000;
      if (el != null && el.2lpz8vh3ss1r1<invokedynamic>(el, 0) && ((JsonPrimitive)el).9ei7ex4o6m1x<invokedynamic>((JsonPrimitive)el, 0)) {
         var10000 = true;
         if ((var2 - var1 - 903146184 ^ 1) == 0) {
            throw null;
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   public static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "Ililllililil";
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

   private static int IIIllIIliIIl(JsonElement r, int el, iliiIIllIiiiIIll depth) {
      int var14 = el;
      iliiIIllIiiiIIll var16 = depth;
      int[] var13 = new int[22];
      int var9 = System.identityHashCode(var13) ^ 1062296968;
      int var11 = (System.identityHashCode(var13) ^ 944109886) + 1368680104;
      int var12 = System.identityHashCode(var13) + 91726396;
      long var6 = -4925703570568547278L;
      if (el > (-(1394685137 ^ 45) * 1736263375 ^ 1889353777)) {
         return el;
      } else {
         var6 ^= ((long)el << 32 ^ var6) & -1L << 32;
         if (r.15f6daveu932c<invokedynamic>(r, 0)) {
            Set var10000 = r.370kksu1xteky<invokedynamic>(r, 0).2owtozw53vhem<invokedynamic>(r.370kksu1xteky<invokedynamic>(r, 0), 0);
            Iterator var4 = var10000.2ia2k6y6540dp<invokedynamic>(var10000, 0);

            while(var4.1re2xz2ctb7dv<invokedynamic>(var4, 0)) {
               Map.Entry var5 = (Map.Entry)var4.1az7xau2khs0g<invokedynamic>(var4, 0);
               String var20 = (String)var5.2upgx5ynpwp3x<invokedynamic>(var5, 0);
               if (var20.2rc5dp0nwd88m<invokedynamic>(var20, 0)) {
                  StringBuilder var10001 = (new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0);
                  depth.9eo1x6tbnovc<invokedynamic>(depth, var10001.32w3eo9pq0gc2<invokedynamic>(var10001, (String)var5.2upgx5ynpwp3x<invokedynamic>(var5, 0), 0).27inl07qeua6b<invokedynamic>(var10001.32w3eo9pq0gc2<invokedynamic>(var10001, (String)var5.2upgx5ynpwp3x<invokedynamic>(var5, 0), 0), 0), 0);
               }

               int var21 = (int)(var6 >>> 32);
               JsonElement var24 = (JsonElement)var5.36v09yob0h197<invokedynamic>(var5, 0);
               var6 ^= ((long)var21.3bzta1an3o011<invokedynamic>(var21, var24.3owgec3edlmwr<invokedynamic>(var24, el + 1, depth, 0), 0) << 32 ^ var6) & -1L << 32;
               if ((System.identityHashCode(var16) ^ System.identityHashCode(var16) ^ 1) == 0) {
                  throw null;
               }
            }

            if (!(r != r ^ true)) {
               IilliliilIIi = ~IilliliilIIi;
               throw null;
            }
         } else if (r.3vgfcpknj54ph<invokedynamic>(r, 0)) {
            JsonArray var22 = r.1uim0eoczdpog<invokedynamic>(r, 0);
            Iterator var17 = var22.21e4w7gtm9s36<invokedynamic>(var22, 0);

            while(var17.1re2xz2ctb7dv<invokedynamic>(var17, 0)) {
               JsonElement var18 = (JsonElement)var17.1az7xau2khs0g<invokedynamic>(var17, 0);
               var6 ^= ((long)((int)(var6 >>> 32)).3bzta1an3o011<invokedynamic>((int)(var6 >>> 32), var18.3owgec3edlmwr<invokedynamic>(var18, el + 1, depth, 0), 0) << 32 ^ var6) & -1L << 32;
               if (var14 - var14 != 0) {
                  lIiiIiIlilli = ~lIiiIiIlilli;
                  throw null;
               }
            }

            if (((var12 | -650184676) + (var12 & -650184676) - (var12 + -650184676) ^ 1) == 0) {
               throw new VerifyError("Inconsistent flow at 10272");
            }
         } else if (r.2lpz8vh3ss1r1<invokedynamic>(r, 0)) {
            JsonPrimitive var23 = r.ho12ezoqcgcj<invokedynamic>(r, 0);
            if (var23.2bjmvlm506ajp<invokedynamic>(var23, 0) && r.srezkl5f2mjq<invokedynamic>(r, 0).cl4m0cvw64<invokedynamic>(r.srezkl5f2mjq<invokedynamic>(r, 0), 0) > (~(12345622 * 1749801491) ^ 635832157)) {
               depth.9eo1x6tbnovc<invokedynamic>(depth, IIIilIIiiIIi<invokedynamic>(), 0);
            }
         }

         return (int)(var6 >>> 32);
      }
   }

   public static iliiIIllIiiiIIll liiiIIllIl(byte[] rootOut, JsonObject[] bytes) {
      iliiIIllIiiiIIll var2 = new iliiIIllIiiiIIll();
      if (rootOut != null && rootOut.length != 0) {
         if (rootOut.length > ((~1838294867 << 1 | ~1838294867 >>> 31) ^ 617328985)) {
            StringBuilder var10001 = (new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), rootOut.length, 0).32w3eo9pq0gc2<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), rootOut.length, 0), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), rootOut.length, 0).32w3eo9pq0gc2<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), rootOut.length, 0), IIIilIIiiIIi<invokedynamic>(), 0), ~(-291519080 ^ -77) ^ -292567596, 0);
            var2.9eo1x6tbnovc<invokedynamic>(var2, var10001.32w3eo9pq0gc2<invokedynamic>(var10001, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var10001.32w3eo9pq0gc2<invokedynamic>(var10001, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
            return var2;
         } else {
            String var3 = new String(rootOut, StandardCharsets.UTF_8);
            byte[] var10000 = var3.3sjkh6yx5s8j5<invokedynamic>(var3, StandardCharsets.UTF_8, 0);
            if (!var10000.27r8tce5y86ve<invokedynamic>(var10000, rootOut, 0)) {
               var2.9eo1x6tbnovc<invokedynamic>(var2, IIIilIIiiIIi<invokedynamic>(), 0);
               return var2;
            } else {
               JsonObject var4;
               try {
                  JsonElement var5 = var3.2qmspfm4b7flw<invokedynamic>(var3, 0);
                  if (!var5.15f6daveu932c<invokedynamic>(var5, 0)) {
                     var2.9eo1x6tbnovc<invokedynamic>(var2, IIIilIIiiIIi<invokedynamic>(), 0);
                     return var2;
                  }

                  var4 = var5.370kksu1xteky<invokedynamic>(var5, 0);
               } catch (Exception var6) {
                  var2.9eo1x6tbnovc<invokedynamic>(var2, IIIilIIiiIIi<invokedynamic>(), 0);
                  return var2;
               }

               var4.27rapu6dj7djq<invokedynamic>(var4, var2, 0);
               if (bytes != null && bytes.length > 0) {
                  bytes[0] = var4;
               }

               return var2;
            }
         }
      } else {
         var2.9eo1x6tbnovc<invokedynamic>(var2, IIIilIIiiIIi<invokedynamic>(), 0);
         return var2;
      }
   }

   public static iliiIIllIiiiIIll IliIlllilIi(byte[] bytes) {
      return bytes.31el742t6gm1r<invokedynamic>(bytes, (JsonObject[])null, 0);
   }

   private lIlIiiliIlIiil() {
   }

   public static Class Iilllilliill(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      MethodHandles.Lookup var14 = var0;
      int[] var13 = new int[20];
      int var9 = System.identityHashCode(var13) + -855642459;
      int var11 = (System.identityHashCode(var13) ^ 1333168937) + 1195996378;
      int var12 = System.identityHashCode(var13) + -1357352548;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) >>> 13 | (char)((char)((char)(~var4[var5]) + var5) + var5) << 3) + var5) - '\uedea') + var5))) + 3881) + var5) - 1222) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) >>> 13 | (char)((char)((char)(~var4[var5]) + var5) + var5) << 3) + var5) - '\uedea') + var5))) + 3881) + var5) - 1222) >>> 7) ^ 8865) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) >>> 13 | (char)((char)((char)(~var4[var5]) + var5) + var5) << 3) + var5) - '\uedea') + var5))) + 3881) + var5) - 1222) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) >>> 13 | (char)((char)((char)(~var4[var5]) + var5) + var5) << 3) + var5) - '\uedea') + var5))) + 3881) + var5) - 1222) >>> 7) ^ 8865) << 10));
         ++var5;
         if (var14 != var14) {
            throw new VerifyError("Inconsistent flow at 15644");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[23];
      int var9 = System.identityHashCode(var13) + 598738390;
      int var11 = System.identityHashCode(var13) ^ -406856327 ^ -481332466;
      int var12 = System.identityHashCode(var13) + -2142453661;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\ud8bb') - 21144) + var5) ^ '빉') ^ 11944) >>> 9 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\ud8bb') - 21144) + var5) ^ '빉') ^ 11944) << 7) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\ud8bb') - 21144) + var5) ^ '빉') ^ 11944) >>> 9 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\ud8bb') - 21144) + var5) ^ '빉') ^ 11944) << 7) << 5) - '\ueafd'))));
         ++var5;
         if (((var12 ^ -1462808585) + ((var12 & -1462808585) << 1) - (var12 + -1462808585) ^ 1) == 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IlIlllIlilIl(JsonElement el) {
      int[] var6 = new int[5];
      int var2 = System.identityHashCode(var6) ^ -1168319326;
      int var3;
      int var4 = (var3 = System.identityHashCode(var6) ^ 894672975) + -448418069;
      int var5 = System.identityHashCode(var6) + 263266510;
      boolean var10;
      if (el != null && el.2lpz8vh3ss1r1<invokedynamic>(el, 0)) {
         JsonPrimitive var10000 = el.ho12ezoqcgcj<invokedynamic>(el, 0);
         if (var10000.5deozp3ojdok<invokedynamic>(var10000, 0)) {
            double var8 = el.32fojtexwtqwt<invokedynamic>(el, 0);
            double var10001 = el.32fojtexwtqwt<invokedynamic>(el, 0);
            if (var8 == var10001.y1ldp0zrp8ov<invokedynamic>(var10001, 0)) {
               var8 = el.32fojtexwtqwt<invokedynamic>(el, 0);
               if (!var8.1lai0x69lldf5<invokedynamic>(var8, 0)) {
                  var10 = true;
                  if ((var4 - var3 - -448418069 ^ 1) == 0) {
                     throw null;
                  }

                  return var10;
               }
            }
         }
      }

      var10 = false;
      return var10;
   }

   private static void lIiiIiIlilli(JsonObject root, iliiIIllIiiiIIll r) {
      int[] var15 = new int[20];
      int var10;
      int var11 = (var10 = System.identityHashCode(var15)) + -931468902;
      int var12;
      int var13 = (var12 = System.identityHashCode(var15) ^ -1916917315) ^ -1174241740;
      int var14 = System.identityHashCode(var15) + 1256932004;
      long var8 = -195232249557855442L;
      var8 ^= ((long)root.3owgec3edlmwr<invokedynamic>(root, 1, r, 0) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) > ((~-292744059 + 113) * 65 ^ -51 ^ -1848501910)) {
         StringBuilder var10001 = (new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), (int)(var8 >>> 32), 0).32w3eo9pq0gc2<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), (int)(var8 >>> 32), 0), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), (int)(var8 >>> 32), 0).32w3eo9pq0gc2<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), (int)(var8 >>> 32), 0), IIIilIIiiIIi<invokedynamic>(), 0), (642051435 * -93 + 15 >>> 1 | 642051435 * -93 + 15 << 31) ^ 209379348, 0);
         r.9eo1x6tbnovc<invokedynamic>(r, var10001.32w3eo9pq0gc2<invokedynamic>(var10001, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var10001.32w3eo9pq0gc2<invokedynamic>(var10001, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
      }

      label171: {
         if (root.3t6kwipmkhyzc<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0)) {
            JsonElement var10000 = root.29uj5fvp8xpy0<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
            if (var10000.331awi5thr0rs<invokedynamic>(var10000, 0)) {
               var10000 = root.29uj5fvp8xpy0<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
               var8 ^= ((long)var10000.ks5omxe57x3h<invokedynamic>(var10000, 0) ^ var8) & -1L >>> 32;
               if ((int)var8 < (~(-88889517 - -101) ^ 88889414)) {
                  StringBuilder var32 = new StringBuilder();
                  var32 = var32.32w3eo9pq0gc2<invokedynamic>(var32, IIIilIIiiIIi<invokedynamic>(), 0);
                  var32 = var32.2o35uwu1uz9qt<invokedynamic>(var32, (int)var8, 0);
                  var32 = var32.32w3eo9pq0gc2<invokedynamic>(var32, IIIilIIiiIIi<invokedynamic>(), 0);
                  r.9eo1x6tbnovc<invokedynamic>(r, var32.27inl07qeua6b<invokedynamic>(var32, 0), 0);
                  if (!(var15 != var15 ^ true)) {
                     throw null;
                  }
               } else if ((int)var8 > (((-503216170 >>> 11 | -503216170 << 21) - -1 - 1 >>> 31 | (-503216170 >>> 11 | -503216170 << 21) - -1 - 1 << 1) ^ -172457888)) {
                  StringBuilder var36 = (new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), (int)var8, 0);
                  r.9eo1x6tbnovc<invokedynamic>(r, var36.32w3eo9pq0gc2<invokedynamic>(var36, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var36.32w3eo9pq0gc2<invokedynamic>(var36, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
               }
               break label171;
            }
         }

         r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
         if ((var14 ^ var14 ^ 1) == 0) {
            iliIiiliiiii = ~iliIiiliiiii;
            throw null;
         }
      }

      Set var27 = root.2owtozw53vhem<invokedynamic>(root, 0);
      Iterator var3 = var27.2ia2k6y6540dp<invokedynamic>(var27, 0);

      while(var3.1re2xz2ctb7dv<invokedynamic>(var3, 0)) {
         Map.Entry var4 = (Map.Entry)var3.1az7xau2khs0g<invokedynamic>(var3, 0);
         String var5 = (String)var4.2upgx5ynpwp3x<invokedynamic>(var4, 0);
         if (var5.2rc5dp0nwd88m<invokedynamic>(var5, 0)) {
            StringBuilder var37 = new StringBuilder();
            r.9eo1x6tbnovc<invokedynamic>(r, var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), var5, 0).27inl07qeua6b<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), var5, 0), 0), 0);
            if ((var11 - var10 - -931468902 ^ 1) == 0) {
               throw new VerifyError("Inconsistent flow at 46512");
            }
         } else if (!IiiiiIIlliiiiIIl.iiiiililIl.tl5e9aqvyirb<invokedynamic>(IiiiiIIlliiiiIIl.iiiiililIl, var5, 0)) {
            StringBuilder var38 = new StringBuilder();
            r.9eo1x6tbnovc<invokedynamic>(r, var38.32w3eo9pq0gc2<invokedynamic>(var38, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var38.32w3eo9pq0gc2<invokedynamic>(var38, IIIilIIiiIIi<invokedynamic>(), 0), var5, 0).27inl07qeua6b<invokedynamic>(var38.32w3eo9pq0gc2<invokedynamic>(var38, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var38.32w3eo9pq0gc2<invokedynamic>(var38, IIIilIIiiIIi<invokedynamic>(), 0), var5, 0), 0), 0);
         }

         if (((var14 | -447907868) + (var14 & -447907868) - (var14 + -447907868) ^ 1) == 0) {
            IlIlllIlilIl = ~IlIlllIlilIl;
            throw null;
         }
      }

      String var18 = root.1nmxbp2z1jasr<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
      if (var18 != null && !var18.1rt2ikdky4oli<invokedynamic>(var18, 0)) {
         if (var18.cl4m0cvw64<invokedynamic>(var18, 0) < (1326630103 + -81 - 7 ^ 1326630012) || var18.cl4m0cvw64<invokedynamic>(var18, 0) > (~(1738422580 * 35) ^ 97 ^ -715248190)) {
            r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
         }

         if (var18.329bjkxh4kwxf<invokedynamic>(var18, 0)) {
            r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
         }
      } else {
         r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
         if ((var13 ^ var12 ^ -1174241740 ^ 1) == 0) {
            throw null;
         }
      }

      String var19 = root.1nmxbp2z1jasr<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
      if (var19 != null && var19.cl4m0cvw64<invokedynamic>(var19, 0) > (~(-1430061251 * 91 ^ 57) ^ 1286555265)) {
         r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
      }

      if (root.3t6kwipmkhyzc<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0)) {
         JsonElement var28 = root.29uj5fvp8xpy0<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
         if (!var28.3vgfcpknj54ph<invokedynamic>(var28, 0)) {
            r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
            if ((var14 + -1032303651 - var14 - -1032303651 ^ 1) == 0) {
               throw null;
            }
         } else {
            JsonArray var20 = root.2z91ao6pbp9op<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
            if (var20.y3mnp77hrzj2<invokedynamic>(var20, 0) > (-(-1534733127 - -9) ^ 1534733110)) {
               r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
            }

            Iterator var6 = var20.21e4w7gtm9s36<invokedynamic>(var20, 0);

            while(var6.1re2xz2ctb7dv<invokedynamic>(var6, 0)) {
               JsonElement var7 = (JsonElement)var6.1az7xau2khs0g<invokedynamic>(var6, 0);
               if (!var7.3e9uijagwsxqt<invokedynamic>(var7, 0)) {
                  r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
               }

               if (var14 + -1174436117 - var14 - -1174436117 != 0) {
                  IIIllIIliIIl = ~IIIllIIliIIl;
                  throw null;
               }
            }
         }
      }

      if (root.3t6kwipmkhyzc<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0)) {
         JsonElement var29 = root.29uj5fvp8xpy0<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
         if (!var29.15f6daveu932c<invokedynamic>(var29, 0)) {
            r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
            if (!(root != root ^ true)) {
               throw null;
            }
         } else {
            JsonObject var21 = root.1q6nlw1zvhzm5<invokedynamic>(root, IIIilIIiiIIi<invokedynamic>(), 0);
            Set var30 = var21.wa8hta9q777f<invokedynamic>(var21, 0);
            Iterator var22 = var30.2ia2k6y6540dp<invokedynamic>(var30, 0);

            while(var22.1re2xz2ctb7dv<invokedynamic>(var22, 0)) {
               String var23 = (String)var22.1az7xau2khs0g<invokedynamic>(var22, 0);
               if (!IiiiiIIlliiiiIIl.IIIIIiilIl.tl5e9aqvyirb<invokedynamic>(IiiiiIIlliiiiIIl.IIIIIiilIl, var23, 0)) {
                  StringBuilder var39 = new StringBuilder();
                  r.9eo1x6tbnovc<invokedynamic>(r, var39.32w3eo9pq0gc2<invokedynamic>(var39, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var39.32w3eo9pq0gc2<invokedynamic>(var39, IIIilIIiiIIi<invokedynamic>(), 0), var23, 0).27inl07qeua6b<invokedynamic>(var39.32w3eo9pq0gc2<invokedynamic>(var39, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var39.32w3eo9pq0gc2<invokedynamic>(var39, IIIilIIiiIIi<invokedynamic>(), 0), var23, 0), 0), 0);
               }

               if ((var13 ^ var12 ^ -1174241740 ^ 1) == 0) {
                  throw new VerifyError("Inconsistent flow at 43237");
               }
            }

            if (var21.3t6kwipmkhyzc<invokedynamic>(var21, IIIilIIiiIIi<invokedynamic>(), 0)) {
               JsonElement var31 = var21.29uj5fvp8xpy0<invokedynamic>(var21, IIIilIIiiIIi<invokedynamic>(), 0);
               if (!var31.15f6daveu932c<invokedynamic>(var31, 0)) {
                  r.9eo1x6tbnovc<invokedynamic>(r, IIIilIIiiIIi<invokedynamic>(), 0);
                  if ((var11 - var10 - -931468902 ^ 1) == 0) {
                     throw new VerifyError("Inconsistent flow at 46704");
                  }
               } else {
                  var21.1q6nlw1zvhzm5<invokedynamic>(var21, IIIilIIiiIIi<invokedynamic>(), 0).1wz7bvwlmtc4g<invokedynamic>(var21.1q6nlw1zvhzm5<invokedynamic>(var21, IIIilIIiiIIi<invokedynamic>(), 0), r, 0);
               }
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      String var17 = var3;
      int[] var13 = new int[12];
      int var9 = System.identityHashCode(var13) ^ -589875032;
      int var11 = System.identityHashCode(var13) ^ 1209464971 ^ -78413323;
      int var12 = System.identityHashCode(var13) + -1836823518;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) >>> 11) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) >>> 11) ^ var5) >>> 13) + '饎') >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) >>> 11) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 8988) - 133))) ^ 27039) + var5) + var5) + '\ud94b') + var5) >>> 11) ^ var5) >>> 13) + '饎') << 15));
         ++var5;
         if ((System.identityHashCode(var17) ^ System.identityHashCode(var17) ^ 1) == 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[18];
      int var9 = System.identityHashCode(var13) + -2109805749;
      int var11 = (System.identityHashCode(var13) ^ -1740402223) + 1198403558;
      int var12 = System.identityHashCode(var13) + -1464711716;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - 'ꃽ'))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - 'ꃽ'))) << 8) ^ var5) ^ var5))) ^ var5))) ^ 3910) << 8 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - 'ꃽ'))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - 'ꃽ'))) << 8) ^ var5) ^ var5))) ^ var5))) ^ 3910) >>> 8))) ^ var5))) ^ 14556) + var5) - var5))));
         ++var5;
         if ((var12 & ~var12 ^ 1) == 0) {
            IiIlliIliiIl = ~IiIlliIliiIl;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[6];
      int var9 = System.identityHashCode(var13) + 1603901911;
      int var11 = System.identityHashCode(var13) ^ 1336484205 ^ -863423567;
      int var12 = System.identityHashCode(var13) + -1171913268;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) << 14) << 4 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) << 14) >>> 12))))) >>> 11 | (char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) << 14) << 4 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 29134) ^ var5) + 30288) + 1742))) << 14) >>> 12))))) << 5));
         ++var5;
         if (((var12 | -914919729) + (var12 & -914919729) - (var12 + -914919729) ^ 1) == 0) {
            throw new VerifyError("Inconsistent flow at 35843");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void iliIiiliiiii(JsonObject r, iliiIIllIiiiIIll modules) {
      JsonObject var15 = r;
      int[] var14 = new int[29];
      int var9;
      int var10 = (var9 = System.identityHashCode(var14)) + -1748198706;
      int var11;
      int var12 = (var11 = System.identityHashCode(var14) ^ 1184145941) ^ 2016780732;
      int var13 = System.identityHashCode(var14) + 1140063766;
      long var7 = 1659213275396727339L;
      if (r.m89231gs1e0d<invokedynamic>(r, 0) > (((1529635226 << 1 | 1529635226 >>> 31) + 73) * 67 ^ -105 ^ 1187304480)) {
         StringBuilder var10001 = (new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), r.m89231gs1e0d<invokedynamic>(r, 0), 0).32w3eo9pq0gc2<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), r.m89231gs1e0d<invokedynamic>(r, 0), 0), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), r.m89231gs1e0d<invokedynamic>(r, 0), 0).32w3eo9pq0gc2<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>((new StringBuilder()).32w3eo9pq0gc2<invokedynamic>(new StringBuilder(), IIIilIIiiIIi<invokedynamic>(), 0), r.m89231gs1e0d<invokedynamic>(r, 0), 0), IIIilIIiiIIi<invokedynamic>(), 0), ~-1017408177 * -630453915 ^ -1763818128, 0);
         modules.9eo1x6tbnovc<invokedynamic>(modules, var10001.32w3eo9pq0gc2<invokedynamic>(var10001, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var10001.32w3eo9pq0gc2<invokedynamic>(var10001, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
      }

      Set var10000 = r.2owtozw53vhem<invokedynamic>(r, 0);
      Iterator var2 = var10000.2ia2k6y6540dp<invokedynamic>(var10000, 0);

      while(var2.1re2xz2ctb7dv<invokedynamic>(var2, 0)) {
         Map.Entry var3 = (Map.Entry)var2.1az7xau2khs0g<invokedynamic>(var2, 0);
         String var4 = (String)var3.2upgx5ynpwp3x<invokedynamic>(var3, 0);
         if (var4.3ttucgtr0xk4g<invokedynamic>(var4, 0)) {
            StringBuilder var24 = new StringBuilder();
            var24 = var24.32w3eo9pq0gc2<invokedynamic>(var24, IIIilIIiiIIi<invokedynamic>(), 0);
            var24 = var24.32w3eo9pq0gc2<invokedynamic>(var24, var4, 0);
            modules.2xqgs7oted3n4<invokedynamic>(modules, var24.27inl07qeua6b<invokedynamic>(var24, 0), 0);
            if (var15 != var15) {
               throw new VerifyError("Inconsistent flow at 29652");
            }
         } else {
            JsonElement var17 = (JsonElement)var3.36v09yob0h197<invokedynamic>(var3, 0);
            if (!var17.15f6daveu932c<invokedynamic>(var17, 0)) {
               StringBuilder var27 = new StringBuilder();
               var27 = var27.32w3eo9pq0gc2<invokedynamic>(var27, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var27.32w3eo9pq0gc2<invokedynamic>(var27, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0);
               modules.9eo1x6tbnovc<invokedynamic>(modules, var27.32w3eo9pq0gc2<invokedynamic>(var27, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var27.32w3eo9pq0gc2<invokedynamic>(var27, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
               if (var10 - var9 - -1748198706 != 0) {
                  IIlllIlliIll = ~IIlllIlliIll;
                  throw null;
               }
            } else {
               var17 = (JsonElement)var3.36v09yob0h197<invokedynamic>(var3, 0);
               JsonObject var5 = var17.370kksu1xteky<invokedynamic>(var17, 0);
               if (var5.3t6kwipmkhyzc<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0)) {
                  var17 = var5.29uj5fvp8xpy0<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0);
                  if (!var17.788enxkztmrh<invokedynamic>(var17, 0)) {
                     StringBuilder var29 = new StringBuilder();
                     var29 = var29.32w3eo9pq0gc2<invokedynamic>(var29, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var29.32w3eo9pq0gc2<invokedynamic>(var29, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0);
                     modules.9eo1x6tbnovc<invokedynamic>(modules, var29.32w3eo9pq0gc2<invokedynamic>(var29, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var29.32w3eo9pq0gc2<invokedynamic>(var29, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
                  }
               }

               if (var5.3t6kwipmkhyzc<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0)) {
                  var17 = var5.29uj5fvp8xpy0<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0);
                  if (!var17.331awi5thr0rs<invokedynamic>(var17, 0)) {
                     StringBuilder var31 = new StringBuilder();
                     var31 = var31.32w3eo9pq0gc2<invokedynamic>(var31, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var31.32w3eo9pq0gc2<invokedynamic>(var31, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0);
                     modules.9eo1x6tbnovc<invokedynamic>(modules, var31.32w3eo9pq0gc2<invokedynamic>(var31, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var31.32w3eo9pq0gc2<invokedynamic>(var31, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
                     if ((var14.length ^ 29) != 0) {
                        throw new VerifyError("Inconsistent flow at 18180");
                     }
                  } else {
                     int var21 = var5.29uj5fvp8xpy0<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0).ks5omxe57x3h<invokedynamic>(var5.29uj5fvp8xpy0<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0), 0);
                     if (!var21.1ffszbca6g312<invokedynamic>(var21, 0)) {
                        StringBuilder var33 = new StringBuilder();
                        var33 = var33.32w3eo9pq0gc2<invokedynamic>(var33, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var33.32w3eo9pq0gc2<invokedynamic>(var33, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0);
                        modules.2xqgs7oted3n4<invokedynamic>(modules, var33.32w3eo9pq0gc2<invokedynamic>(var33, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var33.32w3eo9pq0gc2<invokedynamic>(var33, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
                     }
                  }
               }

               if (var5.3t6kwipmkhyzc<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0)) {
                  var17 = var5.29uj5fvp8xpy0<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0);
                  if (!var17.15f6daveu932c<invokedynamic>(var17, 0)) {
                     StringBuilder var35 = new StringBuilder();
                     var35 = var35.32w3eo9pq0gc2<invokedynamic>(var35, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var35.32w3eo9pq0gc2<invokedynamic>(var35, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0);
                     modules.9eo1x6tbnovc<invokedynamic>(modules, var35.32w3eo9pq0gc2<invokedynamic>(var35, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var35.32w3eo9pq0gc2<invokedynamic>(var35, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
                     if ((var12 ^ var11 ^ 2016780732) != 0) {
                        throw new VerifyError("Inconsistent flow at 38362");
                     }
                  } else {
                     JsonObject var23 = var5.1q6nlw1zvhzm5<invokedynamic>(var5, IIIilIIiiIIi<invokedynamic>(), 0);
                     var7 ^= ((long)var23.m89231gs1e0d<invokedynamic>(var23, 0) << 32 ^ var7) & -1L << 32;
                     if ((int)(var7 >>> 32) > (-(-446404717 ^ -67) ^ 59 ^ -446404887)) {
                        StringBuilder var37 = new StringBuilder();
                        var37 = var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0), IIIilIIiiIIi<invokedynamic>(), 0).2o35uwu1uz9qt<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).32w3eo9pq0gc2<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), var4, 0), IIIilIIiiIIi<invokedynamic>(), 0), (int)(var7 >>> 32), 0);
                        modules.9eo1x6tbnovc<invokedynamic>(modules, var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0).27inl07qeua6b<invokedynamic>(var37.32w3eo9pq0gc2<invokedynamic>(var37, IIIilIIiiIIi<invokedynamic>(), 0), 0), 0);
                     }
                  }
               }

               if ((var14.length ^ 29 ^ 1) == 0) {
                  throw null;
               }
            }
         }
      }

   }

   public static JsonObject iIlIlllllill(byte[] bytes) {
      int[] var7 = new int[13];
      int var3 = System.identityHashCode(var7) + 1892163719;
      int var5 = (System.identityHashCode(var7) ^ -1298399460) + -1232949592;
      int var6 = System.identityHashCode(var7) + 1221869443;

      try {
         String var10000 = new String(bytes, StandardCharsets.UTF_8);
         JsonElement var1 = var10000.2qmspfm4b7flw<invokedynamic>(var10000, 0);
         JsonObject var10;
         if (var1.15f6daveu932c<invokedynamic>(var1, 0)) {
            var10 = var1.370kksu1xteky<invokedynamic>(var1, 0);
            if ((var6 ^ var6 ^ 1) == 0) {
               throw new VerifyError("Inconsistent flow at 59128");
            }
         } else {
            var10 = null;
         }

         return var10;
      } catch (Exception var9) {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3345946751015350975L ^ Long.rotateLeft(-8109356223424206663L, 57) ^ -8987854655015909084L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 844988580549200790L ^ Long.rotateLeft(6313278249667349591L, 49) ^ -7504696040612077716L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6210786861842394102L ^ Long.rotateLeft(8313964434265745328L, 1) ^ -8947017005904267525L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4194214775354281195L ^ Long.rotateLeft(-3228237901250962173L, 4) ^ 9151301903624128242L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -366535058974410734L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3928157009359976699L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8017761173123255191L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5367421448242908018L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6228989364033525043L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -420189866754933948L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   private static String Illlllllilll(JsonObject k, String o) {
      int[] var7 = new int[27];
      int var3 = System.identityHashCode(var7) ^ -134746086;
      int var5 = System.identityHashCode(var7) ^ 1989379914 ^ 689757911;
      int var6 = System.identityHashCode(var7) + -164626884;
      String var10;
      if (k.3t6kwipmkhyzc<invokedynamic>(k, o, 0)) {
         JsonElement var10000 = k.29uj5fvp8xpy0<invokedynamic>(k, o, 0);
         if (var10000.3e9uijagwsxqt<invokedynamic>(var10000, 0)) {
            var10 = k.29uj5fvp8xpy0<invokedynamic>(k, o, 0).srezkl5f2mjq<invokedynamic>(k.29uj5fvp8xpy0<invokedynamic>(k, o, 0), 0);
            if (var6 - var6 != 0) {
               Illlllllilll = ~Illlllllilll;
               throw null;
            }

            return var10;
         }
      }

      var10 = null;
      return var10;
   }

   private static String Iiilliiliiil(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var3[var5] = (byte)(var3[var5] + var1 + var5 ^ var2);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   public static iliiIIllIiiiIIll IilliliilIIi(JsonObject root) {
      iliiIIllIiiiIIll var1 = new iliiIIllIiiiIIll();
      if (root == null) {
         var1.9eo1x6tbnovc<invokedynamic>(var1, IIIilIIiiIIi<invokedynamic>(), 0);
         return var1;
      } else {
         root.27rapu6dj7djq<invokedynamic>(root, var1, 0);
         return var1;
      }
   }

   private static Object Ililllililil(MutableCallSite var0, MethodHandles.Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = Iiilliiliiil(var3, var4 ^ var6, 123).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 181267993) != (Integer.rotateLeft(923692982 ^ var16, var16 & 31) ^ 181267993)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 202904666) != (Integer.rotateLeft(-519115453 ^ var16, var16 & 31) ^ 202904666)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1461196282) != (Integer.rotateLeft(-1380791369 ^ var16, var16 & 31) ^ 1461196282)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1099023952) != (Integer.rotateLeft(789949642 ^ var16, var16 & 31) ^ 1099023952)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 343953430) != (Integer.rotateLeft(-581802197 ^ var16, var16 & 31) ^ 343953430)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1285640153) != (Integer.rotateLeft(161374707 ^ var16, var16 & 31) ^ 1285640153)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -785850188) != (Integer.rotateLeft(908262036 ^ var16, var16 & 31) ^ -785850188)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findStaticSetter(var9, var7[2], Iilllilliill(var7[3], var11));
                     } else {
                        var12 = var1.findStaticGetter(var9, var7[2], Iilllilliill(var7[3], var11));
                     }
                  } else {
                     var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                  }
               } else {
                  var12 = var1.findGetter(var9, var7[2], Iilllilliill(var7[3], var11));
               }
            } else {
               var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
            }
         } else {
            var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
         }
      } else {
         var12 = var1.findSetter(var9, var7[2], Iilllilliill(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), new Class[]{Integer.TYPE});
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }
}
