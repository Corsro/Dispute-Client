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
import net.minecraft.class_1268;
import net.minecraft.class_1802;

public class IIlilIillIlilIil extends ilIllIiIll {
   private final iilliIlIIiliIl iiiiiIlIil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 0, 10);
   private final iiIiiilIIliiil lIIIIllIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi liiiiIlIil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final IllIIiIllllIIiIl iIIIIllIil = new IllIIiIllllIIiIl();
   private final iiIiiilIIliiil IIIIIllIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int IlIIIllIil = -1;

   public ilIlIliIiIlIli IiIiliIiiiIi() {
      return IliIlllilIi<invokedynamic>().equals(this.liiiiIlIil.Iilllilliill()) ? ilIlIliIiIlIli.llilIIIIIl : ilIlIliIiIlIli.IlilIIIIIl;
   }

   public void Iilililiiili() {
      if (this.lIIIIllIil.Iilllilliill() && this.IlIIIllIil != (~(~-1381193124) + -45 ^ -95 ^ -1381193103) && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_31548().method_61496(this.IlIIIllIil);
      }

      this.IlIIIllIil = -1;
   }

   public void Illillliilli() {
      this.IlIIIllIil = -1;
      this.iIIIIllIil.IliIlllilIi();
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8287);
            if (var1 == -1) {
               if (this.IIIIIllIil.Iilllilliill()) {
                  this.IIillIiliIil(false);
               }

            } else {
               if (this.IlIIIllIil == -1) {
                  this.IlIIIllIil = Iiiilllliiilll.field_1724.method_31548().method_67532();
               }

               if (Iiiilllliiilll.field_1724.method_31548().method_67532() != var1) {
                  Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
               }

               if (this.iIIIIllIil.iIlIlllllill((long)this.iiiiiIlIil.Iilllilliill() * 50L)) {
                  this.iIIIIllIil.IliIlllilIi();
                  Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
                  Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
               }
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 17665) + '벗') + 18295) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + 17665) + '벗') + 18295) >>> 1) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 17665) + '벗') + 18295) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + 17665) + '벗') + 18295) >>> 1) << 13) + var5) + var5) + 9812) + var5) ^ var5))) - '꣼'))));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) - var5) ^ 28753) ^ var5))) ^ '쌓') - '눷') ^ '\ufb18') ^ '턖') << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) - var5) ^ 28753) ^ var5))) ^ '쌓') - '눷') ^ '\ufb18') ^ '턖') >>> 8))) ^ '虣'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5713953722415037718L ^ Long.rotateLeft(6263149304114434701L, 27) ^ 3887481427270306304L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4349900120061759678L ^ Long.rotateLeft(2728824209420981073L, 50) ^ 2129709304940124314L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5412030533596980138L ^ Long.rotateLeft(-1409619923703845772L, 57) ^ -2456608082647021001L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4351282411253595083L ^ Long.rotateLeft(3949085512677220061L, 16) ^ 5322495226212719764L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7136426350680144829L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6174544853682927062L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1459777304249333351L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3875284953264527282L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7630868508410596257L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6897492233228714101L;
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

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~var4[var5]) - 486))) >>> 6 | (char)(~((char)((char)(~var4[var5]) - 486))) << 10) - var5))) + var5) ^ 15127) - 17353) + '錛') + 762) - '鋯') << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~var4[var5]) - 486))) >>> 6 | (char)(~((char)((char)(~var4[var5]) - 486))) << 10) - var5))) + var5) ^ 15127) - 17353) + '錛') + 762) - '鋯') >>> 7) ^ '鶈') + '렲')) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~var4[var5]) - 486))) >>> 6 | (char)(~((char)((char)(~var4[var5]) - 486))) << 10) - var5))) + var5) ^ 15127) - 17353) + '錛') + 762) - '鋯') << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~var4[var5]) - 486))) >>> 6 | (char)(~((char)((char)(~var4[var5]) - 486))) << 10) - var5))) + var5) ^ 15127) - 17353) + '錛') + 762) - '鋯') >>> 7) ^ '鶈') + '렲')) >>> 4));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꗘ') >>> 9 | (char)(var4[var5] + 'ꗘ') << 7))) + var5) ^ '\ud91b')) + var5) ^ var5) + var5) ^ var5))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꗘ') >>> 9 | (char)(var4[var5] + 'ꗘ') << 7))) + var5) ^ '\ud91b')) + var5) ^ var5) + var5) ^ var5))) >>> 4));
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
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + 11305) ^ 24552))) - 25710) + var5) - var5) - var5) - var5) + var5) - var5))) ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIlilIillIlilIil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liiiiIlIil, this.iiiiiIlIil, this.IIIIIllIil, this.lIIIIllIil});
   }
}
