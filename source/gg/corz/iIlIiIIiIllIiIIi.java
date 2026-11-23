package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
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
import net.minecraft.class_1294;
import net.minecraft.class_2246;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class iIlIiIIiIllIiIIi extends ilIllIiIll implements lilIliiiilIlii {
   private static final double IiliIliiil = (double)60.0F;
   private int lliiIliiil;
   private final iiIiiilIIliiil lIiiIliiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private boolean IliiIliiil;
   private final iilliIlIIiliIl iiliIliiil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 40, 0, 100);
   private static final double illiIliiil = (double)6.0F;
   private static final int liliIliiil = 22;
   private final Iiiliillliiliill IIiiIliiil = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)40.0F, (double)60.0F, (double)0.0F, (double)100.0F, (double)1.0F);
   private boolean iliiIliiil;
   private class_746 iIiiIliiil;

   public iIlIiIIiIllIiIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiliIliiil, this.IIiiIliiil, this.lIiiIliiil});
   }

   protected void Illillliilli() {
      this.IliiIliiil = false;
      this.lliiIliiil = 0;
      this.iliiIliiil = false;
      this.iIiiIliiil = null;
   }

   private boolean IlIllllIll(class_746 player) {
      if (!player.method_6115() && !player.method_5765()) {
         if (!player.method_5799() && !player.method_5771()) {
            if (player.method_6059(class_1294.field_5913)) {
               return false;
            } else {
               return Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1687.method_29546(player.method_5829().method_1011(Double.longBitsToDouble(-3458496110264819628L ^ -1202295824790730328L))).noneMatch((state) -> state.method_27852(class_2246.field_10343));
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) << 11 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) >>> 5) - var5) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) << 11 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) >>> 5) - var5) ^ var5) << 2) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) << 11 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) >>> 5) - var5) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) << 11 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) << 11 | (char)(~((char)((char)((char)(var4[var5] - var5) - '풚') - var5))) >>> 5) ^ 23795) - 6158))))) ^ var5) - var5) + var5) >>> 5) - var5) ^ var5) << 2) >>> 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1244110911569448524L ^ Long.rotateLeft(7957922552325336274L, 25) ^ 6223580950035034654L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4171291177371939818L ^ Long.rotateLeft(4642496514122856025L, 16) ^ 8649063416919522735L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2374610744331207218L ^ Long.rotateLeft(2630398214433778062L, 33) ^ 8861558488527289754L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2300190635109644914L ^ Long.rotateLeft(-8713082970472952105L, 26) ^ 1961657739246315563L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -339566414600949486L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 231630224077045778L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2307385643174600946L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7716664368761930366L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6709792054553137463L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -693453338964712480L;
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
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 558) + var5))) + var5) - 10842) ^ '볖'))) + '\uda85') - var5))))) ^ var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      if (this.iliiIliiil) {
         this.iliiIliiil = false;
         if (Iiiilllliiilll.field_1690 != null) {
            illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1903, Iiiilllliiilll.field_1755 == null && liIlliiIll(Iiiilllliiilll.field_1690.field_1903));
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) << 4 | (char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) >>> 12) ^ var5) ^ 'ꐙ') ^ '별') - '겴') - var5) - '쪞') ^ var5) ^ 1292) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) << 4 | (char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) >>> 12) ^ var5) ^ 'ꐙ') ^ '별') - '겴') - var5) - '쪞') ^ var5) ^ 1292) << 11) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) << 4 | (char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) >>> 12) ^ var5) ^ 'ꐙ') ^ '별') - '겴') - var5) - '쪞') ^ var5) ^ 1292) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) << 4 | (char)((char)(var4[var5] + var5) << 1 | (char)(var4[var5] + var5) >>> 15) >>> 12) ^ var5) ^ 'ꐙ') ^ '별') - '겴') - var5) - '쪞') ^ var5) ^ 1292) << 11) << 13))) + var5));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ var5) << 8 | (char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ var5) >>> 8))) ^ var5))) - 25738))) ^ var5) + '\uf7c6'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) << 5 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) >>> 11) ^ var5) >>> 14 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) << 5 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) >>> 11) ^ var5) << 2) << 7 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) << 5 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) >>> 11) ^ var5) >>> 14 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) << 5 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 1 | (char)(var4[var5] ^ var5) << 15) - 30647) + '艝') + 'ꈅ') ^ 'ꈒ') - var5))) + var5))) >>> 11) ^ var5) << 2) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      if (this.iliiIliiil) {
         this.lIIlliIIll();
      }

      if (this.IliiIliiil) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1 != null && var1 == this.iIiiIliiil && Iiiilllliiilll.field_1690 != null) {
            boolean var2 = Iiiilllliiilll.field_1755 == null && this.IlIllllIll(var1) && !Iiiilllliiilll.field_1690.field_1903.method_1434();
            ilIiililIiIiilil var3 = var2 ? illllIlIilllIl.IiIlliIliiIl(this.lliiIliiil, var1.method_24828(), this.iiiIlIIIll()) : ilIiililIiIiilil.IIlIllllil;
            switch (var3) {
               case iiIIllllil:
                  illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1903, true);
                  this.iliiIliiil = true;
                  this.IliiIliiil = false;
                  break;
               case liIIllllil:
                  ++this.lliiIliiil;
                  break;
               case IIlIllllil:
                  this.IliiIliiil = false;
            }

         } else {
            this.IliiIliiil = false;
         }
      }
   }

   private boolean iiiIlIIIll() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      double var2 = illllIlIilllIl.liiiIIllIl(this.IIiiIliiil.Iilllilliill(), this.IIiiIliiil.Ililllililil(), var1.nextDouble());
      return illllIlIilllIl.IliIlllilIi(var2, var1.nextDouble());
   }

   public void iIlllIllll(class_243 explosion, boolean velocity) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (!velocity && explosion != null && var3 != null && Iiiilllliiilll.field_1687 != null) {
         if (illllIlIilllIl.IIIllIIliIIl(explosion.field_1352, explosion.field_1351, explosion.field_1350)) {
            if (var3.method_24828() && this.IlIllllIll(var3)) {
               if (illllIlIilllIl.IlIlllIlilIl(var3.field_6235, illIllilIilIllil.Iilllilliill(var3.method_5628()), -(-1840837801 * -69) ^ 1831210597)) {
                  if (!this.lIiiIliiil.Iilllilliill() || this.ilIllIiIll(var3)) {
                     if (illllIlIilllIl.IliIlllilIi((double)this.iiliIliiil.Iilllilliill(), ThreadLocalRandom.current().nextDouble())) {
                        this.IliiIliiil = true;
                        this.lliiIliiil = 0;
                        this.iIiiIliiil = var3;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean ilIllIiIll(class_746 self) {
      double var2 = (double)iIiIlillIliIlill.ilillIiill();

      for(class_742 var5 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var5 != self && liiIIIlliiiIIIll.IliIlllilIi(var5, lilllliiilllli.iiIiIiIIIl) && !((double)self.method_5739(var5) >= (double)6.0F) && illllIlIilllIl.iliIiiliiiii(var2, self.method_23317(), self.method_23321(), var5.method_23317(), var5.method_23321(), (double)60.0F) && illllIlIilllIl.iliIiiliiiii((double)var5.method_36454(), var5.method_23317(), var5.method_23321(), self.method_23317(), self.method_23321(), (double)60.0F)) {
            return true;
         }
      }

      return false;
   }

   protected void Iilililiiili() {
      this.lIIlliIIll();
      this.IliiIliiil = false;
      this.lliiIliiil = 0;
      this.iIiiIliiil = null;
   }

   private static boolean liIlliiIll(class_304 binding) {
      if (Iiiilllliiilll.method_22683() != null && Iiiilllliiilll.method_1569()) {
         class_3675.class_306 var1 = ((AccessorKeyBinding)binding).getBoundKey();
         long var2 = Iiiilllliiilll.method_22683().method_4490();
         if (var1.method_1442() != class_307.field_1668) {
            if (var1.method_1442() == class_307.field_1672) {
               return GLFW.glfwGetMouseButton(var2, var1.method_1444()) == (((94730320 - -119 ^ 33) - 65 << 29 | (94730320 - -119 ^ 33) - 65 >>> 3) ^ -1598771435);
            } else {
               return false;
            }
         } else {
            return var1.method_1444() != class_3675.field_16237.method_1444() && GLFW.glfwGetKey(var2, var1.method_1444()) == (~(1447311538 - -19) ^ -1447311557);
         }
      } else {
         return false;
      }
   }
}
