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
import net.minecraft.class_1294;

public class IIlIlllIlIll extends ilIllIiIll {
   public final IIIIlilllIIIlill lIiIIIIiiIiIIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)10.0F, 0.1, (double)20.0F, 0.1);
   private final IIilIIilIilIIi iliIIIIiIiiIIIIi = new IIilIIilIilIIi();
   public final lliliIIiililiIIi iilIIIIiIIiIIIIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   public final IIIIlilllIIIlill IliIIIIilliIIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)70.0F, (double)50.0F, (double)90.0F, (double)1.0F);

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') << 8 | (char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') >>> 8))))) >>> 14 | (char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') << 8 | (char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') >>> 8))))) << 2) ^ '鰃') + 29309))))) >>> 12 | (char)(-((char)(-((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') << 8 | (char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') >>> 8))))) >>> 14 | (char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') << 8 | (char)((char)((char)((char)(~var4[var5]) ^ var5) ^ 'ꩴ') ^ '\ue75d') >>> 8))))) << 2) ^ '鰃') + 29309))))) << 4));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) << 2 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) >>> 14) - 14460) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) << 2 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) >>> 14) - 14460) << 5))) >>> 4 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) << 2 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) >>> 14) - 14460) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) << 2 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) - var5) ^ '麂'))))) - 27593) ^ 6071))) ^ var5) >>> 14) - 14460) << 5))) << 12) + 9124));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIlIlllIlIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iilIIIIiIIiIIIIi, this.lIiIIIIiiIiIIIIi, this.IliIIIIilliIIIIi});
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_1569()) {
         boolean var1 = this.iilIIIIiIIiIIIIi.Iilllilliill().equals(IliIlllilIi<invokedynamic>());
         if (var1 && (double)Iiiilllliiilll.field_1724.method_6032() > this.lIiIIIIiiIiIIIIi.Iilllilliill()) {
            this.iliIIIIiIiiIIIIi.IliIlllilIi();
         } else if (this.iliIIIIiIiiIIIIi.iIlIlllllill((double)300.0F)) {
            int var2;
            if (var1) {
               var2 = IllIiIillllIiIil.IliIlllilIi(0, 9, class_1294.field_5915);
               if (var2 == -1) {
                  return;
               }
            } else {
               var2 = Iiiilllliiilll.field_1724.method_31548().method_67532();
            }

            float var3 = Iiiilllliiilll.field_1724.method_36455();
            int var4 = Iiiilllliiilll.field_1724.method_31548().method_67532();
            Iiiilllliiilll.field_1724.method_31548().method_61496(var2);
            Iiiilllliiilll.field_1724.method_36457((float)this.IliIIIIilliIIIIi.Iilllilliill() - 1.0F + ThreadLocalRandom.current().nextFloat());
            Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
            Iiiilllliiilll.field_1724.method_36457(var3);
            Iiiilllliiilll.field_1724.method_31548().method_61496(var4);
            this.iliIIIIiIiiIIIIi.IliIlllilIi();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] << 1 | var4[var5] >>> 15))))) + var5) - '\ue750'))) + var5) << 4 | (char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] << 1 | var4[var5] >>> 15))))) + var5) - '\ue750'))) + var5) >>> 12) >>> 4 | (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] << 1 | var4[var5] >>> 15))))) + var5) - '\ue750'))) + var5) << 4 | (char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] << 1 | var4[var5] >>> 15))))) + var5) - '\ue750'))) + var5) >>> 12) << 12) ^ var5) + 19449));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) >>> 5 | (char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) << 11) + '판') << 7 | (char)((char)((char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) >>> 5 | (char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) << 11) + '판') >>> 9) - var5))) - var5) - 15408) + var5) ^ 'ꤟ') << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) >>> 5 | (char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) << 11) + '판') << 7 | (char)((char)((char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) >>> 5 | (char)(~((char)((char)(var4[var5] - 21780) ^ 3915))) << 11) + '판') >>> 9) - var5))) - var5) - 15408) + var5) ^ 'ꤟ') >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4020864354116134522L ^ Long.rotateLeft(-8486901400507066175L, 21) ^ -3226486044370169026L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3079654982384252081L ^ Long.rotateLeft(-8589576685403425596L, 31) ^ -1018161687748130241L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1750721130730632649L ^ Long.rotateLeft(-5318439111900153896L, 31) ^ 6591391153064366052L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8094426260575376228L ^ Long.rotateLeft(-6246178157935627375L, 27) ^ 4360219945985446174L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6301322464199623729L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1935910697045288036L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6891858331742535892L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2808462466206183762L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5538353367944730370L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 927132699046680394L;
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
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) >>> 10 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) << 6))) >>> 13 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) >>> 10 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) << 6))) << 3) - '톢') + var5))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) >>> 10 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) << 6))) >>> 13 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) >>> 10 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5))) << 4) << 6))) << 3) - '톢') + var5))) ^ var5))) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
