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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;

public final class lIIiIIIiiIIiIIIi {
   private final boolean iliilIliil;
   private boolean IiIIiIliil;
   private iIlililIllilil IlIIiIliil;
   private boolean IllIiIliil;
   private int lIiIiIliil;
   private boolean illliIliil;
   private long liIIiIliil;
   private static final long IliilIliil = 30000L;
   private llIIliIiilIIliIi lIIliIliil;
   private final Map<String, Long> lliliIliil;
   private final iIiIliIiIliIliIi IiiilIliil;
   private final Set<String> lIiliIliil;
   private long lIlIiIliil;
   private static final long iililIliil = 400L;
   private final Set<String> liiIiIliil;
   private int iIiIiIliil;
   private liIliliiIlil iIIIiIliil;
   private int IilIiIliil;
   public static final String ililiIliil = "blocked";
   private long illIiIliil;
   private long iiIIiIliil;
   private long lilliIliil;
   private volatile Set<Long> IiiIiIliil;
   private int IIIIiIliil;
   private lIliIliIliIl IilliIliil;
   private static final long lililIliil = 500L;
   private String liIliIliil;
   private static final long iilliIliil = 5000L;
   private String ilIIiIliil;
   private List<IiiiIiIlliiiIiIl> iiiilIliil = List.of();
   private llIIliIiilIIliIi iIIliIliil;
   private String llIIiIliil;
   private static final long IIiilIliil = 700L;
   private boolean iIlIiIliil;
   private final llIillIlilIillIl lliilIliil;
   private static final int lilIiIliil = 3;
   private String IIlliIliil;
   private String iiIliIliil;
   private int iIiliIliil;
   private final iIiiiiIlIliiiiIl lIlliIliil;
   private lliIlilliliIlill liiilIliil;
   private String IlIliIliil;
   private int IliliIliil;
   private String iIlliIliil;
   private int IIiIiIliil;
   private int IliIiIliil;
   private static final long lIiilIliil = 4000L;
   private int iilIiIliil;
   private final Map<String, String> IllliIliil;
   private int lliIiIliil;
   private final IIIIliilIIIlii iiiIiIliil;
   private final String IIIliIliil;
   private final Map<String, liiiiilliiiiiill> IIiliIliil;
   private final Map<Long, Long> iliIiIliil;
   private boolean IiIliIliil;
   private boolean llIliIliil;
   private iIlIlIilIllIlIil lllliIliil;
   private final Map<String, iIlIlIilIllIlIil> ilIliIliil;
   private boolean lllIiIliil;
   private final String lIIIiIliil;
   private long IIlIiIliil;

   private void IIiilIiiiIii(JsonArray members, String hostId) {
      if (this.iIIIiIliil != null) {
         Set var3 = this.lliilIliil.lIlIliIlIl();
         String var4 = this.IiiilIliil.IIlllIlliIll();
         HashSet var5 = new HashSet();
         if (members != null) {
            for(JsonElement var7 : members) {
               if (var7.isJsonObject()) {
                  IIliIiIilIliIiIi var8 = IIliIiIilIliIiIi.iIlIlllllill(var7.getAsJsonObject());
                  if (var8 != null) {
                     var8.liiilIiIIi = var3 == null || var3.isEmpty() || var8.lIiilIiIIi.equals(var4) || var8.iIiilIiIIi != null && var3.contains(var8.iIiilIiIIi.toLowerCase(Locale.ROOT));
                     if (var8.lIiilIiIIi.equals(var4)) {
                        var8.IIIIiIiIIi = this.lliilIliil.IIIilIIiiIIi();
                     }

                     var5.add(var8.lIiilIiIIi);
                     IIliIiIilIliIiIi var9 = this.iIIIiIliil.iIlIlllllill(var8.lIiilIiIIi);
                     if (!var8.iliilIiIIi) {
                        var8.IiiilIiIIi = var9 != null && var9.IiiilIiIIi > 0L ? var9.IiiilIiIIi : System.currentTimeMillis();
                     }

                     var8.iiiilIiIIi = (liiiiilliiiiiill)this.IIiliIliil.get(var8.lIiilIiIIi);
                     this.iIIIiIliil.liiiIIllIl(var8);
                  }
               }
            }

            if (!var5.isEmpty()) {
               this.IiIIiIliil = true;
            }
         }

         for(IIliIiIilIliIiIi var11 : this.iIIIiIliil.IilliliilIIi()) {
            if (!var5.contains(var11.lIiilIiIIi) && var11.iliilIiIIi) {
               var11.iliilIiIIi = false;
               var11.IiiilIiIIi = System.currentTimeMillis();
            }
         }

         if (!var5.isEmpty()) {
            this.ilIliIliil.keySet().removeIf((id) -> !var5.contains(id));
         }

         if (hostId != null) {
            this.iIIIiIliil.iiliilliIIiiilli = hostId;
         }

         if (this.iIIIiIliil.lIiiilliiIiiilli != this.lliilIliil.IiIIlliIIl() && this.iIIIiIliil.IliIlllilIi()) {
            this.iIIIiIliil.lIiiilliiIiiilli = this.lliilIliil.IiIIlliIIl();
         }

      }
   }

