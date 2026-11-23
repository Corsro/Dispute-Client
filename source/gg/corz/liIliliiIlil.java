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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIliliiIlil {
   public boolean IIIIIililIIIIili;
   public final String llliilliilliilli;
   public lIliIliIliIl Iliiillilliiilli;
   public IIlIiIilIlIiIi lIiiilliiIiiilli;
   public final int iiIIIiliIIlIIili;
   private final Map<String, IiiiIiIlliiiIiIl> IllIIililllIIili;
   private final Map<String, IIliIiIilIliIiIi> lIlIIiliiIlIIili;
   public String liiiilliiiiiilli;
   private final Map<Long, IiiiIiIlliiiIiIl> illIIiliIilIIili;
   public final int IiIIIililiIIIili;
   public final int llIIIiliilIIIili;
   public final lliIlilliliIlill Iiliillililiilli;
   public String iiliilliIIiiilli;
   public llIIliIiilIIliIi iliiilliIiiiilli;
   public final int iIIIIiliIlIIIili;

   public List<IIliIiIilIliIiIi> IIIllIIliIIl() {
      ArrayList var1 = new ArrayList();

      for(IIliIiIilIliIiIi var3 : this.lIlIIiliiIlIIili.values()) {
         if (var3.iliilIiIIi && var3.liiilIiIIi && var3.IliIlllilIi() && var3.IIIIiIiIIi) {
            var1.add(var3);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) >>> 11) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) >>> 11) - var5) << 3) ^ var5) + var5))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) >>> 11) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) >>> 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 19749) << 10) - 'Ꚏ') ^ var5) - var5) >>> 11) - var5) << 3) ^ var5) + var5))) >>> 4) + '감'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-var4[var5]) ^ var5) + var5))))) + 'ﻬ') - 16767) + 19870) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIliIiIilIliIiIi iIlIlllllill(String id) {
      return (IIliIiIilIliIiIi)this.lIlIIiliiIlIIili.get(id);
   }

   public List<IiiiIiIlliiiIiIl> IIIilIIiiIIi() {
      ArrayList var1 = new ArrayList();

      for(IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         if (this.llliilliilliilli.equals(var3.IlIIiliIll)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public List<IIliIiIilIliIiIi> iliIiiliiiii() {
      ArrayList var1 = new ArrayList();

      for(IIliIiIilIliIiIi var3 : this.lIlIIiliiIlIIili.values()) {
         if (var3.iliilIiIIi) {
            var1.add(var3);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 24721) + '롰'))))) << 15 | (char)(~((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 24721) + '롰'))))) >>> 1))) + 29918))) - var5) >>> 4 | (char)((char)(~((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 24721) + '롰'))))) << 15 | (char)(~((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 24721) + '롰'))))) >>> 1))) + 29918))) - var5) << 12) ^ '\ue4ef') ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiiIiIlliiiIiIl IIillIiliIil(String id) {
      return (IiiiIiIlliiiIiIl)this.IllIIililllIIili.get(id);
   }

   public boolean Iiilliiliiil(int z, int y, int x) {
      IiiiIiIlliiiIiIl var4 = this.Ililllililil(z, y, x);
      return var4 != null && this.llliilliilliilli.equals(var4.IlIIiliIll);
   }

   public void IIlllIlliIll(List<IiiiIiIlliiiIiIl> jobs) {
      this.IllIIililllIIili.clear();
      this.illIIiliIilIIili.clear();

      for(IiiiIiIlliiiIiIl var3 : jobs) {
         this.IllIIililllIIili.put(var3.iililliIll, var3);
         this.illIIiliIilIIili.put(iilIIIllIIiIIIll.iIlIlllllill(var3.IIiilliIll, var3.lIiilliIll, var3.iIiilliIll), var3);
      }

   }

   public void liiiIIllIl(IIliIiIilIliIiIi p) {
      if (p != null && !p.lIiilIiIIi.isEmpty()) {
         this.lIlIIiliiIlIIili.put(p.lIiilIiIIi, p);
      }

   }

   public int Illillliilli() {
      return Math.max(0, this.IiIiliIiiiIi() - this.IIlilIliiIli());
   }

   private void iIIIlIlIIl(JsonObject doc) {
      if (doc.has(llIIlilIIl<invokedynamic>())) {
         this.iiliilliIIiiilli = doc.get(llIIlilIIl<invokedynamic>()).getAsString();
      }

      if (doc.has(llIIlilIIl<invokedynamic>())) {
         try {
            this.lIiiilliiIiiilli = IIlIiIilIlIiIi.valueOf(doc.get(llIIlilIIl<invokedynamic>()).getAsString());
         } catch (Exception var6) {
         }
      }

      for(IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         var3.IlIIiliIll = null;
         var3.llIIiliIll = IliilIillliilIil.IIilIllIil;
         var3.ilIIiliIll = 0;
         var3.IiIIiliIll = 0;
         var3.iiIIiliIll = 0L;
         var3.liIIiliIll = 0L;
         var3.IIlIiliIll = 0L;
      }

      if (doc.has(llIIlilIIl<invokedynamic>()) && doc.get(llIIlilIIl<invokedynamic>()).isJsonArray()) {
         for(JsonElement var8 : doc.getAsJsonArray(llIIlilIIl<invokedynamic>())) {
            if (var8.isJsonObject()) {
               JsonObject var4 = var8.getAsJsonObject();
               if (var4.has(llIIlilIIl<invokedynamic>())) {
                  IiiiIiIlliiiIiIl var5 = (IiiiIiIlliiiIiIl)this.IllIIililllIIili.get(var4.get(llIIlilIIl<invokedynamic>()).getAsString());
                  if (var5 != null) {
                     var5.IiIlliIliiIl(var4);
                  }
               }
            }
         }
      }

   }

   public Collection<IIliIiIilIliIiIi> IilliliilIIi() {
      return this.lIlIIiliiIlIIili.values();
   }

   public JsonObject Iiiiliiiiiii() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(llIIlilIIl<invokedynamic>(), this.iiliilliIIiiilli == null ? "" : this.iiliilliIIiiilli);
      var1.addProperty(llIIlilIIl<invokedynamic>(), this.lIiiilliiIiiilli.name());
      var1.addProperty(llIIlilIIl<invokedynamic>(), this.Iliiillilliiilli.iiilililIIIiilil);
      var1.addProperty(llIIlilIIl<invokedynamic>(), this.Iliiillilliiilli.lIIiililiIIiilil);
      if (this.iliiilliIiiiilli != null && this.iliiilliIiiiilli.IliIlllilIi()) {
         var1.add(llIIlilIIl<invokedynamic>(), this.iliiilliIiiiilli.IilliliilIIi());
         var1.addProperty(llIIlilIIl<invokedynamic>(), this.liiiilliiiiiilli == null ? "" : this.liiiilliiiiiilli);
         var1.addProperty(llIIlilIIl<invokedynamic>(), this.IIIIIililIIIIili);
      }

      JsonArray var2 = new JsonArray();

      for(IiiiIiIlliiiIiIl var4 : this.IllIIililllIIili.values()) {
         if (var4.IlIIiliIll != null || var4.llIIiliIll != IliilIillliilIil.IIilIllIil || var4.IiIIiliIll > 0) {
            var2.add(var4.IlIlllIlilIl());
         }
      }

      var1.add(llIIlilIIl<invokedynamic>(), var2);
      return var1;
   }

   public boolean Illlllllilll() {
      return !this.IllIIililllIIili.isEmpty();
   }

   public liIliliiIlil(String originZ, lliIlilliliIlill originY, int originX, int identity, int myId, int cubeSide) {
      this.lIiiilliiIiiilli = IIlIiIilIlIiIi.illillliiIililllii;
      this.Iliiillilliiilli = lIliIliIliIl.IliIlllilIi();
      this.liiiilliiiiiilli = "";
      this.lIlIIiliiIlIIili = new LinkedHashMap();
      this.IllIIililllIIili = new LinkedHashMap();
      this.illIIiliIilIIili = new HashMap();
      this.llliilliilliilli = originZ;
      this.Iiliillililiilli = originY;
      this.iIIIIiliIlIIIili = originX;
      this.llIIIiliilIIIili = identity;
      this.IiIIIililiIIIili = myId;
      this.iiIIIiliIIlIIili = cubeSide;
   }

   public boolean IliIlllilIi() {
      return this.llliilliilliilli != null && this.llliilliilliilli.equals(this.iiliilliIIiiilli);
   }

   public int IiIiliIiiiIi() {
      return this.Iiliillililiilli == null ? 0 : this.Iiliillililiilli.iIllIIiill;
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) >>> 8) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) >>> 8) << 14) ^ 23909) + '龱') + var5))) - var5) >>> 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) >>> 8) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 7731) ^ var5) + var5) << 11) - 22558) >>> 8) << 14) ^ 23909) + '龱') + var5))) - var5) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iliilliiilii() {
      long var4 = -1588624690049579522L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         if (var3.IilliliilIIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public void lIiiIiIlilli() {
      this.lIlIIiliiIlIIili.clear();
   }

   public lIiilliiIiilli IIIIllIIIl(JsonObject doc, boolean fromLiveCoordinator) {
      if (doc == null) {
         return lIiilliiIiilli.illiliIIIl;
      } else {
         String var3 = doc.has(llIIlilIIl<invokedynamic>()) ? doc.get(llIIlilIIl<invokedynamic>()).getAsString() : "";
         long var4 = doc.has(llIIlilIIl<invokedynamic>()) ? doc.get(llIIlilIIl<invokedynamic>()).getAsLong() : 0L;
         lIiilliiIiilli var6 = lIiilliiIiilli.lIliliIIIl;
         if (var3 != null && !var3.isEmpty()) {
            if (!this.Iliiillilliiilli.IilliliilIIi()) {
               this.Iliiillilliiilli = new lIliIliIliIl(this.Iliiillilliiilli.Iiilililliililil, var3, var4);
               var6 = lIiilliiIiilli.iIliliIIIl;
            } else if (!this.Iliiillilliiilli.iiilililIIIiilil.equals(var3)) {
               if (!fromLiveCoordinator) {
                  return lIiilliiIiilli.illiliIIIl;
               }

               this.Iliiillilliiilli = new lIliIliIliIl(this.Iliiillilliiilli.Iiilililliililil, var3, var4);
               var6 = lIiilliiIiilli.IlliliIIIl;
            } else {
               if (var4 < this.Iliiillilliiilli.lIIiililiIIiilil) {
                  return lIiilliiIiilli.llliliIIIl;
               }

               if (var4 > this.Iliiillilliiilli.lIIiililiIIiilil) {
                  this.Iliiillilliiilli = new lIliIliIliIl(this.Iliiillilliiilli.Iiilililliililil, var3, var4);
               }
            }

            this.iIIIlIlIIl(doc);
            return var6;
         } else {
            return lIiilliiIiilli.illiliIIIl;
         }
      }
   }

   public Collection<IiiiIiIlliiiIiIl> Iilllilliill() {
      return this.IllIIililllIIili.values();
   }

   public int IlIlllIlilIl() {
      long var4 = -3504201123461760870L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IIliIiIilIliIiIi var3 : this.lIlIIiliiIlIIili.values()) {
         if (var3.iliilIiIIi) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') << 4 | (char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') >>> 12) ^ 26078) + 23936) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') << 4 | (char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') >>> 12) ^ 26078) + 23936) << 3) + var5) ^ '躍') - 21274) - var5) + 5064) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') << 4 | (char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') >>> 12) ^ 26078) + 23936) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') << 4 | (char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8894) - var5) + '\uef57') >>> 12) ^ 26078) + 23936) << 3) + var5) ^ '躍') - 21274) - var5) + 5064) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlilIliiIli() {
      long var4 = 2502939253638421819L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         var4 ^= ((long)((int)(var4 >>> 32) + (var3.IilliliilIIi() ? var3.IIIIiliIll : Math.min(var3.IiIIiliIll, var3.IIIIiliIll))) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7967363295975803071L ^ Long.rotateLeft(8520035412841426587L, 30) ^ -7833874640316484285L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4229829327543390500L ^ Long.rotateLeft(7075583824312663372L, 59) ^ -4472013981985310995L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5789586483877003412L ^ Long.rotateLeft(-5156618363888994108L, 48) ^ -7183457189418353241L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8218099008218679988L ^ Long.rotateLeft(-6533933390725200237L, 13) ^ -8229700968920161092L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5547362114505184799L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3421416381588389320L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3848153598757518695L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3340286319220197210L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8711141062817309739L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2958080738540249927L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIIlliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIIlIIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlIliIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IllIllllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illIlIilIl<invokedynamic>());
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

   public boolean IIiilIiiiIii() {
      if (this.IllIIililllIIili.isEmpty()) {
         return false;
      } else {
         for(IiiiIiIlliiiIiIl var2 : this.IllIIililllIIili.values()) {
            if (!var2.IilliliilIIi()) {
               return false;
            }
         }

         return true;
      }
   }

   public IiiiIiIlliiiIiIl Ililllililil(int y, int x, int z) {
      long var7 = -9015467525765937349L;
      long var9 = -192490085022411809L;
      var7 ^= ((long)iilIIIllIIiIIIll.liiiIIllIl(y, this.iIIIIiliIlIIIili, this.iiIIIiliIIlIIili) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)iilIIIllIIiIIIll.liiiIIllIl(x, this.llIIIiliilIIIili, this.iiIIIiliIIlIIili) ^ var7) & -1L >>> 32;
      var9 ^= ((long)iilIIIllIIiIIIll.liiiIIllIl(z, this.IiIIIililiIIIili, this.iiIIIiliIIlIIili) << 32 ^ var9) & -1L << 32;
      return (IiiiIiIlliiiIiIl)this.illIIiliIilIIili.get(iilIIIllIIiIIIll.iIlIlllllill((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32)));
   }

   public int IiIlliIliiIl() {
      long var6 = -4660596685842062927L;
      long var1 = System.currentTimeMillis();
      var6 ^= (0L ^ var6) & -1L << 32;

      for(IIliIiIilIliIiIi var5 : this.lIlIIiliiIlIIili.values()) {
         if (var5.iliilIiIIi || var5.IiiilIiIIi > 0L && var1 - var5.IiiilIiIIi < 30000L) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   public float Iilililiiili() {
      long var2 = -5416507860566020985L;
      var2 ^= ((long)this.IiIiliIiiiIi() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) <= 0 ? 0.0F : Math.min(1.0F, (float)this.IIlilIliiIli() / (float)((int)(var2 >>> 32)));
   }

   public int IlIillIiilIi() {
      long var4 = -1275172169418492347L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         if (this.llliilliilliilli.equals(var3.IlIIiliIll)) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }
}
