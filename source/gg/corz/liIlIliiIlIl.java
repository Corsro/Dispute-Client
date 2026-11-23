package gg.corz;

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
import net.minecraft.class_2960;

public record liIlIliiIlIl(String id, illIIlIiIilIIlIi kind, String name, String code, String tagline, class_2960 icon, class_2960 padItem, class_2960 potion, class_2960 skin, class_2960 eyes, class_2960 core, boolean slim, class_2960 mainHand, class_2960 offHand, boolean planned, boolean glint, boolean villager, iliIIIIiIiiIIIIi act) {
   private final class_2960 illliIllIilliIll;
   private final boolean ilIiiIllIiIiiIll;
   private final String iIIliIllIlIliIll;
   private final boolean liIiiIlliiIiiIll;
   public static final String IiliiIllliliiIll = "_eyes";
   private final class_2960 iIiliIllIliliIll;
   private final boolean IlIiiIllllIiiIll;
   private final class_2960 iiiliIllIIIiiIll;
   public static final class_2960 IliiiIlllliiiIll = class_2960.method_60656(lilIliilIl<invokedynamic>());
   private final class_2960 lIIiiIlliIIiiIll;
   private final illIIlIiIilIIlIi llIliIllilIliIll;
   private final String IiIliIllliIliIll;
   private final class_2960 IllliIlllllliIll;
   private final String iiIliIllIIlliIll;
   public static final String iIliiIllIlliiIll = "corzclient";
   public static final String llliiIllilliiIll = "textures/bots/";
   private final iliIIIIiIiiIIIIi IIliiIlllIliiIll;
   public static final String lIiiiIlliIiiiIll = "cpx01";
   private final class_2960 IIiliIlllIiliIll;
   public static final String iiliiIllIIiiiIll = "_core";
   private final String lIlliIlliIlliIll;
   private final class_2960 lliliIllililiIll;
   private final class_2960 lilliIlliilliIll;
   private final boolean IiiliIllliiliIll;

