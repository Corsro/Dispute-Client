package gg.corz;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIliIiIilIliIiIi {
   public boolean liiilIiIIi = true;
   private static final int[] IIiilIiIIi = new int[]{-11549705, -18611, -8271996, -1739917, -4560696, -11677471, -10929, -1023342, -6190977, -7297874};
   public boolean IIIIiIiIIi = true;
   public final int IllIiIiIIi;
   public String IliilIiIIi;
   public int lIlIiIiIIi;
   public String iIiilIiIIi;
   public long IiiilIiIIi;
   public final String lIiilIiIIi;
   public double IiIIiIiIIi;
   public lliIiIIliliIiIIl iIIIiIiIIi;
   public liiiiilliiiiiill iiiilIiIIi;
   public boolean iliilIiIIi;
   public double llIIiIiIIi;
   public long lliilIiIIi;
   public IiiIIlllliiIIlll iIlIiIiIIi;
   public iliiiIIiIiiiiIIi lIIIiIiIIi;
   public boolean IlIIiIiIIi;
   public double liIIiIiIIi;
   public String iiIIiIiIIi;
   public int IIlIiIiIIi;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) << 14) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) << 14) ^ var5) << 10) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) << 14) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12371) - var5) << 12 | (char)((char)(var4[var5] - 12371) - var5) >>> 4) ^ var5) - var5) + '錡') + '鎳') - var5) << 14) ^ var5) << 10) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.lIIIiIiIIi.name());
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.iIIIiIiIIi.name());
      if (this.IlIIiIiIIi) {
         var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.llIIiIiIIi);
         var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.IiIIiIiIIi);
         var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.liIIiIiIIi);
      }

      if (this.iiIIiIiIIi != null && !this.iiIIiIiIIi.isEmpty()) {
         var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.iiIIiIiIIi);
      }

      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.IIlIiIiIIi);
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.lIlIiIiIIi);
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.IIIIiIiIIi);
      if (!this.iIlIiIiIIi.IilliliilIIi()) {
         var1.add(IIIllIIliIIl<invokedynamic>(), this.iIlIiIiIIi.IIIllIIliIIl());
      }

      return var1;
   }

   public IIliIiIilIliIiIi(String id) {
      this.lIIIiIiIIi = iliiiIIiIiiiiIIi.llliliiiil;
      this.iIIIiIiIIi = lliIiIIliliIiIIl.IIIllIilIl;
      this.iiIIiIiIIi = "";
      this.iIlIiIiIIi = new IiiIIlllliiIIlll();
      this.lIiilIiIIi = id == null ? "" : id;
      this.IllIiIiIIi = IIiilIiIIi[Math.floorMod(this.lIiilIiIIi.hashCode(), IIiilIiIIi.length)];
   }

   public String liiiIIllIl() {
      return this.iIiilIiIIi != null && !this.iIiilIiIIi.isBlank() ? this.iIiilIiIIi : this.lIiilIiIIi.substring(0, Math.min(6, this.lIiilIiIIi.length()));
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] + 29855) + var5)))))) >>> 1 | (char)(~((char)((char)(-((char)((char)(var4[var5] + 29855) + var5)))))) << 15) - 7756) ^ 9545))) - '꙽') >>> 8 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] + 29855) + var5)))))) >>> 1 | (char)(~((char)((char)(-((char)((char)(var4[var5] + 29855) + var5)))))) << 15) - 7756) ^ 9545))) - '꙽') << 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double iliIiiliiiii(double px, double py, double pz) {
      double var7 = this.llIIiIiIIi - px;
      double var9 = this.IiIIiIiIIi - py;
      double var11 = this.liIIiIiIIi - pz;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) - 13665) ^ '\ue9a7') << 10 | (char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) - 13665) ^ '\ue9a7') >>> 6) - '굱') ^ 20293) + var5) + var5) - '\ue6a2') + 31484))))) ^ 201) ^ 29714) << 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) - 13665) ^ '\ue9a7') << 10 | (char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) - 13665) ^ '\ue9a7') >>> 6) - '굱') ^ 20293) + var5) + var5) - '\ue6a2') + 31484))))) ^ 201) ^ 29714) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7313343481399450004L ^ Long.rotateLeft(-4320047499359282877L, 56) ^ 1583875417713323734L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8365539699177679259L ^ Long.rotateLeft(8327722970967918464L, 31) ^ 2406361186353350908L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6202846539971083600L ^ Long.rotateLeft(-8239495138825595991L, 24) ^ 6556950876395833945L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5838841945025396685L ^ Long.rotateLeft(8939915406318554452L, 58) ^ 1567185210300280482L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4848165115644292375L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1452241721266542969L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7982948010068279321L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5293715917049544223L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7419710014740571653L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5929715528093889220L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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

   public void IilliliilIIi(JsonObject s) {
      if (s != null) {
         this.lIIIiIiIIi = iliiiIIiIiiiiIIi.IliIlllilIi(s.has(IIIllIIliIIl<invokedynamic>()) ? s.get(IIIllIIliIIl<invokedynamic>()).getAsString() : null);
         this.iIIIiIiIIi = lliIiIIliliIiIIl.IliIlllilIi(s.has(IIIllIIliIIl<invokedynamic>()) ? s.get(IIIllIIliIIl<invokedynamic>()).getAsString() : null);
         if (s.has(IIIllIIliIIl<invokedynamic>()) && s.has(IIIllIIliIIl<invokedynamic>()) && s.has(IIIllIIliIIl<invokedynamic>())) {
            try {
               this.llIIiIiIIi = s.get(IIIllIIliIIl<invokedynamic>()).getAsDouble();
               this.IiIIiIiIIi = s.get(IIIllIIliIIl<invokedynamic>()).getAsDouble();
               this.liIIiIiIIi = s.get(IIIllIIliIIl<invokedynamic>()).getAsDouble();
               this.IlIIiIiIIi = true;
            } catch (Exception var3) {
            }
         }

         this.iiIIiIiIIi = s.has(IIIllIIliIIl<invokedynamic>()) ? s.get(IIIllIIliIIl<invokedynamic>()).getAsString() : "";
         this.IIlIiIiIIi = s.has(IIIllIIliIIl<invokedynamic>()) ? s.get(IIIllIIliIIl<invokedynamic>()).getAsInt() : 0;
         this.lIlIiIiIIi = s.has(IIIllIIliIIl<invokedynamic>()) ? s.get(IIIllIIliIIl<invokedynamic>()).getAsInt() : 0;
         this.IIIIiIiIIi = !s.has(IIIllIIliIIl<invokedynamic>()) || s.get(IIIllIIliIIl<invokedynamic>()).getAsBoolean();
         if (s.has(IIIllIIliIIl<invokedynamic>()) && s.get(IIIllIIliIIl<invokedynamic>()).isJsonObject()) {
            this.iIlIiIiIIi = IiiIIlllliiIIlll.IlIlllIlilIl(s.getAsJsonObject(IIIllIIliIIl<invokedynamic>()));
         }

      }
   }

   public boolean IliIlllilIi() {
      return this.iiiilIiIIi == null || this.iiiilIiIIi == liiiiilliiiiiill.IiillIIIil;
   }

   public static IIliIiIilIliIiIi iIlIlllllill(JsonObject o) {
      if (o != null && o.has(IIIllIIliIIl<invokedynamic>())) {
         IIliIiIilIliIiIi var1 = new IIliIiIilIliIiIi(o.get(IIIllIIliIIl<invokedynamic>()).getAsString());
         var1.iIiilIiIIi = o.has(IIIllIIliIIl<invokedynamic>()) ? o.get(IIIllIIliIIl<invokedynamic>()).getAsString() : var1.lIiilIiIIi;
         var1.IliilIiIIi = o.has(IIIllIIliIIl<invokedynamic>()) ? o.get(IIIllIIliIIl<invokedynamic>()).getAsString() : "";
         var1.lliilIiIIi = o.has(IIIllIIliIIl<invokedynamic>()) ? o.get(IIIllIIliIIl<invokedynamic>()).getAsLong() : 0L;
         var1.iliilIiIIi = !o.has(IIIllIIliIIl<invokedynamic>()) || o.get(IIIllIIliIIl<invokedynamic>()).getAsBoolean();
         if (o.has(IIIllIIliIIl<invokedynamic>()) && o.get(IIIllIIliIIl<invokedynamic>()).isJsonObject()) {
            var1.IilliliilIIi(o.getAsJsonObject(IIIllIIliIIl<invokedynamic>()));
         }

         return var1;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - 4318))) + var5) ^ '\uf757') >>> 5 | (char)((char)((char)(-((char)(var4[var5] - 4318))) + var5) ^ '\uf757') << 11))) ^ '艅'))) ^ var5) ^ var5) + var5) + '팦') - var5))))))) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + '\ufadb') ^ var5) - 7754) ^ '뜶') - 32252))) ^ '엎'))) ^ '\uf451') << 15 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + '\ufadb') ^ var5) - 7754) ^ '뜶') - 32252))) ^ '엎'))) ^ '\uf451') >>> 1) - var5))))) + '\ue242'))) ^ var5) + 29924) - '飴') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