   public void lIiiIiIlilli() {
      this.IiiilIliil.IliIlllilIi(this.lIIIiIliil, this.iiiIiIliil.Ililllililil(), this.lliilIliil.Iliilliiilii(), this.lliilIliil.Iiiiliiiiiii());
      this.llIIiIliil = this.iliilIliil ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>();
      this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + (this.iliilIliil ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>()) + llIliilIli<invokedynamic>() + (this.IIIliIliil.isEmpty() ? llIliilIli<invokedynamic>() : this.IIIliIliil) + llIliilIli<invokedynamic>() + this.iiiIiIliil.IlIlllIlilIl());
   }

   public boolean Iiiilliiil() {
      return this.IiiilIliil.IlIlllIlilIl();
   }

   public llIllililIllil IiIlliIliiIl() {
      long var7 = -815895253939335317L;
      if (this.iIIIiIliil == null) {
         return llIllililIllil.lliIIIIliiliIIIIli;
      } else {
         long var1 = System.currentTimeMillis();
         ArrayList var3 = new ArrayList();

         for(IIliIiIilIliIiIi var5 : this.iIIIiIliil.IilliliilIIi()) {
            var7 ^= ((long)(!var5.iliilIiIIi && (var5.IiiilIiIIi <= 0L || var1 - var5.IiiilIiIIi >= 30000L) ? 0 : 1) << 32 ^ var7) & -1L << 32;
            var3.add(new lIIilllliIIillll(var5.lIiilIiIIi, var5.liiiIIllIl(), (boolean)((int)(var7 >>> 32))));
         }

         return this.lIlliIliil.iIlIlllllill(var3, this.IiiilIliil.IIlllIlliIll());
      }
   }

   private void Iliilliiilii(JsonObject doc) {
      long var6 = -3315834963837194233L;
      this.Iiilliiliiil(doc);
      if (this.iIIliIliil != null && this.lIIliIliil != null && !this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) {
         this.IIlilIliiIli(this.iIIliIliil);
         if (this.lIIliIliil == null || !this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) {
            return;
         }
      }

      String var2 = doc != null && doc.has(llIliilIli<invokedynamic>()) ? doc.get(llIliilIli<invokedynamic>()).getAsString() : "";
      var6 ^= ((long)(!var2.isEmpty() && var2.equals(this.IiiilIliil.Illlllllilll()) && !var2.equals(this.IiiilIliil.IIlllIlliIll()) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      lIliIliIliIl var4 = this.iIIIiIliil.Iliiillilliiilli;
      lIiilliiIiilli var5 = this.iIIIiIliil.IIIIllIIIl(doc, (boolean)((int)(var6 >>> 32)));
      if (!this.iIIIiIliil.Iliiillilliiilli.equals(var4)) {
         this.IiIIlliIIl();
      }

      switch (var5) {
         case iIliliIIIl:
            this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl());
            break;
         case IlliliIIIl:
            this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl());
            break;
         case illiliIIIl:
            ++this.iilIiIliil;
            if (this.IilIiIliil++ == 3) {
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>());
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.lliilIliil.IiIiliIiiiIi().Iilllilliill() + llIliilIli<invokedynamic>());
               this.llIIiIliil = llIliilIli<invokedynamic>();
            }
            break;
         case llliliIIIl:
            ++this.iilIiIliil;
      }

   }

   public void IIIllIIliIIl(llIillIlilIillIl liveCtx) {
      long var7 = 2972173748263648078L;
      IiiIiIilliiIiIil var2 = this.IiiilIliil.IIIllIIliIIl();
      if (var2 == IiiIiIilliiIiIil.llIIIilIil && this.IlIIiIliil == iIlililIllilil.IIiillIlilIiillIli) {
         this.IlIlllIlilIl();
      }

      if (var2 == IiiIiIilliiIiIil.ilIIIilIil) {
         this.iIlIiIllIi(llIliilIli<invokedynamic>());
      } else if (var2 == IiiIiIilliiIiIil.IiIIIilIil) {
         this.lllIiillIi(this.IiiilIliil.IiIlliIliiIl());
      } else if (this.IlIIiIliil == iIlililIllilil.IIiillIlilIiillIli) {
         this.llIIiIliil = this.IiiilIliil.IlIlllIlilIl() ? llIliilIli<invokedynamic>() : this.llIIiIliil;
      } else {
         long var3 = System.currentTimeMillis();
         if (this.iIIIiIliil == null) {
            this.IiiilIliil.iliIiiliiiii(new iiiIIilIIIlIil() {
               public void liiiIIllIl(long doc, JsonObject version) {
                  lIIiIIIiiIIiIIIi.this.Iiilliiliiil(version);
               }

               public void IliIlllilIi(JsonArray members, String serverTimeMs, long hostId) {
                  lIIiIIIiiIIiIIIi.this.Illlllllilll(members, serverTimeMs);
               }

               public void iIlIlllllill(ilIllIiIiIllIi m) {
                  if (m.IIilllIiilIilllIii == IlIiIlIlllIiIlIl.llllIIIiIl) {
                     lIIiIIIiiIIiIIIi.this.Iilllilliill(m);
                  }

               }
            });
            this.Ililllililil(var3);
            this.IIIilIIiiIIi();
            this.IIiIllIiIl(liveCtx);
            if (this.iIIIiIliil == null) {
               return;
            }
         }

         String var5 = this.IiiilIliil.Illlllllilll();
         if (var5 != null && !var5.isEmpty()) {
            this.iIIIiIliil.iiliilliIIiiilli = var5;
         }

         var7 ^= ((long)this.iIIIiIliil.IliIlllilIi() << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) != this.iIlIiIliil) {
            this.lliilIliil.IllIllllIl((int)(var7 >>> 32) != 0 ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>());
            if ((int)(var7 >>> 32) != 0) {
               this.iIIIiIliil.Iliiillilliiilli = this.iIIIiIliil.Iliiillilliiilli.IilliliilIIi() ? this.iIIIiIliil.Iliiillilliiilli.iIlIlllllill() : lIliIliIliIl.liiiIIllIl(this.liiilIliil.liiiIIllIl(), this.IiiilIliil.IIlllIlliIll(), var3);
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl() + llIliilIli<invokedynamic>());
            }

            this.iIlIiIliil = (boolean)((int)(var7 >>> 32));
         }

         if ((int)(var7 >>> 32) != 0) {
            this.iiIIlIIlIl();
         }

         this.IiiilIliil.iliIiiliiiii(new iiiIIilIIIlIil() {
            public void iIlIlllllill(ilIllIiIiIllIi m) {
               lIIiIIIiiIIiIIIi.this.IIIIllIIIl(m);
            }

            public void liiiIIllIl(long version, JsonObject doc) {
               if (!lIIiIIIiiIIiIIIi.this.iIIIiIliil.IliIlllilIi()) {
                  lIIiIIIiiIIiIIIi.this.Iliilliiilii(doc);
               }

            }

            public void IliIlllilIi(JsonArray members, String serverTimeMs, long hostId) {
               lIIiIIIiiIIiIIIi.this.IIiilIiiiIii(members, serverTimeMs);
            }
         });
         var7 ^= ((long)this.iIIIiIliil.IliIlllilIi() << 32 ^ var7) & -1L << 32;
         this.Ililllililil(var3);
         if (var3 - this.IIlIiIliil >= 500L) {
            this.IIlIiIliil = var3;
            this.lilIliilIl(var3);
         }

         if ((int)(var7 >>> 32) != 0 && this.IiIIiIliil && !this.IiiilIliil.IlIlllIlilIl() && var3 - this.iiIIiIliil >= 400L) {
            this.iiIIiIliil = var3;
            this.illIlIilIl(var3);
         }

         if (var3 - this.lIlIiIliil >= 700L) {
            this.lIlIiIliil = var3;
            this.IIiIllIiIl(liveCtx);
         }

         this.iIiIlIliIl(liveCtx);
         this.iliIiIliil.entrySet().removeIf((now) -> (Long)now.getValue() < var3);
         if (var3 - this.illIiIliil >= 30000L) {
            this.illIiIliil = var3;
            this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.iiiilIIIIi() + llIliilIli<invokedynamic>() + this.iIIIiIliil.Iliilliiilii() + llIliilIli<invokedynamic>() + this.iIIIiIliil.Iilllilliill().size() + llIliilIli<invokedynamic>() + this.iIIIiIliil.IIlilIliiIli() + llIliilIli<invokedynamic>() + this.iIIIiIliil.IiIiliIiiiIi());
         }

         this.llIIiIliil = (int)(var7 >>> 32) != 0 ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>();
      }
   }

   public boolean Ilillllill() {
      return this.IlIIiIliil == iIlililIllilil.IiiillIliliiillIli || this.IlIIiIliil == iIlililIllilil.iiiillIliIIIIilIli;
   }

   // $FF: synthetic method
   private static CallSite IiIliliIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 24589))) + var5) ^ '耆') - var5) ^ '\udc1e') << 9 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 24589))) + var5) ^ '耆') - var5) ^ '\udc1e') >>> 7) - 31574) + '\uf45a') - var5) - '蘵') << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 24589))) + var5) ^ '耆') - var5) ^ '\udc1e') << 9 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 24589))) + var5) ^ '耆') - var5) ^ '\udc1e') >>> 7) - 31574) + '\uf45a') - var5) - '蘵') >>> 4) ^ 31077));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Illillliilli(llIIliIiilIIliIi a) {
      String var2 = this.IiiilIliil.IIlllIlliIll();
      iIliIlIlIlliIlIl var3 = a.IIIllIIliIIl();
      this.liiilIliil = new lliIlilliliIlill(this.iiiIiIliil.IlIlllIlilIl(), this.iiiIiIliil.IiIlliIliiIl(), this.iiiIiIliil.IIlllIlliIll(), this.iiiIiIliil.Illlllllilll(), this.lliilIliil.iliIiiliiiii(), var3.iliIiiliiiii(), var3.IIIllIIliIIl(), var3.IlIlllIlilIl(), var3.IiIlliIliiIl(), var3.IIlllIlliIll(), this.iiiIiIliil.IIillIiliIil());
      this.IIIIiIliil = iilIIIllIIiIIIll.IliIlllilIi(this.iiiIiIliil.IiIlliIliiIl(), this.iiiIiIliil.IIlllIlliIll(), this.iiiIiIliil.Illlllllilll());
      this.iiiilIliil = iilIIIllIIiIIIll.lIiiIiIlilli(var3.iliIiiliiiii(), var3.IIIllIIliIIl(), var3.IlIlllIlilIl(), this.IIIIiIliil, (c) -> this.lliilIliil.Iilllilliill(c));
      lIliIliIliIl var4 = this.iIIIiIliil != null ? this.iIIIiIliil.Iliiillilliiilli : null;
      LinkedHashMap var5 = new LinkedHashMap();
      String var6 = this.IiiilIliil.Illlllllilll();
      if (this.iIIIiIliil != null) {
         for(IIliIiIilIliIiIi var8 : this.iIIIiIliil.IilliliilIIi()) {
            var5.put(var8.lIiilIiIIi, var8);
         }

         var6 = this.iIIIiIliil.iiliilliIIiiilli;
      }

      this.iIIIiIliil = new liIliliiIlil(var2, this.liiilIliil, var3.iliIiiliiiii(), var3.IIIllIIliIIl(), var3.IlIlllIlilIl(), this.IIIIiIliil);
      this.iIIIiIliil.iiliilliIIiiilli = var6;
      this.iIIIiIliil.lIiiilliiIiiilli = this.lliilIliil.IiIIlliIIl();

      for(IIliIiIilIliIiIi var12 : var5.values()) {
         this.iIIIiIliil.liiiIIllIl(var12);
      }

      this.iIIIiIliil.Iliiillilliiilli = var4 != null && var4.IilliliilIIi() ? var4 : (this.iIIIiIliil.IliIlllilIi() ? lIliIliIliIl.liiiIIllIl(this.liiilIliil.liiiIIllIl(), var2, System.currentTimeMillis()) : new lIliIliIliIl(this.liiilIliil.liiiIIllIl(), "", 0L));
      this.IilliIliil = this.iIIIiIliil.Iliiillilliiilli;
      ArrayList var11 = new ArrayList(this.iiiilIliil.size());

      for(IiiiIiIlliiiIiIl var9 : this.iiiilIliil) {
         var11.add(new IiiiIiIlliiiIiIl(var9.iililliIll, var9.IIiilliIll, var9.lIiilliIll, var9.iIiilliIll, var9.IliilliIll, var9.lliilliIll, var9.iliilliIll, var9.IiiilliIll, var9.liiilliIll, var9.iiiilliIll, var9.IIIIiliIll, var9.lIIIiliIll, var9.iIIIiliIll));
      }

      this.iIIIiIliil.IIlllIlliIll(var11);
      this.iIIIiIliil.iliiilliIiiiilli = a;
      this.iIIIiIliil.liiiilliiiiiilli = this.IlIliIliil;
      this.iIIIiIliil.IIIIIililIIIIili = this.llIliIliil;
      this.lIIliIliil = a;
      this.liIliIliil = null;
      this.IlIIiIliil = iIlililIllilil.lliillIliiliillIli;
      this.iIlIiIliil = this.iIIIiIliil.IliIlllilIi();
      this.lIlliIliil.IliIlllilIi();
      this.lliliIliil.clear();
      this.iliIiIliil.clear();
      this.liiIiIliil.clear();
      this.iIiliIliil = -1;
      this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + (this.IIIliIliil.isEmpty() ? this.liiilIliil.liiiIIllIl() : this.IIIliIliil) + llIliilIli<invokedynamic>() + var11.size() + llIliilIli<invokedynamic>() + this.lliilIliil.iliIiiliiiii() + llIliilIli<invokedynamic>() + var3.lIiiIiIlilli() + (this.iIIIiIliil.IliIlllilIi() ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>() + lIiIiiIiIi(this.iIIIiIliil.iiliilliIIiiilli)));
   }

   public String iIlIlllllill() {
      return this.IIIliIliil;
   }

   private void Iilllilliill(ilIllIiIiIllIi m) {
      if (m.iIilllIiiIlilllIii != null && !m.iIilllIiiIlilllIii.equals(this.IiiilIliil.IIlllIlliIll())) {
         iIIllIlIlIllIl var2 = iIIllIlIlIllIl.IIIllIIliIIl(m.iiilllIiiIIIillIii);
         liiiiilliiiiiill var3 = this.lliilIliil.IiIiliIiiiIi().IliIlllilIi(var2);
         this.IIiliIliil.put(m.iIilllIiiIlilllIii, var3);
         if (var3 != liiiiilliiiiiill.IiillIIIil) {
            if (this.lIiliIliil.add(m.iIilllIiiIlilllIii)) {
               ++this.lliIiIliil;
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + (String)this.IllliIliil.getOrDefault(m.iIilllIiiIlilllIii, lIiIiiIiIi(m.iIilllIiiIlilllIii)) + llIliilIli<invokedynamic>());
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.lliilIliil.IiIiliIiiiIi().IilliliilIIi(var2, var3).replace(llIliilIli<invokedynamic>(), llIliilIli<invokedynamic>()));
            }

         } else {
            this.IIillIiliIil(m);
         }
      }
   }

   public boolean lililiilil() {
      return this.iIIIiIliil != null && this.iIIIiIliil.IlIillIiilIi() > 0 && this.iIiliIliil != 0;
   }

   private void IIiIllIiIl(llIillIlilIillIl liveCtx) {
      IIliIiIilIliIiIi var2 = new IIliIiIilIliIiIi(this.IiiilIliil.IIlllIlliIll());
      var2.iIiilIiIIi = liveCtx.Iliilliiilii();
      var2.IliilIiIIi = liveCtx.Iiiiliiiiiii();
      var2.iIIIiIiIIi = liveCtx.llIIlilIIl();
      var2.IlIIiIiIIi = true;
      var2.llIIiIiIIi = liveCtx.IIlilIliiIli();
      var2.IiIIiIiIIi = liveCtx.Illillliilli();
      var2.liIIiIiIIi = liveCtx.Iilililiiili();
      var2.iiIIiIiIIi = liveCtx.IIiilIiiiIii();
      var2.IIlIiIiIIi = this.iIiliIliil;
      var2.lIlIiIiIIi = this.IliliIliil;
      var2.lIIIiIiIIi = this.iIIIiIliil != null && this.iIIIiIliil.IliIlllilIi() ? iliiiIIiIiiiiIIi.Illiliiiil : iliiiIIiIiiiiIIi.llliliiiil;
      var2.IIIIiIiIIi = liveCtx.IIIilIIiiIIi();
      if (liveCtx.IIIIllIIIl()) {
         var2.iIlIiIiIIi = liveCtx.iIIIlIlIIl();
      }

      this.IiiilIliil.iIlIlllllill(var2.lIiiIiIlilli());
   }

   public void iliIiiliiiii() {
      try {
         this.IiiilIliil.liiiIIllIl();
      } catch (Exception var2) {
      }

      this.IlIIiIliil = iIlililIllilil.IiiillIliliiillIli;
   }

   public liIliliiIlil iIiilIliil() {
      return this.iIIIiIliil;
   }

   public int lIIIiiIIIi() {
      return this.iilIiIliil;
   }

   private boolean Iiiiliiiiiii(ilIllIiIiIllIi m) {
      if (m.IIilllIiilIilllIii == IlIiIlIlllIiIlIl.llllIIIiIl) {
         return true;
      } else if (!this.iIIIiIliil.Iliiillilliiilli.IilliliilIIi()) {
         ++this.iilIiIliil;
         return false;
      } else {
         IiIliliIli var2 = this.iIIIiIliil.Iliiillilliiilli.iliIiiliiiii(m.IilliliilIIi(llIliilIli<invokedynamic>()), m.IIIllIIliIIl(llIliilIli<invokedynamic>(), -1L));
         if (var2 == IiIliliIli.IiillIIlliillIIl) {
            return true;
         } else {
            ++this.iilIiIliil;
            return false;
         }
      }
   }

   private void llIIlilIIl(IiiiIiIlliiiIiIl mine, llliiiIiilliiiIi j, llliiiIiilliiiIi theirs) {
      lIllIlliIllIll var4 = IIlillIilIlillIi.IliIlllilIi(mine.iililliIll, mine.IIIIiliIll, mine.IIlIiliIll, j, theirs);
      mine.IiIIiliIll = j != null && j.liiiIIllIl() ? var4.iIlIlllllill() : Math.max(mine.IiIIiliIll, var4.iIlIlllllill());
      if (var4.IliIlllilIi()) {
         mine.llIIiliIll = IliilIillliilIil.ililIllIil;
         if (var4.liiiIIllIl() == liiilliiiiilli.IilIiiIIIl) {
            ++this.IliIiIliil;
         }
      } else {
         ++this.iIiIiIliil;
         if (mine.IilliliilIIi()) {
            mine.llIIiliIll = IliilIillliilIil.lIilIllIil;
            mine.liIIiliIll = System.currentTimeMillis();
            this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + mine.iililliIll + llIliilIli<invokedynamic>());
         }
      }

   }

   public void IiIilliIil(String reason) {
      long var6 = 1073888802955159692L;
      if (this.iIIIiIliil != null) {
         var6 ^= ((long)(reason != null && reason.startsWith(llIliilIli<invokedynamic>()) ? 1 : 0) << 32 ^ var6) & -1L << 32;

         for(IiiiIiIlliiiIiIl var4 : this.iIIIiIliil.IIIilIIiiIIi()) {
            if (!var4.IilliliilIIi()) {
               if (this.iIIIiIliil.IliIlllilIi()) {
                  var4.iliIiiliiiii(IliilIillliilIil.IlilIllIil);
                  if ((int)(var6 >>> 32) != 0) {
                     ++var4.ilIIiliIll;
                  }
               } else {
                  JsonObject var5 = new JsonObject();
                  var5.addProperty(llIliilIli<invokedynamic>(), reason == null ? "" : reason);
                  this.iilIiIIiIi(IlIiIlIlllIiIlIl.lillIIIiIl, var4, var5);
               }
            }
         }

      }
   }

   public int IIlIilIlIi() {
      return this.lliIiIliil;
   }

   // $FF: synthetic method
   private static CallSite illliIilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) >>> 15) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) >>> 15) >>> 13) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) >>> 15) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) >>> 14 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) + 20687) << 2) - 9015) - '\udf09') ^ var5) + var5) - var5) + var5) >>> 15) >>> 13) - var5) >>> 12) + 17186) ^ var5) ^ '邒'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IilliliilIIi() {
      return this.lIIIiIliil;
   }

   private void IlIlllIlilIl() {
      String var1 = this.IiiilIliil.IIlllIlliIll();
      String var2 = this.IiiilIliil.Iilllilliill();
      if (var2 != null && !var2.isEmpty() && !var2.equals(this.iiiIiIliil.Ililllililil())) {
         this.iiIliIliil = llIliilIli<invokedynamic>() + this.iiiIiIliil.IlIlllIlilIl();
         this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>());
         this.lllIiillIi(llIliilIli<invokedynamic>());
      } else {
         this.IIlliIliil = var1;
         this.IllIiIliil = true;
         this.IiIIiIliil = false;
         this.IlIIiIliil = iIlililIllilil.iIiillIliIliillIli;
         this.llIIiIliil = llIliilIli<invokedynamic>();
         llIIliIiilIIliIi var3 = this.lliilIliil.Ililllililil();
         if (var3 != null && var3.IliIlllilIi()) {
            this.ilIliIliil.put(var1, new iIlIlIilIllIlIil(var1, var3, this.iliilIliil));
         }

      }
   }

   public boolean IIIillIIil() {
      return this.IllIiIliil;
   }

   private boolean lIlIliIlIl() {
      if (this.iIIIiIliil == null) {
         return false;
      } else {
         String var1 = this.IiiilIliil.IIlllIlliIll();

         for(IIliIiIilIliIiIi var3 : this.iIIIiIliil.iliIiiliiiii()) {
            if (!var3.lIiilIiIIi.equals(var1) && !this.IIiliIliil.containsKey(var3.lIiilIiIIi)) {
               return true;
            }
         }

         return false;
      }
   }

   private void iIiIlIliIl(llIillIlilIillIl liveCtx) {
      long var10 = -8367817559749093503L;
      long var12 = 3542763316654901964L;
      if (this.iIIIiIliil == null) {
         this.IiiIiIliil = Collections.emptySet();
      } else {
         String var2 = liveCtx.IIiilIiiiIii();
         String var3 = this.IiiilIliil.IIlllIlliIll();
         HashSet var4 = new HashSet();

         for(IIliIiIilIliIiIi var6 : this.iIIIiIliil.iliIiiliiiii()) {
            if (!var6.lIiilIiIIi.equals(var3) && var6.IlIIiIiIIi && (var6.iiIIiIiIIi == null || var6.iiIIiIiIIi.isEmpty() || var2 == null || var6.iiIIiIiIIi.equals(var2))) {
               long var14 = var10 ^ ((long)((int)Math.floor(var6.llIIiIiIIi)) << 32 ^ var10) & -1L << 32;
               var10 = var14 ^ ((long)((int)Math.floor(var6.IiIIiIiIIi)) ^ var14) & -1L >>> 32;
               var12 ^= ((long)((int)Math.floor(var6.liIIiIiIIi)) << 32 ^ var12) & -1L << 32;
               var4.add(IliIilliIi((int)(var10 >>> 32), (int)var10, (int)(var12 >>> 32)));
               var4.add(IliIilliIi((int)(var10 >>> 32), (int)var10 + 1, (int)(var12 >>> 32)));
            }
         }

         this.IiiIiIliil = var4;
      }
   }

   public String liilliiill() {
      return this.ilIIiIliil;
   }

   public boolean IIlllIlliIll() {
      return this.iIIIiIliil != null && this.iIIIiIliil.IliIlllilIi();
   }

   private static long IliIilliIi(int x, int y, int z) {
      return class_2338.method_10064(x, y, z);
   }

   public int ilIIiIiIIi() {
      return this.IIiIiIliil;
   }

   private ilIllIiIiIllIi IilIililIi(ilIllIiIiIllIi m) {
      if (this.iIIIiIliil != null) {
         m.iiilllIiiIIIillIii.addProperty(llIliilIli<invokedynamic>(), this.iIIIiIliil.Iliiillilliiilli.iiilililIIIiilil);
         m.iiilllIiiIIIillIii.addProperty(llIliilIli<invokedynamic>(), this.iIIIiIliil.Iliiillilliiilli.lIIiililiIIiilil);
      }

      return m;
   }

   public String iiIilIIlil(int z, int x, int y) {
      if (this.iIIIiIliil == null) {
         return null;
      } else {
         IiiiIiIlliiiIiIl var4 = this.iIIIiIliil.Ililllililil(z, x, y);
         if (var4 == null) {
            return null;
         } else {
            return var4.IlIIiliIll == null ? llIliilIli<invokedynamic>() : this.lIliliIlil(var4.IlIIiliIll);
         }
      }
   }

   public String iiiilIIIIi() {
      return llIliilIli<invokedynamic>() + (this.iIIIiIliil == null ? llIliilIli<invokedynamic>() : this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl()) + llIliilIli<invokedynamic>() + this.iilIiIliil + llIliilIli<invokedynamic>() + this.IiiilIliil.IIillIiliIil() + llIliilIli<invokedynamic>() + this.IIiIiIliil + llIliilIli<invokedynamic>() + this.lIiIiIliil + llIliilIli<invokedynamic>() + this.iIiIiIliil + llIliilIli<invokedynamic>() + this.IliIiIliil + llIliilIli<invokedynamic>() + this.lliIiIliil;
   }

   private void IIillIiliIil(ilIllIiIiIllIi m) {
      long var4 = -7589289154999754884L;
      if (m.iiilllIiiIIIillIii.has(llIliilIli<invokedynamic>()) && m.iiilllIiiIIIillIii.get(llIliilIli<invokedynamic>()).isJsonObject()) {
         llIIliIiilIIliIi var2 = llIIliIiilIIliIi.lIiiIiIlilli(m.iiilllIiiIIIillIii.getAsJsonObject(llIliilIli<invokedynamic>()));
         if (var2 != null) {
            var4 ^= ((long)(m.iiilllIiiIIIillIii.has(llIliilIli<invokedynamic>()) && m.iiilllIiiIIIillIii.get(llIliilIli<invokedynamic>()).getAsBoolean() ? 1 : 0) << 32 ^ var4) & -1L << 32;
            this.ilIliIliil.put(m.iIilllIiiIlilllIii, new iIlIlIilIllIlIil(m.iIilllIiiIlilllIii, var2, (boolean)((int)(var4 >>> 32))));
         }
      }
   }

   public int liIIiiiIIi() {
      return this.lIiIiIliil;
   }

   private void Iiilliiliiil(JsonObject doc) {
      long var4 = -6675534804356134126L;
      if (doc != null && doc.has(llIliilIli<invokedynamic>()) && doc.get(llIliilIli<invokedynamic>()).isJsonObject()) {
         llIIliIiilIIliIi var2 = llIIliIiilIIliIi.lIiiIiIlilli(doc.getAsJsonObject(llIliilIli<invokedynamic>()));
         if (var2 != null) {
            var4 ^= ((long)(this.iIIliIliil != null && this.iIIliIliil.liiiIIllIl(var2) ? 0 : 1) << 32 ^ var4) & -1L << 32;
            this.iIIliIliil = var2;
            this.IlIliIliil = doc.has(llIliilIli<invokedynamic>()) ? doc.get(llIliilIli<invokedynamic>()).getAsString() : "";
            this.llIliIliil = doc.has(llIliilIli<invokedynamic>()) && doc.get(llIliilIli<invokedynamic>()).getAsBoolean();
            if ((int)(var4 >>> 32) != 0) {
               this.IiIliIliil = false;
            }

         }
      }
   }

   public lIIiIIIiiIIiIIIi(llIillIlilIillIl transport, boolean expectHost, IIiliIlllIiliIll ctx) {
      this.IlIIiIliil = iIlililIllilil.IIiillIlilIiillIli;
      this.llIIiIliil = llIliilIli<invokedynamic>();
      this.ilIIiIliil = "";
      this.iliIiIliil = new HashMap();
      this.IiiIiIliil = Collections.emptySet();
      this.liiIiIliil = new HashSet();
      this.IlIliIliil = "";
      this.ilIliIliil = new HashMap();
      this.IIlliIliil = "";
      this.lIlliIliil = new iIiiiiIlIliiiiIl();
      this.iIlliIliil = "";
      this.IllliIliil = new HashMap();
      this.IilliIliil = lIliIliIliIl.IliIlllilIi();
      this.IIiliIliil = new HashMap();
      this.lIiliIliil = new HashSet();
      this.iIiliIliil = -1;
      this.lliliIliil = new HashMap();
      this.lliilIliil = transport;
      this.iliilIliil = expectHost;
      this.IiiilIliil = new iIiIliIiIliIliIi(ctx);
      this.iiiIiIliil = transport.IIillIiliIil();
      this.IIIliIliil = IliIiIIilliIiIIi.iIlIlllllill(transport.iiIIlIIlIl());
      this.lIIIiIliil = IliIiIIilliIiIIi.liiiIIllIl(transport.iiIIlIIlIl(), this.iiiIiIliil);
   }

   private void IiIiliIiiiIi() {
      long var6 = 4124882827556298598L;
      if (this.iIIIiIliil != null && this.iIIIiIliil.IIlilIliiIli() > 0) {
         this.illliIliil = true;
      }

      if (!this.illliIliil) {
         this.IlIillIiilIi();
         iIlIlIilIllIlIil var1 = liiiIiiiiiiIii.liiiIIllIl(this.ilIliIliil.values());
         if (liiiIiiiiiiIii.IliIlllilIi(this.lllliIliil, var1)) {
            iIlIlIilIllIlIil var2 = this.lllliIliil;
            llIIliIiilIIliIi var3 = this.iIIliIliil;
            String var4 = this.IlIliIliil;
            var6 ^= ((long)this.llIliIliil << 32 ^ var6) & -1L << 32;
            this.lllliIliil = var1;
            this.iIIliIliil = var1.iIlIlllllill();
            this.IlIliIliil = var1.liiiIIllIl();
            this.llIliIliil = var1.IilliliilIIi();
            this.IIlilIliiIli(this.iIIliIliil);
            if (this.lIIliIliil == null || !this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) {
               this.lllliIliil = var2;
               this.iIIliIliil = var3;
               this.IlIliIliil = var4;
               this.llIliIliil = (boolean)((int)(var6 >>> 32));
            }

         }
      }
   }

   public lliIlilliliIlill IliIlllilIi() {
      return this.liiilIliil;
   }

   public boolean Iillllilll(llIillIlilIillIl host, boolean other) {
      if (host == null) {
         return false;
      } else {
         return other == this.iliilIliil && this.lIIIiIliil.equals(IliIiIIilliIiIIi.liiiIIllIl(host.iiIIlIIlIl(), host.IIillIiliIil()));
      }
   }

   public void lIilliIill() {
      if (this.lIIliIliil != null) {
         if (this.IiiilIliil.IIlllIlliIll() != null && this.IiiilIliil.IIlllIlliIll().equals(this.IlIliIliil)) {
            llIIliIiilIIliIi var1 = this.lliilIliil.Ililllililil();
            if (var1 != null && var1.IliIlllilIi()) {
               this.lllliIliil = new iIlIlIilIllIlIil(this.IiiilIliil.IIlllIlliIll(), var1, this.iliilIliil);
               this.iIIliIliil = var1;
               this.Iilililiiili(var1, llIliilIli<invokedynamic>());
            }

         } else {
            this.IiIliIliil = true;
         }
      }
   }

   private void iiIIlIIlIl() {
      if (!this.iIIIiIliil.Iliiillilliiilli.equals(this.IilliIliil)) {
         this.IilliIliil = this.iIIIiIliil.Iliiillilliiilli;
         this.IiIIlliIIl();
      }
   }

   public boolean Illillllil(int staleMs, int z, int x, long y) {
      if (this.iIIIiIliil == null) {
         return false;
      } else {
         IiiiIiIlliiiIiIl var6 = this.iIIIiIliil.Ililllililil(staleMs, z, x);
         if (var6 != null && !var6.IilliliilIIi() && !this.IiiilIliil.IIlllIlliIll().equals(var6.IlIIiliIll)) {
            if (!this.iIIIiIliil.IliIlllilIi() && !this.iIIIiIliil.Iliiillilliiilli.IilliliilIIi()) {
               return false;
            } else if (this.iIIIiIliil.IliIlllilIi()) {
               String var8 = var6.IlIIiliIll;
               if (!iilIIIllIIiIIIll.IIiilIiiiIii(var6, this.IiiilIliil.IIlllIlliIll(), System.currentTimeMillis(), y)) {
                  return false;
               } else {
                  this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + var6.iililliIll + (var8 == null ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>() + this.lIliliIlil(var8) + llIliilIli<invokedynamic>()) + llIliilIli<invokedynamic>());
                  return true;
               }
            } else {
               JsonObject var7 = new JsonObject();
               var7.addProperty(llIliilIli<invokedynamic>(), y);
               this.iilIiIIiIi(IlIiIlIlllIiIlIl.IillIIIiIl, var6, var7);
               return true;
            }
         } else {
            return false;
         }
      }
   }

   private void iilIiIIiIi(IlIiIlIlllIiIlIl j, IiiiIiIlliiiIiIl extra, JsonObject type) {
      JsonObject var4 = type == null ? new JsonObject() : type;
      var4.addProperty(llIliilIli<invokedynamic>(), extra.iililliIll);
      var4.addProperty(llIliilIli<invokedynamic>(), extra.IIlIiliIll);
      this.IiiilIliil.lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(j, this.IiiilIliil.IIlllIlliIll(), var4)));
   }

   private void lilIliilIl(long now) {
      long var12 = -6331755047762528270L;
      long var14 = -5738260567619554427L;
      if (this.iIIIiIliil != null) {
         var12 ^= (0L ^ var12) & -1L << 32;
         var12 ^= (0L ^ var12) & -1L >>> 32;

         for(IiiiIiIlliiiIiIl var6 : this.iIIIiIliil.IIIilIIiiIIi()) {
            llliiiIiilliiiIi var7 = this.lliilIliil.IlIillIiilIi(var6, var6.IIlIiliIll);
            var14 ^= ((long)(var7.IIillIiliIil() + var7.Ililllililil() + var7.Iiilliiliiil()) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)Math.min(var7.lIiiIiIlilli(), var6.IIIIiliIll) ^ var14) & -1L >>> 32;
            if ((int)var14 > var6.IiIIiliIll) {
               var6.liIIiliIll = now;
               if (!this.iIIIiIliil.IliIlllilIi()) {
                  JsonObject var10 = new JsonObject();
                  var10.addProperty(llIliilIli<invokedynamic>(), (int)var14);
                  this.iilIiIIiIi(IlIiIlIlllIiIlIl.llilIIIiIl, var6, var10);
               }
            }

            var6.IiIIiliIll = var7.liiiIIllIl() ? (int)var14 : Math.max(var6.IiIIiliIll, (int)var14);
            var12 ^= ((long)((int)var12 + var6.IiIIiliIll) ^ var12) & -1L >>> 32;
            var12 ^= ((long)((int)(var12 >>> 32) + (int)(var14 >>> 32)) << 32 ^ var12) & -1L << 32;
            if (var7.IliIlllilIi()) {
               Long var16 = (Long)this.lliliIliil.get(var6.iililliIll);
               if (var16 == null || var16 != var6.IIlIiliIll) {
                  this.lliliIliil.put(var6.iililliIll, var6.IIlIiliIll);
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     this.llIIlilIIl(var6, var7, var7);
                  } else {
                     JsonObject var11 = new JsonObject();
                     var7.IIIllIIliIIl(var11);
                     this.IiiilIliil.lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(IlIiIlIlllIiIlIl.iillIIIiIl, this.IiiilIliil.IIlllIlliIll(), var11)));
                  }
               }
            } else {
               this.lliliIliil.remove(var6.iililliIll);
               if (var6.IilliliilIIi() && var7.liiiIIllIl()) {
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     var6.llIIiliIll = IliilIillliilIil.lIilIllIil;
                     var6.IlIIiliIll = this.IiiilIliil.IIlllIlliIll();
                     var6.IiIIiliIll = (int)var14;
                     var6.liIIiliIll = now;
                  } else {
                     JsonObject var17 = new JsonObject();
                     var7.IIIllIIliIIl(var17);
                     this.IiiilIliil.lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(IlIiIlIlllIiIlIl.iillIIIiIl, this.IiiilIliil.IIlllIlliIll(), var17)));
                  }
               }
            }
         }

         this.liiIiIliil.clear();
         this.iIiliIliil = (int)(var12 >>> 32);
         this.IliliIliil = (int)var12;
      }
   }

   private void IlIillIiilIi() {
      if (this.lllliIliil == null && this.iIIliIliil != null) {
         this.lllliIliil = new iIlIlIilIllIlIil(this.IlIliIliil, this.iIIliIliil, this.llIliIliil);
      }
   }

   public boolean ilIllIiIll() {
      return this.IlIIiIliil == iIlililIllilil.iiiillIliIIIIilIli && !this.ilIIiIliil.isEmpty();
   }

   public boolean IiiIlliiIl() {
      return this.IlIIiIliil == iIlililIllilil.IIiillIlilIiillIli;
   }

   public String iIlllIllll() {
      return this.IlIliIliil;
   }

   private void iIIIlIlIIl(ilIllIiIiIllIi m) {
      String var2 = m.IilliliilIIi(llIliilIli<invokedynamic>());
      if (var2 != null) {
         IiiiIiIlliiiIiIl var3 = this.iIIIiIliil.IIillIiliIil(var2);
         if (var3 != null) {
            if (!m.iIilllIiiIlilllIii.equals(var3.IlIIiliIll)) {
               ++this.IIiIiIliil;
            } else {
               long var4 = m.IIIllIIliIIl(llIliilIli<invokedynamic>(), -1L);
               if (var4 != var3.IIlIiliIll) {
                  ++this.lIiIiIliil;
               } else {
                  this.llIIlilIIl(var3, this.lliilIliil.IlIillIiilIi(var3, var3.IIlIiliIll), llliiiIiilliiiIi.IlIlllIlilIl(m.iiilllIiiIIIillIii));
               }
            }
         }
      }
   }

   private void Iilililiiili(llIIliIiilIIliIi why, String a) {
      this.IiIilliIil(a);
      this.Illillliilli(why);
      if (this.iIIIiIliil.IliIlllilIi()) {
         this.iIIIiIliil.Iliiillilliiilli = this.iIIIiIliil.Iliiillilliiilli.iIlIlllllill();
         this.IilliIliil = this.iIIIiIliil.Iliiillilliiilli;
         this.liIIiIliil = Math.max(this.liIIiIliil + 1L, this.IiiilIliil.Iiilliiliiil() + 1L);
         this.IiiilIliil.IilliliilIIi(this.iIIIiIliil.Iiiiliiiiiii(), this.liIIiIliil);
      }

      this.IiIIlliIIl();
   }

   public void llIililIil(int z, int x, int y) {
      if (this.iIIIiIliil != null) {
         IiiiIiIlliiiIiIl var4 = this.iIIIiIliil.Ililllililil(z, x, y);
         if (var4 != null) {
            this.liiIiIliil.add(var4.iililliIll);
            this.IIlIiIliil = 0L;
         }

      }
   }

   public boolean iiiIlIIIll() {
      return this.iIIIiIliil != null && this.lIIliIliil != null;
   }

   // $FF: synthetic method
   private static CallSite llIliilIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8131234395040588194L ^ Long.rotateLeft(3083817929769335262L, 35) ^ 4229985500560824237L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1251815683186865585L ^ Long.rotateLeft(-2360109456431859610L, 30) ^ 2589634827531489072L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8392590300052307485L ^ Long.rotateLeft(-3107461340310048825L, 6) ^ 1385119088952122439L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5520865950358323172L ^ Long.rotateLeft(8282776189988326617L, 31) ^ 6091690355633331205L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1114144100306637431L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4707837681744293948L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6768907846501321108L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7973478330911835784L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8673314119758585233L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7256219818697004309L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIliliIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIliIIlli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlliiIlli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illlilllli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illliIilli<invokedynamic>());
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
   private static CallSite iiIliIIlli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] + 8245) << 15 | (char)(var4[var5] + 8245) >>> 1) + var5) + 10142))) >>> 7 | (char)(-((char)((char)((char)((char)(var4[var5] + 8245) << 15 | (char)(var4[var5] + 8245) >>> 1) + var5) + 10142))) << 9))) - 10148) << 12 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] + 8245) << 15 | (char)(var4[var5] + 8245) >>> 1) + var5) + 10142))) >>> 7 | (char)(-((char)((char)((char)((char)(var4[var5] + 8245) << 15 | (char)(var4[var5] + 8245) >>> 1) + var5) + 10142))) << 9))) - 10148) >>> 4) - var5))) ^ 28972));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String lIiIiiIiIi(String id) {
      return id == null ? llIliilIli<invokedynamic>() : id.substring(0, Math.min(6, id.length()));
   }

   private void IIIIllIIIl(ilIllIiIiIllIi m) {
      long var7 = 2597845131154211854L;
      if (this.iIIIiIliil != null && m != null) {
         if (this.Iiiiliiiiiii(m)) {
            switch (m.IIilllIiilIilllIii) {
               case llllIIIiIl:
                  this.IllIllllIl(m);
                  break;
               case iillIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     this.iIIIlIlIIl(m);
                  }
                  break;
               case IIilIIIiIl:
               case lillIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     IiiiIiIlliiiIiIl var11 = this.iIIIiIliil.IIillIiliIil(m.IilliliilIIi(llIliilIli<invokedynamic>()));
                     if (var11 != null && var11.IIIllIIliIIl(m.iIilllIiiIlilllIii, m.IIIllIIliIIl(llIliilIli<invokedynamic>(), -1L))) {
                        var11.iliIiiliiiii(m.IIilllIiilIilllIii == IlIiIlIlllIiIlIl.IIilIIIiIl ? IliilIillliilIil.llilIllIil : IliilIillliilIil.IIilIllIil);
                        if (m.lIiiIiIlilli(llIliilIli<invokedynamic>(), "").startsWith(llIliilIli<invokedynamic>())) {
                           ++var11.ilIIiliIll;
                        }
                     } else if (var11 != null) {
                        ++this.lIiIiIliil;
                     }
                  }
                  break;
               case lIilIIIiIl:
                  long var10 = m.IIIllIIliIIl(llIliilIli<invokedynamic>(), Long.MIN_VALUE);
                  if (var10 != Long.MIN_VALUE && !m.iIilllIiiIlilllIii.equals(this.IiiilIliil.IIlllIlliIll())) {
                     this.iliIiIliil.put(var10, System.currentTimeMillis() + 4000L);
                  }
                  break;
               case llilIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     IiiiIiIlliiiIiIl var9 = this.iIIIiIliil.IIillIiliIil(m.IilliliilIIi(llIliilIli<invokedynamic>()));
                     var7 ^= ((long)m.iliIiiliiiii(llIliilIli<invokedynamic>(), -1) << 32 ^ var7) & -1L << 32;
                     if (var9 != null && (int)(var7 >>> 32) >= 0 && var9.IIIllIIliIIl(m.iIilllIiiIlilllIii, m.IIIllIIliIIl(llIliilIli<invokedynamic>(), -1L))) {
                        if ((int)(var7 >>> 32) > var9.IiIIiliIll) {
                           var9.liIIiliIll = System.currentTimeMillis();
                        }

                        var9.IiIIiliIll = Math.max(var9.IiIIiliIll, Math.min((int)(var7 >>> 32), var9.IIIIiliIll));
                     }
                  }
                  break;
               case IillIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     IiiiIiIlliiiIiIl var2 = this.iIIIiIliil.IIillIiliIil(m.IilliliilIIi(llIliilIli<invokedynamic>()));
                     IIliIiIilIliIiIi var3 = this.iIIIiIliil.iIlIlllllill(m.iIilllIiiIlilllIii);
                     long var4 = Math.max(10000L, m.IIIllIIliIIl(llIliilIli<invokedynamic>(), 30000L));
                     if (var2 != null && var3 != null && var3.liiilIiIIi) {
                        String var6 = var2.IlIIiliIll;
                        if (iilIIIllIIiIIIll.IIiilIiiiIii(var2, m.iIilllIiiIlilllIii, System.currentTimeMillis(), var4)) {
                           this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + var2.iililliIll + llIliilIli<invokedynamic>() + this.lIliliIlil(m.iIilllIiiIlilllIii) + llIliilIli<invokedynamic>() + (var6 == null ? llIliilIli<invokedynamic>() : llIliilIli<invokedynamic>() + this.lIliliIlil(var6) + llIliilIli<invokedynamic>()));
                        }
                     }
                  }
               case iIilIIIiIl:
               case IlilIIIiIl:
               case ililIIIiIl:
               case IlllIIIiIl:
               case IiilIIIiIl:
               case illlIIIiIl:
               case IIllIIIiIl:
               case lIllIIIiIl:
               case iIllIIIiIl:
               case liilIIIiIl:
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illlilllli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) << 7 | (char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) >>> 9) ^ 30430))) + 4254))) ^ var5) - var5) ^ '쟶') ^ '\udd17') >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) << 7 | (char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) >>> 9) ^ 30430))) + 4254))) ^ var5) - var5) ^ '쟶') ^ '\udd17') << 8) + 30028) << 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) << 7 | (char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) >>> 9) ^ 30430))) + 4254))) ^ var5) - var5) ^ '쟶') ^ '\udd17') >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) << 7 | (char)(-((char)((char)(~((char)(-var4[var5]))) + 2481))) >>> 9) ^ 30430))) + 4254))) ^ var5) - var5) ^ '쟶') ^ '\udd17') << 8) + 30028) >>> 4) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String liIlliiIll() {
      return this.iiIliIliil;
   }

   private void IIlilIliiIli(llIIliIiilIIliIi offered) {
      long var4 = 4894009204977122906L;
      IiiiIIlliiiIIl var2 = IliIIilllliIIill.IliIlllilIi(this.lIIliIliil, this.lliilIliil.Ililllililil(), offered, this.lliilIliil.IIiilIiiiIii(), this.IiIliIliil, this.IiiilIliil.IIlllIlliIll().equals(this.IlIliIliil));
      switch (var2.iIlIlllllill()) {
         case IIilIlIllIilIlIl:
            if (this.liIliIliil == null) {
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + var2.lIiiIiIlilli());
            }

            this.liIliIliil = IliIIilllliIIill.liiiIIllIl(offered.IlIlllIlilIl());
            this.llIIiIliil = var2.lIiiIiIlilli();
            break;
         case iIilIlIlIlilIlIl:
            this.llIIiIliil = var2.lIiiIiIlilli();
            break;
         case lillIlIliillIlIl:
            if (this.iIIIiIliil == null) {
               this.Illillliilli(offered);
            }
            break;
         case IlllIlIlllllIlIl:
         case illlIlIlIillIlIl:
            this.liIliIliil = null;
            var4 ^= ((long)(this.lliilIliil.Ililllililil() != null && this.lliilIliil.Ililllililil().liiiIIllIl(offered) ? 0 : 1) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != 0 && !this.lliilIliil.Iiilliiliiil(offered)) {
               this.llIIiIliil = llIliilIli<invokedynamic>();
               return;
            }

            if (!var2.lIiiIiIlilli().isEmpty()) {
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + var2.lIiiIiIlilli());
            }

            if (this.iIIIiIliil == null) {
               this.Illillliilli(offered);
            } else {
               this.Iilililiiili(offered, llIliilIli<invokedynamic>());
            }
      }

   }

   private void IIIilIIiiIIi() {
      long var3 = -1289369142610155182L;
      var3 ^= ((long)(!this.iIlliIliil.isEmpty() && this.iIlliIliil.equals(this.IiiilIliil.IIlllIlliIll()) ? 1 : 0) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 0) {
         this.IlIillIiilIi();
         iIlIlIilIllIlIil var2 = liiiIiiiiiiIii.liiiIIllIl(this.ilIliIliil.values());
         if (var2 == null && this.lllliIliil == null) {
            return;
         }

         if (liiiIiiiiiiIii.IliIlllilIi(this.lllliIliil, var2)) {
            this.lllliIliil = var2;
         }

         if (this.lllliIliil == null) {
            return;
         }

         this.iIIliIliil = this.lllliIliil.iIlIlllllill();
         this.IlIliIliil = this.lllliIliil.liiiIIllIl();
         this.llIliIliil = this.lllliIliil.IilliliilIIi();
      }

      if (this.iIIliIliil == null) {
         this.llIIiIliil = llIliilIli<invokedynamic>();
      } else {
         this.IIlilIliiIli(this.iIIliIliil);
      }
   }

   private void Ililllililil(long now) {
      long var6 = 2514987928637813813L;
      if (!this.IiiilIliil.Ililllililil()) {
         var6 ^= ((long)(this.lllIiIliil && this.iIIliIliil != null && (this.lIIliIliil == null || this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) && !this.lIlIliIlIl() ? 0 : 1) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) != 0) {
            if (!this.lllIiIliil || now - this.lilliIliil >= 5000L) {
               this.lllIiIliil = true;
               this.lilliIliil = now;
               JsonObject var4 = this.lliilIliil.IiIiliIiiiIi().iliIiiliiiii();
               llIIliIiilIIliIi var5 = this.lliilIliil.Ililllililil();
               if (var5 != null && var5.IliIlllilIi()) {
                  var4.add(llIliilIli<invokedynamic>(), var5.IilliliilIIi());
                  var4.addProperty(llIliilIli<invokedynamic>(), this.iliilIliil);
                  var4.addProperty(llIliilIli<invokedynamic>(), this.lIIliIliil == null ? "" : this.lIIliIliil.iIlIlllllill());
                  this.ilIliIliil.put(this.IiiilIliil.IIlllIlliIll(), new iIlIlIilIllIlIil(this.IiiilIliil.IIlllIlliIll(), var5, this.iliilIliil));
               }

               this.IiiilIliil.lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(IlIiIlIlllIiIlIl.llllIIIiIl, this.IiiilIliil.IIlllIlliIll(), var4)));
            }
         }
      }
   }

   public boolean lliIliliIl() {
      return this.IlIIiIliil == iIlililIllilil.lliillIliiliillIli && this.iIIIiIliil != null && this.lIIliIliil != null;
   }

   private void IllIllllIl(ilIllIiIiIllIi m) {
      if (m.iIilllIiiIlilllIii != null && !m.iIilllIiiIlilllIii.equals(this.IiiilIliil.IIlllIlliIll())) {
         iIIllIlIlIllIl var2 = iIIllIlIlIllIl.IIIllIIliIIl(m.iiilllIiiIIIillIii);
         iIIllIlIlIllIl var3 = this.lliilIliil.IiIiliIiiiIi();
         liiiiilliiiiiill var4 = var3.IliIlllilIi(var2);
         IIliIiIilIliIiIi var5 = this.iIIIiIliil.iIlIlllllill(m.iIilllIiiIlilllIii);
         if (var5 != null) {
            var5.iiiilIiIIi = var4;
         }

         this.IIiliIliil.put(m.iIilllIiiIlilllIii, var4);
         if (var4 == liiiiilliiiiiill.IiillIIIil) {
            this.IIillIiliIil(m);
         } else {
            if (this.lIiliIliil.add(m.iIilllIiiIlilllIii)) {
               ++this.lliIiIliil;
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.lIliliIlil(m.iIilllIiiIlilllIii) + llIliilIli<invokedynamic>());
               this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + var3.IilliliilIIi(var2, var4).replace(llIliilIli<invokedynamic>(), llIliilIli<invokedynamic>()));
            }

         }
      }
   }

   public boolean lllllillll() {
      return this.llIliIliil;
   }

   public boolean IlIllllIll() {
      return this.IlIIiIliil == iIlililIllilil.iiiillIliIIIIilIli || this.IlIIiIliil == iIlililIllilil.IiiillIliliiillIli || this.IiiilIliil.IIIllIIliIIl() == IiiIiIilliiIiIil.IiIIIilIil || this.IiiilIliil.IIIllIIliIIl() == IiiIiIilliiIiIil.ilIIIilIil;
   }

   private void lllIiillIi(String reason) {
      if (this.IlIIiIliil != iIlililIllilil.iiiillIliIIIIilIli) {
         this.IlIIiIliil = iIlililIllilil.iiiillIliIIIIilIli;
         this.ilIIiIliil = reason == null ? llIliilIli<invokedynamic>() : reason;
         this.llIIiIliil = llIliilIli<invokedynamic>() + this.ilIIiIliil;
         this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + this.ilIIiIliil);
      }

      try {
         this.IiiilIliil.liiiIIllIl();
      } catch (Exception var3) {
      }

   }

   private void illIlIilIl(long now) {
      long var6 = 8488104883475588845L;
      long var8 = 8241616178867482028L;
      this.IiIiliIiiiIi();
      var6 ^= ((long)iilIIIllIIiIIIll.IIIllIIliIIl(this.iIIIiIliil, now) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)iilIIIllIIiIIIll.IlIlllIlilIl(this.iIIIiIliil, now) ^ var6) & -1L >>> 32;
      if ((int)var6 > 0) {
         this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + (int)var6 + llIliilIli<invokedynamic>());
      }

      long var10000 = var8 ^ ((long)iilIIIllIIiIIIll.IiIlliIliiIl(this.iIIIiIliil, now, this.lliilIliil.IIIIllIIIl()) << 32 ^ var8) & -1L << 32;
      this.liIIiIliil = Math.max(this.liIIiIliil + 1L, this.IiiilIliil.Iiilliiliiil() + 1L);
      this.IiiilIliil.IilliliilIIi(this.iIIIiIliil.Iiiiliiiiiii(), this.liIIiIliil);
   }

   private void IiIIlliIIl() {
      this.lliliIliil.clear();
      this.lllIiIliil = false;
   }

   // $FF: synthetic method
   private static CallSite lIlliiIlli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '靲') >>> 4 | (char)(var4[var5] ^ '靲') << 12) >>> 10 | (char)((char)(var4[var5] ^ '靲') >>> 4 | (char)(var4[var5] ^ '靲') << 12) << 6) ^ '벫') >>> 11 | (char)((char)((char)((char)(var4[var5] ^ '靲') >>> 4 | (char)(var4[var5] ^ '靲') << 12) >>> 10 | (char)((char)(var4[var5] ^ '靲') >>> 4 | (char)(var4[var5] ^ '靲') << 12) << 6) ^ '벫') << 5) + var5) ^ 9156) ^ '鶐') ^ var5) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean illilIilil() {
      return this.iIIIiIliil != null && this.iIIIiIliil.IIiilIiiiIii();
   }

   public boolean iIIilIlIil(int y, int x, int z) {
      if (this.iIIIiIliil != null && this.lIIliIliil != null) {
         if (!this.iIIIiIliil.Illlllllilll()) {
            return true;
         } else {
            Long var4 = IliIilliIi(y, x, z);
            Long var5 = (Long)this.iliIiIliil.get(var4);
            return var5 != null && var5 > System.currentTimeMillis() ? false : this.iIIIiIliil.Iiilliiliiil(y, x, z);
         }
      } else {
         return false;
      }
   }

   public String lliililiil() {
      return this.IiiilIliil.IIlllIlliIll();
   }

   public String ilillIiill() {
      return this.llIIiIliil;
   }

   private void Illlllllilll(JsonArray hostId, String members) {
      if (members != null && !members.isEmpty()) {
         this.iIlliIliil = members;
      }

      if (hostId != null) {
         HashSet var3 = new HashSet();

         for(JsonElement var5 : hostId) {
            if (var5.isJsonObject()) {
               IIliIiIilIliIiIi var6 = IIliIiIilIliIiIi.iIlIlllllill(var5.getAsJsonObject());
               if (var6 != null) {
                  var3.add(var6.lIiilIiIIi);
                  this.IllliIliil.put(var6.lIiilIiIIi, var6.liiiIIllIl());
               }
            }
         }

         if (!var3.isEmpty()) {
            this.ilIliIliil.keySet().removeIf((id) -> !var3.contains(id));
            this.IiIIiIliil = true;
         }

      }
   }

   public Set<Long> IIiillIiil() {
      return this.IiiIiIliil;
   }

   private String lIliliIlil(String memberId) {
      if (memberId == null) {
         return llIliilIli<invokedynamic>();
      } else if (memberId.equals(this.IiiilIliil.IIlllIlliIll())) {
         return llIliilIli<invokedynamic>();
      } else {
         IIliIiIilIliIiIi var2 = this.iIIIiIliil != null ? this.iIIIiIliil.iIlIlllllill(memberId) : null;
         return var2 != null && var2.iIiilIiIIi != null && !var2.iIiilIiIIi.isEmpty() ? var2.iIiilIiIIi : memberId.substring(0, Math.min(6, memberId.length()));
      }
   }

   private void iIlIiIllIi(String reason) {
      if (this.IlIIiIliil != iIlililIllilil.IiiillIliliiillIli) {
         this.IlIIiIliil = iIlililIllilil.IiiillIliliiillIli;
         this.ilIIiIliil = reason;
         this.llIIiIliil = llIliilIli<invokedynamic>() + reason;
         this.lliilIliil.IllIllllIl(llIliilIli<invokedynamic>() + reason + llIliilIli<invokedynamic>());
      }

   }

   public String IIllllIlll() {
      return this.liIliIliil;
   }

   public boolean iilllIIill() {
      if (this.iIIIiIliil != null && this.lIIliIliil != null) {
         llIIliIiilIIliIi var1 = this.lliilIliil.Ililllililil();
         return var1 != null && var1.IliIlllilIi() && !var1.liiiIIllIl(this.lIIliIliil);
      } else {
         return false;
      }
   }

   public llIIliIiilIIliIi lIIlliIIll() {
      return this.lIIliIliil;
   }

   public int IlIIillIIi() {
      return this.iIiIiIliil;
   }

   public IIIIliilIIIlii liiiIIllIl() {
      return this.iiiIiIliil;
   }
}
