package gg.corz;

import com.google.gson.JsonArray;
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
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class llIIIlIiilIIIlIi {
   public static final int liIIiiiiil = 64;
   public static final int iiIIiiiiil = 24;
   private String lIlIiiiiil;
   private final List<illiiIIlIiliiIIl> IIlIiiiiil = new ArrayList();
   private boolean iIlIiiiiil;

   public synchronized String IlIillIiilIi() {
      return String.format(Locale.ROOT, IiIiliIiiiIi<invokedynamic>(), this.IIlIiiiiil.size(), this.lIlIiiiiil, this.iIlIiiiiil);
   }

   public synchronized int liiiIIllIl() {
      return this.IIlIiiiiil.size();
   }

   public synchronized boolean Illlllllilll(String from, String to) {
      String var3 = IiIlliIliiIl(to);
      if (var3.isEmpty()) {
         return false;
      } else {
         illiiIIlIiliiIIl var4 = this.iliIiiliiiii(from);
         if (var4 == null) {
            return false;
         } else if (!var3.equalsIgnoreCase(from) && this.iliIiiliiiii(var3) != null) {
            return false;
         } else {
            this.IIlIiiiiil.set(this.IIlIiiiiil.indexOf(var4), new illiiIIlIiliiIIl(var3, var4.iIlIlllllill()));
            if (from.equalsIgnoreCase(this.lIlIiiiiil)) {
               this.lIlIiiiiil = var3;
            }

            return true;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - '\ue076') + '\ua7cd') - 10771))) - var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - '\ue076') + '\ua7cd') - 10771))) - var5))) ^ var5) >>> 11) ^ var5) ^ 18525) + '\ue251') ^ '鯤') << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - '\ue076') + '\ua7cd') - 10771))) - var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - '\ue076') + '\ua7cd') - 10771))) - var5))) ^ var5) >>> 11) ^ var5) ^ 18525) + '\ue251') ^ '鯤') >>> 3) - 1553) + 22829) - 28800))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized boolean IIillIiliIil(String name) {
      if (name == null) {
         this.lIlIiiiiil = null;
         return true;
      } else {
         illiiIIlIiliiIIl var2 = this.iliIiiliiiii(name);
         if (var2 == null) {
            return false;
         } else {
            this.lIlIiiiiil = var2.liiiIIllIl();
            return true;
         }
      }
   }

   public synchronized List<illiiIIlIiliiIIl> IliIlllilIi() {
      return Collections.unmodifiableList(new ArrayList(this.IIlIiiiiil));
   }

   public synchronized boolean IIlllIlliIll(String name, int mask) {
      long var6 = -520524222407270621L;
      String var3 = IiIlliIliiIl(name);
      if (var3.isEmpty()) {
         return false;
      } else {
         var6 ^= ((long)(mask & 511) << 32 ^ var6) & -1L << 32;

         for(var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < this.IIlIiiiiil.size(); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            if (((illiiIIlIiliiIIl)this.IIlIiiiiil.get((int)var6)).liiiIIllIl().equalsIgnoreCase(var3)) {
               this.IIlIiiiiil.set((int)var6, new illiiIIlIiliiIIl(var3, (int)(var6 >>> 32)));
               return true;
            }
         }

         if (this.IIlIiiiiil.size() >= 64) {
            return false;
         } else {
            this.IIlIiiiiil.add(new illiiIIlIiliiIIl(var3, (int)(var6 >>> 32)));
            if (this.lIlIiiiiil == null) {
               this.lIlIiiiiil = var3;
            }

            return true;
         }
      }
   }

   public synchronized illiiIIlIiliiIIl IIIllIIliIIl() {
      return this.iliIiiliiiii(this.lIlIiiiiil);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) >>> 7 | (char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) << 9) >>> 7 | (char)((char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) >>> 7 | (char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) << 9) << 9) - var5) + 14203) - 29002) << 14 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) >>> 7 | (char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) << 9) >>> 7 | (char)((char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) >>> 7 | (char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) ^ var5))) - var5))) << 9) << 9) - var5) + 14203) - 29002) >>> 2))) + 21060))))) + 27253))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IiIlliIliiIl(String name) {
      if (name == null) {
         return "";
      } else {
         String var1 = name.strip().replaceAll(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>());
         return var1.length() > 24 ? var1.substring(0, 24) : var1;
      }
   }

   public synchronized illiiIIlIiliiIIl iliIiiliiiii(String name) {
      if (name == null) {
         return null;
      } else {
         for(illiiIIlIiliiIIl var3 : this.IIlIiiiiil) {
            if (var3.liiiIIllIl().equalsIgnoreCase(name)) {
               return var3;
            }
         }

         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '탏') ^ var5) + var5) - '\udea5') + '꽨') ^ var5))) - '칐'))) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6485025522456621546L ^ Long.rotateLeft(7078354510268741413L, 24) ^ -3647122164960149742L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3412444093367805408L ^ Long.rotateLeft(4832146242860074671L, 36) ^ 7473705160162142022L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9136909023995914552L ^ Long.rotateLeft(-4346912877605293070L, 15) ^ 2703327553676159814L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8120937579864481286L ^ Long.rotateLeft(3604008563199602480L, 53) ^ 1659002492625136790L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4583409300817008332L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8486329093927873159L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7302069998206297782L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3800850430135780940L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4343653468121365465L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4585582709846896441L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   public synchronized void IIIilIIiiIIi(JsonElement el) {
      long var8 = 2292810964899340787L;
      this.IIlIiiiiil.clear();
      this.lIlIiiiiil = null;
      this.iIlIiiiiil = false;
      if (el != null && el.isJsonObject()) {
         JsonObject var2 = el.getAsJsonObject();
         if (var2.has(IiIiliIiiiIi<invokedynamic>()) && var2.get(IiIiliIiiiIi<invokedynamic>()).isJsonArray()) {
            for(JsonElement var4 : var2.getAsJsonArray(IiIiliIiiiIi<invokedynamic>())) {
               if (var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();
                  String var6 = var5.has(IiIiliIiiiIi<invokedynamic>()) ? IiIlliIliiIl(var5.get(IiIiliIiiiIi<invokedynamic>()).getAsString()) : "";
                  var8 ^= ((long)(var5.has(IiIiliIiiiIi<invokedynamic>()) ? var5.get(IiIiliIiiiIi<invokedynamic>()).getAsInt() & 511 : 0) << 32 ^ var8) & -1L << 32;
                  if (!var6.isEmpty() && this.iliIiiliiiii(var6) == null && this.IIlIiiiiil.size() < 64) {
                     this.IIlIiiiiil.add(new illiiIIlIiliiIIl(var6, (int)(var8 >>> 32)));
                  }
               }
            }
         }

         if (var2.has(IiIiliIiiiIi<invokedynamic>()) && this.iliIiiliiiii(var2.get(IiIiliIiiiIi<invokedynamic>()).getAsString()) != null) {
            this.lIlIiiiiil = this.iliIiiliiiii(var2.get(IiIiliIiiiIi<invokedynamic>()).getAsString()).liiiIIllIl();
         }

         if (var2.has(IiIiliIiiiIi<invokedynamic>())) {
            this.iIlIiiiiil = var2.get(IiIiliIiiiIi<invokedynamic>()).getAsBoolean();
         }

      }
   }

   public synchronized Integer IlIlllIlilIl() {
      if (!this.iIlIiiiiil) {
         return null;
      } else {
         illiiIIlIiliiIIl var1 = this.IIIllIIliIIl();
         return var1 == null ? null : var1.iIlIlllllill();
      }
   }

   public synchronized boolean IilliliilIIi() {
      return this.iIlIiiiiil;
   }

   public synchronized String iIlIlllllill() {
      return this.lIlIiiiiil;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) << 9 | (char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) >>> 7))) >>> 10 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) << 9 | (char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) >>> 7))) << 6))) << 6 | (char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) << 9 | (char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) >>> 7))) >>> 10 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) << 9 | (char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 5950) + var5) >>> 7))) << 6))) >>> 10) - var5) + var5) + 16381) + 'ﳠ'))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) >>> 9 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) << 7) - var5) + 25622) + var5) - var5) ^ var5) - '蘐') << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) >>> 9 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) << 7) - var5) + 25622) + var5) - var5) ^ var5) - '蘐') >>> 13) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) >>> 9 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) << 7) - var5) + 25622) + var5) - var5) ^ var5) - '蘐') << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) >>> 9 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 14359) << 7) - var5) + 25622) + var5) - var5) ^ var5) - '蘐') >>> 13) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized JsonElement Iiilliiliiil() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for(illiiIIlIiliiIIl var4 : this.IIlIiiiiil) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(IiIiliIiiiIi<invokedynamic>(), var4.liiiIIllIl());
         var5.addProperty(IiIiliIiiiIi<invokedynamic>(), var4.iIlIlllllill());
         var2.add(var5);
      }

      var1.add(IiIiliIiiiIi<invokedynamic>(), var2);
      if (this.lIlIiiiiil != null) {
         var1.addProperty(IiIiliIiiiIi<invokedynamic>(), this.lIlIiiiiil);
      }

      var1.addProperty(IiIiliIiiiIi<invokedynamic>(), this.iIlIiiiiil);
      return var1;
   }

   public synchronized boolean Iilllilliill(String name) {
      illiiIIlIiliiIIl var2 = this.iliIiiliiiii(name);
      if (var2 == null) {
         return false;
      } else {
         this.IIlIiiiiil.remove(var2);
         if (var2.liiiIIllIl().equalsIgnoreCase(this.lIlIiiiiil)) {
            this.lIlIiiiiil = this.IIlIiiiiil.isEmpty() ? null : ((illiiIIlIiliiIIl)this.IIlIiiiiil.get(0)).liiiIIllIl();
         }

         return true;
      }
   }

   public synchronized boolean Ililllililil(String delta, int name) {
      long var6 = -1433298962616053933L;
      illiiIIlIiliiIIl var3 = this.iliIiiliiiii(delta);
      if (var3 == null) {
         return false;
      } else {
         var6 ^= ((long)this.IIlIiiiiil.indexOf(var3) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)((int)(var6 >>> 32) + Integer.signum(name)) ^ var6) & -1L >>> 32;
         if ((int)var6 >= 0 && (int)var6 < this.IIlIiiiiil.size()) {
            Collections.swap(this.IIlIiiiiil, (int)(var6 >>> 32), (int)var6);
            return true;
         } else {
            return false;
         }
      }
   }

   public synchronized void lIiiIiIlilli(boolean on) {
      this.iIlIiiiiil = on;
   }
}
