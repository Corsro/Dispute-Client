package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_2680;

public class iIllIiilIlllIiil extends ilIllIiIll {
   private final iiIiiilIIliiil IIIiiillil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private int IlIiiillil = 0;
   private static final int iiIiiillil = 10;
   private final iiIiiilIIliiil iIIiiillil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final int llIiiillil = 0;
   private final iiIiiilIIliiil iiiliillil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int Illiiillil = 0;
   private int iIliiillil = 0;
   private final List<lilIIiliilIIil> llliiillil = new ArrayList();
   private static final int liIiiillil = 2;
   private final IIIIlilllIIIlill liiliillil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)1.0F, (double)10.0F, 0.1);
   private int lIliiillil = 3;
   private static final int IiIiiillil = 8;
   private static final int IIliiillil = 3;
   private static final int ilIiiillil = 8;
   private final iilliIlIIiliIl lIIiiillil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 1, 20);

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ 'ﲎ') ^ var5) - 27575))) + 26495) - 10679) ^ var5) - var5) + var5) ^ '蕑') ^ 5275))) + var5) ^ 14322));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) >>> 1 | (char)(~var4[var5]) << 15) ^ var5)))) - 32691) ^ var5))))))) >>> 5 | (char)(-((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) >>> 1 | (char)(~var4[var5]) << 15) ^ var5)))) - 32691) ^ var5))))))) << 11) + 16099) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void ilIllIiIll(class_2338 pos, class_2680 original) {
      if (this.IIIiiillil.Iilllilliill()) {
         this.IlIiiillil = this.Illiiillil + this.lIIiiillil.Iilllilliill();
      }

      if (this.iIIiiillil.Iilllilliill() && this.llliiillil.size() < (1309153789 - -111 + 19 ^ 1309154175)) {
         this.llliiillil.add(new lilIIiliilIIil(pos, original, this.Illiiillil));
      }

   }

   protected void Illillliilli() {
      this.lIliiillil = 3;
      this.iIliiillil = 0;
      this.IlIiiillil = 0;
      this.llliiillil.clear();
   }

   public boolean IlIllllIll() {
      return this.IIIiiillil.Iilllilliill() || this.iIIiiillil.Iilllilliill();
   }

   private void liIlliiIll(AccessorClientPlayerInteractionManager im) {
      if (Iiiilllliiilll.field_1687 != null) {
         Iterator var2 = this.llliiillil.iterator();

         while(var2.hasNext()) {
            lilIIiliilIIil var3 = (lilIIiliilIIil)var2.next();
            class_2680 var4 = Iiiilllliiilll.field_1687.method_8320(var3.lIlIiilIiiIlIiilIi);
            int var5 = this.Illiiillil - var3.illIiilIiIilIiilIi;
            boolean var6 = var4.equals(var3.IllIiilIilllIiilIi) || !var4.method_26215() && var4.method_26204() == var3.IllIiilIilllIiilIi.method_26204();
            if (var6) {
               this.iIliiillil = 0;
               int var7 = this.lIliiillil;
               this.lIliiillil = Math.min(this.lIliiillil + 2, 8);
               var2.remove();
            } else if (var5 >= 10) {
               ++this.iIliiillil;
               if (this.iIliiillil >= 8 && this.lIliiillil > 0) {
                  int var8 = this.lIliiillil--;
                  this.iIliiillil = 0;
               }

               var2.remove();
            }
         }
      }

      if (im.getBlockBreakingCooldown() > this.lIliiillil) {
         im.setBlockBreakingCooldown(this.lIliiillil);
      }

   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) << 6 | (char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) >>> 10) + var5) << 15 | (char)((char)((char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) << 6 | (char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) >>> 10) + var5) >>> 1) << 13 | (char)((char)((char)((char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) << 6 | (char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) >>> 10) + var5) << 15 | (char)((char)((char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) << 6 | (char)(-((char)(~((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5))))))) >>> 10) + var5) >>> 1) >>> 3))) - var5) + 14536) - var5) ^ '襛') - 28596));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIllIiilIlllIiil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liiliillil, this.iiiliillil, this.IIIiiillil, this.lIIiiillil, this.iIIiiillil});
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1761 != null) {
         ++this.Illiiillil;
         AccessorClientPlayerInteractionManager var1 = (AccessorClientPlayerInteractionManager)Iiiilllliiilll.field_1761;
         if (this.IIIiiillil.Iilllilliill()) {
            if (this.iiiliillil.Iilllilliill() && this.lIIlliIIll()) {
               var1.setBlockBreakingCooldown(0);
            }

         } else if (this.iIIiiillil.Iilllilliill()) {
            this.liIlliiIll(var1);
         } else if (this.iiiliillil.Iilllilliill()) {
            var1.setBlockBreakingCooldown(0);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) << 10) + var5) ^ var5) + '\ue5c7') << 15 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) << 10) + var5) ^ var5) + '\ue5c7') >>> 1) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) << 10) + var5) ^ var5) + '\ue5c7') << 15 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ '\ue33c') - var5))) << 10) + var5) ^ var5) + '\ue5c7') >>> 1) << 15) ^ 'ꪒ'))) - 32079) + var5) - 'ꇻ') + '薏'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIIlliIIll() {
      return !this.IIIiiillil.Iilllilliill() || this.Illiiillil >= this.IlIiiillil;
   }

   protected void Iilililiiili() {
      this.llliiillil.clear();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ 20984) ^ var5) ^ 5002))) << 5 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ 20984) ^ var5) ^ 5002))) >>> 11) - var5) ^ '읪') + 14453) + var5) << 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ 20984) ^ var5) ^ 5002))) << 5 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ 20984) ^ var5) ^ 5002))) >>> 11) - var5) ^ '읪') + 14453) + var5) >>> 7))))))) + '\ud904'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 564275364141049825L ^ Long.rotateLeft(9028924915322038518L, 37) ^ -5284879400660505828L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7271366800469120665L ^ Long.rotateLeft(-3668181858592156979L, 51) ^ 699788665649762442L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1840982614258805403L ^ Long.rotateLeft(669630702617839295L, 63) ^ 6140388443741789646L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 796842567337211966L ^ Long.rotateLeft(4000919278149500821L, 44) ^ -6509692824476460273L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3594074787023665327L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7971198325137407208L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2657023385900824131L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6091306336170870040L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2041669927871927757L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7615955625906329877L;
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

   public float iiiIlIIIll() {
      return (float)this.liiliillil.Iilllilliill();
   }
}
