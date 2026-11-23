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
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public final class llIIiliilIIili {
   public llilIlilililIlil IliIiiIIIl;
   public String iliIiiIIIl;
   public lilIilIiiilIilIi lliIiiIIIl;
   public boolean iIiIiiIIIl = true;
   public int liiIiiIIIl;
   public String IiiIiiIIIl;
   public int iiiIiiIIIl;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(var4[var5] ^ '누') + var5) + '켊'))))))) + 26812) + var5))) - 13883) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) << 6) + var5) + 8612) ^ '\udcbd') - '釟') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) << 6) + var5) + 8612) ^ '\udcbd') - '釟') >>> 1) ^ '쐊') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) << 6) + var5) + 8612) ^ '\udcbd') - '釟') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') << 6 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '阀') >>> 10) ^ '\udfda'))) + var5))) ^ '\ued84') + 15035) + var5) << 6) + var5) + 8612) ^ '\udcbd') - '釟') >>> 1) ^ '쐊') << 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl(class_1799 stack) {
      if (this.iIiIiiIIIl && stack != null && !stack.method_7960()) {
         boolean var10000;
         switch (this.IliIiiIIIl.ordinal()) {
            case 0:
               class_1792 var2 = IiiIlliiIl.iIlIlllllill(this.iliIiiIIIl);
               var10000 = var2 != null && stack.method_31574(var2);
               break;
            case 1:
               var10000 = IilliliilIIi(stack, this.IiiIiiIIIl, Math.max(1, this.liiIiiIIIl));
               break;
            case 2:
               var10000 = stack.method_31574(class_1802.field_8598);
               break;
            default:
               throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      } else {
         return false;
      }
   }

   public llIIiliilIIili() {
      this.IliIiiIIIl = llilIlilililIlil.lliilIiIil;
      this.lliIiiIIIl = lilIilIiiilIilIi.lliIIllIIi;
      this.iliIiiIIIl = IIIllIIliIIl<invokedynamic>();
      this.IiiIiiIIIl = IIIllIIliIIl<invokedynamic>();
      this.liiIiiIIIl = 1;
      this.iiiIiiIIIl = 0;
   }

   public String iIlIlllllill() {
      String var10000;
      switch (this.IliIiiIIIl.ordinal()) {
         case 0 -> var10000 = this.iliIiiIIIl;
         case 1 -> var10000 = this.IiiIiiIIIl + IIIllIIliIIl<invokedynamic>() + IliiiiIilliiiiIi.iliIiiliiiii(this.liiIiiIIIl) + IIIllIIliIIl<invokedynamic>();
         case 2 -> var10000 = IIIllIIliIIl<invokedynamic>();
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      String var1 = var10000;
      String var2 = (this.lliIiiIIIl == lilIilIiiilIilIi.lliIIllIIi || this.lliIiiIIIl == lilIilIiiilIilIi.IIIlIllIIi) && this.iiiIiiIIIl > 0 ? IIIllIIliIIl<invokedynamic>() + this.iiiIiiIIIl + IIIllIIliIIl<invokedynamic>() : "";
      return var1 + IIIllIIliIIl<invokedynamic>() + this.lliIiiIIIl + var2;
   }

   public static llIIiliilIIili IliIlllilIi(String action, lilIilIiiilIilIi keepAmount, int item) {
      llIIiliilIIili var3 = new llIIiliilIIili();
      var3.IliIiiIIIl = llilIlilililIlil.lliilIiIil;
      var3.iliIiiIIIl = action;
      var3.lliIiiIIIl = keepAmount;
      var3.iiiIiiIIIl = item;
      return var3;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - '魗'))) - var5))) ^ 32254) + 16001) + var5) ^ '蓅') + 13056) + var5) + var5) + 5509));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') << 1))) ^ '틤') >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') << 1))) ^ '틤') << 11) - var5) - '\uea9b') ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') << 1))) ^ '틤') >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11))) + var5) + '좭') ^ var5) + '鉭') << 1))) ^ '틤') << 11) - var5) - '\uea9b') ^ var5) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IilliliilIIi(class_1799 enchantName, String minLevel, int stack) {
      if (enchantName != null && !enchantName.method_7960() && enchantName.method_31574(class_1802.field_8598)) {
         class_9304 var3 = (class_9304)enchantName.method_58695(class_9334.field_49643, class_9304.field_49385);

         for(class_6880 var5 : var3.method_57534()) {
            if (IliiiiIilliiiiIi.iIlIlllllill(var5, minLevel) && var3.method_57536(var5) >= stack) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.iIiIiiIIIl);
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.IliIiiIIIl.name());
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.lliIiiIIIl.name());
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.iliIiiIIIl);
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.IiiIiiIIIl);
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.liiIiiIIIl);
      var1.addProperty(IIIllIIliIIl<invokedynamic>(), this.iiiIiiIIIl);
      return var1;
   }

   public static llIIiliilIIili iliIiiliiiii(JsonObject o) {
      llIIiliilIIili var1 = new llIIiliilIIili();

      try {
         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.iIiIiiIIIl = o.get(IIIllIIliIIl<invokedynamic>()).getAsBoolean();
         }

         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.IliIiiIIIl = llilIlilililIlil.valueOf(o.get(IIIllIIliIIl<invokedynamic>()).getAsString());
         }

         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.lliIiiIIIl = lilIilIiiilIilIi.valueOf(o.get(IIIllIIliIIl<invokedynamic>()).getAsString());
         }

         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.iliIiiIIIl = o.get(IIIllIIliIIl<invokedynamic>()).getAsString();
         }

         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.IiiIiiIIIl = o.get(IIIllIIliIIl<invokedynamic>()).getAsString();
         }

         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.liiIiiIIIl = o.get(IIIllIIliIIl<invokedynamic>()).getAsInt();
         }

         if (o.has(IIIllIIliIIl<invokedynamic>())) {
            var1.iiiIiiIIIl = o.get(IIIllIIliIIl<invokedynamic>()).getAsInt();
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6755176011875799405L ^ Long.rotateLeft(3842407340474925855L, 46) ^ 2113955102099326477L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -136919980827818335L ^ Long.rotateLeft(-8673390795854836721L, 36) ^ -6952992350965441407L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5933850216838284789L ^ Long.rotateLeft(5236670142153283670L, 7) ^ -3411560200909329056L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2447914434499177322L ^ Long.rotateLeft(8096579404263436069L, 36) ^ 8235429576429745373L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1313766063091512521L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1534484531463965748L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5372260810579645748L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4354286740838576665L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8364021826581598148L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8703639167752972936L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illlllllilll<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) ^ var5) + 10700) + 22406) + var5) + '\uf2fe') - var5) ^ 13265))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) ^ var5) + 10700) + 22406) + var5) + '\uf2fe') - var5) ^ 13265))) << 4) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
