package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
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
import net.minecraft.class_332;

public class IillIIllillIIl {
   private final IIIIlilllIIIlill IiIilliIlliIilliIl;
   private int illilliIlIililliIl;
   private static final int IIIilliIllIIilliIl = 4;
   private final liIliIliiIliIl iiIilliIlIIlilliIl;
   private final liIliIliiIliIl lIlilliIliIlilliIl;
   private static final int liillliIliiillliIl = 4;
   private boolean iIiilliIlIliilliIl = false;
   private int IllilliIllllilliIl;
   private int lililliIliililliIl;
   private static final int iIIilliIlIlIilliIl = 9;
   private static final int ilillliIlIiillliIl = 4;
   private int IIiilliIllIiilliIl;
   private static final int llIilliIlilIilliIl = 9;

   public void IliIlllilIi(class_332 mouseY, int mouseX, int ctx) {
      long var20 = -4940200736875643194L;
      long var22 = -5657363511536180715L;
      long var24 = 1556838029142478412L;
      long var26 = -4332410399508176204L;
      String var4 = this.IiIilliIlliIilliIl.IliIlllilIi() + IIlllIlliIll<invokedynamic>() + String.format(IIlllIlliIll<invokedynamic>(), this.IiIilliIlliIilliIl.Iilllilliill());
      CorzClient.fontRenderer().IliIlllilIi(var4, (float)(this.IllilliIllllilliIl + 4), (float)(this.illilliIlIililliIl + 4), new Color(-3947581));
      var20 ^= ((long)(this.IllilliIllllilliIl + 4) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)(this.illilliIlIililliIl + 4 + 9 + 9) ^ var20) & -1L >>> 32;
      var22 ^= ((long)(this.lililliIliililliIl - 8) << 32 ^ var22) & -1L << 32;
      var22 ^= ((long)(mouseX >= (int)(var20 >>> 32) && mouseX <= (int)(var20 >>> 32) + (int)(var22 >>> 32) && ctx >= (int)var20 - 4 && ctx <= (int)var20 + 4 + 4 ? 1 : 0) ^ var22) & -1L >>> 32;
      this.lIlilliIliIlilliIl.lIiiIiIlilli((int)var22 == 0 && !this.iIiilliIlIliilliIl ? (double)0.0F : (double)1.0F);
      double var9 = this.lIlilliIliIlilliIl.iIlIlllllill();
      IIiIllIllIiIllIl.Iilllilliill(mouseY, (int)(var20 >>> 32), (int)var20, (int)(var22 >>> 32), 4);
      double var11 = this.IiIilliIlliIilliIl.Iilllilliill();
      if (Math.abs(this.iiIilliIlIIlilliIl.IiIlliIliiIl() - var11) > 0.001) {
         this.iiIilliIlIIlilliIl.lIiiIiIlilli(var11);
      }

