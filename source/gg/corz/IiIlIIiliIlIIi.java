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
import net.minecraft.class_1792;
import net.minecraft.class_1802;

public final class IiIlIIiliIlIIi {
   public String IiIiiIililiIiiIili;
   public String lIliiIiliiIliiIili;
   public int IlliiIilillliiIili;
   public String llIiiIiliilIiiIili;
   public llIlIlIlilIlIlIl IIIiiIililIIiiIili;
   public int iiIiiIiliIIliiIili;
   public int liliiIiliiiliiIili;
   public boolean liiliIiliiiiliIili = true;
   public boolean iIiiiIiliIliiiIili;
   public ililIlIiilIl iIIiiIiliIlIiiIili;
   public boolean IIiiiIililIiiiIili;
   public int illiiIiliIiliiIili;
   public transient int lliiiIiliiliiiIili;

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)(~((char)(~((char)(-((char)((char)(-((char)(~var4[var5]))) + var5))))))) << 12 | (char)(~((char)(~((char)(-((char)((char)(-((char)(~var4[var5]))) + var5))))))) >>> 4))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IiIlIIiliIlIIi liiiIIllIl(String priority, String profession, int item) {
      IiIlIIiliIlIIi var3 = new IiIlIIiliIlIIi();
      var3.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.iilIliilIl;
      var3.iIIiiIiliIlIiiIili = ililIlIiilIl.iliIIillIiiIIill;
      var3.llIiiIiliilIiiIili = priority;
      var3.lIliiIiliiIliiIili = profession;
      var3.illiiIiliIiliiIili = item;
      return var3;
   }

   public int IlIlllIlilIl() {
      return IiiIlliiIl.IIIllIIliIIl(this.iliIiiliiiii());
   }

   public static IiIlIIiliIlIIi lIiiIiIlilli(lIllIilliIllIill ti, String profession) {
      if (ti == null) {
         return null;
      } else {
         String var2 = profession != null && !profession.isEmpty() ? profession : Iiilliiliiil<invokedynamic>();
         if (ti.IlIiIilill && ti.llIiIilill != null) {
            String var6 = IliiiiIilliiiiIi.lIiiIiIlilli(ti.llIiIilill);
            if (IliiiiIilliiiiIi.liiiIIllIl(var6) == null) {
               return null;
            } else {
               IiIlIIiliIlIIi var7 = IliIlllilIi(var6, Math.max(1, ti.IiIiIilill), 80, false);
               var7.llIiiIiliilIiiIili = var2;
               return var7;
            }
         } else if (!ti.iIIiIilill) {
            String var5 = IiiIlliiIl.IilliliilIIi(ti.lIilIilill);
            return var5 == null ? null : iIlIlllllill(var2, var5, 80);
         } else {
            class_1792 var3 = ti.illlIilill != null && ti.illlIilill != class_1802.field_8687 ? ti.illlIilill : (ti.lillIilill != null && ti.lillIilill != class_1802.field_8687 ? ti.lillIilill : null);
            String var4 = IiiIlliiIl.IilliliilIIi(var3);
            return var4 == null ? null : liiiIIllIl(var2, var4, 60);
         }
      }
   }

   public static IiIlIIiliIlIIi Ililllililil(JsonObject o) {
      IiIlIIiliIlIIi var1 = new IiIlIIiliIlIIi();

      try {
         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.liiliIiliiiiliIili = o.get(Iiilliiliiil<invokedynamic>()).getAsBoolean();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.valueOf(o.get(Iiilliiliiil<invokedynamic>()).getAsString());
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.iIIiiIiliIlIiiIili = ililIlIiilIl.valueOf(o.get(Iiilliiliiil<invokedynamic>()).getAsString());
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.llIiiIiliilIiiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsString();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.IiIiiIililiIiiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsString();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.iiIiiIiliIIliiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsInt();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.lIliiIiliiIliiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsString();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.IlliiIilillliiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsInt();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.illiiIiliIiliiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsInt();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.liliiIiliiiliiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsInt();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.IIiiiIililIiiiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsBoolean();
         }

         if (o.has(Iiilliiliiil<invokedynamic>())) {
            var1.iIiiiIiliIliiiIili = o.get(Iiilliiliiil<invokedynamic>()).getAsBoolean();
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   public boolean IIIllIIliIIl() {
      return IiiIlliiIl.iliIiiliiiii(this.iliIiiliiiii());
   }

   public boolean IiIlliIliiIl() {
      return this.liliiIiliiiliiIili > 0 && this.lliiiIiliiliiiIili >= this.liliiIiliiiliiIili;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) << 12) ^ var5))) ^ 'ꨤ'))) - var5) << 8 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) << 12) ^ var5))) ^ 'ꨤ'))) - var5) >>> 8) >>> 6 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) << 12) ^ var5))) ^ 'ꨤ'))) - var5) << 8 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 29817) + 15089) - var5) - '\ude29') - 21919) - var5) ^ var5) >>> 6) << 12) ^ var5))) ^ 'ꨤ'))) - var5) >>> 8) << 10))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject IIillIiliIil() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.liiliIiliiiiliIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.IIIiiIililIIiiIili.name());
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.iIIiiIiliIlIiiIili.name());
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.llIiiIiliilIiiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.IiIiiIililiIiiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.iiIiiIiliIIliiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.lIliiIiliiIliiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.IlliiIilillliiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.illiiIiliIiliiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.liliiIiliiiliiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.IIiiiIililIiiiIili);
      var1.addProperty(Iiilliiliiil<invokedynamic>(), this.iIiiiIiliIliiiIili);
      return var1;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') << 4) ^ var5))) >>> 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') << 4) ^ var5))) << 13))) >>> 2 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') << 4) ^ var5))) >>> 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '푃') >>> 13 | (char)((char)(-var4[var5]) ^ '푃') << 3) + '쀝') - var5) - var5) ^ '鸁') - '슲') << 4) ^ var5))) << 13))) << 14) - '룷') + '빚') - 29022));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IiIlIIiliIlIIi IilliliilIIi() {
      return iIlIlllllill(Iiilliiliiil<invokedynamic>(), IiiIlliiIl.IilliliilIIi(class_1802.field_8287), 80);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) - 22868))) ^ '\ue69b'))) - var5) + var5) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) - 22868))) ^ '\ue69b'))) - var5) + var5) << 8) ^ 9641))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiIlIIiliIlIIi() {
      this.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.IilIliilIl;
      this.iIIiiIiliIlIiiIili = ililIlIiilIl.IliIIilllliIIill;
      this.llIiiIiliilIiiIili = Iiilliiliiil<invokedynamic>();
      this.IiIiiIililiIiiIili = Iiilliiliiil<invokedynamic>();
      this.iiIiiIiliIIliiIili = 1;
      this.lIliiIiliiIliiIili = Iiilliiliiil<invokedynamic>();
      this.IlliiIilillliiIili = 0;
      this.illiiIiliIiliiIili = 50;
      this.liliiIiliiiliiIili = 0;
      this.IIiiiIililIiiiIili = true;
      this.iIiiiIiliIliiiIili = false;
      this.lliiiIiliiliiiIili = 0;
   }

   public static IiIlIIiliIlIIi IliIlllilIi(String level, int autoDrop, int priority, boolean enchant) {
      IiIlIIiliIlIIi var4 = new IiIlIIiliIlIIi();
      var4.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.IilIliilIl;
      var4.iIIiiIiliIlIiiIili = ililIlIiilIl.IliIIilllliIIill;
      var4.llIiiIiliilIiiIili = Iiilliiliiil<invokedynamic>();
      var4.IiIiiIililiIiiIili = level;
      var4.iiIiiIiliIIliiIili = autoDrop;
      var4.illiiIiliIiliiIili = priority;
      var4.iIiiiIiliIliiiIili = enchant;
      return var4;
   }

   public String Iilllilliill() {
      String var10000;
      switch (this.iIIiiIiliIlIiiIili.ordinal()) {
         case 0 -> var10000 = this.iiIiiIiliIIliiIili > 1 ? this.IiIiiIililiIiiIili + Iiilliiliiil<invokedynamic>() + IliiiiIilliiiiIi.iliIiiliiiii(this.iiIiiIiliIIliiIili) : this.IiIiiIililiIiiIili;
         case 1 -> var10000 = Iiilliiliiil<invokedynamic>() + IiiIlliiIl.lIiiIiIlilli(this.lIliiIiliiIliiIili);
         case 2 -> var10000 = IiiIlliiIl.lIiiIiIlilli(this.lIliiIiliiIliiIili);
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public String Illlllllilll() {
      String var1 = this.iIIiiIiliIlIiiIili == ililIlIiilIl.iliIIillIiiIIill ? IiiIlliiIl.lIiiIiIlilli(this.lIliiIiliiIliiIili) + Iiilliiliiil<invokedynamic>() : this.Iilllilliill();
      return this.IIIiiIililIIiiIili + Iiilliiliiil<invokedynamic>() + var1 + Iiilliiliiil<invokedynamic>() + this.llIiiIiliilIiiIili + Iiilliiliiil<invokedynamic>();
   }

   public class_1792 iliIiiliiiii() {
      return this.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && this.iIIiiIiliIlIiiIili == ililIlIiilIl.liiIIilliiiIIill ? IiiIlliiIl.iIlIlllllill(this.lIliiIiliiIliiIili) : null;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -944235461240182073L ^ Long.rotateLeft(-166053223380976930L, 37) ^ 1084975329195452229L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 744608012481108529L ^ Long.rotateLeft(1573854574010871174L, 11) ^ 8327298232162482349L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9125361822370491124L ^ Long.rotateLeft(6349998714887571723L, 62) ^ -3436254404217687917L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8306339189784671578L ^ Long.rotateLeft(-1835248577570055691L, 31) ^ 5042416595557493294L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8702876059946038249L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1574816149405961684L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4805692725156385716L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7321685904571845551L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7005982212939179578L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1828623548470132512L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   public static IiIlIIiliIlIIi iIlIlllllill(String profession, String priority, int item) {
      IiIlIIiliIlIIi var3 = new IiIlIIiliIlIIi();
      var3.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.IilIliilIl;
      var3.iIIiiIiliIlIiiIili = ililIlIiilIl.liiIIilliiiIIill;
      var3.llIiiIiliilIiiIili = profession;
      var3.lIliiIiliiIliiIili = priority;
      var3.illiiIiliIiliiIili = item;
      return var3;
   }

   public boolean IIlllIlliIll() {
      return this.liiliIiliiiiliIili && !this.IiIlliIliiIl();
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 2 | (char)((char)(-var4[var5]) + var5) >>> 14) >>> 12 | (char)((char)((char)(-var4[var5]) + var5) << 2 | (char)((char)(-var4[var5]) + var5) >>> 14) << 4) - '뚖') - 14084) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 2 | (char)((char)(-var4[var5]) + var5) >>> 14) >>> 12 | (char)((char)((char)(-var4[var5]) + var5) << 2 | (char)((char)(-var4[var5]) + var5) >>> 14) << 4) - '뚖') - 14084) ^ var5) << 6) + 7098))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
