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
import net.minecraft.class_10255;
import net.minecraft.class_1313;
import net.minecraft.class_746;

public class iilliIIlIIiliIIl extends ilIllIiIll {
   private class_10255 IliIiIilIl;
   private final iiIiiilIIliiil iIiIiIilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill lIiIiIilIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.5F, 0.1, (double)5.0F, 0.05);
   private final IIIIlilllIIIlill IIiIiIilIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.6, 0.1, (double)5.0F, 0.05);

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)(var4[var5] << 12 | var4[var5] >>> 4))) + 2326))))) - 17853)) << 10 | (char)((char)((char)(~((char)(-((char)((char)(-((char)(var4[var5] << 12 | var4[var5] >>> 4))) + 2326))))) - 17853)) >>> 6) + '묷') + '\ue71d') + 'ꜿ') ^ var5) + '욕')))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      if (this.IliIiIilIl != null) {
         this.IliIiIilIl.field_5960 = false;
         this.IliIiIilIl = null;
      }

   }

   public iilliIIlIIiliIIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiIiIilIl, this.lIiIiIilIl, this.iIiIiIilIl});
   }

   protected void iIIIlIlIIl() {
      if (this.IliIiIilIl != null && (Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1724.method_5854() != this.IliIiIilIl)) {
         this.lIIlliIIll();
      }

   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) ^ '뿭') + var5))))) ^ '\udcd5') ^ 21024))) - '\ue6ae') + '뿓') + 21929));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iiiIlIIIll(class_10255 type, class_1313 boat) {
      long var11 = -1520071789637614339L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (var3 != null && var3.method_5854() == type) {
         double var4 = (Iiiilllliiilll.field_1690.field_1894.method_1434() ? (double)1.0F : (double)0.0F) - (Iiiilllliiilll.field_1690.field_1881.method_1434() ? (double)1.0F : (double)0.0F);
         double[] var6 = IilIililIi.IliIlllilIi((double)0.0F, var4, this.IIiIiIilIl.Iilllilliill(), type.method_36454());
         double var7 = (double)0.0F;
         var11 ^= ((long)Iiiilllliiilll.field_1690.field_1903.method_1434() << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)Iiiilllliiilll.field_1690.field_1832.method_1434() ^ var11) & -1L >>> 32;
         if ((int)(var11 >>> 32) != (int)var11) {
            var7 = (int)(var11 >>> 32) != 0 ? this.lIiIiIilIl.Iilllilliill() : -this.lIiIiIilIl.Iilllilliill();
         }

         type.method_18800(var6[0], var7, var6[1]);
         type.field_5960 = this.iIiIiIilIl.Iilllilliill();
         this.IliIiIilIl = type;
         type.field_6017 = (double)0.0F;
         var3.field_6017 = (double)0.0F;
         type.method_5784(boat, type.method_18798());
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + '\ue885') >>> 4 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + '\ue885') << 12) - 24405) - '蓺') >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + '\ue885') >>> 4 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + '\ue885') << 12) - 24405) - '蓺') << 11) - var5) - var5) - '髕'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7399529714347626532L ^ Long.rotateLeft(-8115486195441585315L, 24) ^ -1133897787050122585L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -828906091802791122L ^ Long.rotateLeft(-3491391125200717017L, 56) ^ 725905806324046318L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1076058689567629966L ^ Long.rotateLeft(-4143276577852007430L, 29) ^ 9185005267520272762L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4205289816332703436L ^ Long.rotateLeft(-5083821910897038326L, 19) ^ -6166504307611845992L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4001438178386899036L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1167553262300832366L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2078083934275864695L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3681518479784307631L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8450233583144860159L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4189183728707854578L;
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

   protected void Iilililiiili() {
      this.lIIlliIIll();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') << 4) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') << 4) >>> 12) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') << 4) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9) ^ var5))) ^ 26572) ^ var5) - var5) ^ '붤') << 4) >>> 12) << 6) ^ var5));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) << 2) << 7 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) << 2) >>> 9) - 17639) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) << 2) << 7 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) + '蚒') - var5) - 19631) - var5))) << 9) >>> 7) >>> 1) << 2) >>> 9) - 17639) - var5) << 1) + var5))) - 'ꢐ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
