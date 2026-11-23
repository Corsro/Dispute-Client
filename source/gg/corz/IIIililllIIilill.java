package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIIililllIIilill {
   private final String lIiIIliill;
   public final boolean iilIIliill;
   private final String IIiIIliill;
   private final Map<Integer, iIlIlIlIllIlIl> IliIIliill = new HashMap();
   private final boolean iIiIIliill;
   private final iIlIlIlIllIlIl iliIIliill;
   public final String lilIIliill;
   private final Map<Integer, iIlIlIlIllIlIl> lliIIliill = new HashMap();
   private static final Pattern IilIIliill = Pattern.compile(IiIlliIliiIl<invokedynamic>());

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) << 2 | (char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) >>> 14) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) << 2 | (char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) >>> 14) >>> 1))) >>> 3 | (char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) << 2 | (char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) >>> 14) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) << 2 | (char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ 15161))) + var5) >>> 14) >>> 1))) << 13) ^ var5) ^ var5) ^ var5) + var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Set<Integer> lIiiIiIlilli() {
      LinkedHashSet var1 = new LinkedHashSet(this.IliIIliill.keySet());
      var1.addAll(this.lliIIliill.keySet());
      return var1;
   }

   public iIlIlIlIllIlIl liiiIIllIl(int code) {
      iIlIlIlIllIlIl var2 = (iIlIlIlIllIlIl)this.IliIIliill.get(code);
      if (var2 != null) {
         return var2;
      } else {
         return this.iIiIIliill && code != ((-1994985092 >>> 31 | -1994985092 << 1) * -587345955 ^ -406407158) ? new iIlIlIlIllIlIl(iliIiiliiiii(this.IIiIIliill, code), -1, -1) : this.iliIIliill;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) ^ 32136) ^ var5) + var5) + var5))) - var5) ^ 21357) >>> 2 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) ^ 32136) ^ var5) + var5) + var5))) - var5) ^ 21357) << 14))) ^ 'ퟏ') - var5) - var5) + '\ue93a'))) ^ var5)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIlIlIlIllIlIl iIlIlllllill(int code) {
      iIlIlIlIllIlIl var2 = (iIlIlIlIllIlIl)this.lliIIliill.get(code);
      if (var2 != null) {
         return var2;
      } else {
         return !this.iilIIliill && this.lIiIIliill != null ? new iIlIlIlIllIlIl(iliIiiliiiii(this.lIiIIliill, code), -1, -1) : null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) << 10 | (char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) >>> 6) >>> 14 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) << 10 | (char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) >>> 6) << 2) - 7896))) ^ var5))) << 8 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) << 10 | (char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) >>> 6) >>> 14 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) << 10 | (char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) << 2 | (char)((char)((char)(~var4[var5]) - var5) + var5) >>> 14) ^ 8009) >>> 6) << 2) - 7896))) ^ var5))) >>> 8) + var5) - var5) ^ var5) - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IIIililllIIilill IliIlllilIi(String json) {
      return new IIIililllIIilill(JsonParser.parseString(json).getAsJsonObject());
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) >>> 10 | (char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) << 6) ^ '\udc2b') - 17749) - var5) - var5) << 11 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) >>> 10 | (char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) << 6) ^ '\udc2b') - 17749) - var5) - var5) >>> 5) ^ var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) >>> 10 | (char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) << 6) ^ '\udc2b') - 17749) - var5) - var5) << 11 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) >>> 10 | (char)(~((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ 16226))))))))) << 6) ^ '\udc2b') - 17749) - var5) - var5) >>> 5) ^ var5) + var5) + var5) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iIlIlIlIllIlIl IIIllIIliIIl(JsonElement v) {
      long var5 = -4493449045274481155L;
      if (v != null && !v.isJsonNull()) {
         if (this.iilIIliill) {
            if (v.isJsonArray() && this.IIiIIliill != null) {
               JsonArray var7 = v.getAsJsonArray();
               if (var7.size() < (~(((1576445179 << 13 | 1576445179 >>> 19) << 3 | (1576445179 << 13 | 1576445179 >>> 19) >>> 29) - -31) ^ 1527030248)) {
                  return null;
               } else {
                  var5 ^= ((long)((int)Math.round(var7.get(0).getAsDouble())) << 32 ^ var5) & -1L << 32;
                  var5 ^= ((long)((int)Math.round(var7.get(1).getAsDouble())) ^ var5) & -1L >>> 32;
                  return (int)(var5 >>> 32) >= 0 && (int)var5 > 0 ? new iIlIlIlIllIlIl(this.IIiIIliill, (int)(var5 >>> 32), (int)var5) : null;
               }
            } else {
               return null;
            }
         } else if (!v.isJsonPrimitive()) {
            return null;
         } else {
            String var2 = v.getAsString();
            return var2.isEmpty() ? null : new iIlIlIlIllIlIl(var2, -1, -1);
         }
      } else {
         return null;
      }
   }

   private IIIililllIIilill(JsonObject root) {
      this.lilIIliill = IlIlllIlilIl(root, IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>());
      this.iilIIliill = IiIlliIliiIl<invokedynamic>().equals(IlIlllIlilIl(root, IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>()));
      this.IIiIIliill = IlIlllIlilIl(root, IiIlliIliiIl<invokedynamic>(), (String)null);
      this.lIiIIliill = IlIlllIlilIl(root, IiIlliIliiIl<invokedynamic>(), (String)null);
      this.iIiIIliill = !this.iilIIliill && root.has(IiIlliIliiIl<invokedynamic>()) && root.get(IiIlliIliiIl<invokedynamic>()).getAsInt() >= 2 && this.IIiIIliill != null;
      JsonObject var2 = root.has(IiIlliIliiIl<invokedynamic>()) && root.get(IiIlliIliiIl<invokedynamic>()).isJsonObject() ? root.getAsJsonObject(IiIlliIliiIl<invokedynamic>()) : new JsonObject();

      for(Map.Entry var4 : var2.entrySet()) {
         String var5 = (String)var4.getKey();
         boolean var6 = var5.endsWith(IiIlliIliiIl<invokedynamic>());

         int var7;
         try {
            var7 = Integer.parseInt(var6 ? var5.substring(0, var5.length() - 3) : var5);
         } catch (NumberFormatException var9) {
            continue;
         }

         iIlIlIlIllIlIl var8 = this.IIIllIIliIIl((JsonElement)var4.getValue());
         if (var8 != null) {
            (var6 ? this.lliIIliill : this.IliIIliill).put(var7, var8);
         }
      }

      iIlIlIlIllIlIl var10 = (iIlIlIlIllIlIl)this.IliIIliill.get(30);
      if (var10 == null && this.iIiIIliill) {
         var10 = new iIlIlIlIllIlIl(iliIiiliiiii(this.IIiIIliill, 30), -1, -1);
      }

      if (var10 == null && !this.IliIIliill.isEmpty()) {
         var10 = (iIlIlIlIllIlIl)this.IliIIliill.get(this.IliIIliill.keySet().stream().min(Integer::compare).orElseThrow());
      }

      this.iliIIliill = var10;
   }

   private static String IlIlllIlilIl(JsonObject def, String o, String key) {
      JsonElement var3 = def.get(o);
      return var3 != null && var3.isJsonPrimitive() ? var3.getAsString() : key;
   }

   static String iliIiiliiiii(String code, int pattern) {
      long var6 = 696310424621711238L;
      long var8 = -3232167835598691579L;
      Matcher var2 = IilIIliill.matcher(code);
      if (!var2.find()) {
         return code;
      } else {
         var6 ^= ((long)Integer.parseInt(var2.group(1)) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)Integer.parseInt(var2.group(2)) ^ var6) & -1L >>> 32;
         if ((int)var6 < (int)(var6 >>> 32)) {
            var8 ^= ((long)((int)(var6 >>> 32)) << 32 ^ var8) & -1L << 32;
            var6 ^= ((long)((int)var6) << 32 ^ var6) & -1L << 32;
            var6 ^= ((long)((int)(var8 >>> 32)) ^ var6) & -1L >>> 32;
         }

         var8 ^= ((long)((int)(var6 >>> 32) + Math.floorMod(pattern == ((--424423576 >>> 27 | --424423576 << 5) ^ -696652548) ? 0 : pattern, (int)var6 - (int)(var6 >>> 32) + 1)) << 32 ^ var8) & -1L << 32;
         return code.substring(0, var2.start()) + (int)(var8 >>> 32) + code.substring(var2.end());
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '\udada') ^ var5))) + var5) ^ var5) - var5) + 7716) + var5))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi() {
      return !this.lliIIliill.isEmpty() || !this.iilIIliill && this.lIiIIliill != null;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8837588060276832557L ^ Long.rotateLeft(-8637223963495358854L, 54) ^ 7956370971505430515L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1845152225010029201L ^ Long.rotateLeft(5713503667819590322L, 54) ^ -256922155924261646L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6546505049169807304L ^ Long.rotateLeft(6652698831205097319L, 22) ^ 259214582454260487L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8320716462513225985L ^ Long.rotateLeft(5808059524566870660L, 7) ^ -2156310663824804384L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2994497410867400012L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1026694299424806632L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -419309620125218789L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5394967270515768837L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6688629846293244983L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5085285393709780545L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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
