package gg.corz;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Ilillillllillill {
   public int llliiIiill = 0;
   public final List<String> iiIiiIiill = new ArrayList();
   public final List<String> lIliiIiill = new ArrayList();
   public final List<String> IlliiIiill = new ArrayList();
   public boolean liliiIiill = false;
   public int illiiIiill = 0;
   public final List<String> iIliiIiill = new ArrayList();
   public final List<String> IIliiIiill = new ArrayList();
   public final Map<String, JsonObject> lIiiiIiill = new LinkedHashMap();
   public int IiliiIiill = 0;
   public boolean iiliiIiill = false;
   public final List<String> liIiiIiill = new ArrayList();
   public boolean IIiiiIiill = false;
   public final List<String> IiIiiIiill = new ArrayList();
   public static final List<String> ilIiiIiill;

   private static boolean IIlllIlliIll(JsonElement el) {
      int[] var6 = new int[23];
      int var2 = System.identityHashCode(var6) ^ 1109665055;
      int var4 = (System.identityHashCode(var6) ^ -520340928) + -824144736;
      int var5 = System.identityHashCode(var6) + -1547678652;
      boolean var8;
      if (el != null && el.2gaxjihu6l7f1<invokedynamic>(el, 0)) {
         JsonPrimitive var10000 = el.17q9t6yd07eit<invokedynamic>(el, 0);
         if (var10000.2gpacs1rrc1qv<invokedynamic>(var10000, 0)) {
            var8 = true;
            if ((var5 & ~var5) != 0) {
               illIlIilIl = ~illIlIilIl;
               throw null;
            }

            return var8;
         }
      }

      var8 = false;
      return var8;
   }

   private void IilliliilIIi(String opts, JsonObject mod, llllliiillllii id, llliiillilliiill m) {
      int[] var16 = new int[31];
      int var12 = System.identityHashCode(var16) ^ 812033847;
      int var13;
      int var14 = (var13 = System.identityHashCode(var16) ^ 125061742) ^ 949130921;
      int var15 = System.identityHashCode(var16) + 506365019;
      long var9 = -3805137965865233724L;
      JsonObject var5 = new JsonObject();
      if (m.iIIliiiill) {
         JsonElement var10000 = mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0);
         if (var10000.13evjyv00eq4t<invokedynamic>(var10000, 0)) {
            var10000 = mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0);
            var9 ^= ((long)var10000.1edotw59k1z9p<invokedynamic>(var10000, 0) << 32 ^ var9) & -1L << 32;
            if ((((int)(var9 >>> 32) ^ id.3uefo2h7hfxjh<invokedynamic>(id, 0)) * (var15 | 1) ^ var15 ^ var15) != 0) {
               if (id.2tdy7w8j1wczt<invokedynamic>(id, (boolean)((int)(var9 >>> 32)), 0)) {
                  List var23;
                  if ((int)(var9 >>> 32) != 0) {
                     var23 = this.IiIiiIiill;
                     if (var15 + 1590930652 - var15 - 1590930652 != 0) {
                        throw null;
                     }
                  } else {
                     var23 = this.liIiiIiill;
                  }

                  var23.1xiogph6vygyv<invokedynamic>(var23, opts, 0);
                  if ((var14 ^ var13 ^ 949130921 ^ 1) == 0) {
                     throw null;
                  }
               } else {
                  this.iiIiiIiill.1xiogph6vygyv<invokedynamic>(this.iiIiiIiill, opts, 0);
                  this.IIliiIiill.1xiogph6vygyv<invokedynamic>(this.IIliiIiill, opts, 0);
                  List var24 = this.IlliiIiill;
                  StringBuilder var10001 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>((new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0), id.7kf1g8fl0ob8<invokedynamic>(id, 0), 0);
                  var24.1xiogph6vygyv<invokedynamic>(var24, var10001.jzvvq9ek5azw<invokedynamic>(var10001, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var10001.jzvvq9ek5azw<invokedynamic>(var10001, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
               }
            }
         }
      }

      if (m.IlIliiiill && mod.2s020tzlerhqb<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0)) {
         JsonObject var6 = new JsonObject();
         Set var25 = mod.373k3dqeul6gh<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0).29lzs9rbf4tpy<invokedynamic>(mod.373k3dqeul6gh<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0), 0);
         Iterator var7 = var25.yggj9xz3wsqe<invokedynamic>(var25, 0);

         while(var7.3q3fmnj2xpoi8<invokedynamic>(var7, 0)) {
            Map.Entry var8 = (Map.Entry)var7.2m4qzwnzdi3ei<invokedynamic>(var7, 0);
            if (id.2rg4xx6r4b3jb<invokedynamic>(id, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), 0) != null) {
               if (id.hbfwzuhh5t4a<invokedynamic>(id, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), 0)) {
                  if ((var15 | ~var15) + 1 != 0) {
                     throw null;
                  }
               } else {
                  var6.wetdadyussjk<invokedynamic>(var6, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), (JsonElement)var8.3c95lxoezhvd6<invokedynamic>(var8, 0), 0);
                  if ((var14 ^ var13 ^ 949130921) != 0) {
                     throw null;
                  }
               }
            }
         }

         if (var6.2zxz4pmxyvyhe<invokedynamic>(var6, 0) > 0) {
            var5.wetdadyussjk<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), var6, 0);
         }

         this.llliiIiill += var6.2zxz4pmxyvyhe<invokedynamic>(var6, 0);
      }

      if (m.llIliiiill) {
         JsonElement var26 = mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0);
         if (var26.3k8kjzubb2wpr<invokedynamic>(var26, 0)) {
            int var27 = mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0).1iy7epzcp8ns5<invokedynamic>(mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0), 0);
            if (var27.80x4do763br0<invokedynamic>(var27, 0)) {
               var5.3rxkwbzdw4dai<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0).1iy7epzcp8ns5<invokedynamic>(mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0), 0).1e02s75eowcyx<invokedynamic>(mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0).1iy7epzcp8ns5<invokedynamic>(mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0), 0), 0), 0);
               ++this.illiiIiill;
            }
         }
      }

      if (m.IlIliiiill && mod.1oo0i82uvfcr0<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0)) {
         JsonElement var28 = mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0);
         if (!var28.29cjf1whd4d5p<invokedynamic>(var28, 0) && id.1w1b6y6606rg1<invokedynamic>(id, 0)) {
            var5.wetdadyussjk<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), mod.2f12yjf6mgbri<invokedynamic>(mod, IlIillIiilIi<invokedynamic>(), 0), 0);
         }
      }

      this.lIiiiIiill.3g04tk40flp3m<invokedynamic>(this.lIiiiIiill, opts, var5, 0);
   }

   private static Object Iiilliiliiil(MutableCallSite var0, MethodHandles.Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = IIIilIIiiIIi(var3, var4 ^ var6, 26).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1423459231) != (Integer.rotateLeft(-743653738 ^ var16, var16 & 31) ^ -1423459231)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -285331663) != (Integer.rotateLeft(1951391230 ^ var16, var16 & 31) ^ -285331663)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1691870723) != (Integer.rotateLeft(1766193279 ^ var16, var16 & 31) ^ -1691870723)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -600107557) != (Integer.rotateLeft(1861725054 ^ var16, var16 & 31) ^ -600107557)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -674991762) != (Integer.rotateLeft(-1062175951 ^ var16, var16 & 31) ^ -674991762)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1393608093) != (Integer.rotateLeft(-522850358 ^ var16, var16 & 31) ^ -1393608093)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 2059807341) != (Integer.rotateLeft(856702489 ^ var16, var16 & 31) ^ 2059807341)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findStaticGetter(var9, var7[2], IIillIiliIil(var7[3], var11));
                     } else {
                        var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
                     }
                  } else {
                     var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                  }
               } else {
                  var12 = var1.findStaticSetter(var9, var7[2], IIillIiliIil(var7[3], var11));
               }
            } else {
               var12 = var1.findGetter(var9, var7[2], IIillIiliIil(var7[3], var11));
            }
         } else {
            var12 = var1.findSetter(var9, var7[2], IIillIiliIil(var7[3], var11));
         }
      } else {
         var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), new Class[]{Integer.TYPE});
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[21];
      int var9 = System.identityHashCode(var13) ^ 734846595;
      int var11 = (System.identityHashCode(var13) ^ 2134548366) + -332474294;
      int var12 = System.identityHashCode(var13) + 1238180119;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') << 2) - '쉻') + '輽') + '낊') + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') << 2) - '쉻') + '輽') + '낊') + var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') << 2) - '쉻') + '輽') + '낊') + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 7) + var5) + '혟') - 23206) - '\uf4b9'))) + '\ue740') << 2) - '쉻') + '輽') + '낊') + var5) >>> 13) << 14))) + 13079));
         ++var5;
         if ((var12 ^ var12 ^ 1) == 0) {
            throw new VerifyError("Inconsistent flow at 46351");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[22];
      int var9 = System.identityHashCode(var13) ^ -1697175533;
      int var11 = (System.identityHashCode(var13) ^ 1967677954) + -427806430;
      int var12 = System.identityHashCode(var13) + 395355105;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) >>> 15) ^ var5))) ^ '\uf47a') >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) >>> 15) ^ var5))) ^ '\uf47a') << 15) ^ var5) << 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) >>> 15) ^ var5))) ^ '\uf47a') >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) << 4 | (char)((char)((char)(var4[var5] + '뗔') >>> 5 | (char)(var4[var5] + '뗔') << 11) - var5) >>> 12) - var5) + 1712) >>> 8) ^ 888))) ^ 14598) << 6) + var5) >>> 15) ^ var5))) ^ '\uf47a') << 15) ^ var5) >>> 9));
         ++var5;
         if ((var13.length ^ 22) != 0) {
            lilIliilIl = ~lilIliilIl;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Ilillillllillill IliIlllilIi(JsonObject opts, llliiillilliiill content, Collection<llllliiillllii> live) {
      return opts.31yx2fn3a5511<invokedynamic>(opts, content, live, false.3bb21idjogw0<invokedynamic>(0), 0);
   }

   static {
      String var10000 = IlIillIiilIi<invokedynamic>();
      ilIiiIiill = var10000.1xav1z6w51azo<invokedynamic>(var10000, IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>(), 0);
   }

   public static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "Iiilliiliiil";
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

   public static JsonObject iliIiiliiiii(JsonObject live, Collection<llllliiillllii> content, lIiIiIlliIiIiIll policy) {
      int[] var20 = new int[13];
      int var15;
      int var16 = (var15 = System.identityHashCode(var20)) + -183988533;
      int var18 = (System.identityHashCode(var20) ^ 655620035) + 255186069;
      int var19 = System.identityHashCode(var20) + -596871551;
      long var13 = 7908900982126409565L;
      JsonObject var3 = new JsonObject();
      var3.wetdadyussjk<invokedynamic>(var3, IlIillIiilIi<invokedynamic>(), new JsonObject(), 0);
      if (live != null && policy != null && policy.37lyapgigj3qi<invokedynamic>(policy, 0)) {
         Map var4 = content.tuilg8p9p2g2<invokedynamic>(content, 0);
         Iterator var5 = ilIiiIiill.2v2ieuyiqbtzu<invokedynamic>(ilIiiIiill, 0);

         while(var5.3q3fmnj2xpoi8<invokedynamic>(var5, 0)) {
            String var6 = (String)var5.2m4qzwnzdi3ei<invokedynamic>(var5, 0);
            if (!live.2s020tzlerhqb<invokedynamic>(live, var6, 0)) {
               if ((var19 & ~var19) != 0) {
                  throw new VerifyError("Inconsistent flow at 3032");
               }
            } else {
               Class var10000 = IlIillIiilIi<invokedynamic>();
               var13 ^= ((long)var10000.2hec6ga1lp8hx<invokedynamic>(var10000, var6, 0) << 32 ^ var13) & -1L << 32;
               JsonObject var8 = new JsonObject();
               var10000 = live.373k3dqeul6gh<invokedynamic>(live, var6, 0).29lzs9rbf4tpy<invokedynamic>(live.373k3dqeul6gh<invokedynamic>(live, var6, 0), 0);
               Iterator var9 = var10000.yggj9xz3wsqe<invokedynamic>(var10000, 0);

               while(var9.3q3fmnj2xpoi8<invokedynamic>(var9, 0)) {
                  Map.Entry var10 = (Map.Entry)var9.2m4qzwnzdi3ei<invokedynamic>(var9, 0);
                  String var25 = (String)var10.1e233vtwwuv3i<invokedynamic>(var10, 0);
                  if (!var25.qezt26rfravh<invokedynamic>(var25, 0)) {
                     JsonElement var26 = (JsonElement)var10.3c95lxoezhvd6<invokedynamic>(var10, 0);
                     if (!var26.lonfe0gy2dm5<invokedynamic>(var26, 0)) {
                        if ((var20.length ^ 13 ^ 1) == 0) {
                           throw new VerifyError("Inconsistent flow at 20916");
                        }
                     } else {
                        String var27 = (String)var10.1e233vtwwuv3i<invokedynamic>(var10, 0);
                        String var11 = var27.ysdm7wej34m7<invokedynamic>(var27, 0);
                        if ((int)(var13 >>> 32) != 0) {
                           if (policy.5xgqqkss2lpv<invokedynamic>(policy, var11, 0)) {
                              if ((var20.length ^ 13) != 0) {
                                 throw new VerifyError("Inconsistent flow at 22134");
                              }
                              continue;
                           }
                        } else if (!policy.3m093n9y9tfde<invokedynamic>(policy, var6, var11, 0)) {
                           if (((var19 | 1275548297) + (var19 & 1275548297) - (var19 + 1275548297) ^ 1) == 0) {
                              IIiIllIiIl = ~IIiIllIiIl;
                              throw null;
                           }
                           continue;
                        }

                        llllliiillllii var12 = (llllliiillllii)var4.2au2kurmywujb<invokedynamic>(var4, var11, 0);
                        if (var12 != null) {
                           if (var8.1oo0i82uvfcr0<invokedynamic>(var8, var11, 0)) {
                              if (((var19 | ~var19) + 1 ^ 1) == 0) {
                                 throw new VerifyError("Inconsistent flow at 51400");
                              }
                           } else {
                              var8.wetdadyussjk<invokedynamic>(var8, var11, var11.gtisgvcdt5dm<invokedynamic>(var11, ((JsonElement)var10.3c95lxoezhvd6<invokedynamic>(var10, 0)).3fcslbuc7thfw<invokedynamic>((JsonElement)var10.3c95lxoezhvd6<invokedynamic>(var10, 0), 0), var12, policy, 0), 0);
                              if ((var16 - var15 - -183988533 ^ 1) == 0) {
                                 throw null;
                              }
                           }
                        }
                     }
                  }
               }

               if ((int)(var13 >>> 32) != 0 || var8.2zxz4pmxyvyhe<invokedynamic>(var8, 0) > 0) {
                  var3.wetdadyussjk<invokedynamic>(var3, var6, var8, 0);
               }

               if ((var16 - var15 - -183988533 ^ 1) == 0) {
                  iIiIlIliIl = ~iIiIlIliIl;
                  throw null;
               }
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   private static String IIIilIIiiIIi(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var3[var5] = (byte)(var3[var5] - (var1 ^ var2) ^ var5);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5892253687006116655L ^ Long.rotateLeft(-5147115879019639663L, 52) ^ 4340482591996593768L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6563168241173602207L ^ Long.rotateLeft(-1883368866475611793L, 44) ^ 3611751099958235901L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7408794558549388747L ^ Long.rotateLeft(-7573427467885086032L, 43) ^ -8300497533406161960L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1600093336801112144L ^ Long.rotateLeft(-2580532664667278257L, 57) ^ 2471455530447599184L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6387059554521229879L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5041577996929712139L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 516333164508560447L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -580934266184097453L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -664180411492490845L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8631896344357441080L;
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

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[14];
      int var9 = System.identityHashCode(var13) + -1106459427;
      int var11 = System.identityHashCode(var13) ^ -691029265 ^ -312954349;
      int var12 = System.identityHashCode(var13) + -1992669656;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 22342) ^ 'ꛪ') - var5) - var5) - '\uf11b') + var5) - var5) + var5))) - var5) ^ '갛'))) + var5) >>> 11 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 22342) ^ 'ꛪ') - var5) - var5) - '\uf11b') + var5) - var5) + var5))) - var5) ^ '갛'))) + var5) << 5) - 15724) - var5))))));
         ++var5;
         if ((var12 & ~var12) != 0) {
            throw new VerifyError("Inconsistent flow at 1491");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIlllllill(String opts, JsonObject known, llliiillilliiill policy, Map<String, llllliiillllii> section, lIiIiIlliIiIiIll entries) {
      lIiIiIlliIiIiIll var24 = entries;
      int[] var19 = new int[28];
      int var14;
      int var15 = (var14 = System.identityHashCode(var19)) ^ 269649307;
      int var16;
      int var17 = (var16 = System.identityHashCode(var19) ^ -420276280) ^ 158379687;
      int var18 = System.identityHashCode(var19) + -1283301779;
      long var12 = -6779144580289146766L;
      Class var10000 = IlIillIiilIi<invokedynamic>();
      var12 ^= ((long)var10000.2hec6ga1lp8hx<invokedynamic>(var10000, opts, 0) << 32 ^ var12) & -1L << 32;
      var10000 = known.29lzs9rbf4tpy<invokedynamic>(known, 0);
      Iterator var7 = var10000.yggj9xz3wsqe<invokedynamic>(var10000, 0);

      while(var7.3q3fmnj2xpoi8<invokedynamic>(var7, 0)) {
         Map.Entry var8 = (Map.Entry)var7.2m4qzwnzdi3ei<invokedynamic>(var7, 0);
         String var9 = (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0);
         if (var9.qezt26rfravh<invokedynamic>(var9, 0)) {
            this.iIliiIiill.1xiogph6vygyv<invokedynamic>(this.iIliiIiill, var9, 0);
            var10000 = this.IlliiIiill;
            StringBuilder var34 = new StringBuilder();
            var10000.1xiogph6vygyv<invokedynamic>(var10000, var34.jzvvq9ek5azw<invokedynamic>(var34, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var34.jzvvq9ek5azw<invokedynamic>(var34, IlIillIiilIi<invokedynamic>(), 0), var9, 0).17b93pe9xtj46<invokedynamic>(var34.jzvvq9ek5azw<invokedynamic>(var34, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var34.jzvvq9ek5azw<invokedynamic>(var34, IlIillIiilIi<invokedynamic>(), 0), var9, 0), 0), 0);
            if ((var17 ^ var16 ^ 158379687) != 0) {
               throw new VerifyError("Inconsistent flow at 7433");
            }
         } else {
            label65: {
               String var10 = var9.ysdm7wej34m7<invokedynamic>(var9, 0);
               if ((int)(var12 >>> 32) != 0) {
                  if (entries.5xgqqkss2lpv<invokedynamic>(entries, var10, 0)) {
                     if ((var18 - var18 ^ 1) == 0) {
                        throw new VerifyError("Inconsistent flow at 14406");
                     }
                     break label65;
                  }
               } else if (!entries.3m093n9y9tfde<invokedynamic>(entries, opts, var10, 0)) {
                  break label65;
               }

               llllliiillllii var11 = (llllliiillllii)section.2au2kurmywujb<invokedynamic>(section, var10, 0);
               if (var11 == null) {
                  this.iIliiIiill.1xiogph6vygyv<invokedynamic>(this.iIliiIiill, var9, 0);
                  var10000 = this.IlliiIiill;
                  StringBuilder var10001 = new StringBuilder();
                  var10000.1xiogph6vygyv<invokedynamic>(var10000, var10001.jzvvq9ek5azw<invokedynamic>(var10001, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var10001.jzvvq9ek5azw<invokedynamic>(var10001, IlIillIiilIi<invokedynamic>(), 0), var9, 0).17b93pe9xtj46<invokedynamic>(var10001.jzvvq9ek5azw<invokedynamic>(var10001, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var10001.jzvvq9ek5azw<invokedynamic>(var10001, IlIillIiilIi<invokedynamic>(), 0), var9, 0), 0), 0);
                  if ((var15 ^ var14 ^ 269649307) != 0) {
                     lliIliliIl = ~lliIliliIl;
                     throw null;
                  }
               } else {
                  JsonElement var28 = (JsonElement)var8.3c95lxoezhvd6<invokedynamic>(var8, 0);
                  if (var28.lonfe0gy2dm5<invokedynamic>(var28, 0)) {
                     if (this.lIiiiIiill.2ggu1zfgw5c34<invokedynamic>(this.lIiiiIiill, var10, 0)) {
                        if (((var18 ^ -244442077) + ((var18 & -244442077) << 1) - (var18 + -244442077) ^ 1) == 0) {
                           throw new VerifyError("Inconsistent flow at 7649");
                        }
                     } else {
                        JsonElement var10002 = (JsonElement)var8.3c95lxoezhvd6<invokedynamic>(var8, 0);
                        this.zqkiukai32k7<invokedynamic>(this, var10, var10002.3fcslbuc7thfw<invokedynamic>(var10002, 0), var11, policy, entries, 0);
                        if (var24 != var24) {
                           throw new VerifyError("Inconsistent flow at 43840");
                        }
                     }
                  }
               }
               continue;
            }

            this.iIliiIiill.1xiogph6vygyv<invokedynamic>(this.iIliiIiill, var9, 0);
            var10000 = this.IlliiIiill;
            StringBuilder var31 = new StringBuilder();
            var31 = var31.jzvvq9ek5azw<invokedynamic>(var31, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var31.jzvvq9ek5azw<invokedynamic>(var31, IlIillIiilIi<invokedynamic>(), 0), var9, 0);
            var31 = var31.jzvvq9ek5azw<invokedynamic>(var31, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var31.jzvvq9ek5azw<invokedynamic>(var31, IlIillIiilIi<invokedynamic>(), 0), opts, 0);
            var10000.1xiogph6vygyv<invokedynamic>(var10000, var31.jzvvq9ek5azw<invokedynamic>(var31, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var31.jzvvq9ek5azw<invokedynamic>(var31, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
            if ((var17 ^ var16 ^ 158379687) != 0) {
               throw new VerifyError("Inconsistent flow at 51106");
            }
         }
      }

   }

   public boolean Iilllilliill() {
      int[] var6 = new int[17];
      int var1;
      int var2 = (var1 = System.identityHashCode(var6)) ^ 1999341797;
      int var4 = System.identityHashCode(var6) ^ -443765538 ^ 1901201466;
      int var5 = System.identityHashCode(var6) + 1077140295;
      boolean var10000;
      if (this.IiIiiIiill.dpp0hd9k85ej<invokedynamic>(this.IiIiiIiill, 0) && this.liIiiIiill.dpp0hd9k85ej<invokedynamic>(this.liIiiIiill, 0) && this.llliiIiill == 0 && this.illiiIiill == 0 && !this.liliiIiill && !this.iiliiIiill) {
         var10000 = true;
         if ((var2 ^ var1 ^ 1999341797) != 0) {
            throw new VerifyError("Inconsistent flow at 36020");
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[10];
      int var9 = System.identityHashCode(var13) ^ 317165168;
      int var10;
      int var11 = (var10 = System.identityHashCode(var13) ^ -2036303649) ^ 890206673;
      int var12 = System.identityHashCode(var13) + 948178423;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + '蠮') - '멻') ^ var5) - '끔') - var5))) + var5) ^ 'ꐍ'));
         ++var5;
         if ((var11 ^ var10 ^ 890206673) != 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Illlllllilll(JsonElement el) {
      int[] var8 = new int[14];
      int var4 = System.identityHashCode(var8) + 919177951;
      int var6 = (System.identityHashCode(var8) ^ 1473223897) + -746778881;
      int var7 = System.identityHashCode(var8) + -1963804855;
      if (el != null && el.2gaxjihu6l7f1<invokedynamic>(el, 0)) {
         JsonPrimitive var10000 = el.17q9t6yd07eit<invokedynamic>(el, 0);
         if (var10000.2tn5l390lwliy<invokedynamic>(var10000, 0)) {
            double var1 = el.3l65cvpwnfttj<invokedynamic>(el, 0);
            boolean var10;
            if (var1 == var1.3o61hn0h7xdkj<invokedynamic>(var1, 0) && !var1.jjg3d5e2s60i<invokedynamic>(var1, 0) && var1.1qlwial39hjtm<invokedynamic>(var1, 0) <= Double.longBitsToDouble(-8161518085915660745L ^ -3502804948975735241L)) {
               var10 = true;
               if ((var7 + 1834869662 - var7 - 1834869662 ^ 1) == 0) {
                  throw null;
               }
            } else {
               var10 = false;
            }

            return var10;
         }
      }

      return false;
   }

   private static Map<String, llllliiillllii> IlIlllIlilIl(Collection<llllliiillllii> live) {
      Collection var10 = live;
      int[] var9 = new int[11];
      int var5 = System.identityHashCode(var9) + -196884209;
      int var7 = System.identityHashCode(var9) ^ -1529326896 ^ 1333523763;
      int var8 = System.identityHashCode(var9) + 1204727311;
      LinkedHashMap var1 = new LinkedHashMap();
      if (live != null) {
         Iterator var2 = live.368dw3gcb48u4<invokedynamic>(live, 0);

         while(var2.3q3fmnj2xpoi8<invokedynamic>(var2, 0)) {
            llllliiillllii var3 = (llllliiillllii)var2.2m4qzwnzdi3ei<invokedynamic>(var2, 0);
            if (var3 != null) {
               var1.38tabjqkjj5t0<invokedynamic>(var1, var3.1fr9dofhxt0y7<invokedynamic>(var3, 0), var3, 0);
            }

            if ((System.identityHashCode(var10) ^ System.identityHashCode(var10) ^ 1) == 0) {
               throw new VerifyError("Inconsistent flow at 11931");
            }
         }
      }

      return var1;
   }

   private static boolean IiIlliIliiIl(JsonObject o, String key) {
      int[] var7 = new int[11];
      int var3 = System.identityHashCode(var7) ^ 590023460;
      int var5 = (System.identityHashCode(var7) ^ 1353655124) + -908360155;
      int var6 = System.identityHashCode(var7) + 442336273;
      boolean var10;
      if (o != null && o.1oo0i82uvfcr0<invokedynamic>(o, key, 0)) {
         JsonElement var10000 = o.2f12yjf6mgbri<invokedynamic>(o, key, 0);
         if (var10000.lonfe0gy2dm5<invokedynamic>(var10000, 0)) {
            var10 = true;
            if ((var7.length ^ 11 ^ 1) == 0) {
               throw null;
            }

            return var10;
         }
      }

      var10 = false;
      return var10;
   }

   public static Class IIillIiliIil(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   private void lIiiIiIlilli(String policy, JsonObject id, llllliiillllii opts, llliiillilliiill mod, lIiIiIlliIiIiIll m) {
      int[] var22 = new int[8];
      int var17;
      int var18 = (var17 = System.identityHashCode(var22)) ^ 606300910;
      int var19;
      int var20 = (var19 = System.identityHashCode(var22) ^ -1302039292) + 642626100;
      int var21 = System.identityHashCode(var22) + 2126217020;
      long var15 = -3620463955811738099L;
      if (mod.32id0idok5f95<invokedynamic>(mod, 0)) {
         this.1tpzlsdbjugt<invokedynamic>(this, policy, id, opts, mod, 0);
      } else {
         ilIIlIliIiIIlIli var6 = m.1bqqnt9xi3tz6<invokedynamic>(m, policy, opts.1as5ysalgm4yu<invokedynamic>(opts, 0), opts.on8kp6ebhzbt<invokedynamic>(opts, 0), 0);
         JsonObject var7 = new JsonObject();
         if (mod.iIIliiiill) {
            JsonElement var10000 = id.2f12yjf6mgbri<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0);
            if (var10000.13evjyv00eq4t<invokedynamic>(var10000, 0)) {
               var10000 = id.2f12yjf6mgbri<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0);
               var15 ^= ((long)var10000.1edotw59k1z9p<invokedynamic>(var10000, 0) << 32 ^ var15) & -1L << 32;
               if ((((int)(var15 >>> 32) - opts.3uefo2h7hfxjh<invokedynamic>(opts, 0)) * (var21 | 1) ^ var20 - var19 - 642626100) != 0) {
                  if (m.dzrpcoo4gw2u<invokedynamic>(m, opts, (boolean)((int)(var15 >>> 32)), 0)) {
                     List var31;
                     if ((int)(var15 >>> 32) != 0) {
                        var31 = this.IiIiiIiill;
                        if (mod != mod) {
                           throw new VerifyError("Inconsistent flow at 51057");
                        }
                     } else {
                        var31 = this.liIiiIiill;
                     }

                     var31.1xiogph6vygyv<invokedynamic>(var31, policy, 0);
                     if ((var18 ^ var17 ^ 606300910) != 0) {
                        throw null;
                     }
                  } else {
                     this.iiIiiIiill.1xiogph6vygyv<invokedynamic>(this.iiIiiIiill, policy, 0);
                     if ((int)(var15 >>> 32) != 0) {
                        this.IIliiIiill.1xiogph6vygyv<invokedynamic>(this.IIliiIiill, policy, 0);
                        List var32 = this.IlliiIiill;
                        StringBuilder var10001 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0);
                        var32.1xiogph6vygyv<invokedynamic>(var32, var10001.jzvvq9ek5azw<invokedynamic>(var10001, opts.7kf1g8fl0ob8<invokedynamic>(opts, 0), 0).17b93pe9xtj46<invokedynamic>(var10001.jzvvq9ek5azw<invokedynamic>(var10001, opts.7kf1g8fl0ob8<invokedynamic>(opts, 0), 0), 0), 0);
                        if ((var22.length ^ 8 ^ 1) == 0) {
                           throw new VerifyError("Inconsistent flow at 28245");
                        }
                     } else {
                        ++this.IiliiIiill;
                        List var33 = this.lIliiIiill;
                        StringBuilder var45 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), policy, 0);
                        var33.1xiogph6vygyv<invokedynamic>(var33, var45.jzvvq9ek5azw<invokedynamic>(var45, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var45.jzvvq9ek5azw<invokedynamic>(var45, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
                        var33 = this.IlliiIiill;
                        var45 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>((new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0), opts.7kf1g8fl0ob8<invokedynamic>(opts, 0), 0);
                        var33.1xiogph6vygyv<invokedynamic>(var33, var45.jzvvq9ek5azw<invokedynamic>(var45, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var45.jzvvq9ek5azw<invokedynamic>(var45, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
                     }
                  }
               }
            }
         }

         if (mod.IlIliiiill && id.2s020tzlerhqb<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0)) {
            JsonObject var8 = new JsonObject();
            Class var35 = id.373k3dqeul6gh<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0).29lzs9rbf4tpy<invokedynamic>(id.373k3dqeul6gh<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0), 0);
            Iterator var9 = var35.yggj9xz3wsqe<invokedynamic>(var35, 0);

            while(var9.3q3fmnj2xpoi8<invokedynamic>(var9, 0)) {
               Map.Entry var10 = (Map.Entry)var9.2m4qzwnzdi3ei<invokedynamic>(var9, 0);
               String var11 = (String)var10.1e233vtwwuv3i<invokedynamic>(var10, 0);
               iIiIiIIlIliIiIIl var12 = opts.2rg4xx6r4b3jb<invokedynamic>(opts, var11, 0);
               if (var12 != null) {
                  if (opts.hbfwzuhh5t4a<invokedynamic>(opts, var11, 0)) {
                     if ((var18 ^ var17 ^ 606300910) != 0) {
                        lIIlliIIll = ~lIIlliIIll;
                        throw null;
                     }
                  } else {
                     JsonElement var13 = (JsonElement)var10.3c95lxoezhvd6<invokedynamic>(var10, 0);
                     IIIlllilIIllli var14 = m.2dkzeupjlpnjj<invokedynamic>(m, policy, var11, var12, 0);
                     if (var14 == IIIlllilIIllli.iillilIIIl) {
                        if (!var13.31i0bam0i6bot<invokedynamic>(var13, opts.37ssh9q6ww13y<invokedynamic>(opts, var11, 0), 0)) {
                           ++this.IiliiIiill;
                           var35 = this.lIliiIiill;
                           StringBuilder var47 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), policy, 0);
                           var35.1xiogph6vygyv<invokedynamic>(var35, var47.jzvvq9ek5azw<invokedynamic>(var47, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var47.jzvvq9ek5azw<invokedynamic>(var47, IlIillIiilIi<invokedynamic>(), 0), var11, 0).17b93pe9xtj46<invokedynamic>(var47.jzvvq9ek5azw<invokedynamic>(var47, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var47.jzvvq9ek5azw<invokedynamic>(var47, IlIillIiilIi<invokedynamic>(), 0), var11, 0), 0), 0);
                           if ((var21 ^ var21) != 0) {
                              IlIllllIll = ~IlIllllIll;
                              throw null;
                           }
                        }
                     } else if (!m.1m9d3yzmcsasf<invokedynamic>(m, var14, var13, 0)) {
                        ++this.IiliiIiill;
                        var35 = this.lIliiIiill;
                        StringBuilder var48 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), policy, 0);
                        var35.1xiogph6vygyv<invokedynamic>(var35, var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0), var11, 0).17b93pe9xtj46<invokedynamic>(var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0), var11, 0), 0), 0);
                        var35 = this.IlliiIiill;
                        var48 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>((new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0), opts.7kf1g8fl0ob8<invokedynamic>(opts, 0), 0);
                        var48 = var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>(var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0), var11, 0);
                        var35.1xiogph6vygyv<invokedynamic>(var35, var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var48.jzvvq9ek5azw<invokedynamic>(var48, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
                        if ((var21 ^ var21) != 0) {
                           iiiIlIIIll = ~iiiIlIIIll;
                           throw null;
                        }
                     } else {
                        var8.wetdadyussjk<invokedynamic>(var8, var11, var13, 0);
                        if (var20 - var19 - 642626100 != 0) {
                           IiiIlliiIl = ~IiiIlliiIl;
                           throw null;
                        }
                     }
                  }
               }
            }

            if (var8.2zxz4pmxyvyhe<invokedynamic>(var8, 0) > 0) {
               var7.wetdadyussjk<invokedynamic>(var7, IlIillIiilIi<invokedynamic>(), var8, 0);
            }

            this.llliiIiill += var8.2zxz4pmxyvyhe<invokedynamic>(var8, 0);
         }

         if (mod.llIliiiill) {
            JsonElement var39 = id.2f12yjf6mgbri<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0);
            if (var39.3k8kjzubb2wpr<invokedynamic>(var39, 0)) {
               var39 = id.2f12yjf6mgbri<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0);
               var15 ^= ((long)var39.1iy7epzcp8ns5<invokedynamic>(var39, 0) << 32 ^ var15) & -1L << 32;
               if (m.1brsfbjjf5nmz<invokedynamic>(m, var6, (int)(var15 >>> 32), 0)) {
                  var7.3rxkwbzdw4dai<invokedynamic>(var7, IlIillIiilIi<invokedynamic>(), ((int)(var15 >>> 32)).1e02s75eowcyx<invokedynamic>((int)(var15 >>> 32), 0), 0);
                  ++this.illiiIiill;
                  if (((var21 ^ 1801311284) + ((var21 & 1801311284) << 1) - (var21 + 1801311284) ^ 1) == 0) {
                     throw null;
                  }
               } else if ((int)(var15 >>> 32) != opts.3cuthdnbutn08<invokedynamic>(opts, 0)) {
                  ++this.IiliiIiill;
                  List var41 = this.lIliiIiill;
                  StringBuilder var51 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), policy, 0);
                  var41.1xiogph6vygyv<invokedynamic>(var41, var51.jzvvq9ek5azw<invokedynamic>(var51, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var51.jzvvq9ek5azw<invokedynamic>(var51, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
                  if (m.ut4zfoykzg70<invokedynamic>(m, var6, 0) && ((int)(var15 >>> 32)).yj963ih4x68h<invokedynamic>((int)(var15 >>> 32), 0)) {
                     var41 = this.IlliiIiill;
                     var51 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0).jzvvq9ek5azw<invokedynamic>((new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), IlIillIiilIi<invokedynamic>(), 0), opts.7kf1g8fl0ob8<invokedynamic>(opts, 0), 0);
                     var41.1xiogph6vygyv<invokedynamic>(var41, var51.jzvvq9ek5azw<invokedynamic>(var51, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var51.jzvvq9ek5azw<invokedynamic>(var51, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
                  }
               }
            }
         }

         if (mod.IlIliiiill && id.1oo0i82uvfcr0<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0)) {
            JsonElement var43 = id.2f12yjf6mgbri<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0);
            if (!var43.29cjf1whd4d5p<invokedynamic>(var43, 0)) {
               JsonElement var28 = id.2f12yjf6mgbri<invokedynamic>(id, IlIillIiilIi<invokedynamic>(), 0);
               if (m.o4ogmajjv62d<invokedynamic>(m, policy, 0) && opts.1w1b6y6606rg1<invokedynamic>(opts, 0) && var28.2dzks2wfncvmb<invokedynamic>(var28, 0, 0) == null) {
                  var7.wetdadyussjk<invokedynamic>(var7, IlIillIiilIi<invokedynamic>(), var28, 0);
                  if ((var20 - var19 - 642626100 ^ 1) == 0) {
                     throw new VerifyError("Inconsistent flow at 64402");
                  }
               } else {
                  ++this.IiliiIiill;
                  List var44 = this.lIliiIiill;
                  StringBuilder var53 = (new StringBuilder()).jzvvq9ek5azw<invokedynamic>(new StringBuilder(), policy, 0);
                  var44.1xiogph6vygyv<invokedynamic>(var44, var53.jzvvq9ek5azw<invokedynamic>(var53, IlIillIiilIi<invokedynamic>(), 0).17b93pe9xtj46<invokedynamic>(var53.jzvvq9ek5azw<invokedynamic>(var53, IlIillIiilIi<invokedynamic>(), 0), 0), 0);
               }
            }
         }

         this.lIiiiIiill.3g04tk40flp3m<invokedynamic>(this.lIiiiIiill, policy, var7, 0);
      }
   }

   private static JsonObject IIIllIIliIIl(String m, JsonObject policy, llllliiillllii mod, lIiIiIlliIiIiIll id) {
      int[] var18 = new int[20];
      int var14 = System.identityHashCode(var18) ^ 897442745;
      int var16 = System.identityHashCode(var18) ^ 971865242 ^ 1347253166;
      int var17 = System.identityHashCode(var18) + -1443937450;
      long var11 = -2826934968387238434L;
      ilIIlIliIiIIlIli var4 = id.1bqqnt9xi3tz6<invokedynamic>(id, m, mod.1as5ysalgm4yu<invokedynamic>(mod, 0), mod.on8kp6ebhzbt<invokedynamic>(mod, 0), 0);
      JsonObject var5 = new JsonObject();
      JsonElement var10000 = policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0);
      if (var10000.13evjyv00eq4t<invokedynamic>(var10000, 0)) {
         var10000 = policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0);
         var11 ^= ((long)var10000.1edotw59k1z9p<invokedynamic>(var10000, 0) << 32 ^ var11) & -1L << 32;
         if (id.2u9zd5sbjp68u<invokedynamic>(id, var4, (boolean)((int)(var11 >>> 32)), 0)) {
            var5.1jeeu6iy20r3r<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), ((int)(var11 >>> 32)).2tsqv9dx8zc5<invokedynamic>((boolean)((int)(var11 >>> 32)), 0), 0);
         }
      }

      var10000 = policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0);
      if (var10000.3k8kjzubb2wpr<invokedynamic>(var10000, 0) && id.1brsfbjjf5nmz<invokedynamic>(id, var4, policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0).1iy7epzcp8ns5<invokedynamic>(policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0), 0), 0)) {
         var5.3rxkwbzdw4dai<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0).1iy7epzcp8ns5<invokedynamic>(policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0), 0).1e02s75eowcyx<invokedynamic>(policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0).1iy7epzcp8ns5<invokedynamic>(policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0), 0), 0), 0);
      }

      JsonObject var6 = new JsonObject();
      if (policy.2s020tzlerhqb<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0)) {
         Set var26 = policy.373k3dqeul6gh<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0).29lzs9rbf4tpy<invokedynamic>(policy.373k3dqeul6gh<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0), 0);
         Iterator var7 = var26.yggj9xz3wsqe<invokedynamic>(var26, 0);

         while(var7.3q3fmnj2xpoi8<invokedynamic>(var7, 0)) {
            Map.Entry var8 = (Map.Entry)var7.2m4qzwnzdi3ei<invokedynamic>(var7, 0);
            iIiIiIIlIliIiIIl var9 = mod.2rg4xx6r4b3jb<invokedynamic>(mod, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), 0);
            if (var9 != null) {
               if (mod.hbfwzuhh5t4a<invokedynamic>(mod, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), 0)) {
                  if ((var17 + 1990738925 - var17 - 1990738925 ^ 1) == 0) {
                     throw new VerifyError("Inconsistent flow at 58993");
                  }
               } else {
                  IIIlllilIIllli var10 = id.2dkzeupjlpnjj<invokedynamic>(id, m, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), var9, 0);
                  if (var10 != IIIlllilIIllli.iillilIIIl && id.1m9d3yzmcsasf<invokedynamic>(id, var10, (JsonElement)var8.3c95lxoezhvd6<invokedynamic>(var8, 0), 0)) {
                     var6.wetdadyussjk<invokedynamic>(var6, (String)var8.1e233vtwwuv3i<invokedynamic>(var8, 0), (JsonElement)var8.3c95lxoezhvd6<invokedynamic>(var8, 0), 0);
                  }

                  if (((var17 ^ 1604027209) + ((var17 & 1604027209) << 1) - (var17 + 1604027209) ^ 1) == 0) {
                     ilIllIiIll = ~ilIllIiIll;
                     throw null;
                  }
               }
            }
         }
      }

      var5.wetdadyussjk<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), var6, 0);
      if (policy.1oo0i82uvfcr0<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0)) {
         var10000 = policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0);
         if (!var10000.29cjf1whd4d5p<invokedynamic>(var10000, 0) && id.o4ogmajjv62d<invokedynamic>(id, m, 0) && mod.1w1b6y6606rg1<invokedynamic>(mod, 0)) {
            var10000 = policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0);
            if (var10000.2dzks2wfncvmb<invokedynamic>(var10000, 0, 0) == null) {
               var5.wetdadyussjk<invokedynamic>(var5, IlIillIiilIi<invokedynamic>(), policy.2f12yjf6mgbri<invokedynamic>(policy, IlIillIiilIi<invokedynamic>(), 0), 0);
            }
         }
      }

      return var5;
   }

   public static Ilillillllillill liiiIIllIl(JsonObject live, llliiillilliiill opts, Collection<llllliiillllii> content, lIiIiIlliIiIiIll policy) {
      Ilillillllillill var4 = new Ilillillllillill();
      if (live != null && opts != null) {
         if (policy != null && policy.37lyapgigj3qi<invokedynamic>(policy, 0)) {
            Map var5 = content.tuilg8p9p2g2<invokedynamic>(content, 0);
            if (opts.lIIliiiill && live.2s020tzlerhqb<invokedynamic>(live, IlIillIiilIi<invokedynamic>(), 0)) {
               var4.1r7pz0pzemvta<invokedynamic>(var4, IlIillIiilIi<invokedynamic>(), live.373k3dqeul6gh<invokedynamic>(live, IlIillIiilIi<invokedynamic>(), 0), opts, var5, policy, 0);
            }

            if (opts.ilIliiiill && live.2s020tzlerhqb<invokedynamic>(live, IlIillIiilIi<invokedynamic>(), 0)) {
               var4.liliiIiill = true;
               var4.1r7pz0pzemvta<invokedynamic>(var4, IlIillIiilIi<invokedynamic>(), live.373k3dqeul6gh<invokedynamic>(live, IlIillIiilIi<invokedynamic>(), 0), opts, var5, policy, 0);
            }

            if (opts.IiIliiiill && live.2s020tzlerhqb<invokedynamic>(live, IlIillIiilIi<invokedynamic>(), 0)) {
               var4.iiliiIiill = true;
               var4.1r7pz0pzemvta<invokedynamic>(var4, IlIillIiilIi<invokedynamic>(), live.373k3dqeul6gh<invokedynamic>(live, IlIillIiilIi<invokedynamic>(), 0), opts, var5, policy, 0);
            }

            return var4;
         } else {
            var4.IIiiiIiill = true;
            var4.IlliiIiill.1xiogph6vygyv<invokedynamic>(var4.IlliiIiill, IlIillIiilIi<invokedynamic>(), 0);
            return var4;
         }
      } else {
         return var4;
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      String var17 = var3;
      int[] var13 = new int[19];
      int var9 = System.identityHashCode(var13) + -473027059;
      int var11 = System.identityHashCode(var13) ^ -449880269 ^ 1853024998;
      int var12 = System.identityHashCode(var13) + -676590585;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf030') + var5) ^ 29123) ^ '衵') - var5) + '\uedac') ^ 5093) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf030') + var5) ^ 29123) ^ '衵') - var5) + '\uedac') ^ 5093) << 6) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf030') + var5) ^ 29123) ^ '衵') - var5) + '\uedac') ^ 5093) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf030') + var5) ^ 29123) ^ '衵') - var5) + '\uedac') ^ 5093) << 6) ^ var5) >>> 13))) + var5))) + var5) + '큁') - 8956))) + 23074));
         ++var5;
         if (!(var17 != var17 ^ true)) {
            throw new VerifyError("Inconsistent flow at 1517");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
