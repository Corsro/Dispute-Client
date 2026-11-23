package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10707;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_5134;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_9362;

public class lIIiIlIliIIiIlIl extends ilIllIiIll implements lilIliiiilIlii, liliIiliiliIil, ilIIIiiIiIIIii {
   static final String illIIIIiIl = "Pause";
   private final liiIlIIliiiIlIIl llIlIIIiIl = new liiIlIIliiiIlIIl();
   static final long iIiIIIIiIl = 75L;
   private final iilliIlIIiliIl lIIlIIIiIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 90, 0, 100);
   static final int IiiIIIIiIl = 3;
   private long ilIlIIIiIl = Long.MIN_VALUE;
   static final int IIiIIIIiIl = 2;
   private final lliliIIiililiIIi iIIlIIIiIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   static final int iliIIIIiIl = 20;
   private long IiIlIIIiIl = -1L;
   private int liIlIIIiIl = Integer.MIN_VALUE;
   static final long IliIIIIiIl = 100L;
   private static final lilllliiilllli iiiIIIIiIl = new lilllliiilllli(true, true, true, true, true, true);
   private final iIliiiIiIlliiiIi IlIlIIIiIl = new iIliiiIiIlliiiIi();
   static final int liiIIIIiIl = Integer.MIN_VALUE;
   static final long lliIIIIiIl = 1000L;
   static final int lIiIIIIiIl = 10;
   private long iiIlIIIiIl = -1L;
   static final String iilIIIIiIl = "Critical Hits";
   private final lliliIIiililiIIi IIIlIIIiIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   static final String lilIIIIiIl = "KB Reduction";
   static final String IilIIIIiIl = "Normal";

   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 == null) {
         this.IiIilliIil();
      } else {
         this.llIlIIIiIl.liiiIIllIl(var1.method_24828());
      }
   }

   static boolean Illillllil(long hurtMs, long averageHitDelayMs, long now, long sentMs) {
      if (hurtMs >= (6819962821474803304L ^ 6819962821474803304L) && averageHitDelayMs < hurtMs) {
         long var8 = Math.max(1604569925304684884L ^ 1604569925304684848L, Math.min(3890081968263757472L ^ 3890081968263757128L, sentMs + (9094284700497295977L ^ 9094284700497295906L)));
         return now - hurtMs < var8;
      } else {
         return false;
      }
   }

   private static boolean liilliiill(class_746 target, class_1309 player) {
      if (!player.method_6115()) {
         return false;
      } else {
         class_10707 var2 = (class_10707)player.method_6030().method_58694(class_9334.field_56396);
         if (var2 == null) {
            return false;
         } else if (!iIiilIliil(player.method_6048(), illIllilIilIllil.IlIlllIlilIl(), var2.method_67197())) {
            return false;
         } else {
            class_243 var3 = player.method_5631(0.0F, player.method_5791());
            return lliililiil(var3.field_1352, var3.field_1350, target.method_23317() - player.method_23317(), target.method_23321() - player.method_23321());
         }
      }
   }

   static boolean lIliliIlil(double velocityX, double toTargetX, double velocityZ, double toTargetZ) {
      return velocityX * velocityZ + toTargetX * toTargetZ > Double.longBitsToDouble(-302376747448100551L ^ -302376747448100551L);
   }

   protected void Iilililiiili() {
      this.IiIilliIil();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3665064455397172762L ^ Long.rotateLeft(4867048802181696948L, 43) ^ -2127789417811382324L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6878325623511371517L ^ Long.rotateLeft(-5667865050376813703L, 37) ^ -5309220548929062845L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5175487352023818567L ^ Long.rotateLeft(6313841779400196132L, 61) ^ 3594874499991797369L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3171971154855844425L ^ Long.rotateLeft(3230616732683424940L, 1) ^ 2757812514229204803L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1682626448645201111L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5045383787723979462L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6406068415776127800L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4534082007571538268L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6497405396479045088L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -223879477349942955L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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

   static int lililiilil(int ticksSinceHurt, int mirroredTicks) {
      return Math.max(ticksSinceHurt, illilIilil(mirroredTicks));
   }

   private static boolean IIIillIIil(class_746 player) {
      if (!class_9362.method_58659(player)) {
         return false;
      } else {
         for(int var1 = 0; var1 < class_1661.method_7368(); ++var1) {
            if (player.method_31548().method_5438(var1).method_7909() instanceof class_9362) {
               return true;
            }
         }

         return false;
      }
   }

   private static int Ilillllill(class_1309 target) {
      return lililiilil(illIllilIilIllil.Ililllililil(target), illIllilIilIllil.Iilllilliill(target.method_5628()));
   }

   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      long var9 = 3025966151482710418L;
      if (!(presser instanceof class_1309 var3)) {
         return iilllIllIIillIll.ilIIIIilll;
      } else {
         class_746 var4 = Iiiilllliiilll.field_1724;
         if (var4 != null && liiIIIlliiiIIIll.IliIlllilIi(presser, iiiIIIIiIl) && !IIIillIIil(var4)) {
            if (liilliiill(var4, var3)) {
               return iilllIllIIillIll.ilIIIIilll;
            } else {
               long var5 = IIIiillllIIiilll.IliIlllilIi();
               var9 ^= ((long)IliIlllilIi<invokedynamic>().equals(this.IIIlIIIiIl.Iilllilliill()) << 32 ^ var9) & -1L << 32;
               var9 ^= ((long)((int)(var9 >>> 32) != 0 ? this.Iillllilll(var4, var3, var5) : this.lllllillll(var4, var3, var5)) ^ var9) & -1L >>> 32;
               if ((int)var9 == 0) {
                  return iilllIllIIillIll.ilIIIIilll;
               } else {
                  if ((int)(var9 >>> 32) != 0) {
                     this.ilIlIIIiIl = IIllIIlilIllIIli.IlIlllIlilIl();
                     if (target == null || target == IIllIIlilIllIIli.IilliliilIIi()) {
                        iIIilIlIil(var4, var3);
                     }
                  }

                  return iilllIllIIillIll.IiIIIIilll;
               }
            }
         } else {
            return iilllIllIIillIll.ilIIIIilll;
         }
      }
   }

   public lIIiIlIliIIiIlIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIlIIIiIl, this.lIIlIIIiIl, this.iIIlIIIiIl});
   }

   static boolean iIiilIliil(int blockDelayTicks, int marginTicks, int useTicks) {
      return blockDelayTicks + Math.max(0, marginTicks) >= useTicks;
   }

   protected void Illillliilli() {
      this.IiIilliIil();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - var5) - '诈') + '껄') ^ 2758))) + var5) - var5) << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - var5) - '诈') + '껄') ^ 2758))) + var5) - var5) >>> 4) + 32419) - '념') - '엉'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lllllillll(class_746 now, class_1309 player, long target) {
      long var6 = 3688169462171475060L;
      if (!now.method_24828()) {
         return false;
      } else {
         var6 ^= ((long)iiIilIIlil(illIllilIilIllil.IlIlllIlilIl()) << 32 ^ var6) & -1L << 32;
         return Ilillllill(player) <= (int)(var6 >>> 32) && !this.iilllIIill(player, target) ? false : this.lIilliIill(player, -1L);
      }
   }

   private static boolean llIililIil(class_746 player) {
      return player.method_7261(0.5F) > 0.9F && player.field_6017 > Double.longBitsToDouble(-9017234860347249935L ^ -9017234860347249935L) && !player.method_24828() && !player.method_6101() && !player.method_5799() && !player.method_74025() && !player.method_5765() && !player.method_5624();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 8799) - '떨') - var5) ^ 23586) ^ var5) + var5) ^ var5) + 31257) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 8799) - '떨') - var5) ^ 23586) ^ var5) + var5) ^ var5) + 31257) << 13) ^ var5)) - '롃') + var5) ^ var5) + '蟮') ^ var5) + 19933))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IIiillIiil(boolean distance, double invulnerableTicks, double shieldBlocks, int leadTicks, int vanillaRange) {
      return !distance && invulnerableTicks <= shieldBlocks && leadTicks <= vanillaRange;
   }

   static int iiIilIIlil(int expectedHurtTicks) {
      return Math.max(2, expectedHurtTicks + 1);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 10 | (char)((char)(~var4[var5]) ^ var5) << 6) + var5) - var5))) >>> 11 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 10 | (char)((char)(~var4[var5]) ^ var5) << 6) + var5) - var5))) << 5) ^ 'ꎅ') - 27059) - '\ue886'))) + var5))) << 8 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 10 | (char)((char)(~var4[var5]) ^ var5) << 6) + var5) - var5))) >>> 11 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 10 | (char)((char)(~var4[var5]) ^ var5) << 6) + var5) - var5))) << 5) ^ 'ꎅ') - 27059) - '\ue886'))) + var5))) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlllIllll(class_243 newVelocity, boolean explosion) {
      this.llIlIIIiIl.IliIlllilIi();
      this.IiIlIIIiIl = IIIiillllIIiilll.IliIlllilIi();
   }

   private boolean Iillllilll(class_746 now, class_1309 target, long player) {
      long var8 = 8092536689687262379L;
      var8 ^= (0L ^ var8) & -1L << 32;
      if (this.llIlIIIiIl.iIlIlllllill()) {
         if (IliIlllilIi<invokedynamic>().equals(this.iIIlIIIiIl.Iilllilliill())) {
            return false;
         }

         if (now.method_18798().field_1351 > Double.longBitsToDouble(9103766839824916159L ^ 9103766839824916159L)) {
            var8 ^= (4294967296L ^ var8) & -1L << 32;
         } else if (!now.method_24828()) {
            return false;
         }
      }

      class_243 var6 = now.method_18798();
      if (!lIliliIlil(var6.field_1352, var6.field_1350, target.method_23317() - now.method_23317(), target.method_23321() - now.method_23321())) {
         return false;
      } else {
         if ((int)(var8 >>> 32) == 0) {
            var8 ^= ((long)iiIilIIlil(illIllilIilIllil.IlIlllIlilIl()) ^ var8) & -1L >>> 32;
            if (ilillIiill(target) <= (int)var8 && !this.iilllIIill(target, player)) {
               return false;
            }
         }

         return this.lIilliIill(target, (int)(var8 >>> 32) != 0 ? this.IiIlIIIiIl : -1L);
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 8 | (char)((char)(-var4[var5]) - var5) >>> 8) ^ '\uefe2') << 9 | (char)((char)((char)((char)(-var4[var5]) - var5) << 8 | (char)((char)(-var4[var5]) - var5) >>> 8) ^ '\uefe2') >>> 7))) - '\ue0b6'))) << 9 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 8 | (char)((char)(-var4[var5]) - var5) >>> 8) ^ '\uefe2') << 9 | (char)((char)((char)((char)(-var4[var5]) - var5) << 8 | (char)((char)(-var4[var5]) - var5) >>> 8) ^ '\uefe2') >>> 7))) - '\ue0b6'))) >>> 7) + '뀵') - var5) ^ '\udf15') + 'ꓧ') ^ '豯'))) + 25371) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIilliIil() {
      this.IlIlIIIiIl.liiiIIllIl();
      this.llIlIIIiIl.IilliliilIIi();
      this.ilIlIIIiIl = 5607126940710960309L ^ -3616245096143815499L;
      this.IiIlIIIiIl = -1L;
      this.liIlIIIiIl = ~1429290945 * 654471207 + 17 + 57 ^ -334075460;
      this.iiIlIIIiIl = -1L;
   }

   private static void iIIilIlIil(class_746 target, class_1309 player) {
      target.method_23667(class_1268.field_5808, false);
      if (llIililIil(target)) {
         target.method_7277(player);
      }

   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_2596 var3 = event.lIiilIIIIi;
      if (var3 instanceof class_2824 var2) {
         if (!event.lIiiIiIlilli()) {
            if (Iiiilllliiilll != null && Iiiilllliiilll.method_18854() && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               class_746 var6 = Iiiilllliiilll.field_1724;
               class_1297 var4 = Iiiilllliiilll.field_1687 == null ? null : Iiiilllliiilll.field_1687.method_8469(IIIliiIilIIliiIi.liiiIIllIl(var2));
               if (var6 != null && var4 instanceof class_1309) {
                  class_1309 var5 = (class_1309)var4;
                  if (IIiillIiil(liilliiill(var6, var5), liiIIIlliiiIIIll.IIIllIIliIIl(var5), var6.method_45325(class_5134.field_47759), Ilillllill(var5), iiIilIIlil(illIllilIilIllil.IlIlllIlilIl()))) {
                     this.liIlIIIiIl = var5.method_5628();
                     this.iiIlIIIiIl = IIIiillllIIiilll.IliIlllilIi();
                     return;
                  }
               }

               this.liIlIIIiIl = -(1789212993 * -1736263375) ^ 83759503;
               this.iiIlIIIiIl = -1L;
               return;
            }

            return;
         }
      }

   }

   private static int ilillIiill(class_1309 target) {
      return lililiilil(illIllilIilIllil.IIillIiliIil(target), illIllilIilIllil.Iilllilliill(target.method_5628()));
   }

   public boolean IlIllllIll() {
      return this.ilIlIIIiIl == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private boolean iilllIIill(class_1309 target, long now) {
      return target.method_5628() != this.liIlIIIiIl ? false : Illillllil(this.iiIlIIIiIl, illIllilIilIllil.Illlllllilll(target.method_5628()), now, illIllilIilIllil.IIIllIIliIIl());
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '팉') + 'ꇭ') + 1277) + '꼆') + var5) ^ var5) ^ var5) - '낤'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIIlliIIll() {
      return this.ilIlIIIiIl == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private boolean lIilliIill(class_1309 target, long extraStamp) {
      long var4 = Math.max(illIllilIilIllil.Illlllllilll(target.method_5628()), extraStamp);
      return this.IlIlIIIiIl.IliIlllilIi(target.method_5628(), var4, this.lIIlIIIiIl.Iilllilliill(), () -> ThreadLocalRandom.current().nextInt((105617169 - -53) * -65 ^ 1724815198));
   }

   static int illilIilil(int ticksSinceHurt) {
      return ticksSinceHurt == Integer.MAX_VALUE ? 0 : Math.max(0, 10 - ticksSinceHurt);
   }

   static boolean lliililiil(double lookX, double lookZ, double toAttackerX, double toAttackerZ) {
      return lookX * toAttackerX + lookZ * toAttackerZ >= Double.longBitsToDouble(5505573026976283328L ^ 5505573026976283328L);
   }
}
