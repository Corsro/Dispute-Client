package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1914;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public final class lIllIilliIllIill {
   public final int IIIiIilill;
   public final String ilIiIilill;
   public final int IiilIilill;
   public final int IillIilill;
   public final int llllIilill;
   public final int iiilIilill;
   public final boolean iIIiIilill;
   public final class_6880<class_1887> llIiIilill;
   private final String liIiIilill;
   public final class_1792 lillIilill;
   public final int iillIilill;
   public final int IiIiIilill;
   public final int llilIilill;
   public final class_1799 IIilIilill;
   public final class_1792 lIilIilill;
   public final boolean IlIiIilill;
   public final int IlilIilill;
   public final boolean ililIilill;
   public final class_1792 illlIilill;
   public final float liilIilill;
   public final int lIIiIilill;
   public final int iIilIilill;

   public String iliIiiliiiii() {
      long var4 = 7651962781682935092L;
      if (this.IlIiIilill && !this.ilIiIilill.isEmpty()) {
         String var1 = IliiiiIilliiiiIi.lIiiIiIlilli(this.llIiIilill);
         var4 ^= (4294967296L ^ var4) & -1L << 32;

         try {
            if (this.llIiIilill != null) {
               var4 ^= ((long)((class_1887)this.llIiIilill.comp_349()).method_8183() << 32 ^ var4) & -1L << 32;
            }
         } catch (Exception var6) {
            var4 ^= ((long)this.IiIiIilill << 32 ^ var4) & -1L << 32;
         }

         return (int)(var4 >>> 32) > 1 ? var1 + IiIlliIliiIl<invokedynamic>() + IliiiiIilliiiiIi.iliIiiliiiii(this.IiIiIilill) : var1;
      } else {
         return IiiIlliiIl.IlIlllIlilIl(this.lIilIilill);
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) >>> 11) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) >>> 11) >>> 14) - 26342) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) >>> 11) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 15193) - var5) >>> 2 | (char)((char)((char)(~var4[var5]) - 15193) - var5) << 14) + '膆') + 20542) + var5) ^ 27956) - var5) - var5) >>> 11) >>> 14) - 26342) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIllIilliIllIill IliIlllilIi(class_1914 offer, int index) {
      long var17 = 4846553943339615757L;
      long var15 = -4258597919338607067L;
      class_1799 var2 = offer.method_19272();
      class_1799 var3 = offer.method_8247();
      class_1799 var4 = offer.method_8250().method_7972();
      class_1792 var5 = var2.method_7960() ? null : var2.method_7909();
      var15 ^= ((long)var2.method_7947() << 32 ^ var15) & -1L << 32;
      class_1792 var7 = var3.method_7960() ? null : var3.method_7909();
      var15 ^= ((long)(var3.method_7960() ? 0 : var3.method_7947()) ^ var15) & -1L >>> 32;
      class_6880 var9 = null;
      String var10 = "";
      var17 ^= (0L ^ var17) & -1L << 32;
      if (var4.method_31574(class_1802.field_8598)) {
         class_9304 var12 = (class_9304)var4.method_58695(class_9334.field_49643, class_9304.field_49385);
         Iterator var13 = var12.method_57534().iterator();
         if (var13.hasNext()) {
            class_6880 var14 = (class_6880)var13.next();
            var9 = var14;
            var17 ^= ((long)var12.method_57536(var14) << 32 ^ var17) & -1L << 32;
            var10 = IliiiiIilliiiiIi.IilliliilIIi(var14);
         }
      }

      return new lIllIilliIllIill(index, var5, (int)(var15 >>> 32), var7, (int)var15, var4, offer.method_8249(), offer.method_8248(), offer.method_8255(), offer.method_19277(), offer.method_19278(), offer.method_21725(), offer.method_19279(), var9, var10, (int)(var17 >>> 32));
   }

   public boolean IilliliilIIi() {
      return this.lillIilill != null && this.iillIilill > 0;
   }

   public String lIiiIiIlilli() {
      return this.liIiIilill;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) >>> 10 | (char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) << 6) - '\udca1') << 11 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) >>> 10 | (char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) << 6) - '\udca1') >>> 5) << 12 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) >>> 10 | (char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) << 6) - '\udca1') << 11 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) >>> 10 | (char)((char)(~((char)((char)(var4[var5] ^ var5) - var5))) >>> 15 | (char)(~((char)((char)(var4[var5] ^ var5) - var5))) << 1) << 6) - '\udca1') >>> 5) >>> 4) - 4906))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIllIilliIllIill(int disabled, class_1792 secondItem, int maxUses, class_1792 storedEnchant, int uses, class_1799 priceMultiplier, int storedEnchantPath, int specialPrice, boolean output, int merchantXp, float storedEnchantLevel, int firstCount, int firstItem, class_6880<class_1887> secondCount, String demandBonus, int index) {
      long var18 = -1097929238992104529L;
      super();
      this.llllIilill = disabled;
      this.illlIilill = secondItem;
      this.IillIilill = maxUses;
      this.lillIilill = storedEnchant;
      this.iillIilill = uses;
      this.IIilIilill = priceMultiplier;
      this.lIilIilill = priceMultiplier.method_7909();
      this.iIilIilill = priceMultiplier.method_7947();
      this.IlilIilill = storedEnchantPath;
      this.llilIilill = specialPrice;
      this.ililIilill = output;
      this.IiilIilill = merchantXp;
      this.liilIilill = storedEnchantLevel;
      this.iiilIilill = firstCount;
      this.IIIiIilill = firstItem;
      this.iIIiIilill = priceMultiplier.method_31574(class_1802.field_8687);
      this.IlIiIilill = priceMultiplier.method_31574(class_1802.field_8598);
      this.llIiIilill = secondCount;
      this.ilIiIilill = demandBonus;
      this.IiIiIilill = index;
      var18 ^= (0L ^ var18) & -1L << 32;
      if (secondItem == class_1802.field_8687) {
         var18 ^= ((long)maxUses << 32 ^ var18) & -1L << 32;
      } else if (storedEnchant == class_1802.field_8687) {
         var18 ^= ((long)uses << 32 ^ var18) & -1L << 32;
      }

      this.lIIiIilill = (int)(var18 >>> 32);
      this.liIiIilill = IlIlllIlilIl(secondItem) + IiIlliIliiIl<invokedynamic>() + maxUses + IiIlliIliiIl<invokedynamic>() + IlIlllIlilIl(storedEnchant) + IiIlliIliiIl<invokedynamic>() + uses + IiIlliIliiIl<invokedynamic>() + IlIlllIlilIl(this.lIilIilill) + IiIlliIliiIl<invokedynamic>() + this.iIilIilill + (this.IlIiIilill ? IiIlliIliiIl<invokedynamic>() + demandBonus + index : "");
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 28297) + 1162) + var5) ^ var5) + var5) ^ 19966) ^ var5) - '骲') + 22871))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill() {
      return !this.ililIilill && this.liiiIIllIl() > 0;
   }

   private static String IlIlllIlilIl(class_1792 item) {
      return item == null ? IiIlliIliiIl<invokedynamic>() : item.method_7876();
   }

   public int liiiIIllIl() {
      return Math.max(0, this.llilIilill - this.IlilIilill);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4921756662219986561L ^ Long.rotateLeft(-647190011382559309L, 57) ^ 6556389256736473032L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -72541700489498942L ^ Long.rotateLeft(-4356825067861436556L, 61) ^ -1352880250022913221L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3414922682072268985L ^ Long.rotateLeft(2255529853065107425L, 59) ^ 4941546178486873624L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5257029975102249008L ^ Long.rotateLeft(-4624089388123000282L, 10) ^ -6649926665861476226L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1590561495545745936L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7883267331748579309L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5283344218548687058L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2972362178502078581L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2501704866798557766L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4864877909104488079L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIillIiliIil<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) << 10 | (char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) >>> 6) >>> 3 | (char)((char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) << 10 | (char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) >>> 6) << 13) - '\ueb68'))) ^ var5) ^ 7109) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) << 10 | (char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) >>> 6) >>> 3 | (char)((char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) << 10 | (char)(~((char)((char)(~((char)((char)((char)var4[var5] ^ '\ua87b') + var5))) + 617))) >>> 6) << 13) - '\ueb68'))) ^ var5) ^ 7109) ^ var5))) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIIllIIliIIl() {
      StringBuilder var1 = new StringBuilder();
      if (this.illlIilill != null) {
         var1.append(this.IillIilill).append(IiIlliIliiIl<invokedynamic>()).append(IiiIlliiIl.IlIlllIlilIl(this.illlIilill));
      }

      if (this.IilliliilIIi()) {
         var1.append(IiIlliIliiIl<invokedynamic>()).append(this.iillIilill).append(IiIlliIliiIl<invokedynamic>()).append(IiiIlliiIl.IlIlllIlilIl(this.lillIilill));
      }

      return var1.length() == 0 ? IiIlliIliiIl<invokedynamic>() : var1.toString();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') << 2))) ^ '\uda97') >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') << 2))) ^ '\uda97') << 4) ^ 20804) << 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') << 2))) ^ '\uda97') >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) << 5 | (char)((char)((char)(var4[var5] - 19416) << 9 | (char)(var4[var5] - 19416) >>> 7) + 9629) >>> 11) ^ '\ue2ed') << 2))) ^ '\uda97') << 4) ^ 20804) >>> 8) ^ 30048) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
