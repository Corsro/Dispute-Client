package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_5455;
import net.minecraft.class_6796;
import net.minecraft.class_7924;
import net.minecraft.class_2350.class_2351;
import org.joml.Matrix4f;

public class IliiilIllliiilIl extends ilIllIiIll {
   private static final int llliIIiIll = 1;
   private final iiIiiilIIliiil iIllIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IillIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil illlIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int ilIiIIiIll = 5;
   private static final int ililIIiIll = 400;
   private final IilIiililIii iillIIiIll = new IilIiililIii();
   private static final int liliIIiIll = 4;
   private static final int IiilIIiIll = 40;
   private int IlilIIiIll;
   private final iiIiiilIIliiil IlllIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iiIlIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iIIlIIIiIlIlIIIi iIilIIiIll = new iIIlIIIiIlIlIIIi();
   private static final int IlliIIiIll = 0;
   private static final int IiIiIIiIll = 6;
   private int llilIIiIll;
   private final iiIiiilIIliiil IIllIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int illiIIiIll = 2;
   private static final int iiIiIIiIll = 2;
   private static final int IIliIIiIll = 1;
   private static final int llIiIIiIll = 5;
   private static final int liIiIIiIll = 2;
   private static final int iIiiIIiIll = 8;
   private final iiIiiilIIliiil IiIlIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int iiliIIiIll = 5;
   private static final int lIliIIiIll = 14;
   private static final double lIIiIIiIll = (double)72.0F;
   private final iilliIlIIiliIl liIlIIiIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 80, 0, 255);
   private static final int iiilIIiIll = 64;
   private final iiIiiilIIliiil llllIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IlIiIIiIll = 6;
   private static final int IIiiIIiIll = 6;
   private final Long2ObjectOpenHashMap<IIliiIilIliiIi> lIilIIiIll = new Long2ObjectOpenHashMap();
   private static final long liilIIiIll = 15000L;
   private static final int iIIiIIiIll = 10;
   private static final int IIIiIIiIll = 160;
   private static final int IiliIIiIll = 3;
   private final iiIiiilIIliiil lIllIIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl ilIlIIiIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 1, 10);
   private final iilliIlIIiliIl llIlIIiIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 4, 1, 12);
   private static final int iIliIIiIll = 24;
   private static final int lIiiIIiIll = 7;
   private final IIiiIIIllIiiIIIl lillIIiIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final List<iliIiiIiiIii> IIilIIiIll = new ArrayList();

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3301735546142886088L ^ Long.rotateLeft(-290769267075011773L, 26) ^ -8589139100268586507L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3178707739405021973L ^ Long.rotateLeft(-7328026512208966150L, 38) ^ -2736639924403977537L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6910956031422151225L ^ Long.rotateLeft(4251425542242811245L, 29) ^ 834417324930841823L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1711886529025516262L ^ Long.rotateLeft(-8645382780917531368L, 43) ^ 4242671900164804793L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2039054882610052585L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3029983248478477099L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4543376401604387172L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3308349015904839135L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6876338218443834203L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 756519466681554440L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   private static int IIllllIlll(class_2680 doCave, boolean doDeep, boolean st, boolean doAme, boolean doCocoa, boolean doKelp, boolean doVine, boolean doBee, boolean doBamboo) {
      if (doCave.method_26215()) {
         return 0;
      } else if (doDeep && doCave.method_27852(class_2246.field_28888) && doCave.method_28498(class_2741.field_12496) && doCave.method_11654(class_2741.field_12496) != class_2351.field_11052) {
         return 1;
      } else if (st && doCave.method_27852(class_2246.field_27161)) {
         return 2;
      } else if (doAme && iIlllIllll(doCave)) {
         return 3;
      } else if (doCocoa && doCave.method_27852(class_2246.field_10302) && doCave.method_28498(class_2741.field_12556) && (Integer)doCave.method_11654(class_2741.field_12556) == ((-1155792942 * -65 << 25 | -1155792942 * -65 >>> 7) ^ 1560004629)) {
         return 4;
      } else if (doKelp && (doCave.method_27852(class_2246.field_20421) || doCave.method_27852(class_2246.field_20422)) && doCave.method_28498(class_2741.field_20432) && (Integer)doCave.method_11654(class_2741.field_20432) == (-411914466 + 71 + 11 ^ -411914379)) {
         return 5;
      } else if (doVine && doCave.method_27852(class_2246.field_10463)) {
         return (-1335331550 - -103) * 19 ^ 398506285;
      } else if (doBee && doCave.method_27852(class_2246.field_10211) && doCave.method_28498(class_2741.field_12516) && String.valueOf(doCave.method_11654(class_2741.field_12516)).equalsIgnoreCase(IliIlllilIi<invokedynamic>())) {
         return (-1363470919 * -111 >>> 5 | -1363470919 * -111 << 27) ^ 123 ^ 1239878874;
      } else {
         return doBamboo && doCave.method_27852(class_2246.field_10597) ? (1435345780 * -19 >>> 27 | 1435345780 * -19 << 5) ^ -811873124 : 0;
      }
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = this.lIIlliIIll();
         if (var1 != this.llilIIiIll) {
            this.llilIIiIll = var1;
            this.lIilIIiIll.clear();
            this.iIilIIiIll.liiiIIllIl();
         }

         class_1923 var2 = Iiiilllliiilll.field_1724.method_31476();
         int var3 = this.llIlIIiIll.Iilllilliill();
         this.iIilIIiIll.IIlllIlliIll(Iiiilllliiilll.field_1687, var2.field_9181, var2.field_9180, var3, 15000L, iIIlIIIiIlIlIIIi.IliIlllilIi(400), this::IlIllllIll);
         if (++this.IlilIIiIll % 40 == 0) {
            int var4 = var3 + 2;
            ObjectIterator var5 = this.lIilIIiIll.long2ObjectEntrySet().fastIterator();

            while(var5.hasNext()) {
               long var6 = ((Long2ObjectMap.Entry)var5.next()).getLongKey();
               if (Math.abs(class_1923.method_8325(var6) - var2.field_9181) > var4 || Math.abs(class_1923.method_8332(var6) - var2.field_9180) > var4) {
                  var5.remove();
               }
            }

            this.iIilIIiIll.IiIlliIliiIl(var2.field_9181, var2.field_9180, var4 + 2);
         }
      }
   }

   private static boolean iIlllIllll(class_2680 st) {
      return (st.method_27852(class_2246.field_28675) || st.method_27852(class_2246.field_28676)) && st.method_28498(class_2741.field_28716) && (Boolean)st.method_11654(class_2741.field_28716);
   }

   private static class_5321<class_6796> iiiIlIIIll(String id) {
      return class_5321.method_29179(class_7924.field_41245, class_2960.method_60655(IliIlllilIi<invokedynamic>(), id));
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') >>> 2) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') >>> 2) >>> 13) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') >>> 2) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) ^ var5) ^ '蛱') + var5) + 9651) << 6) - var5) ^ 19175) ^ var5) - '\ued95') >>> 2) >>> 13) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) << 5) - 6700) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) << 5) - 6700) ^ var5) >>> 15) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) << 5) - 6700) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) + '\ue6c0') - var5) ^ 3499) ^ var5) << 5) - 6700) ^ var5) >>> 15) << 1) ^ var5) + var5))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') >>> 5) + 29339) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') >>> 5) + 29339) ^ var5) >>> 4) - var5))) + var5) ^ var5))) << 13 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') >>> 5) + 29339) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] + 6091) << 13 | (char)(var4[var5] + 6091) >>> 3))) - 12856) ^ '\ue758') >>> 5) + 29339) ^ var5) >>> 4) - var5))) + var5) ^ var5))) >>> 3) ^ '요') ^ 20598));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int liIlliiIll() {
      long var2 = 1990560047946173283L;
      var2 ^= ((long)this.ilIlIIiIll.Iilllilliill() << 32 ^ var2) & -1L << 32;
      return Math.max(-(-1624502051 * 31 - -111) ^ -1180044088, (~(~551343247) ^ 551343265) - (int)(var2 >>> 32) * 4);
   }

   protected void Iilililiiili() {
      this.lIilIIiIll.clear();
      this.iIilIIiIll.liiiIIllIl();
   }

   private int lllllillll(class_2818 chunk, class_1923 markers, List<int[]> cpos) {
      try {
         Long var4 = IilIiililIii.IliIlllilIi(this.lillIIiIll.Iilllilliill());
         if (var4 != null && Iiiilllliiilll.field_1687 != null) {
            class_5455 var5 = Iiiilllliiilll.field_1687.method_30349();
            int var6 = 0;

            for(iliIiiIiiIii var8 : this.IIilIIiIll) {
               if (var8.IliIlllilIi().Iilllilliill()) {
                  boolean var9 = var8.liiiIIllIl().stream().anyMatch((k) -> k.method_29177().method_12832().contains(IliIlllilIi<invokedynamic>()) || k.method_29177().method_12832().contains(IliIlllilIi<invokedynamic>()));
                  if (var9) {
                     int var10 = 0;
                     int var11 = 0;

                     for(class_5321 var13 : var8.liiiIIllIl()) {
                        for(class_2338 var16 : this.iillIIiIll.liiiIIllIl(Iiiilllliiilll.field_1687, var5, var4, markers.field_9181, markers.field_9180, var13)) {
                           ++var10;
                           if (this.Iillllilll(var16, var8.iIlIlllllill())) {
                              ++var11;
                           } else if (var9 && cpos.size() < 64) {
                              cpos.add(new int[]{var16.method_10263(), var16.method_10264(), var16.method_10260()});
                           }
                        }
                     }

                     if (var9 && var10 > 0 && var11 == 0) {
                        var6 += 14 * Math.min(var10, 3);
                     }
                  }
               }
            }

            return var6;
         } else {
            return 0;
         }
      } catch (Throwable var17) {
         return 0;
      }
   }

   private void IlIllllIll(class_2818 key, long chunk) {
      try {
         IIliiIilIliiIi var4 = this.ilIllIiIll(key, key.method_12004());
         if (var4 != null) {
            this.lIilIIiIll.put(chunk, var4);
         } else {
            this.lIilIIiIll.remove(chunk);
         }
      } catch (Throwable var5) {
         this.lIilIIiIll.remove(chunk);
      }

   }

   private int lIIlliIIll() {
      int var1 = (this.iiIlIIiIll.Iilllilliill() ? 1 : 0) | (this.IIllIIiIll.Iilllilliill() ? 2 : 0) | (this.lIllIIiIll.Iilllilliill() ? 4 : 0) | (this.iIllIIiIll.Iilllilliill() ? 8 : 0) | (this.IlllIIiIll.Iilllilliill() ? 16 : 0) | (this.llllIIiIll.Iilllilliill() ? 32 : 0) | (this.illlIIiIll.Iilllilliill() ? 64 : 0) | (this.IillIIiIll.Iilllilliill() ? 128 : 0) | (this.IiIlIIiIll.Iilllilliill() ? 256 : 0);
      return 31 * (31 * (31 * System.identityHashCode(Iiiilllliiilll.field_1687) + this.lillIIiIll.Iilllilliill().hashCode()) + this.ilIlIIiIll.Iilllilliill()) + var1;
   }

   private IIliiIilIliiIi ilIllIiIll(class_2818 cpos, class_1923 chunk) {
      class_2826[] var3 = cpos.method_12006();
      int var4 = Iiiilllliiilll.field_1687.method_31607();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      ArrayList var13 = new ArrayList();
      int var14 = Integer.MAX_VALUE;
      int var15 = Integer.MIN_VALUE;
      boolean var16 = this.IillIIiIll.Iilllilliill();
      boolean var17 = this.iIllIIiIll.Iilllilliill();
      boolean var18 = this.IIllIIiIll.Iilllilliill();
      boolean var19 = this.llllIIiIll.Iilllilliill();
      boolean var20 = this.illlIIiIll.Iilllilliill();
      boolean var21 = this.iiIlIIiIll.Iilllilliill();
      boolean var22 = this.IlllIIiIll.Iilllilliill();
      boolean var23 = this.lIllIIiIll.Iilllilliill();
      if (!var16 && !var17 && !var18 && !var19 && !var20 && !var21 && !var22 && !var23) {
         return null;
      } else {
         class_2680 var24 = null;
         int var25 = 0;

         for(int var26 = 0; var26 < var3.length; ++var26) {
            class_2826 var27 = var3[var26];
            if (var27 != null && !var27.method_38292() && var27.method_19523((doKelp) -> IIllllIlll(doKelp, var16, var17, var18, var19, var20, var21, var22, var23) != 0)) {
               int var28 = var4 + (var26 << 4);

               for(int var29 = 0; var29 < 16; ++var29) {
                  for(int var30 = 0; var30 < 16; ++var30) {
                     for(int var31 = 0; var31 < 16; ++var31) {
                        class_2680 var32 = var27.method_12254(var30, var29, var31);
                        if (var32 != var24) {
                           var24 = var32;
                           var25 = IIllllIlll(var32, var16, var17, var18, var19, var20, var21, var22, var23);
                        }

                        if (var25 != 0) {
                           byte var33 = 0;
                           switch (var25) {
                              case 1:
                                 if (var5 < 24) {
                                    var5 += 10;
                                    var33 = 10;
                                 }
                                 break;
                              case 2:
                                 if (var6 < 24) {
                                    var6 += 6;
                                    var33 = 6;
                                 }
                                 break;
                              case 3:
                                 if (var7 < 24) {
                                    var7 += 5;
                                    var33 = 5;
                                 }
                                 break;
                              case 4:
                                 if (var8 < 24) {
                                    var8 += 5;
                                    var33 = 5;
                                 }
                                 break;
                              case 5:
                                 if (var9 < 24) {
                                    var9 += 6;
                                    var33 = 6;
                                 }
                                 break;
                              case 6:
                                 if (var10 < 24) {
                                    var10 += 2;
                                    var33 = 2;
                                 }
                                 break;
                              case 7:
                                 if (var11 < 24) {
                                    var11 += 2;
                                    var33 = 2;
                                 }
                                 break;
                              case 8:
                                 if (var12 < 24) {
                                    ++var12;
                                    var33 = 1;
                                 }
                           }

                           if (var33 > 0) {
                              int var34 = (chunk.field_9181 << 4) + var30;
                              int var35 = var28 + var29;
                              int var36 = (chunk.field_9180 << 4) + var31;
                              if (var13.size() < 64) {
                                 var13.add(new int[]{var34, var35, var36});
                              }

                              if (var35 < var14) {
                                 var14 = var35;
                              }

                              if (var35 > var15) {
                                 var15 = var35;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         int var37 = this.lllllillll(cpos, chunk, var13);
         if (var37 > 0) {
            for(int[] var40 : var13) {
               if (var40[1] < var14) {
                  var14 = var40[1];
               }

               if (var40[1] > var15) {
                  var15 = var40[1];
               }
            }
         }

         int var39 = var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var37;
         int var41 = (var5 > 0 ? 1 : 0) + (var6 > 0 ? 1 : 0) + (var7 > 0 ? 1 : 0) + (var8 > 0 ? 1 : 0) + (var9 > 0 ? 1 : 0) + (var10 > 0 ? 1 : 0) + (var11 > 0 ? 1 : 0) + (var12 > 0 ? 1 : 0) + (var37 > 0 ? 1 : 0);
         int var42 = this.liIlliiIll();
         if (this.IiIlIIiIll.Iilllilliill() && var37 == 0 && var5 == 0 && var6 == 0 && var7 == 0 && var8 == 0 && var9 == 0) {
            var42 += 12;
         }

         if (var39 < var42) {
            return null;
         } else {
            IIliiIilIliiIi var43 = new IIliiIilIliiIi();
            var43.IIiliIiiilIiliIiii = var39;
            var43.iIiliIiiiIliliIiii = var41;
            var43.iiiliIiiiIIIiiIiii = var13;
            var43.lliliIiiiililiIiii = var14 == Integer.MAX_VALUE ? (int)Iiiilllliiilll.field_1724.method_23318() - 4 : var14;
            var43.IiiliIiiiliiliIiii = var15 == Integer.MIN_VALUE ? (int)Iiiilllliiilll.field_1724.method_23318() + 4 : var15;
            return var43;
         }
      }
   }

   protected void Illillliilli() {
      this.lIilIIiIll.clear();
      this.iIilIIiIll.liiiIIllIl();
      this.IlilIIiIll = 0;
   }

   private static int iilllIIill(int r, int b, int a, int g) {
      return (r & (((-1969448026 << 5 | -1969448026 >>> 27) << 31 | (-1969448026 << 5 | -1969448026 >>> 27) >>> 1) + -51 ^ -1446397238)) << (-((-1875923029 << 5 | -1875923029 >>> 27) * -49 * -1527099483) ^ -463767742) | (b & (~((1751415901 >>> 23 | 1751415901 << 9) * -49) ^ -61 ^ -2006696205)) << (-874288861 + -73 - -3 ^ -874288947) | (a & ((1233698656 >>> 29 | 1233698656 << 3) * 1227133513 - -55 ^ -2023508170)) << ((2145471081 << 27 | 2145471081 >>> 5) ^ -53 ^ 59 ^ -1275005525) | g & ((((-1170627003 << 7 | -1170627003 >>> 25) ^ -117) << 19 | ((-1170627003 << 7 | -1170627003 >>> 25) ^ -117) >>> 13) ^ -357099111);
   }

   private boolean Iillllilll(class_2338 a, List<class_2248> blocks) {
      int var3 = Iiiilllliiilll.field_1687.method_31607();
      int var4 = Iiiilllliiilll.field_1687.method_31607() + Iiiilllliiilll.field_1687.method_31605();
      class_2338.class_2339 var5 = new class_2338.class_2339();

      for(int var6 = -40; var6 <= 40; ++var6) {
         int var7 = a.method_10264() + var6;
         if (var7 >= var3 && var7 < var4) {
            for(int var8 = -2; var8 <= 2; ++var8) {
               for(int var9 = -2; var9 <= 2; ++var9) {
                  var5.method_10103(a.method_10263() + var8, var7, a.method_10260() + var9);
                  class_2248 var10 = Iiiilllliiilll.field_1687.method_8320(var5).method_26204();

                  for(class_2248 var12 : blocks) {
                     if (var10 == var12) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   public IliiilIllliiilIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIlIIiIll, this.ilIlIIiIll, this.IiIlIIiIll, this.liIlIIiIll, this.iiIlIIiIll, this.IIllIIiIll, this.lIllIIiIll, this.iIllIIiIll, this.IlllIIiIll, this.llllIIiIll, this.illlIIiIll, this.IillIIiIll, this.lillIIiIll});
      this.IIilIIiIll.add(new iliIiiIiiIii(this.iiIlIIiIll, List.of(iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())), List.of(class_2246.field_9993, class_2246.field_10463)));
      this.IIilIIiIll.add(new iliIiiIiiIii(this.IIllIIiIll, List.of(iiiIlIIIll(IliIlllilIi<invokedynamic>())), List.of(class_2246.field_28675, class_2246.field_28676)));
      this.IIilIIiIll.add(new iliIiiIiiIii(this.lIllIIiIll, List.of(iiiIlIIIll(IliIlllilIi<invokedynamic>())), List.of(class_2246.field_10597)));
      this.IIilIIiIll.add(new iliIiiIiiIii(this.IlllIIiIll, List.of(iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())), List.of(class_2246.field_10211, class_2246.field_10108)));
      this.IIilIIiIll.add(new iliIiiIiiIii(this.iIllIIiIll, List.of(iiiIlIIIll(IliIlllilIi<invokedynamic>())), List.of(class_2246.field_27160, class_2246.field_27159, class_2246.field_27161, class_2246.field_27164, class_2246.field_27163, class_2246.field_27162, class_2246.field_27114)));
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && !this.lIilIIiIll.isEmpty()) {
         Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
         double var3 = Iiiilllliiilll.field_1724.method_23317();
         double var5 = Iiiilllliiilll.field_1724.method_23321();
         float var7 = (float)Math.max(0, Math.min(255, this.liIlIIiIll.Iilllilliill())) / 255.0F;
         float var8 = Math.min(1.0F, var7 + 0.35F);
         int var9 = iilllIIill(255, 255, 40, 40);
         int var10 = iilllIIill(Math.min(255, this.liIlIIiIll.Iilllilliill() + 90), 255, 90, 90);
         int var11 = 160;
         ObjectIterator var12 = this.lIilIIiIll.long2ObjectEntrySet().fastIterator();

         while(var12.hasNext()) {
            Long2ObjectMap.Entry var13 = (Long2ObjectMap.Entry)var12.next();
            long var14 = var13.getLongKey();
            IIliiIilIliiIi var16 = (IIliiIilIliiIi)var13.getValue();
            double var17 = (double)(class_1923.method_8325(var14) << 4);
            double var19 = (double)(class_1923.method_8332(var14) << 4);
            double var21 = (double)(var16.lliliIiiiililiIiii - 1);
            double var23 = (double)(var16.IiiliIiiiliiliIiii + 2);
            if (var23 - var21 < (double)3.0F) {
               --var21;
               var23 += (double)2.0F;
            }

            if (!iIiiIIilIliiIIil.IlIillIiilIi(var17 + (double)8.0F, (var21 + var23) * (double)0.5F, var19 + (double)8.0F, 12.0F + (float)(var23 - var21) * 0.5F)) {
               float var25 = iIiiIIilIliiIIil.Ililllililil(var17);
               float var26 = iIiiIIilIliiIIil.IIIilIIiiIIi(var19);
               float var27 = var25 + 16.0F;
               float var28 = var26 + 16.0F;
               float var29 = iIiiIIilIliiIIil.Iiilliiliiil(var21);
               float var30 = iIiiIIilIliiIIil.Iiilliiliiil(var23);
               iIiiIIilIliiIIil.IIlilIliiIli(var2, var25, var29, var26, var27, var30, var28, 1.0F, 0.15F, 0.15F, var7);
               iIiiIIilIliiIIil.iIIIlIlIIl(var2, var25, var29, var26, var27, var30, var28, var9, 2.0F);
               if (var11 > 0) {
                  double var31 = var17 + (double)8.0F - var3;
                  double var33 = var19 + (double)8.0F - var5;
                  if (!(var31 * var31 + var33 * var33 > (double)5184.0F)) {
                     List var35 = var16.iiiliIiiiIIIiiIiii;
                     int var36 = 0;

                     for(int var37 = var35.size(); var36 < var37 && var11 > 0; ++var36) {
                        int[] var38 = (int[])var35.get(var36);
                        float var39 = iIiiIIilIliiIIil.Ililllililil((double)var38[0]);
                        float var40 = iIiiIIilIliiIIil.Iiilliiliiil((double)var38[1]);
                        float var41 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var38[2]);
                        iIiiIIilIliiIIil.IIlilIliiIli(var2, var39, var40, var41, var39 + 1.0F, var40 + 1.0F, var41 + 1.0F, 1.0F, 0.35F, 0.35F, var8);
                        iIiiIIilIliiIIil.iIIIlIlIIl(var2, var39, var40, var41, var39 + 1.0F, var40 + 1.0F, var41 + 1.0F, var10, 1.25F);
                        --var11;
                     }
                  }
               }
            }
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 5 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 11) - '룝') ^ var5)))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 5 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 11) - '룝') ^ var5)))) << 14) ^ var5) ^ var5) << 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 5 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 11) - '룝') ^ var5)))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 5 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 11) - '룝') ^ var5)))) << 14) ^ var5) ^ var5) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) >>> 11))) ^ var5) >>> 1 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) >>> 11))) ^ var5) << 15) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) >>> 11))) ^ var5) >>> 1 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 5622) ^ '\ue863') + '譸') - var5))) >>> 11))) ^ var5) << 15) ^ var5) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
