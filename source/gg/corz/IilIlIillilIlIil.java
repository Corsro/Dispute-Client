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
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_3966;

public class IilIlIillilIlIil extends ilIllIiIll implements liIIIiiiiIIIii, ilIIIiiIiIIIii {
   private final IIIIlilllIIIlill lllIIIlIil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), Double.longBitsToDouble(-4157691812746335586L ^ -8769377831173723490L), Double.longBitsToDouble(-1447183634510851388L ^ -6058869652938239292L), Double.longBitsToDouble(425605054366082392L ^ 5032224523212678488L), (double)1.0F);
   private final iiIiiilIIliiil IilIIIlIil;
   private final iiIiiilIIliiil lilIIIlIil;
   private static final lilllliiilllli IllIIIlIil;
   private final lliliIIiililiIIi illIIIlIil;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) - var5) + 22932) ^ var5) - var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) - var5) + 22932) ^ var5) - var5) << 14)))) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      return iIIiIlIiIlIiIlIi.liiiIIllIl(target, presser);
   }

   public int liIlliiIll() {
      return -(-1329032514 * -113) * 15 ^ -2147248026;
   }

   private class_1309 lllllillll() {
      class_239 var2 = Iiiilllliiilll.field_1765;
      if (var2 instanceof class_3966 var1) {
         class_1297 var4 = var1.method_17782();
         if (var4 instanceof class_1309 var3) {
            if (liiIIIlliiiIIIll.IliIlllilIi(var4, IllIIIlIil)) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public IilIlIillilIlIil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.illIIIlIil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), lIiiilliIiiill.IIIilllIilIIilllIi.IliIlllilIi(), lIiiilliIiiill.liiiIIllIl());
      this.IilIIIlIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.lilIIIlIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lllIIIlIil, this.illIIIlIil, this.IilIIIlIil, this.lilIIIlIil});
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) - '\ue6da') ^ var5) + 4175))) ^ var5)) ^ '\ue208') - 14443) + '튒') + '빻'))) + 32686))) << 5 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) - '\ue6da') ^ var5) + 4175))) ^ var5)) ^ '\ue208') - 14443) + '튒') + '빻'))) + 32686))) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean ilIllIiIll() {
      return this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && liliIIliiiliIIli.lIiiIiIlilli(this.lllIIIlIil.Iilllilliill()) && lIlllIliIlllIl.IIIllIIliIIl(this.iIlllIllll()) >= 0;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 12 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 4))) - var5) + '챝') - var5) ^ var5) - 19374) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 12 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 4))) - var5) + '챝') - var5) ^ var5) - 19374) >>> 8))) - 12618) << 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 12 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 4))) - var5) + '챝') - var5) ^ var5) - 19374) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 12 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 4))) - var5) + '챝') - var5) ^ var5) - 19374) >>> 8))) - 12618) >>> 9) + var5))) - var5) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiIIIlIiIIlIIlIi lIIlliIIll() {
      return new iiIIIlIiIIlIIlIi(true, true, this.lllIIIlIil.Iilllilliill(), this.iIlllIllll(), this.IilIIIlIil.Iilllilliill(), false, false, this.lilIIIlIil.Iilllilliill());
   }

   static {
      IllIIIlIil = lilllliiilllli.IIliIiIIIl.iIlIlllllill(true);
   }

   protected void Iilililiiili() {
      iIIiIlIiIlIiIlIi.Illlllllilll(this);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 32708) - var5) ^ '뿰') + '궭') + var5) ^ var5) - 27371) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 32708) - var5) ^ '뿰') + '궭') + var5) ^ var5) - 27371) << 14) ^ var5))) - 8657) + 'Ꙡ'))) + var5) - 26315));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      iIIiIlIiIlIiIlIi.IliIlllilIi();
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1755 == null) {
         double var1 = this.lllIIIlIil.Iilllilliill();
         if (liliIIliiiliIIli.lIiiIiIlilli(var1)) {
            class_1309 var3 = this.lllllillll();
            if (var3 != null && !iIIiIlIiIlIiIlIi.IlIlllIlilIl(var3) && iIIiIlIiIlIiIlIi.lIiiIiIlilli()) {
               lIiiilliIiiill var4 = this.iIlllIllll();
               int var5 = lIlllIliIlllIl.IIIllIIliIIl(var4);
               if (var5 >= 0) {
                  if (liliIIliiiliIIli.IliIlllilIi(var3)) {
                     if (this.IilIIIlIil.Iilllilliill()) {
                        int var6 = lIlllIliIlllIl.IlIlllIlilIl();
                        if (var6 >= 0 && liliIIliiiliIIli.IlIlllIlilIl(var3, lIlllIliIlllIl.iliIiiliiiii(var6)) && liliIIliiiliIIli.IIillIiliIil(var3, 2)) {
                           iIIiIlIiIlIiIlIi.IIIllIIliIIl(this, var3, var6, var4, var1, this.lilIIIlIil.Iilllilliill());
                        }
                     }
                  } else if (liliIIliiiliIIli.IlIlllIlilIl(var3, lIlllIliIlllIl.iliIiiliiiii(var5)) && liliIIliiiliIIli.IIillIiliIil(var3, 1)) {
                     iIIiIlIiIlIiIlIi.iliIiiliiiii(this, var3, var5, this.lilIIIlIil.Iilllilliill());
                  }
               }
            }
         }
      }
   }

   private lIiiilliIiiill iIlllIllll() {
      return lIiiilliIiiill.iIlIlllllill(this.illIIIlIil.Iilllilliill());
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      iIIiIlIiIlIiIlIi.IIlllIlliIll(event);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5))))) + 'ꈥ') + 29408) << 11 | (char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5))))) + 'ꈥ') + 29408) >>> 5) ^ 21098) << 12 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5))))) + 'ꈥ') + 29408) << 11 | (char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5))))) + 'ꈥ') + 29408) >>> 5) ^ 21098) >>> 4) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iiiIlIIIll() {
      return 3;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2794873531474297450L ^ Long.rotateLeft(5524897538390936236L, 61) ^ -2502007173803799172L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8998727612584219351L ^ Long.rotateLeft(-6418340160864852127L, 6) ^ 5786646947997221193L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7974500972205343073L ^ Long.rotateLeft(-7883320590410974679L, 5) ^ -2781421671710715507L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -153188475383436144L ^ Long.rotateLeft(-7739473006917376076L, 1) ^ -8860524877582372977L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4884887138170744832L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2640427490640821945L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3464529067373337455L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4703797851577743322L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2227428352879404571L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -780369031516201441L;
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
}
