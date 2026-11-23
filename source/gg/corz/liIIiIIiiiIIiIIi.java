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
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class liIIiIIiiiIIiIIi extends ilIllIiIll {
   private final Iiiliillliiliill iiilIliiil = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), Double.longBitsToDouble(8813076380167737810L ^ 4209271661088248274L), Double.longBitsToDouble(6801501782949176298L ^ 2184186264987575274L), (double)1.0F, Double.longBitsToDouble(-608770490850689434L ^ -5209197510209651098L), (double)1.0F);
   private int lIIiIliiil;
   private double iIIiIliiil;
   private int IlIiIliiil;
   private boolean ilIiIliiil;
   private int llIiIliiil;
   private final iiIiiilIIliiil IIIiIliiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   private void lIIlliIIll(boolean onBlock) {
      if (!iIiIlillIliIlill.iIIilIlIil(false)) {
         if (iIiIlillIliIlill.iilllIIill()) {
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         } else {
            if (!onBlock) {
               class_239 var4 = Iiiilllliiilll.field_1765;
               if (var4 instanceof class_3966) {
                  class_3966 var2 = (class_3966)var4;
                  class_1297 var5 = var2.method_17782();
                  if (var5 instanceof class_1309) {
                     class_1309 var3 = (class_1309)var5;
                     if (!lIIIIIlliIIIIIll.liiiIIllIl(var3)) {
                        Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                     } else if (IIllIIlilIllIIli.Iilllilliill(this, var3)) {
                        lIIIIIlliIIIIIll.iIlIlllllill();
                        Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, var3);
                        Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                        Iiiilllliiilll.field_1724.method_75203();
                     }

                     return;
                  }
               }
            }

            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         }
      }
   }

   private void iiiIlIIIll() {
      this.ilIiIliiil = false;
      this.lIIiIliiil = 0;
      this.IlIiIliiil = 0;
      this.llIiIliiil = 0;
      this.iIIiIliiil = (double)0.0F;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + '떵') + 21300) + var5) >>> 1 | (char)((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + '떵') + 21300) + var5) << 15) ^ '雘'))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + '떵') + 21300) + var5) >>> 1 | (char)((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + '떵') + 21300) + var5) << 15) ^ '雘'))) << 2) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') >>> 10) - var5) - 24759))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') >>> 10) - var5) - 24759))) >>> 1) - 13531) >>> 2 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') >>> 10) - var5) - 24759))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '짪') ^ '킔') >>> 10) - var5) - 24759))) >>> 1) - 13531) << 14))) ^ var5) ^ 11664) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1755 == null) {
         if (GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 0) != 1) {
            this.ilIiIliiil = false;
         } else if (!this.ilIiIliiil) {
            this.ilIiIliiil = true;
            this.IlIiIliiil = 0;
            this.iIIiIliiil = (double)0.0F;
            this.lIIiIliiil = this.IlIllllIll();
         } else if (this.lIIiIliiil > 0) {
            --this.lIIiIliiil;
         } else {
            boolean var1 = Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332;
            if (!var1 || this.IIIiIliiil.Iilllilliill()) {
               this.lIIlliIIll(var1);
               ++this.IlIiIliiil;
               this.lIIiIliiil = this.IlIllllIll();
            }
         }
      } else {
         this.ilIiIliiil = false;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8076919067292863952L ^ Long.rotateLeft(8338534278137155376L, 55) ^ -5420204947271558691L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3707155725041044516L ^ Long.rotateLeft(809973049578113331L, 59) ^ -7906118245224306996L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6068857606049457592L ^ Long.rotateLeft(3525961735849699379L, 46) ^ -9151410572875722031L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3064209974681261188L ^ Long.rotateLeft(4673329309940235993L, 55) ^ -824705813154546333L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8953362718608061617L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6754315883163266842L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2196862253401102548L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3393792202252489100L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6318260072699434449L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7008908798715111432L;
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

   private int IlIllllIll() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      double var2 = this.iiilIliiil.Iilllilliill();
      double var4 = this.iiilIliiil.Ililllililil();
      double var6 = Math.max((double)0.5F, var4 - var2);
      if (this.iIIiIliiil == (double)0.0F) {
         this.iIIiIliiil = (var2 + var4) / (double)2.0F;
      }

      this.iIIiIliiil += var1.nextGaussian() * var6 * 0.18;
      if (var1.nextDouble() < 0.05) {
         this.iIIiIliiil = var2 + var1.nextDouble() * var6;
      }

      this.iIIiIliiil = Math.min(var4, Math.max(var2, this.iIIiIliiil));
      double var8 = this.iIIiIliiil;
      if (this.IlIiIliiil < 4) {
         var8 *= 0.78 + 0.06 * (double)this.IlIiIliiil;
      }

      double var10 = (double)1000.0F / var8;
      var10 *= (double)1.0F + var1.nextGaussian() * 0.22;
      if (var1.nextDouble() < 0.09) {
         var10 += (double)100.0F + var1.nextDouble() * (double)200.0F;
      }

      double var12 = Math.max((double)1.0F, var10 / (double)50.0F);
      int var14 = (int)var12;
      if (var1.nextDouble() < var12 - (double)var14) {
         ++var14;
      }

      if (var14 >= 3) {
         this.llIiIliiil = 0;
      } else if (++this.llIiIliiil >= 8 + var1.nextInt(4)) {
         var14 = 3 + var1.nextInt(3);
         this.llIiIliiil = 0;
      }

      return var14;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - 30464) + 11805) ^ var5))) ^ 19719) ^ 24882) + var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - 30464) + 11805) ^ var5))) ^ 19719) ^ 24882) + var5) << 14) - var5) << 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - 30464) + 11805) ^ var5))) ^ 19719) ^ 24882) + var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - 30464) + 11805) ^ var5))) ^ 19719) ^ 24882) + var5) << 14) - var5) >>> 5) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liIIiIIiiiIIiIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiilIliiil, this.IIIiIliiil});
   }

   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-((char)(var4[var5] << 1 | var4[var5] >>> 15))))))))) ^ '鈦') - var5) >>> 8 | (char)((char)((char)(-((char)(-((char)(~((char)(-((char)(var4[var5] << 1 | var4[var5] >>> 15))))))))) ^ '鈦') - var5) << 8) ^ var5) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-((char)(var4[var5] << 1 | var4[var5] >>> 15))))))))) ^ '鈦') - var5) >>> 8 | (char)((char)((char)(-((char)(-((char)(~((char)(-((char)(var4[var5] << 1 | var4[var5] >>> 15))))))))) ^ '鈦') - var5) << 8) ^ var5) + var5) << 6));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - '餯'))) + var5) + var5) - var5) + '맻') + var5))) - var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - '餯'))) + var5) + var5) - var5) + '맻') + var5))) - var5) << 9) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
