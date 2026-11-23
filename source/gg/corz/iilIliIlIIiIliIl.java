package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iilIliIlIIiIliIl {
   private static String IIIilIIiiIIi(ilIllIiIll m) {
      return IIiiIllIiiIl.IliIlllilIi(m.lIiiIiIlilli());
   }

   private static String lIlIliIlIl() {
      try {
         return IIIIIllllIIIIlll.IIillIiliIil();
      } catch (Throwable var1) {
         return IllIllllIl<invokedynamic>();
      }
   }

   public static boolean lIiiIiIlilli(String slug) {
      return iliIiiliiiii(slug, llilIllililIll.IilliliilIIi());
   }

   static boolean iliIiiliiiii(String slug, List<ilIllIiIll> modules) {
      liiilIliiiilIl var2 = lilllIiliilllIil.IIIllIIliIIl(slug);
      if (var2 == null) {
         return false;
      } else {
         lIlIllIliIlIllIl var3 = liiiIIllIl(var2.IIIillllllIIilllll.iiililIiIl, var2.IIIillllllIIilllll.IIIiilIiIl, var2.IIIillllllIIilllll.lIIiilIiIl, modules);
         if (var2.iIIilllllIlIilllll && var3.ilIiilIiIl.equals(var2.IIIillllllIIilllll.ilIiilIiIl)) {
            return true;
         } else {
            var3.iIIiilIiIl = var2.IIIillllllIIilllll.iIIiilIiIl;
            lilllIiliilllIil.IIIilIIiiIIi(slug, var3);
            return true;
         }
      }
   }

   public static IIIllllllIIlllll Iilililiiili(lIlIllIliIlIllIl profile, llliiillilliiill opts) {
      return Iiiiliiiiiii(profile, opts, llilIllililIll.IilliliilIIi(), iiiIIIlIIIlIIl::IilliliilIIi);
   }

   public static lIlIllIliIlIllIl IliIlllilIi(String name, String author, String description) {
      return liiiIIllIl(name, author, description, llilIllililIll.IilliliilIIi());
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + 'ꗥ') >>> 4 | (char)((char)(var4[var5] + var5) + 'ꗥ') << 12) << 9 | (char)((char)((char)(var4[var5] + var5) + 'ꗥ') >>> 4 | (char)((char)(var4[var5] + var5) + 'ꗥ') << 12) >>> 7))) ^ '퍵'))) ^ '츱') >>> 9 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + 'ꗥ') >>> 4 | (char)((char)(var4[var5] + var5) + 'ꗥ') << 12) << 9 | (char)((char)((char)(var4[var5] + var5) + 'ꗥ') >>> 4 | (char)((char)(var4[var5] + var5) + 'ꗥ') << 12) >>> 7))) ^ '퍵'))) ^ '츱') << 7))) ^ '놙'))) - var5) ^ 9981))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIillIiliIil(JsonObject m, ilIllIiIll mj, JsonObject content) {
      if (mj instanceof IIililillIililil) {
         Ililllililil(m, IllIllllIl<invokedynamic>()).add(IllIllllIl<invokedynamic>(), content);
      } else if (mj instanceof Iiliililliliilil) {
         Ililllililil(m, IllIllllIl<invokedynamic>()).add(IllIllllIl<invokedynamic>(), content);
      } else {
         Ililllililil(m, IllIllllIl<invokedynamic>()).add(IIIilIIiiIIi(mj), content);
      }

   }

   private static ilIIlIliIiIIlIli IIIIllIIIl(lIiIiIlliIiIiIll policy, String m, ilIllIiIll id) {
      return policy.Iiilliiliiil(m, id.liiiIIllIl(), ilIIlilIiIIlil.liiiIIllIl(id));
   }

   private static boolean IlIlllIlilIl(JsonElement depth, int v) {
      if (depth != null && !depth.isJsonNull()) {
         if (v > 12) {
            return false;
         } else if (depth.isJsonPrimitive()) {
            return !depth.getAsJsonPrimitive().isString() || depth.getAsString().length() <= 2048;
         } else if (depth.isJsonArray()) {
            for(JsonElement var5 : depth.getAsJsonArray()) {
               if (!IlIlllIlilIl(var5, v + 1)) {
                  return false;
               }
            }

            return true;
         } else {
            for(Map.Entry var3 : depth.getAsJsonObject().entrySet()) {
               if (IiiiiIIlliiiiIIl.IliIlllilIi((String)var3.getKey()) || !IlIlllIlilIl((JsonElement)var3.getValue(), v + 1)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public static List<llllliiillllii> IiIiliIiiiIi(List<ilIllIiIll> modules) {
      ArrayList var1 = new ArrayList();

      for(final ilIllIiIll var3 : modules) {
         final String var4 = IIIilIIiiIIi(var3);
         var1.add(new llllliiillllii() {
            public boolean iliIiiliiiii(String name) {
               IilliIllilliIl var2 = iilIliIlIIiIliIl.IIlilIliiIli(var3, name);
               return var2 != null && var2.IlIlllIlilIl();
            }

            public boolean iIlIlllllill() {
               return var3.liiiIIllIl();
            }

            public String IliIlllilIi() {
               return var4;
            }

            public boolean IiIlliIliiIl() {
               return var3.lliIliliIl();
            }

            public boolean IIlllIlliIll() {
               return ilIIlilIiIIlil.liiiIIllIl(var3);
            }

            public JsonElement IIIllIIliIIl(String name) {
               IilliIllilliIl var2 = iilIliIlIIiIliIl.IIlilIliiIli(var3, name);

               try {
                  return var2 == null ? null : var2.IIlllIlliIll();
               } catch (Exception var4x) {
                  return null;
               }
            }

            public int IlIlllIlilIl() {
               return var3.IIIilIIiiIIi();
            }

            public iIiIiIIlIliIiIIl lIiiIiIlilli(String name) {
               IilliIllilliIl var2 = iilIliIlIIiIliIl.IIlilIliiIli(var3, name);
               return var2 == null ? null : var2.IiIlliIliiIl();
            }

            public boolean liiiIIllIl() {
               return var3.IliIlllilIi();
            }

            public String IilliliilIIi() {
               return var3.IilliliilIIi();
            }
         });
      }

      return var1;
   }

   public static lIlIllIliIlIllIl liiiIIllIl(String name, String description, String author, List<ilIllIiIll> modules) {
      lIlIllIliIlIllIl var4 = new lIlIllIliIlIllIl();
      var4.iiililIiIl = name;
      var4.IIIiilIiIl = description;
      var4.lIIiilIiIl = author;
      var4.IiililIiIl = lIlIliIlIl();
      var4.liililIiIl = IllIllllIl<invokedynamic>();
      var4.ilIiilIiIl = IIIllIIliIIl(Illlllllilll(modules));
      return var4;
   }

   private static ilIllIiIll Illillliilli(List<ilIllIiIll> stableId, String modules) {
      for(ilIllIiIll var3 : stableId) {
         if (IIIilIIiiIIi(var3).equals(modules)) {
            return var3;
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '腘')) >>> 15 | (char)((char)(var4[var5] - '腘')) << 1) + 1925) >>> 3 | (char)((char)((char)((char)(var4[var5] - '腘')) >>> 15 | (char)((char)(var4[var5] - '腘')) << 1) + 1925) << 13) + 20623) + var5) - var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '腘')) >>> 15 | (char)((char)(var4[var5] - '腘')) << 1) + 1925) >>> 3 | (char)((char)((char)((char)(var4[var5] - '腘')) >>> 15 | (char)((char)(var4[var5] - '腘')) << 1) + 1925) << 13) + 20623) + var5) - var5) << 10) ^ '핓') ^ 24313) - 13067));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int iiIIlIIlIl(ilIllIiIll settings, String own, JsonObject res, lIiIiIlliIiIiIll m, boolean id, IIIllllllIIlllll policy) {
      long var11 = 9201492814714485365L;
      var11 ^= (0L ^ var11) & -1L << 32;

      for(IilliIllilliIl var8 : settings.IiIlliIliiIl()) {
         if (!var8.IlIlllIlilIl()) {
            String var9 = var8.IliIlllilIi();
            if (res.has(var9) && (id || m.IIIilIIiiIIi(own, var9, var8.IiIlliIliiIl()) != IIIlllilIIllli.iillilIIIl)) {
               try {
                  switch (var8.Illlllllilll(res.get(var9))) {
                     case lIilllIill:
                        var11 += 4294967296L;
                        break;
                     case iIilllIill:
                        var11 += 4294967296L;
                        ++policy.lillilIill;
                        break;
                     case IlilllIill:
                        policy.iIililIill.add(IllIllllIl<invokedynamic>() + settings.IilliliilIIi() + IllIllllIl<invokedynamic>() + var9 + IllIllllIl<invokedynamic>());
                     case IIilllIill:
                  }
               } catch (Exception var13) {
                  policy.iIililIill.add(IllIllllIl<invokedynamic>() + settings.IilliliilIIi() + IllIllllIl<invokedynamic>() + var9);
               }
            }
         }
      }

      return (int)(var11 >>> 32);
   }

   private static JsonObject Ililllililil(JsonObject content, String key) {
      if (!content.has(key)) {
         content.add(key, new JsonObject());
      }

      return content.getAsJsonObject(key);
   }

   public static IIIllllllIIlllll Iliilliiilii(liiilIliiiilIl persist, List<ilIllIiIll> preset, Runnable modules) {
      if (persist == null) {
         IIIllllllIIlllll var3 = new IIIllllllIIlllll();
         var3.IlililIill = IllIllllIl<invokedynamic>();
         return var3;
      } else {
         return Iiiiliiiiiii(persist.IIIillllllIIilllll, persist.iIIilllllIlIilllll ? llliiillilliiill.IilliliilIIi() : llliiillilliiill.iIlIlllllill(), preset, modules);
      }
   }

   public static String iIlIlllllill(String author, String name, String description) {
      return IilliliilIIi(author, name, description, llilIllililIll.IilliliilIIi());
   }

   private static JsonObject Iiilliiliiil(ilIllIiIll m) {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IllIllllIl<invokedynamic>(), m.IliIlllilIi());
      var1.addProperty(IllIllllIl<invokedynamic>(), m.IIIilIIiiIIi());
      JsonObject var2 = new JsonObject();

      for(IilliIllilliIl var4 : m.IiIlliIliiIl()) {
         if (!var4.IlIlllIlilIl()) {
            JsonElement var5 = var4.IIlllIlliIll();
            if (var5 != null) {
               var2.add(var4.IliIlllilIi(), var5);
            }
         }
      }

      var1.add(IllIllllIl<invokedynamic>(), var2);
      if (m.lliIliliIl()) {
         JsonElement var6 = m.IIiIllIiIl();
         if (var6 != null) {
            var1.add(IllIllllIl<invokedynamic>(), var6);
         }
      }

      return var1;
   }

   public static lIlIllIliIlIllIl IIlllIlliIll(lIlIllIliIlIllIl modules, List<ilIllIiIll> profile) {
      if (modules == null) {
         return null;
      } else {
         lIlIllIliIlIllIl var2 = modules.IIlllIlliIll();
         var2.ilIiilIiIl = Ilillillllillill.iliIiiliiiii(modules.ilIiilIiIl, IiIiliIiiiIi(profile), lIiIiIlliIiIiIll.IliIlllilIi());
         return var2;
      }
   }

   private static boolean llIIlilIIl(lIiIiIlliIiIiIll policy, String m, ilIllIiIll id, boolean own) {
      return own ? !id.liiiIIllIl() : policy.IiIiliIiiiIi(IIIIllIIIl(policy, m, id), true);
   }

   public static IIIllllllIIlllll Iiiiliiiiiii(lIlIllIliIlIllIl profile, llliiillilliiill modules, List<ilIllIiIll> persist, Runnable opts) {
      long var14 = 7921115002173583239L;
      IIIllllllIIlllll var4 = new IIIllllllIIlllll();
      if (profile == null) {
         var4.IlililIill = IllIllllIl<invokedynamic>();
         return var4;
      } else {
         if (modules == null) {
            modules = llliiillilliiill.liiiIIllIl();
         }

         lIiIiIlliIiIiIll var5 = lIiIiIlliIiIiIll.IliIlllilIi();
         if (!var5.IlIlllIlilIl()) {
            var4.IlililIill = IllIllllIl<invokedynamic>();
            return var4;
         } else {
            var14 ^= ((long)modules.IliIlllilIi() << 32 ^ var14) & -1L << 32;
            JsonObject var7 = Illlllllilll(persist);
            Ilillillllillill var8 = Ilillillllillill.liiiIIllIl(profile.ilIiilIiIl, modules, IiIiliIiiiIi(persist), var5);
            var4.iIililIill.addAll(var8.IlliiIiill);

            try {
               for(Map.Entry var10 : var8.lIiiiIiill.entrySet()) {
                  String var11 = (String)var10.getKey();
                  ilIllIiIll var12 = Illillliilli(persist, var11);
                  if (var12 != null) {
                     JsonObject var13 = (JsonObject)var10.getValue();
                     if (var13.has(IllIllllIl<invokedynamic>()) && var13.get(IllIllllIl<invokedynamic>()).isJsonObject()) {
                        var4.illlilIill += iiIIlIIlIl(var12, var11, var13.getAsJsonObject(IllIllllIl<invokedynamic>()), var5, (boolean)((int)(var14 >>> 32)), var4);
                     }

                     if (var13.has(IllIllllIl<invokedynamic>()) && iIIIlIlIIl(var5, var11, var12, var13.get(IllIllllIl<invokedynamic>()).getAsInt(), (boolean)((int)(var14 >>> 32)))) {
                        var12.IlIillIiilIi(var13.get(IllIllllIl<invokedynamic>()).getAsInt());
                        ++var4.IillilIill;
                     }

                     if (var13.has(IllIllllIl<invokedynamic>()) && var12.lliIliliIl() && ((int)(var14 >>> 32) != 0 || var5.Iliilliiilii(var11))) {
                        var12.iIiIlIliIl(var13.get(IllIllllIl<invokedynamic>()));
                     }

                     var12.IiiIlliiIl();
                  }
               }

               for(String var21 : var8.liIiiIiill) {
                  ilIllIiIll var24 = Illillliilli(persist, var21);
                  if (var24 != null) {
                     var24.IIillIiliIil(false);
                  }
               }

               for(String var22 : var8.IiIiiIiill) {
                  ilIllIiIll var25 = Illillliilli(persist, var22);
                  if (var25 != null && llIIlilIIl(var5, var22, var25, (boolean)((int)(var14 >>> 32)))) {
                     var25.IIillIiliIil(true);
                  }
               }

               opts.run();
               var4.IIililIill = (boolean)((int)(var14 >>> 32));
               var4.iillilIill = var8.IiliiIiill;

               for(String var23 : var8.IIliiIiill) {
                  ilIllIiIll var26 = Illillliilli(persist, var23);
                  var4.lIililIill.add(var26 != null ? var26.IilliliilIIi() : var23);
               }

               var4.IlllilIill = true;
               return var4;
            } catch (Exception var17) {
               try {
                  IiIIlliIIl(var7, persist);
                  opts.run();
                  var4.llllilIill = true;
               } catch (Exception var16) {
               }

               var4.IlililIill = IllIllllIl<invokedynamic>() + var17.getMessage();
               return var4;
            }
         }
      }
   }

   public static List<llllliiillllii> IlIillIiilIi() {
      return IiIiliIiiiIi(llilIllililIll.IilliliilIIi());
   }

   private static JsonObject Illlllllilll(List<ilIllIiIll> modules) {
      JsonObject var1 = new JsonObject();
      var1.add(IllIllllIl<invokedynamic>(), new JsonObject());

      for(ilIllIiIll var3 : modules) {
         IIillIiliIil(var1, var3, Iiilliiliiil(var3));
      }

      return var1;
   }

   static lIlIllIliIlIllIl Iilllilliill(JsonObject root, List<ilIllIiIll> modules) {
      lIlIllIliIlIllIl var2 = new lIlIllIliIlIllIl();
      var2.iiililIiIl = IllIllllIl<invokedynamic>();
      JsonObject var3 = new JsonObject();
      var3.add(IllIllllIl<invokedynamic>(), new JsonObject());

      for(ilIllIiIll var5 : modules) {
         JsonElement var6 = Iiiilliiil.IIIllIIliIIl(root, var5);
         if (var6 != null && var6.isJsonObject()) {
            IIillIiliIil(var3, var5, var6.getAsJsonObject().deepCopy());
         }
      }

      var2.ilIiilIiIl = var3;
      return var2;
   }

   private iilIliIlIIiIliIl() {
   }

   private static void IiIIlliIIl(JsonObject modules, List<ilIllIiIll> backup) {
      long var11 = -6213940101298017296L;

      for(String var3 : Ilillillllillill.ilIiiIiill) {
         if (modules.has(var3)) {
            for(Map.Entry var5 : modules.getAsJsonObject(var3).entrySet()) {
               ilIllIiIll var6 = Illillliilli(backup, (String)var5.getKey());
               if (var6 != null) {
                  JsonObject var7 = ((JsonElement)var5.getValue()).getAsJsonObject();

                  for(IilliIllilliIl var9 : var6.IiIlliIliiIl()) {
                     if (!var9.IlIlllIlilIl() && var7.getAsJsonObject(IllIllllIl<invokedynamic>()).has(var9.IliIlllilIi())) {
                        try {
                           var9.Illlllllilll(var7.getAsJsonObject(IllIllllIl<invokedynamic>()).get(var9.IliIlllilIi()));
                        } catch (Exception var13) {
                        }
                     }
                  }

                  var6.IlIillIiilIi(var7.get(IllIllllIl<invokedynamic>()).getAsInt());
                  if (var7.has(IllIllllIl<invokedynamic>()) && var6.lliIliliIl()) {
                     var6.iIiIlIliIl(var7.get(IllIllllIl<invokedynamic>()));
                  }

                  var11 ^= ((long)var7.get(IllIllllIl<invokedynamic>()).getAsBoolean() << 32 ^ var11) & -1L << 32;
                  if ((int)(var11 >>> 32) != var6.IliIlllilIi()) {
                     var6.IIillIiliIil((boolean)((int)(var11 >>> 32)));
                  }
               }
            }
         }
      }

   }

   static String IilliliilIIi(String name, String modules, String description, List<ilIllIiIll> author) {
      return lilllIiliilllIil.Iiilliiliiil(liiiIIllIl(name, modules, description, author));
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-var4[var5]) + var5))) + var5) - var5) - var5))) ^ 15066) >>> 14 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-var4[var5]) + var5))) + var5) - var5) - var5))) ^ 15066) << 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static JsonObject IIIllIIliIIl(JsonObject content) {
      for(String var2 : Ilillillllillill.ilIiiIiill) {
         if (content.has(var2)) {
            JsonObject var3 = content.getAsJsonObject(var2);

            for(String var5 : List.copyOf(var3.keySet())) {
               if (IiiiiIIlliiiiIIl.IliIlllilIi(var5)) {
                  var3.remove(var5);
               } else {
                  JsonObject var6 = var3.getAsJsonObject(var5);
                  JsonObject var7 = var6.getAsJsonObject(IllIllllIl<invokedynamic>());

                  for(String var9 : List.copyOf(var7.keySet())) {
                     if (IiiiiIIlliiiiIIl.IliIlllilIi(var9) || !IlIlllIlilIl(var7.get(var9), 6)) {
                        var7.remove(var9);
                     }
                  }

                  if (var6.has(IllIllllIl<invokedynamic>()) && !IlIlllIlilIl(var6.get(IllIllllIl<invokedynamic>()), 5)) {
                     var6.remove(IllIllllIl<invokedynamic>());
                  }
               }
            }
         }
      }

      return content;
   }

   private static boolean iIIIlIlIIl(lIiIiIlliIiIiIll policy, String id, ilIllIiIll key, int m, boolean own) {
      return own ? llIllIlilIllIl.IilliliilIIi(m) : policy.Illillliilli(IIIIllIIIl(policy, id, key), m);
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) + 'ﾕ'))) >>> 10 | (char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) + 'ﾕ'))) << 6) + var5) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) + 'ﾕ'))) >>> 10 | (char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) + 'ﾕ'))) << 6) + var5) << 8) - '\uf43d') - var5) + 31388))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IIIllllllIIlllll IIiilIiiiIii(liiilIliiiilIl preset) {
      return Iliilliiilii(preset, llilIllililIll.IilliliilIIi(), iiiIIIlIIIlIIl::IilliliilIIi);
   }

   public static lIlIllIliIlIllIl IiIlliIliiIl(lIlIllIliIlIllIl profile) {
      return IIlllIlliIll(profile, llilIllililIll.IilliliilIIi());
   }

   private static IilliIllilliIl IIlilIliiIli(ilIllIiIll m, String name) {
      for(IilliIllilliIl var3 : m.IiIlliIliiIl()) {
         if (var3.IliIlllilIi().equals(name)) {
            return var3;
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') >>> 2) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') >>> 2) << 7) + var5) - var5))) - var5)) >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') >>> 2) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) - 15627) + 21809) << 11 | (char)((char)((char)(~var4[var5]) - 15627) + 21809) >>> 5) << 3) + var5) - '閫') - '\uf069') + 'ﾄ') >>> 2) << 7) + var5) - var5))) - var5)) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6332540980585489366L ^ Long.rotateLeft(5026470279974540085L, 5) ^ 6185205796490729151L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3393288525268372907L ^ Long.rotateLeft(2758226072779279647L, 11) ^ -8128251098298209597L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8625674365691271971L ^ Long.rotateLeft(-8640668564683102879L, 63) ^ 8618301610741069L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8781078078300103502L ^ Long.rotateLeft(9102500733259290130L, 55) ^ 5490278856791974527L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4847344980779342307L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5729023281952589460L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9143917359006942581L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2695925761923162858L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3367497405692166755L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5581674420647336988L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(illIlIilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lilIliilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiIllIiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIiIlIliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lliIliliIl<invokedynamic>());
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
}
