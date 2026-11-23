package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1109;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import net.minecraft.class_742;

public class IiiIiiIlliiIiiIl extends ilIllIiIll implements IiIiilliIiil {
   private final lliliIIiililiIIi llliIlIlll;
   private final ililliIiIiilliIi illiIlIlll;
   private static final int lIliIlIlll = 5;
   private final iiIiiilIIliiil liliIlIlll;
   private volatile Set<Integer> IliiIlIlll;
   private final iillIlIIilIl iiliIlIlll;
   private final AtomicInteger IIiiIlIlll;
   public static final int iIliIlIlll = -2;
   private static final int IIliIlIlll = 16;
   private static final int iiIiIlIlll = 4;
   private int iIiiIlIlll;
   public static int IlliIlIlll = -1;
   private int lIiiIlIlll;
   private final iiIiiilIIliiil IiliIlIlll;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 31423) ^ var5) - var5) + 25351) - 23929) - 'ꃀ') - var5))) ^ var5) - var5) + var5) << 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 31423) ^ var5) - var5) + 25351) - 23929) - 'ꃀ') - var5))) ^ var5) - var5) + var5) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iiiIlIIIll(class_332 y, int w, int x, int ctx, int h) {
      this.iiliIlIlll.IliIlllilIi(y, w, x, ctx, h, this.iIlllIllll());
   }

   public void ilIllIiIll() {
      this.iiliIlIlll.IilliliilIIi();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) ^ '超') - 23469))))) ^ 32539) << 6 | (char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) ^ '超') - 23469))))) ^ 32539) >>> 10) - '쳉') >>> 4 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) ^ '超') - 23469))))) ^ 32539) << 6 | (char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) ^ '超') - 23469))))) ^ 32539) >>> 10) - '쳉') << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llllIlilllIl IIllllIlll() {
      return (llllIlilllIl)iIIlliIlIlIlliIl.iIliliiIll.get(this.iIlllIllll());
   }

   private void lllllillll() {
      long var3 = -2638493399443875352L;
      var3 ^= ((long)iIIlliIlIlIlliIl.iIliliiIll.size() << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) > (~(1056761937 * 1022611261 * 1875962727) * 96516119 ^ 377750621)) {
         var3 ^= ((long)ThreadLocalRandom.current().nextInt((int)(var3 >>> 32) - 1) ^ var3) & -1L >>> 32;
         if ((int)var3 >= this.iIlllIllll()) {
            var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32;
         }

         this.llliIlIlll.Iiilliiliiil((int)var3);
      }
   }

   public int iIlllIllll() {
      return Math.floorMod(this.llliIlIlll.Ililllililil(), iIIlliIlIlIlliIl.iIliliiIll.size());
   }

   public void IlIllllIll(double my, double mx) {
      this.iiliIlIlll.iIlIlllllill(my, mx);
   }

   protected void Illillliilli() {
      iiiliiIiIIIiiiIi.IliIlllilIi();
      this.IIllllIlll().IIlllIlliIll();
   }

   private void Iillllilll() {
      if (this.IiliIlIlll.Iilllilliill() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         ArrayList var1 = new ArrayList();

         for(class_742 var3 : Iiiilllliiilll.field_1687.method_18456()) {
            if (var3 != Iiiilllliiilll.field_1724) {
               var1.add(var3);
            }
         }

         var1.sort(Comparator.comparingDouble((p) -> p.method_5858(Iiiilllliiilll.field_1724)));
         HashSet var5 = new HashSet();

         for(int var6 = 0; var6 < Math.min(16, var1.size()); ++var6) {
            class_742 var4 = (class_742)var1.get(var6);
            var5.add(var4.method_5628());
            ((llllIlilllIl)iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(var4.method_5667().hashCode(), iIIlliIlIlIlliIl.iIliliiIll.size()))).IIlllIlliIll();
         }

         this.IliiIlIlll = var5;
      } else {
         this.IliiIlIlll = Set.of();
      }
   }

   public IiiIiiIlliiIiiIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.llliIlIlll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), ((llllIlilllIl)iIIlliIlIlIlliIl.iIliliiIll.get(0)).liiiIIllIl(), iIIlliIlIlIlliIl.IliIlllilIi());
      this.illiIlIlll = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::lllllillll);
      this.IiliIlIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.liliIlIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.iiliIlIlll = new iillIlIIilIl();
      this.IIiiIlIlll = new AtomicInteger();
      this.IliiIlIlll = Set.of();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llliIlIlll, this.illiIlIlll, this.IiliIlIlll, this.liliIlIlll});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6305055991919540910L ^ Long.rotateLeft(5230372785199450836L, 52) ^ 3402825438479772874L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7795109001286442169L ^ Long.rotateLeft(-8038452864781209358L, 6) ^ 4208848308528373055L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1278594387914274491L ^ Long.rotateLeft(6217542449960140150L, 34) ^ -2521202831327593609L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1199610422269209997L ^ Long.rotateLeft(-1148470122602021760L, 43) ^ -3982971589393635517L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8785421181574722222L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3917394136387031996L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2580038453601701863L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8410811069674260289L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5208799223187576537L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3449175446927582897L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ 'ꥤ')) ^ var5))))) << 13 | (char)(-((char)(~((char)((char)((char)(var4[var5] ^ 'ꥤ')) ^ var5))))) >>> 3) - var5) - var5))) << 7 | (char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ 'ꥤ')) ^ var5))))) << 13 | (char)(-((char)(~((char)((char)((char)(var4[var5] ^ 'ꥤ')) ^ var5))))) >>> 3) - var5) - var5))) >>> 9) ^ '\ud910') + '뷖') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      this.IIllllIlll().IIlllIlliIll();
      if (this.iIiiIlIlll-- <= 0) {
         this.iIiiIlIlll = 4;
         this.Iillllilll();
      }

      if (this.IIiiIlIlll.get() > 0) {
         if (this.lIiiIlIlll > 0) {
            --this.lIiiIlIlll;
         } else {
            this.IIiiIlIlll.decrementAndGet();
            this.lIiiIlIlll = 3;
            llllIlilllIl var1 = this.IIllllIlll();
            String var2 = var1.iliIiiliiiii();
            if (var2 != null && Iiiilllliiilll.field_1724 != null) {
               try {
                  Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(class_3414.method_47908(class_2960.method_60656(var2)), var1.IIIllIIliIIl(), 0.7F));
               } catch (Throwable var4) {
                  this.IIiiIlIlll.set(0);
               }

            } else {
               this.IIiiIlIlll.set(0);
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 15 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 1) - '蝭') ^ 32353) + var5) ^ '\uf2e2') << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 15 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 1) - '蝭') ^ 32353) + var5) ^ '\uf2e2') >>> 10) ^ '쀰')))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.IIiiIlIlll.set(0);
      this.IliiIlIlll = Set.of();
   }

   public static llllIlilllIl liIlliiIll(class_742 player) {
      long var4 = -1475311716019958660L;
      if (player != null && !iIIlliIlIlIlliIl.iIliliiIll.isEmpty()) {
         ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(IiiIiiIlliiIiiIl.class);
         if (var1 instanceof IiiIiiIlliiIiiIl) {
            IiiIiiIlliiIiiIl var2 = (IiiIiiIlliiIiiIl)var1;
            var4 ^= ((long)(player == class_310.method_1551().field_1724 ? 1 : 0) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != 0 && IlliIlIlll >= 0) {
               return (llllIlilllIl)iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(IlliIlIlll, iIIlliIlIlIlliIl.iIliliiIll.size()));
            } else if ((int)(var4 >>> 32) != 0 && IlliIlIlll == (965657889 - 79 - 65 ^ -965657745)) {
               return null;
            } else if (!var2.IliIlllilIi()) {
               return null;
            } else if ((int)(var4 >>> 32) != 0) {
               return var2.IIllllIlll();
            } else {
               return var2.IiliIlIlll.Iilllilliill() && var2.IliiIlIlll.contains(player.method_5628()) ? (llllIlilllIl)iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(player.method_5667().hashCode(), iIIlliIlIlIlliIl.iIliliiIll.size())) : null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (this.liliIlIlll.Iilllilliill()) {
         class_2596 var3 = event.lIiilIIIIi;
         if (var3 instanceof class_2824) {
            class_2824 var2 = (class_2824)var3;
            if (IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               if (this.IIllllIlll().iliIiiliiiii() == null) {
                  return;
               }

               if (this.IIiiIlIlll.get() == 0) {
                  this.IIiiIlIlll.set(Math.max(1, this.IIllllIlll().IlIlllIlilIl()));
               }
            }
         }

      }
   }

   public boolean lIIlliIIll(double h, double w, int x, int my, int button, int y, int mx) {
      return this.iiliIlIlll.liiiIIllIl(h, w, x, my, button, y, mx);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 4 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 12) ^ 7851))) << 10 | (char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 4 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 12) ^ 7851))) >>> 6) + var5) << 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 4 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 12) ^ 7851))) << 10 | (char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 4 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 12) ^ 7851))) >>> 6) + var5) >>> 10) - var5) + 'ﯨ') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