   public boolean iIlIlllllill() {
      return this.IIliiIlllIliiIll == iliIIIIiIiiIIIIi.ilIIIIliil;
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) + var5) >>> 14 | (char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) + var5) << 2) ^ var5) + 199) ^ var5) - var5))) + '켬'))) + '胊'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_2960 Illillliilli() {
      return this.IllliIlllllliIll;
   }

   public String Iiilliiliiil() {
      return this.iIIliIllIlIliIll;
   }

   public String IiIiliIiiiIi() {
      return this.iiIliIllIIlliIll;
   }

   public class_2960 Iiiiliiiiiii() {
      return this.iIiliIllIliliIll;
   }

   public String IIlilIliiIli() {
      return this.lIlliIlliIlliIll;
   }

   public class_2960 IIiilIiiiIii() {
      return this.lilliIlliilliIll;
   }

   public class_2960 IIIIllIIIl() {
      return this.lliliIllililiIll;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5396829512403545446L ^ Long.rotateLeft(1144287545228368796L, 50) ^ 3606579304521026937L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7066317969607606810L ^ Long.rotateLeft(-7029453747936497340L, 41) ^ 5749227351829073842L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3677796533952041378L ^ Long.rotateLeft(272331667553240709L, 43) ^ 98278726997209429L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3182803387899460555L ^ Long.rotateLeft(-2749689325600967737L, 37) ^ -2364656773007666825L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6974023461946840660L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -571392140491109053L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6551421229384237250L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8488504603990172564L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8850386363390195573L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2169146590460354715L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiIllIiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIiIlIliIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lliIliliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiiIlliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiiIlIIIll<invokedynamic>());
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

   public liIlIliiIlIl IIillIiliIil(String icon, String potion) {
      return new liIlIliiIlIl(this.iIIliIllIlIliIll, this.llIliIllilIliIll, this.IiIliIllliIliIll, this.iiIliIllIIlliIll, this.lIlliIlliIlliIll, lIiiIiIlilli(icon), this.illliIllIilliIll, lIiiIiIlilli(potion), this.IIiliIlllIiliIll, this.iIiliIllIliliIll, this.lliliIllililiIll, this.IiiliIllliiliIll, this.iiiliIllIIIiiIll, this.lIIiiIlliIIiiIll, this.IlIiiIllllIiiIll, this.ilIiiIllIiIiiIll, this.liIiiIlliiIiiIll, this.IIliiIlllIliiIll);
   }

   public boolean lIlIliIlIl() {
      return this.ilIiiIllIiIiiIll;
   }

   public static liIlIliiIlIl IiIlliIliiIl(String tagline, String id, String code, String skinKey, String item) {
      class_2960 var5 = lIiiIiIlilli(item);
      return new liIlIliiIlIl(tagline, illIIlIiIilIIlIi.iIIliiiiil, (String)null, id, code, var5, (class_2960)null, (class_2960)null, IilliliilIIi(skinKey), IilliliilIIi(skinKey + lilIliilIl<invokedynamic>()), IilliliilIIi(skinKey + lilIliilIl<invokedynamic>()), false, var5, (class_2960)null, false, false, false, iliIIIIiIiiIIIIi.ilIIIIliil);
   }

   public static class_2960 lIiiIiIlilli(String id) {
      return id == null ? null : class_2960.method_60654(id);
   }

   public boolean iiIIlIIlIl() {
      return this.IlIiiIllllIiiIll;
   }

   public class_2960 IiIIlliIIl() {
      return this.lIIiiIlliIIiiIll;
   }

   public boolean IllIllllIl() {
      return this.liIiiIlliiIiiIll;
   }

   public boolean iIIIlIlIIl() {
      return this.IiiliIllliiliIll;
   }

   public static liIlIliiIlIl IIIllIIliIIl(String mainHand, String tagline, String id, String code, String skinKey) {
      class_2960 var5 = lIiiIiIlilli(skinKey);
      return new liIlIliiIlIl(mainHand, illIIlIiIilIIlIi.lIIliiiiil, (String)null, tagline, id, var5, (class_2960)null, (class_2960)null, IilliliilIIi(code), (class_2960)null, (class_2960)null, false, var5, (class_2960)null, false, false, false, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   public static liIlIliiIlIl iliIiiliiiii(String code, String tagline, String offHand, String skinKey, String id, String mainHand) {
      class_2960 var6 = lIiiIiIlilli(id);
      return new liIlIliiIlIl(code, illIIlIiIilIIlIi.lIIliiiiil, (String)null, tagline, offHand, var6, (class_2960)null, (class_2960)null, IilliliilIIi(skinKey), IilliliilIIi(skinKey + lilIliilIl<invokedynamic>()), IilliliilIIi(skinKey + lilIliilIl<invokedynamic>()), false, var6, lIiiIiIlilli(mainHand), false, false, false, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(var4[var5] ^ 28999))))) - 31315))) - 30254) + 3054) ^ var5) + 26411) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(var4[var5] ^ 28999))))) - 31315))) - 30254) + 3054) ^ var5) + 26411) >>> 10) - 13893));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) >>> 13 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) << 3) + var5) ^ 9456) - var5))) << 8 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) >>> 13 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) << 3) + var5) ^ 9456) - var5))) >>> 8) >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) >>> 13 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) << 3) + var5) ^ 9456) - var5))) << 8 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) >>> 13 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) >>> 5 | (char)((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ var5))) - 13162) << 11) + 29828))) << 3) + var5) ^ 9456) - var5))) >>> 8) << 8) ^ var5))) ^ '벡'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static liIlIliiIlIl IlIlllIlilIl(String mainHand, String tagline, String skinKey, String icon, String id, String code) {
      return new liIlIliiIlIl(mainHand, illIIlIiIilIIlIi.iIIliiiiil, (String)null, tagline, skinKey, lIiiIiIlilli(id), (class_2960)null, (class_2960)null, IilliliilIIi(icon), (class_2960)null, (class_2960)null, false, lIiiIiIlilli(code), (class_2960)null, false, false, false, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   public boolean IliIlllilIi() {
      return this.IIiliIlllIiliIll != null;
   }

   public boolean liiiIIllIl() {
      return this.llIliIllilIliIll == illIIlIiIilIIlIi.lIIliiiiil;
   }

   public class_2960 Iilililiiili() {
      return this.illliIllIilliIll;
   }

   public class_2960 llIIlilIIl() {
      return this.iiiliIllIIIiiIll;
   }

   public static liIlIliiIlIl Illlllllilll(String code, String tagline, String padItem, String id) {
      class_2960 var4 = lIiiIiIlilli(id);
      return new liIlIliiIlIl(code, illIIlIiIilIIlIi.iIIliiiiil, (String)null, tagline, padItem, var4, var4, (class_2960)null, (class_2960)null, (class_2960)null, (class_2960)null, false, (class_2960)null, (class_2960)null, false, false, false, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   public String IlIillIiilIi() {
      return this.IiIliIllliIliIll;
   }

   public iliIIIIiIiiIIIIi illIlIilIl() {
      return this.IIliiIlllIliiIll;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ '荖') >>> 1 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ '荖') << 15) + 'ꁒ') + var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ '荖') >>> 1 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ '荖') << 15) + 'ꁒ') + var5) >>> 3) ^ '쀇') + 26276) - var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) ^ var5))) + 5586) + '툤'))))) + 24745) ^ '覷') + 19068) + 7693) << 8 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) ^ var5))) + 5586) + '툤'))))) + 24745) ^ '覷') + 19068) + 7693) >>> 8) - '좆'))) ^ var5) - var5) + 27168) - 20081));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static liIlIliiIlIl IIlllIlliIll(String code, String icon, String tagline, String id) {
      return new liIlIliiIlIl(code, illIIlIiIilIIlIi.iIIliiiiil, (String)null, icon, tagline, lIiiIiIlilli(id), (class_2960)null, (class_2960)null, IliiiIlllliiiIll, (class_2960)null, (class_2960)null, false, (class_2960)null, (class_2960)null, false, false, true, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   public class_2960 Iliilliiilii() {
      return this.IIiliIlllIiliIll;
   }

   public liIlIliiIlIl(String kind, illIIlIiIilIIlIi name, String core, String skin, String act, class_2960 glint, class_2960 id, class_2960 villager, class_2960 padItem, class_2960 potion, class_2960 eyes, boolean slim, class_2960 icon, class_2960 mainHand, boolean code, boolean tagline, boolean offHand, iliIIIIiIiiIIIIi planned) {
      this.iIIliIllIlIliIll = kind;
      this.llIliIllilIliIll = name;
      this.IiIliIllliIliIll = core;
      this.iiIliIllIIlliIll = skin;
      this.lIlliIlliIlliIll = act;
      this.IllliIlllllliIll = glint;
      this.illliIllIilliIll = id;
      this.lilliIlliilliIll = villager;
      this.IIiliIlllIiliIll = padItem;
      this.iIiliIllIliliIll = potion;
      this.lliliIllililiIll = eyes;
      this.IiiliIllliiliIll = slim;
      this.iiiliIllIIIiiIll = icon;
      this.lIIiiIlliIIiiIll = mainHand;
      this.IlIiiIllllIiiIll = code;
      this.ilIiiIllIiIiiIll = tagline;
      this.liIiiIlliiIiiIll = offHand;
      this.IIliiIlllIliiIll = planned;
   }

   public static liIlIliiIlIl Iilllilliill(String name, String tagline, String id, String code, String offHand, String mainHand) {
      class_2960 var6 = lIiiIiIlilli(offHand);
      return new liIlIliiIlIl(name, illIIlIiIilIIlIi.lIIliiiiil, tagline, id, code, var6, (class_2960)null, (class_2960)null, IilliliilIIi(lilIliilIl<invokedynamic>()), (class_2960)null, (class_2960)null, false, var6, lIiiIiIlilli(mainHand), true, false, false, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   public illIIlIiIilIIlIi IIIilIIiiIIi() {
      return this.llIliIllilIliIll;
   }

   public liIlIliiIlIl Ililllililil() {
      return new liIlIliiIlIl(this.iIIliIllIlIliIll, this.llIliIllilIliIll, this.IiIliIllliIliIll, this.iiIliIllIIlliIll, this.lIlliIlliIlliIll, this.IllliIlllllliIll, this.illliIllIilliIll, this.lilliIlliilliIll, this.IIiliIlllIiliIll, this.iIiliIllIliliIll, this.lliliIllililiIll, this.IiiliIllliiliIll, this.iiiliIllIIIiiIll, this.lIIiiIlliIIiiIll, this.IlIiiIllllIiiIll, true, this.liIiiIlliiIiiIll, this.IIliiIlllIliiIll);
   }

   public static class_2960 IilliliilIIi(String key) {
      return class_2960.method_60655(lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>() + key + lilIliilIl<invokedynamic>());
   }
}
