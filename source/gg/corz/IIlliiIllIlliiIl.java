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
import net.minecraft.class_12392;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_9362;
import net.minecraft.class_9836;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;

public class IIlliiIllIlliiIl extends ilIllIiIll implements ilIIIiiIiIIIii {
   private static final double IliIllIlll = (double)11.5F;
   private boolean iiIlllIlll;
   private float llllllIlll;
   private static final float lIiIllIlll = 0.5F;
   private long lIllllIlll;
   private boolean IillllIlll;
   private static final float iIiIllIlll = 0.9F;
   private boolean liIlllIlll;
   private final iIililIlIlililIl IiIlllIlll = new iIililIlIlililIl();
   private final iiIiiilIIliiil lIIlllIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil llIlllIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil iIIlllIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private long iillllIlll = -1L;
   private final iiIiiilIIliiil IiiIllIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private boolean illlllIlll;
   private final iIiiIiilIliiIiil ilIlllIlll = new iIiiIiilIliiIiil();
   private static final lilllliiilllli lliIllIlll;
   private int lillllIlll = -1;
   private final iiIiiilIIliiil liiIllIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi iliIllIlll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIiiilIIliiil IlIlllIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private int iIllllIlll;
   private final Iiiliillliiliill IIIlllIlll = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.0F, (double)0.0F, (double)0.0F, (double)200.0F, (double)10.0F);
   private float IlllllIlll;
   private final Iiiliillliiliill iiiIllIlll = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.0F, (double)0.0F, (double)-5.0F, (double)10.0F, (double)1.0F);

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1958553464292878679L ^ Long.rotateLeft(-2521244159195444366L, 22) ^ -6724043450744379753L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8460663352820868018L ^ Long.rotateLeft(-4579634927338362113L, 41) ^ 1082299963012612817L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 357073272337252090L ^ Long.rotateLeft(-7700262805174861718L, 33) ^ -2408333175603657514L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 298901734719295361L ^ Long.rotateLeft(3254438340300428694L, 12) ^ -1396874527011979407L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7006948029460014282L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3534465964306927497L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5469615995477973060L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4563337982442702379L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3868447977196066138L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4958868439646743987L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') >>> 8) - var5) + 24226))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') >>> 8) - var5) + 24226))) << 12) << 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') >>> 8) - var5) + 24226))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) >>> 12 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 10258))) + var5) - '請') - var5))))) << 4))) << 10) + var5) - '\ue8cf') >>> 8) - var5) + 24226))) << 12) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean Iillllilll(class_1309 e) {
      return this.iIIlllIlll.Iilllilliill() && this.llIililIil(e);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) << 2 | (char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) >>> 14) >>> 1 | (char)((char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) << 2 | (char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) >>> 14) << 15) << 8 | (char)((char)((char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) << 2 | (char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) >>> 14) >>> 1 | (char)((char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) << 2 | (char)((char)((char)(var4[var5] + 20881) >>> 13 | (char)(var4[var5] + 20881) << 3) ^ var5) >>> 14) << 15) >>> 8) ^ '\uf8c5') - 20182) ^ 8178) ^ '鳛') + '\udf3a') ^ var5) - '퍉') ^ '눤') ^ var5))) + var5))) - 31965));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void lilIliilIl(IiiIlllliiIlll event) {
      if (event.liiiIIllIl() == ((849407967 * -678152731 << 5 | 849407967 * -678152731 >>> 27) ^ 829927283) && Iiiilllliiilll.field_1690 != null) {
         if (IillIIIllillIIIl.iIlIlllllill(Iiiilllliiilll.field_1690.field_1886, event.IliIlllilIi())) {
            this.iiiIlIIIll();
         }

      }
   }

   private lilllliiilllli iilllIIill() {
      String var1 = this.iliIllIlll.Iilllilliill();
      byte var2 = -1;
      switch (var1.hashCode()) {
         case 2403731:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case 2024244918:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
      }

      lilllliiilllli var10000;
      switch (var2) {
         case 0 -> var10000 = lilllliiilllli.IIliIiIIIl;
         case 1 -> var10000 = lliIllIlll;
         default -> var10000 = lilllliiilllli.iiIiIiIIIl;
      }

      return var10000;
   }

   static {
      lliIllIlll = lilllliiilllli.IIliIiIIIl.IliIlllilIi(false);
   }

   public int liIlliiIll() {
      return ~(610037429 * -97 + 93) ^ -955911228;
   }

   protected void Illillliilli() {
      this.lililiilil();
   }

   private void iiIilIIlil(class_746 player, long now) {
      long var7 = 5452175052827373460L;
      var7 ^= ((long)player.field_6235 << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) > this.iIllllIlll) {
         class_1282 var5 = player.method_6081();
         class_1297 var6 = var5 == null ? null : var5.method_5529();
         if (var6 != null && var6 != player) {
            this.IiIlllIlll.IliIlllilIi(var6.method_5628(), now);
         }
      }

      this.iIllllIlll = (int)(var7 >>> 32);
   }

   private boolean iIIilIlIil(class_1309 target) {
      return lliillliliilll.IilliliilIIi(Iiiilllliiilll.field_1724.method_6047()) || iIIiIlIiIlIiIlIi.iIlIlllllill(target);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 21878) >>> 15 | (char)(var4[var5] - 21878) << 1) - '\ue20e') - 25202))) ^ var5) >>> 3 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - 21878) >>> 15 | (char)(var4[var5] - 21878) << 1) - '\ue20e') - 25202))) ^ var5) << 13))) >>> 15 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 21878) >>> 15 | (char)(var4[var5] - 21878) << 1) - '\ue20e') - 25202))) ^ var5) >>> 3 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - 21878) >>> 15 | (char)(var4[var5] - 21878) << 1) - '\ue20e') - 25202))) ^ var5) << 13))) << 1) - 2813))))) - 'ꆺ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lIilliIill(class_1309 target) {
      long var3 = 5065259597488963180L;
      if (!this.Ilillllill()) {
         return false;
      } else {
         var3 ^= ((long)this.liilliiill(target) << 32 ^ var3) & -1L << 32;
         if (this.lIIlllIlll.Iilllilliill() && (int)(var3 >>> 32) == 0 && !this.ilillIiill()) {
            return false;
         } else {
            return (int)(var3 >>> 32) != 0 || Iiiilllliiilll.field_1724.method_7261(0.5F - this.llllllIlll) >= 1.0F;
         }
      }
   }

   protected void IllIllllIl(IiiiIIIlliiiIIIl event) {
      if (event.liiiIIllIl() == (-(~1351194245) * -373475417 ^ 805698411) && Iiiilllliiilll.field_1690 != null) {
         if (IillIIIllillIIIl.liiiIIllIl(Iiiilllliiilll.field_1690.field_1886, event.IliIlllilIi())) {
            this.iiiIlIIIll();
         }

      }
   }

   protected void Iilililiiili() {
      this.lililiilil();
   }

   private float Illillllil() {
      return ilIIIillIiIIIill.lIiiIiIlilli(this.iiiIllIlll.Iilllilliill(), this.iiiIllIlll.Ililllililil(), ThreadLocalRandom.current().nextDouble());
   }

   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1690 != null) {
         long var2 = System.nanoTime() / 1000000L;
         long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
         this.iiIilIIlil(var1, var2);
         this.lIliliIlil(var1);
         if (!class_9362.method_58659(var1)) {
            this.illlllIlll = false;
         }

         if (this.iiIlllIlll && var4 > this.lIllllIlll + 1L) {
            this.iiIlllIlll = false;
         }

         boolean var6 = IillIIIllillIIIl.IliIlllilIi(Iiiilllliiilll.field_1690.field_1886);
         if (this.liIlllIlll && !var6) {
            this.liIlllIlll = false;
            if (this.IiiIllIlll.Iilllilliill()) {
               this.IiIlllIlll.IilliliilIIi();
            }
         } else if (!this.liIlllIlll && var6 && Iiiilllliiilll.field_1755 == null) {
            this.liIlllIlll = true;
         }

         if (!this.IlIlllIlll.Iilllilliill()) {
            this.IiIlllIlll.IilliliilIIi();
         }

         if (!this.IlIllllIll(true)) {
            this.ilIlllIlll.liiiIIllIl();
         } else {
            class_1309 var7 = this.IiIilliIil();
            if (var7 != null && this.lllllillll(var7)) {
               if (!this.IlIlllIlll.Iilllilliill() || this.IiIlllIlll.liiiIIllIl(var7.method_5628(), var2)) {
                  if (this.ilIlllIlll.IliIlllilIi(var7.method_5628(), var2, this::illilIilil)) {
                     if (!this.ilIllIiIll(var1) && this.lIilliIill(var7)) {
                        if (IIllIIlilIllIIli.IIlllIlliIll(this)) {
                           this.lillllIlll = var7.method_5628();
                           this.iillllIlll = var4;
                        }

                     }
                  }
               }
            } else {
               this.ilIlllIlll.liiiIIllIl();
               this.IiIlllIlll.iIlIlllllill(var2);
            }
         }
      } else {
         this.lililiilil();
      }
   }

   private iilllIllIIillIll lIIlliIIll(class_1297 target) {
      long var5 = -2220020147359672311L;
      if (this.iiIlllIlll && this.IiiIllIlll.Iilllilliill() && this.liiIllIlll.Iilllilliill() && this.IlIllllIll(false)) {
         class_1309 var10000;
         label43: {
            var5 ^= ((long)(target != null || Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() != class_240.field_1333 ? 0 : 1) << 32 ^ var5) & -1L << 32;
            if (target instanceof class_1309) {
               class_1309 var4 = (class_1309)target;
               if (this.iIlllIllll(var4)) {
                  var10000 = var4;
                  break label43;
               }
            }

            var10000 = null;
         }

         class_1309 var3 = var10000;
         var5 ^= ((long)(var3 != null && !this.Iillllilll(var3) && this.lIilliIill(var3) ? 1 : 0) ^ var5) & -1L >>> 32;
         return ilIIIillIiIIIill.IilliliilIIi((boolean)((int)(var5 >>> 32)), var3 != null, (boolean)((int)var5)) ? iilllIllIIillIll.IiIIIIilll : iilllIllIIillIll.ilIIIIilll;
      } else {
         return iilllIllIIillIll.ilIIIIilll;
      }
   }

   public IIlliiIllIlliiIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iliIllIlll, this.IiiIllIlll, this.liiIllIlll, this.iiiIllIlll, this.IIIlllIlll, this.lIIlllIlll, this.iIIlllIlll, this.IlIlllIlll, this.llIlllIlll});
   }

   private long illilIilil() {
      return (long)Math.round(ilIIIillIiIIIill.lIiiIiIlilli(this.IIIlllIlll.Iilllilliill(), this.IIIlllIlll.Ililllililil(), ThreadLocalRandom.current().nextDouble()));
   }

   private void lililiilil() {
      this.liIlllIlll = false;
      this.iiIlllIlll = false;
      this.lIllllIlll = 0L;
      this.ilIlllIlll.liiiIIllIl();
      this.IiIlllIlll.lIiiIiIlilli();
      this.iIllllIlll = 0;
      this.IlllllIlll = 0.0F;
      this.llllllIlll = this.Illillllil();
      this.illlllIlll = false;
      this.IillllIlll = false;
      this.lillllIlll = -1;
      this.iillllIlll = -1L;
   }

   private boolean IlIllllIll(boolean needActivation) {
      if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_18506() == null && Iiiilllliiilll.method_1569()) {
         if (needActivation && this.IiiIllIlll.Iilllilliill() && !this.liIlllIlll) {
            return false;
         } else {
            return !this.llIlllIlll.Iilllilliill() || lliillliliilll.IliIlllilIi(Iiiilllliiilll.field_1724.method_6047());
         }
      } else {
         return false;
      }
   }

   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      long var5 = -4760090311897115008L;
      if (Iiiilllliiilll.field_1724 == null) {
         return iilllIllIIillIll.ilIIIIilll;
      } else if (target == null) {
         return this.lIIlliIIll(presser);
      } else if (target != this) {
         return iilllIllIIillIll.ilIIIIilll;
      } else {
         var5 ^= ((long)(presser != null && presser.method_5628() == this.lillllIlll && this.iillllIlll == IIllIIlilIllIIli.IlIlllIlilIl() ? 1 : 0) << 32 ^ var5) & -1L << 32;
         this.lillllIlll = -1;
         if ((int)(var5 >>> 32) != 0 && presser instanceof class_1309) {
            class_1309 var4 = (class_1309)presser;
            if (!this.IillllIlll && !Iiiilllliiilll.field_1724.method_6115()) {
               if (this.IlIllllIll(true) && this.lllllillll(var4) && this.lIilliIill(var4)) {
                  return lIIIIIlliIIIIIll.IliIlllilIi(var4) ? iilllIllIIillIll.ilIIIIilll : iilllIllIIillIll.IiIIIIilll;
               }

               return iilllIllIIillIll.IiIIIIilll;
            }
         }

         return iilllIllIIillIll.IiIIIIilll;
      }
   }

   private boolean ilIllIiIll(class_746 player) {
      return player.method_6115() || this.IillllIlll || IIllIIlilIllIIli.IliIlllilIi() || IIllIIlilIllIIli.IiIlliIliiIl() || IIllIIlilIllIIli.iliIiiliiiii() || IIllIIlilIllIIli.IIillIiliIil() || IIIIilIilIIIilIi.lIIlliIIll() || IilIIililIIi.IilliliilIIi() || lIIIIIlliIIIIIll.lIiiIiIlilli();
   }

   private boolean IIIillIIil(class_1309 target) {
      return lliillliliilll.iIlIlllllill(Iiiilllliiilll.field_1724.method_6047()) || iIIiIlIiIlIiIlIi.IilliliilIIi(target);
   }

   private boolean ilillIiill() {
      long var3 = 8435813662089429046L;
      class_746 var1 = Iiiilllliiilll.field_1724;
      var3 ^= ((long)(!var1.method_24828() && !var1.method_6101() && !var1.method_5799() && !var1.method_5771() && !var1.method_5765() && !var1.method_6128() ? 1 : 0) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) == 0) {
         return true;
      } else {
         return var1.field_6017 > Double.longBitsToDouble(2457754070267166912L ^ 2457754070267166912L) && !var1.method_5624() && !var1.method_74025() && var1.method_7261(0.5F) > 0.9F;
      }
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_746 var2 = Iiiilllliiilll.field_1724;
      if (var2 != null && Iiiilllliiilll.method_18854() && !event.lIiiIiIlilli()) {
         class_2596 var3 = event.lIiilIIIIi;
         if (var3 instanceof class_9836) {
            this.IillllIlll = false;
         } else if (!(var3 instanceof class_2885) && !(var3 instanceof class_2886)) {
            if (var3 instanceof class_2846) {
               class_2846 var4 = (class_2846)var3;
               if (var4.method_12363() == class_2847.field_12974) {
                  this.IillllIlll = true;
               }
            } else if (var3 instanceof class_2824) {
               class_2824 var5 = (class_2824)var3;
               if (!IIIliiIilIIliiIi.IliIlllilIi(var5)) {
                  this.IillllIlll = true;
               } else if (class_9362.method_58659(var2) && lliillliliilll.iIlIlllllill(var2.method_6047())) {
                  this.illlllIlll = true;
               }
            }
         } else {
            this.IillllIlll = true;
         }

      }
   }

   private boolean Ilillllill() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (Iiiilllliiilll.field_1771 <= 0 && !var1.method_3144()) {
         class_1799 var2 = var1.method_6047();
         if (var1.method_75202(var2, 0)) {
            return false;
         } else {
            class_12392 var3 = (class_12392)var2.method_58694(class_9334.field_64680);
            class_239 var4 = Iiiilllliiilll.field_1765;
            return var3 == null || var4 == null || var3.method_76736(var1, var4.method_17784());
         }
      } else {
         return false;
      }
   }

   private class_1309 IiIilliIil() {
      class_239 var3 = Iiiilllliiilll.field_1765;
      class_1309 var10000;
      if (var3 instanceof class_3966 var2) {
         class_1297 var4 = var2.method_17782();
         if (var4 instanceof class_1309 var1) {
            var10000 = var1;
            return var10000;
         }
      }

      var10000 = null;
      return var10000;
   }

   private boolean lllllillll(class_1309 e) {
      return this.iIlllIllll(e) && !this.Iillllilll(e);
   }

   private boolean liilliiill(class_1309 target) {
      return !this.illlllIlll && class_9362.method_58659(Iiiilllliiilll.field_1724) ? this.IIIillIIil(target) : false;
   }

   private void lIliliIlil(class_746 player) {
      float var2 = player.method_7261(0.0F);
      if (var2 < this.IlllllIlll) {
         this.llllllIlll = this.Illillllil();
      }

      this.IlllllIlll = var2;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) >>> 14) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) >>> 14) + var5) << 9) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) >>> 14) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5) - '鎉') ^ 19130) - var5) ^ var5) << 14) ^ 15150) + 29022) >>> 14) + var5) << 9) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iIlllIllll(class_1309 e) {
      return liiIIIlliiiIIIll.IliIlllilIi(e, this.iilllIIill()) && e != Iiiilllliiilll.field_1724.method_5854();
   }

   private void iiiIlIIIll() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_18506() == null && !this.liIlllIlll) {
         this.liIlllIlll = true;
         if (this.IiiIllIlll.Iilllilliill() && this.liiIllIlll.Iilllilliill()) {
            this.iiIlllIlll = true;
            this.lIllllIlll = IIllIIlilIllIIli.IlIlllIlilIl();
         }

      }
   }

   private boolean llIililIil(class_1309 e) {
      if (e instanceof class_1657 && e.method_6115()) {
         class_10707 var2 = (class_10707)e.method_6030().method_58694(class_9334.field_56396);
         if (var2 == null) {
            return false;
         } else if (!ilIIIillIiIIIill.liiiIIllIl(e.method_6048(), ilIIIillIiIIIill.IliIlllilIi(illIllilIilIllil.IiIlliIliiIl()), var2.method_67197())) {
            return false;
         } else {
            double var3 = (double)-1.0F;

            for(class_10707.class_10708 var6 : var2.comp_3588()) {
               var3 = Math.max(var3, (double)var6.comp_3638());
            }

            if (var3 < (double)0.0F) {
               return false;
            } else {
               class_243 var8 = e.method_5631(0.0F, e.method_5791());
               class_243 var9 = Iiiilllliiilll.field_1724.method_73189();
               class_243 var7 = e.method_73189();
               if (!ilIIIillIiIIIill.iIlIlllllill(var8.field_1352, var8.field_1350, var9.field_1352 - var7.field_1352, var9.field_1350 - var7.field_1350, var3 + (double)11.5F)) {
                  return false;
               } else {
                  return !this.iIIilIlIil(e);
               }
            }
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ '뾔') - var5) - var5) - '\ue0c2') ^ var5) ^ 12132) + var5))) ^ var5) + 32589) << 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ '뾔') - var5) - var5) - '\ue0c2') ^ var5) ^ 12132) + var5))) ^ var5) + 32589) >>> 4) ^ 2261))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
