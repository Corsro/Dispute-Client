package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1113;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1540;
import net.minecraft.class_1541;
import net.minecraft.class_1542;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2312;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3419;

public class lllllIllillllIll extends ilIllIiIll {
   private static volatile int liliiillll = 0;
   private final iiIiiilIIliiil iiIiiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil illiiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil lIliiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long ilIiiillll = 1000L;
   private final ConcurrentHashMap<class_2960, long[]> iiliiillll = new ConcurrentHashMap();
   private final iiIiiilIIliiil Illiiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IiIiiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi Iiliiillll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final long llIiiillll = 1000L;
   private final iilliIlIIiliIl llliiillll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 1, 20);
   private final iiIiiilIIliiil liIiiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIliiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iIliiillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   public static lllllIllillllIll iiiIlIIIll() {
      lllllIllillllIll var0 = (lllllIllillllIll)llilIllililIll.iliIiiliiiii(lllllIllillllIll.class);
      return var0 != null && var0.IliIlllilIi() ? var0 : null;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 23806) ^ var5) ^ 5368) ^ 24360) ^ '蚮') + '괃') - '팧') - var5))))) + var5) ^ 14032) + var5) ^ '\uf056') - '\udb90'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      long var2 = -4978974341079771711L;
      var2 ^= ((long)this.Iiliiillll.Ililllililil() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != liliiillll) {
         liliiillll = (int)(var2 >>> 32);
         IlIllllIll();
      }

   }

   protected void Illillliilli() {
      this.iiliiillll.clear();
      this.lIIlliIIll();
   }

   public static boolean lllllillll(class_2680 state) {
      long var3 = -1477059954306550462L;
      var3 ^= ((long)liliiillll << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 0 && state != null) {
         class_2248 var2 = state.method_26204();
         if (var2 == class_2246.field_10091) {
            return true;
         } else if ((int)(var3 >>> 32) < ((-2132847433 - -123 + -11 + -37) * 17 ^ -1898666720)) {
            return false;
         } else {
            return var2 instanceof class_2312 || var2 == class_2246.field_10523 || var2 == class_2246.field_10301;
         }
      } else {
         return false;
      }
   }

   private static void IlIllllIll() {
      if (Iiiilllliiilll != null && Iiiilllliiilll.field_1769 != null && Iiiilllliiilll.field_1687 != null) {
         Iiiilllliiilll.execute(() -> Iiiilllliiilll.field_1769.method_3279());
      }

   }

   protected void iIIIlIlIIl() {
      this.lIIlliIIll();
      if (this.iiliiillll.size() > 256) {
         long var1 = System.currentTimeMillis();
         this.iiliiillll.values().removeIf((h) -> var1 - h[1] > 1000L);
      }

   }

   public lllllIllillllIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiIiiillll, this.liIiiillll, this.iiIiiillll, this.IIliiillll, this.lIliiillll, this.iIliiillll, this.Illiiillll, this.llliiillll, this.illiiillll, this.Iiliiillll});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5219339968244322655L ^ Long.rotateLeft(-5651765012819283750L, 34) ^ 6955428392636477850L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2575949172686674478L ^ Long.rotateLeft(3479946471843203518L, 55) ^ -7222115181914819439L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3769968013248879306L ^ Long.rotateLeft(-1334598208444336097L, 60) ^ 1645681857464423773L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5099995869319503856L ^ Long.rotateLeft(-1177940112833714512L, 46) ^ 7969932168370004932L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6662809573847304712L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8592536017340084652L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6045388535915470900L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3197905429573229140L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2243780297246809371L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5904369544038457396L;
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

   protected void Iilililiiili() {
      this.iiliiillll.clear();
      if (liliiillll != 0) {
         liliiillll = 0;
         IlIllllIll();
      }

   }

   public boolean IIllllIlll() {
      return this.iIliiillll.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) << 4 | (char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) >>> 12) - var5))) - 21570) << 1 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) << 4 | (char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) >>> 12) - var5))) - 21570) >>> 15) >>> 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) << 4 | (char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) >>> 12) - var5))) - 21570) << 1 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) << 4 | (char)((char)(var4[var5] ^ '\ue734') << 12 | (char)(var4[var5] ^ '\ue734') >>> 4) >>> 12) - var5))) - 21570) >>> 15) << 5) ^ var5) - var5) - var5) ^ 5033))) - '믎') ^ 2742));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean ilIllIiIll(class_1297 entity) {
      if (entity instanceof class_1542) {
         return this.IiIiiillll.Iilllilliill();
      } else if (entity instanceof class_1303) {
         return this.liIiiillll.Iilllilliill();
      } else if (entity instanceof class_1540) {
         return this.iiIiiillll.Iilllilliill();
      } else {
         return entity instanceof class_1541 ? this.IIliiillll.Iilllilliill() : false;
      }
   }

   public boolean iIlllIllll() {
      return this.illiiillll.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 25947) - 26911) + var5) << 9 | (char)((char)((char)((char)(-var4[var5]) ^ 25947) - 26911) + var5) >>> 7) + '씚') + var5) - '돺') ^ 28510) ^ var5) + 12524));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iillllilll(class_1113 sound) {
      if (this.Illiiillll.Iilllilliill() && sound != null) {
         class_3419 var2 = sound.method_4774();
         class_2960 var3 = sound.method_4775();
         if (var3 == null) {
            return false;
         } else {
            boolean var4 = var2 == class_3419.field_15247 && var3.method_12832().startsWith(IliIlllilIi<invokedynamic>());
            if (var4 || var2 != class_3419.field_15250 && var2 != class_3419.field_15253 && var2 != class_3419.field_15247 && var2 != class_3419.field_61058 && var2 != class_3419.field_15246) {
               long var5 = System.currentTimeMillis();
               long[] var7 = (long[])this.iiliiillll.computeIfAbsent(var3, (now) -> new long[]{var5, 0L, 0L, 0L});
               synchronized(var7) {
                  if (var5 - var7[1] > 1000L) {
                     var7[0] = var5;
                     var7[2] = 0L;
                     var7[3] = 0L;
                  } else if (var5 - var7[0] > 1000L) {
                     var7[0] = var5;
                     var7[2] = 0L;
                  }

                  var7[1] = var5;
                  int var10002 = var7[2]++;
                  if (var7[2] > (long)this.llliiillll.Iilllilliill()) {
                     var7[3] = 1L;
                  }

                  return var7[3] != 0L;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 'ꦙ') >>> 1 | (char)(var4[var5] + 'ꦙ') << 15) - var5) << 12 | (char)((char)((char)(var4[var5] + 'ꦙ') >>> 1 | (char)(var4[var5] + 'ꦙ') << 15) - var5) >>> 4) - 'ꌳ'))) ^ '샬') ^ 15861) << 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 'ꦙ') >>> 1 | (char)(var4[var5] + 'ꦙ') << 15) - var5) << 12 | (char)((char)((char)(var4[var5] + 'ꦙ') >>> 1 | (char)(var4[var5] + 'ꦙ') << 15) - var5) >>> 4) - 'ꌳ'))) ^ '샬') ^ 15861) >>> 3) + 30793) - 3899));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liIlliiIll() {
      return this.lIliiillll.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ '즸') + 25634) + var5) + '\uf8c8'))))) ^ 7346))) - var5) + 16372) ^ 'ﲴ') + var5) ^ 25112) - var5) + 'ꪵ') + '鼻') ^ '덥'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
