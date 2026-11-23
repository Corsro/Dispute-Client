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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_12079;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_7920;
import net.minecraft.class_8685;

public class iiIiilIIliil extends ilIllIiIll implements IiIiilliIiil {
   private static final Map<class_2960, class_8685> liIllIiiiiIllIii;
   private final ililliIiIiilliIi lllllIiiillllIii = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::liIlliiIll);
   public static int IIlllIiilIlllIii;
   private static final List<class_2960> ilIllIiiIiIllIii = new ArrayList();
   public final iIllIIilIlllIIil IilllIiililllIii = new iIllIIilIlllIIil();
   private int iIlllIiiIllllIii = IIllllIlll();

   private void liIlliiIll() {
      if (ilIllIiiIiIllIii.size() > 1) {
         for(int var1 = this.iIlllIiiIllllIii; this.iIlllIiiIllllIii == var1; this.iIlllIiiIllllIii = IIllllIlll()) {
         }

      }
   }

   private class_8685 iIlllIllll(int i) {
      class_2960 var2 = (class_2960)ilIllIiiIiIllIii.get(Math.floorMod(i, ilIllIiiIiIllIii.size()));
      return (class_8685)liIllIiiiiIllIii.computeIfAbsent(var2, (t) -> class_8685.method_74884(new liilIiIliiilIiIl(t), (class_12079.class_12081)null, (class_12079.class_12081)null, class_7920.field_41123));
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)(var4[var5] + 24781))) ^ var5))) ^ 1921))) - var5) - var5) ^ 18439) - var5));
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
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - 19590) << 14 | (char)((char)(~((char)(var4[var5] - var5))) - 19590) >>> 2) ^ '\ue4cb') >>> 5 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) - 19590) << 14 | (char)((char)(~((char)(var4[var5] - var5))) - 19590) >>> 2) ^ '\ue4cb') << 11))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - 19590) << 14 | (char)((char)(~((char)(var4[var5] - var5))) - 19590) >>> 2) ^ '\ue4cb') >>> 5 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) - 19590) << 14 | (char)((char)(~((char)(var4[var5] - var5))) - 19590) >>> 2) ^ '\ue4cb') << 11))) >>> 13))) - 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ 12426) >>> 12 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ 12426) << 4) - var5))))) << 9 | (char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ 12426) >>> 12 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ 12426) << 4) - var5))))) >>> 7) - var5) - var5) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      for(String var3 : new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}) {
         ilIllIiiIiIllIii.add(class_2960.method_60655(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + var3 + IliIlllilIi<invokedynamic>()));
      }

      liIllIiiiiIllIii = new HashMap();
      IIlllIiilIlllIii = -1;
   }

   public void ilIllIiIll() {
      this.IilllIiililllIii.IilliliilIIi();
   }

   public void iiiIlIIIll(class_332 ctx, int w, int x, int y, int h) {
      this.IilllIiililllIii.IliIlllilIi(ctx, w, x, y, h, this.iIlllIiiIllllIii);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uec6b') - 5606) ^ '믉') ^ var5) - var5) - 16971)))))))) - 27082));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iillllilll() {
      return this.iIlllIiiIllllIii;
   }

   public void IlIllllIll(double mx, double my) {
      this.IilllIiililllIii.iIlIlllllill(mx, my);
   }

   public class_8685 lllllillll() {
      return this.iIlllIllll(this.iIlllIiiIllllIii);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4449030370940052967L ^ Long.rotateLeft(9069666027660225675L, 21) ^ -3310156985803300594L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7076034229935984192L ^ Long.rotateLeft(6234889329885009716L, 51) ^ 101359758948991334L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7567794880170493205L ^ Long.rotateLeft(-6766823768443767398L, 46) ^ -823649242425554232L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3855647429869390386L ^ Long.rotateLeft(-2709606074169275468L, 48) ^ -9154465613836743956L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7063740408411919517L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 739284190857236262L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1867557699816608205L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4708160908989783719L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3363032452086402186L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8951306811794051838L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   public static class_8685 iilllIIill(class_742 player) {
      if (class_310.method_1551().field_1724 != player) {
         return null;
      } else {
         ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iiIiilIIliil.class);
         if (var1 instanceof iiIiilIIliil) {
            iiIiilIIliil var2 = (iiIiilIIliil)var1;
            if (IIlllIiilIlllIii >= 0) {
               return var2.iIlllIllll(IIlllIiilIlllIii);
            } else {
               return !var2.IliIlllilIi() ? null : var2.lllllillll();
            }
         } else {
            return null;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~var4[var5]) - var5) ^ var5) + var5))))) + 25628) ^ 2901) - 32061) ^ var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~var4[var5]) - var5) ^ var5) + var5))))) + 25628) ^ 2901) - 32061) ^ var5) - var5) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IIllllIlll() {
      return ilIllIiiIiIllIii.isEmpty() ? 0 : ThreadLocalRandom.current().nextInt(ilIllIiiIiIllIii.size());
   }

   protected void Illillliilli() {
      this.iIlllIiiIllllIii = IIllllIlll();
   }

   public iiIiilIIliil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lllllIiiillllIii});
   }

   public boolean lIIlliIIll(double w, double x, int button, int y, int h, int mx, int my) {
      return this.IilllIiililllIii.liiiIIllIl(w, x, button, y, h, mx, my);
   }
}
