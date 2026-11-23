package gg.corz;

import com.corz.client.mixins.AccessorBiomeAccess;
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
import net.minecraft.class_2561;

public class liIIIiIiiiIIIiIi extends ilIllIiIll {
   private final iiIiiilIIliiil llillilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IlillilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 18260) ^ 'ꅯ'))) ^ '蒚') - var5) + '틖') - var5) + var5) - '菼') + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 18260) ^ 'ꅯ'))) ^ '蒚') - var5) + '틖') - var5) + var5) - '菼') + var5) >>> 13))) + 'ꮉ'))) - 'ﱉ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }

   }

   public liIIIiIiiiIIIiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlillilIIi, this.llillilIIi});
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(var4[var5] - var5))) - var5))))) << 12 | (char)(-((char)(~((char)((char)(~((char)(var4[var5] - var5))) - var5))))) >>> 4) >>> 9 | (char)((char)(-((char)(~((char)((char)(~((char)(var4[var5] - var5))) - var5))))) << 12 | (char)(-((char)(~((char)((char)(~((char)(var4[var5] - var5))) - var5))))) >>> 4) << 7) + var5) ^ var5) + 24115) - var5) + 14820) - 23713))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6730497474289022403L ^ Long.rotateLeft(-2039872653150373582L, 49) ^ 4993083470602800638L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2653805143030572400L ^ Long.rotateLeft(8020958132490657707L, 49) ^ -4079524051422837497L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5707848397553726025L ^ Long.rotateLeft(-7256059042367036739L, 62) ^ 4634050809015351959L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4973151319938537460L ^ Long.rotateLeft(-5653810392549947742L, 14) ^ 4730374706265454980L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3997828268052165506L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8986637820785745495L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4948810849624425080L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4490953292738017622L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 213768737563832675L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -162867167901267668L;
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

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) >>> 5))) >>> 10 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) >>> 5))) << 6) + var5) ^ var5) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) >>> 5))) >>> 10 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 'ﴰ') ^ var5) ^ var5) ^ '읈') ^ var5))) - var5) + var5) - var5) >>> 5))) << 6) + var5) ^ var5) << 4) - var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))))) ^ 339) + 13360) + 3670) + 16508) + 28349) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))))) ^ 339) + 13360) + 3670) + 16508) + 28349) << 12) - 29639))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      long var5 = -3043199488124357781L;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var1 = ((AccessorBiomeAccess)Iiiilllliiilll.field_1687.method_22385()).getSeed();
         var5 ^= ((long)Iiiilllliiilll.method_1542() << 32 ^ var5) & -1L << 32;
         String var4 = (int)(var5 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
         this.iiiIlIIIll(IliIlllilIi<invokedynamic>() + var4);
         this.iiiIlIIIll(IliIlllilIi<invokedynamic>() + var1);
         if (this.llillilIIi.Iilllilliill()) {
            this.iiiIlIIIll(IliIlllilIi<invokedynamic>() + Long.toHexString(var1));
         }

         if (this.IlillilIIi.Iilllilliill()) {
            Iiiilllliiilll.field_1774.method_1455(Long.toString(var1));
            this.iiiIlIIIll(IliIlllilIi<invokedynamic>());
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + var1, true);
         } else {
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + var1, true);
         }

         this.IIillIiliIil(false);
      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
         this.IIillIiliIil(false);
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) >>> 9) + var5) ^ var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) >>> 9) + var5) ^ var5) >>> 7))) + var5) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) >>> 9) + var5) ^ var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) - var5) >>> 13) << 14) >>> 9) >>> 14) >>> 9) + var5) ^ var5) >>> 7))) + var5) >>> 1) + var5) - '뀚'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
