package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
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
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_746;

final class llIliiiilIliii implements lIliiliiIliili {
   private final lilllllliillllll IIilIIIlIl;
   private final illillIlIilillIl lIilIIIlIl;

   public void IIillIiliIil(float pitch, float yaw) {
      this.IIilIIIlIl.iliIiiliiiii(pitch, yaw);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) << 5 | (char)(var4[var5] - var5) >>> 11) + 'ꝡ') + var5))) + var5))) + var5) - 'ꆗ') + '턇'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iliIiiliiiii(class_2338 pos) {
      long var9 = -5397148318030337409L;
      long var11 = -5292766180752496118L;
      long var13 = 7604781076280580138L;
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && pos != null) {
         class_243 var3 = var2.method_73189();
         var9 ^= ((long)((int)Math.floor(var3.field_1351 + 1.0E-4)) << 32 ^ var9) & -1L << 32;
         if (pos.method_10264() != (int)(var9 >>> 32) - 1) {
            return false;
         } else {
            var9 ^= ((long)((int)Math.floor(var3.field_1352 - 0.31)) ^ var9) & -1L >>> 32;
            var11 ^= ((long)((int)Math.floor(var3.field_1352 + 0.31)) << 32 ^ var11) & -1L << 32;
            var11 ^= ((long)((int)Math.floor(var3.field_1350 - 0.31)) ^ var11) & -1L >>> 32;
            var13 ^= ((long)((int)Math.floor(var3.field_1350 + 0.31)) << 32 ^ var13) & -1L << 32;
            return pos.method_10263() >= (int)var9 && pos.method_10263() <= (int)(var11 >>> 32) && pos.method_10260() >= (int)var11 && pos.method_10260() <= (int)(var13 >>> 32);
         }
      } else {
         return false;
      }
   }

   public boolean IiIlliIliiIl(class_2338 yaw, class_2350 pos, float face, float pitch) {
      return IiIiiiilliIiiiil.IliIlllilIi(yaw, pos, (double)4.5F, face, pitch) != null;
   }

   public float IIlllIlliIll() {
      return this.IIilIIIlIl.IliIlllilIi();
   }

   public int IlIillIiilIi() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 == null ? -1 : var1.method_31548().method_67532();
   }

   public Object IiIiliIiiiIi() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 == null ? class_1799.field_8037 : var1.method_6047().method_7972();
   }

   public IIIIiiIllIIIiiIl IlIlllIlilIl(class_2338 yaw, float pos, float pitch) {
      class_3965 var4 = IiIiiiilliIiiiil.liiiIIllIl(yaw, iiilIIiIIIiIIi.iIIlliiliIlIlliili, (class_2350)null, (double)4.5F, pos, pitch);
      return var4 == null ? null : new IIIIiiIllIIIiiIl(var4.method_17780(), var4.method_17784());
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) >>> 1 | (char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) << 15) + '\ueed6') ^ 5814) + var5) >>> 14 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) >>> 1 | (char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) << 15) + '\ueed6') ^ 5814) + var5) << 2) + var5) ^ '왪') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) >>> 1 | (char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) << 15) + '\ueed6') ^ 5814) + var5) >>> 14 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) >>> 1 | (char)(-((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5))) << 15) + '\ueed6') ^ 5814) + var5) << 2) + var5) ^ '왪') >>> 14) ^ var5) + 6151));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IIIllIIliIIl(class_2338 pos) {
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && pos != null) {
         class_243 var3 = var2.method_33571();
         double var4 = Math.max((double)0.0F, Math.max((double)pos.method_10263() - var3.field_1352, var3.field_1352 - ((double)pos.method_10263() + (double)1.0F)));
         double var6 = Math.max((double)0.0F, Math.max((double)pos.method_10264() - var3.field_1351, var3.field_1351 - ((double)pos.method_10264() + (double)1.0F)));
         double var8 = Math.max((double)0.0F, Math.max((double)pos.method_10260() - var3.field_1350, var3.field_1350 - ((double)pos.method_10260() + (double)1.0F)));
         return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
      } else {
         return Double.MAX_VALUE;
      }
   }

   public boolean Illillliilli() {
      class_310 var1 = class_310.method_1551();
      return var1.field_1761 != null && var1.field_1761.method_2923();
   }

   public float[] Iilllilliill(class_243 point) {
      return this.IIilIIIlIl.IlIillIiilIi(point);
   }

   public boolean IliIlllilIi() {
      class_310 var1 = class_310.method_1551();
      return var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null;
   }

   public float Illlllllilll() {
      return this.IIilIIIlIl.liiiIIllIl();
   }

   public boolean IIIilIIiiIIi(int slot) {
      return this.IIilIIIlIl.IIIilIIiiIIi(slot);
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 27797) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ 27797) ^ var5) << 12) - 11698) << 3 | (char)((char)((char)((char)(var4[var5] ^ 27797) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ 27797) ^ var5) << 12) - 11698) >>> 13))))) - var5) ^ var5) >>> 4 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 27797) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ 27797) ^ var5) << 12) - 11698) << 3 | (char)((char)((char)((char)(var4[var5] ^ 27797) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ 27797) ^ var5) << 12) - 11698) >>> 13))))) - var5) ^ var5) << 12) - var5) ^ var5) - 27862));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli(class_2338 pos) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1687 != null && pos != null) {
         class_2680 var3 = var2.field_1687.method_8320(pos);
         return var3.method_26215() || var3.method_51176();
      } else {
         return true;
      }
   }

   public boolean Iiilliiliiil() {
      return this.IIilIIIlIl.iIlIlllllill() && (this.lIilIIIlIl.iIlIlllllill() || Iiiiliiiiiii<invokedynamic>().equals(this.lIilIIIlIl.IIillIiliIil()));
   }

   public boolean iIlIlllllill() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 != null && var1.method_24828();
   }

   public long liiiIIllIl() {
      return this.IIilIIIlIl.IIillIiliIil();
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)((char)(var4[var5] ^ 20614) + 8673) + 28922))) >>> 5 | (char)(~((char)((char)((char)(var4[var5] ^ 20614) + 8673) + 28922))) << 11))))) ^ var5) >>> 2 | (char)((char)(~((char)(~((char)((char)(~((char)((char)((char)(var4[var5] ^ 20614) + 8673) + 28922))) >>> 5 | (char)(~((char)((char)((char)(var4[var5] ^ 20614) + 8673) + 28922))) << 11))))) ^ var5) << 14) + '蝽') + var5) + var5) ^ var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIiilIiiiIii() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1761 != null) {
         try (IlIIiiIillIIiiIi var2 = this.lIilIIIlIl.IIlllIlliIll()) {
            var1.field_1761.method_2925();
         }

      }
   }

   public boolean IIlilIliiIli(Object snapshot) {
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && snapshot instanceof class_1799 var3) {
         return class_1799.method_31577(var3, var2.method_6047());
      } else {
         return false;
      }
   }

   public boolean IilliliilIIi() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 != null && var1.method_6115();
   }

   llIliiiilIliii(lilllllliillllll gates, illillIlIilillIl host) {
      this.IIilIIIlIl = gates;
      this.lIilIIIlIl = host;
   }

   public boolean Iliilliiilii(class_2338 pos, int elapsed) {
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && var3.field_1761 != null && pos != null) {
         float var5 = var3.field_1687.method_8320(pos).method_26165(var4, var3.field_1687, pos);
         float var6 = ((AccessorClientPlayerInteractionManager)var3.field_1761).corzBreakingProgress();
         return iiilIIiIIIiIIi.IliIlllilIi(var6, var5, elapsed);
      } else {
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) + var5) - var5) ^ var5))) + var5) - var5) + '\ueb38'))) ^ '鞂') ^ var5))) >>> 3 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) + var5) - var5) ^ var5))) + var5) - var5) + '\ueb38'))) ^ '鞂') ^ var5))) << 13) ^ var5) - 32119));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iilililiiili(class_2338 pos, class_2350 face) {
      long var8 = 4948156579517594340L;
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1761 != null) {
         try (IlIIiiIillIIiiIi var5 = this.lIilIIIlIl.IIlllIlliIll()) {
            if (var3.field_1761.method_2902(pos, face)) {
               var4.method_6104(class_1268.field_5808);
               var8 ^= (4294967296L ^ var8) & -1L << 32;
               return (boolean)((int)(var8 >>> 32));
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean Ililllililil() {
      return this.IIilIIIlIl.iIlIlllllill() && this.lIilIIIlIl.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7624581999307190855L ^ Long.rotateLeft(-5475380467097593085L, 61) ^ -3159710115896993333L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8896975412476012800L ^ Long.rotateLeft(-7571906206651579905L, 7) ^ 5505120696616229418L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7263350405936977318L ^ Long.rotateLeft(-8228913169676507837L, 35) ^ 8251607067590539814L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6402073551268099550L ^ Long.rotateLeft(7292355421579953372L, 54) ^ -8953395674116140284L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2891177630221953715L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7282771598758929056L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3823925698950834745L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8541502026165497138L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8017390123538692223L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6500915372507060236L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIIllIIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIIIlIlIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, llIIlilIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiIIlliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiIIlIIlIl<invokedynamic>());
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