      double var13 = this.iiIilliIlIIlilliIl.iIlIlllllill();
      double var15 = (var13 - this.IiIilliIlliIilliIl.Ililllililil()) / (this.IiIilliIlliIilliIl.Iiilliiliiil() - this.IiIilliIlliIilliIl.Ililllililil());
      var24 ^= ((long)((int)(var15 * (double)((int)(var22 >>> 32)))) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((int)(var20 >>> 32) + (int)(var24 >>> 32)) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)var20 + 2) << 32 ^ var26) & -1L << 32;
      IIiIllIllIiIllIl.IIillIiliIil(mouseY, (int)(var20 >>> 32), (int)var20, (int)(var24 >>> 32), 4);
      IIiIllIllIiIllIl.Ililllililil(mouseY, (int)var24, (int)(var26 >>> 32), 4, Math.max(var9, this.iIiilliIlIliilliIl ? (double)1.0F : (double)0.0F));
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 12555) + 26592) ^ 7283) - var5) - 2316) ^ var5) ^ '\udf2a') << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 12555) + 26592) ^ 7283) - var5) - 2316) ^ var5) ^ '\udf2a') >>> 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 12555) + 26592) ^ 7283) - var5) - 2316) ^ var5) ^ '\udf2a') << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 12555) + 26592) ^ 7283) - var5) - 2316) ^ var5) ^ '\udf2a') >>> 11) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(int width, int y, int height, int x) {
      this.IllilliIllllilliIl = width;
      this.illilliIlIililliIl = y;
      this.lililliIliililliIl = height;
      this.IIiilliIllIiilliIl = x;
   }

   public boolean IiIlliIliiIl() {
      return this.iIiilliIlIliilliIl;
   }

   public boolean liiiIIllIl(double button, double mouseY, int mouseX) {
      long var9 = 1194144106778434028L;
      long var11 = -6138636577052765823L;
      if (mouseX != 0) {
         return false;
      } else {
         var9 ^= ((long)(this.IllilliIllllilliIl + 4) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)(this.illilliIlIililliIl + 4 + 9 + 9) ^ var9) & -1L >>> 32;
         var11 ^= ((long)(this.lililliIliililliIl - 8) << 32 ^ var11) & -1L << 32;
         if (button >= (double)((int)(var9 >>> 32)) && button <= (double)((int)(var9 >>> 32) + (int)(var11 >>> 32)) && mouseY >= (double)((int)var9 - 4) && mouseY <= (double)((int)var9 + 4 + 4)) {
            this.iIiilliIlIliilliIl = true;
            this.lIiiIiIlilli(button);
            return true;
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5))) << 11 | (char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5))) >>> 5) - '헣') - '肏') ^ var5) ^ 8509) - var5) - var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 597631699490271337L ^ Long.rotateLeft(-5008911354009392096L, 42) ^ -6839658772244568992L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6116241404885743435L ^ Long.rotateLeft(3499013740924304102L, 11) ^ -3139208066320657197L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3004193769045126762L ^ Long.rotateLeft(5821190167862604510L, 42) ^ 7783557437835707842L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5670999941601553664L ^ Long.rotateLeft(9098455439735245942L, 19) ^ -6111994558042723121L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6559687812835660818L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1535444927478621289L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1104530594736514207L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6102699072695503779L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -843788081221558679L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4860995311548123584L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   public int IlIlllIlilIl() {
      return this.IIiilliIllIiilliIl;
   }

   private void lIiiIiIlilli(double mouseX) {
      long var15 = 7191043613968933238L;
      var15 ^= ((long)(this.IllilliIllllilliIl + 4) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(this.lililliIliililliIl - 8) ^ var15) & -1L >>> 32;
      double var5 = (mouseX - (double)((int)(var15 >>> 32))) / (double)((int)var15);
      var5 = Math.max((double)0.0F, Math.min((double)1.0F, var5));
      double var7 = this.IiIilliIlliIilliIl.Iiilliiliiil() - this.IiIilliIlliIilliIl.Ililllililil();
      double var9 = this.IiIilliIlliIilliIl.Ililllililil() + var5 * var7;
      double var11 = this.IiIilliIlliIilliIl.IlIillIiilIi();
      double var13 = (double)Math.round(var9 / var11) * var11;
      var13 = Math.max(this.IiIilliIlliIilliIl.Ililllililil(), Math.min(this.IiIilliIlliIilliIl.Iiilliiliiil(), var13));
      this.IiIilliIlliIilliIl.IIillIiliIil(var13);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) - '\ue8f7') + var5) >>> 1 | (char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) - '\ue8f7') + var5) << 15) - 'ﲓ'))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(double button, double mouseX, int mouseY) {
      if (mouseY == 0) {
         this.iIiilliIlIliilliIl = false;
      }

   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue6a8') << 12 | (char)(var4[var5] + '\ue6a8') >>> 4) << 13 | (char)((char)(var4[var5] + '\ue6a8') << 12 | (char)(var4[var5] + '\ue6a8') >>> 4) >>> 3) ^ var5) ^ var5) ^ '\ufb1b'))) ^ var5) - var5) ^ var5) + '貙') + var5) ^ '褚'))) - '콶') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIIllIIliIIl(double mouseY, double mouseX) {
      return mouseY >= (double)this.IllilliIllllilliIl && mouseY <= (double)(this.IllilliIllllilliIl + this.lililliIliililliIl) && mouseX >= (double)this.illilliIlIililliIl && mouseX <= (double)(this.illilliIlIililliIl + this.IIiilliIllIiilliIl);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '쯥'))) ^ 13045) - var5) ^ var5))) - var5) + '녅') + 29169) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '쯥'))) ^ 13045) - var5) ^ var5))) - var5) + '녅') + 29169) >>> 13) + '\ue8c7') + 10081) - '넵') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '쯥'))) ^ 13045) - var5) ^ var5))) - var5) + '녅') + 29169) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '쯥'))) ^ 13045) - var5) ^ var5))) - var5) + '녅') + 29169) >>> 13) + '\ue8c7') + 10081) - '넵') >>> 8) ^ '\ueced') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IillIIllillIIl(IIIIlilllIIIlill y, int height, int width, int setting, int x) {
      this.IiIilliIlliIilliIl = y;
      this.IllilliIllllilliIl = height;
      this.illilliIlIililliIl = width;
      this.lililliIliililliIl = setting;
      this.IIiilliIllIiilliIl = x;
      this.iiIilliIlIIlilliIl = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, y.Iilllilliill());
      this.lIlilliIliIlilliIl = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, (double)0.0F);
   }

   public void iIlIlllllill(double mouseX, double mouseY, int button) {
      if (this.iIiilliIlIliilliIl) {
         this.lIiiIiIlilli(mouseX);
      }

   }
}
