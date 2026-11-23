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

public class iilliilIIiliil {
   private boolean IlIlIlllillIlIllli = false;
   private int IiiIIllliliiIIllli;
   private final liIliIliiIliIl IIiIIlllilIiIIllli;
   private static final int lIlIIllliiIlIIllli = 4;
   private static final int IiIIIllliliIIIllli = 4;
   private final liIliIliiIliIl iIiIIllliIliIIllli;
   private final iilliIlIIiliIl lilIIllliiilIIllli;
   private static final int iiIIIllliIIlIIllli = 4;
   private int iiiIIllliIIIlIllli;
   private int lliIIllliiliIIllli;
   private int lIIlIllliiIIlIllli;
   private static final int illIIllliIilIIllli = 9;
   private static final int IllIIlllilllIIllli = 9;

   public void IliIlllilIi(class_332 ctx, int mouseY, int mouseX) {
      long var20 = -5187270451293446134L;
      long var22 = -4071576448119847112L;
      long var24 = -4706013432221260266L;
      long var26 = -7865915406922425921L;
      String var4 = this.lilIIllliiilIIllli.IliIlllilIi() + IIlllIlliIll<invokedynamic>() + this.lilIIllliiilIIllli.Iilllilliill();
      CorzClient.fontRenderer().IliIlllilIi(var4, (float)(this.lliIIllliiliIIllli + 4), (float)(this.IiiIIllliliiIIllli + 4), new Color(-3947581));
      String var5 = this.lilIIllliiilIIllli.IIlilIliiIli();
      if (var5 != null) {
         var20 ^= ((long)((int)CorzClient.fontRenderer().iIlIlllllill(var4)) << 32 ^ var20) & -1L << 32;
         CorzClient.fontRenderer().IliIlllilIi(var5, (float)(this.lliIIllliiliIIllli + 4 + (int)(var20 >>> 32) + 5), (float)(this.IiiIIllliliiIIllli + 4), new Color(235, 96, 92));
      }

      var20 ^= ((long)(this.lliIIllliiliIIllli + 4) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)(this.IiiIIllliliiIIllli + 4 + 9 + 9) ^ var20) & -1L >>> 32;
      var22 ^= ((long)(this.iiiIIllliIIIlIllli - 8) << 32 ^ var22) & -1L << 32;
      var22 ^= ((long)(mouseY >= (int)(var20 >>> 32) && mouseY <= (int)(var20 >>> 32) + (int)(var22 >>> 32) && mouseX >= (int)var20 - 4 && mouseX <= (int)var20 + 4 + 4 ? 1 : 0) ^ var22) & -1L >>> 32;
      this.iIiIIllliIliIIllli.lIiiIiIlilli((int)var22 == 0 && !this.IlIlIlllillIlIllli ? (double)0.0F : (double)1.0F);
      double var10 = this.iIiIIllliIliIIllli.iIlIlllllill();
      IIiIllIllIiIllIl.Iilllilliill(ctx, (int)(var20 >>> 32), (int)var20, (int)(var22 >>> 32), 4);
      double var12 = (double)this.lilIIllliiilIIllli.Iilllilliill();
      if (Math.abs(this.IIiIIlllilIiIIllli.IiIlliIliiIl() - var12) > 0.01) {
         this.IIiIIlllilIiIIllli.lIiiIiIlilli(var12);
      }

      double var14 = this.IIiIIlllilIiIIllli.iIlIlllllill();
      float var16 = (float)(var14 - (double)this.lilIIllliiilIIllli.Ililllililil()) / (float)(this.lilIIllliiilIIllli.Iiilliiliiil() - this.lilIIllliiilIIllli.Ililllililil());
      var24 ^= ((long)((int)(var16 * (float)((int)(var22 >>> 32)))) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((int)(var20 >>> 32) + (int)(var24 >>> 32)) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)var20 + 2) << 32 ^ var26) & -1L << 32;
      IIiIllIllIiIllIl.IIillIiliIil(ctx, (int)(var20 >>> 32), (int)var20, (int)(var24 >>> 32), 4);
      IIiIllIllIiIllIl.Ililllililil(ctx, (int)var24, (int)(var26 >>> 32), 4, Math.max(var10, this.IlIlIlllillIlIllli ? (double)1.0F : (double)0.0F));
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 7 | (char)(-((char)(var4[var5] ^ var5))) << 9) ^ var5) - var5) ^ '쌛') << 1 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 7 | (char)(-((char)(var4[var5] ^ var5))) << 9) ^ var5) - var5) ^ '쌛') >>> 15) ^ '\ude17') + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(int height, int y, int x, int width) {
      this.lliIIllliiliIIllli = height;
      this.IiiIIllliliiIIllli = y;
      this.iiiIIllliIIIlIllli = x;
      this.lIIlIllliiIIlIllli = width;
   }

   public boolean liiiIIllIl(double mouseY, double mouseX, int button) {
      long var9 = 1035463562430288447L;
      long var11 = 1549470391263767396L;
      if (button != 0) {
         return false;
      } else {
         var9 ^= ((long)(this.lliIIllliiliIIllli + 4) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)(this.IiiIIllliliiIIllli + 4 + 9 + 9) ^ var9) & -1L >>> 32;
         var11 ^= ((long)(this.iiiIIllliIIIlIllli - 8) << 32 ^ var11) & -1L << 32;
         if (mouseY >= (double)((int)(var9 >>> 32)) && mouseY <= (double)((int)(var9 >>> 32) + (int)(var11 >>> 32)) && mouseX >= (double)((int)var9 - 4) && mouseX <= (double)((int)var9 + 4 + 4)) {
            this.IlIlIlllillIlIllli = true;
            this.lIiiIiIlilli(mouseY);
            return true;
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) >>> 15) ^ '붔') ^ var5)) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) >>> 15) ^ '붔') ^ var5)) ^ var5) >>> 1) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) >>> 15) ^ '붔') ^ var5)) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) >>> 8 | (char)((char)((char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) << 7 | (char)(-((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15))) >>> 9) + var5) << 8) << 15) ^ var5) + '\udee4') ^ var5) >>> 15) ^ '붔') ^ var5)) ^ var5) >>> 1) << 3) - 'ꦭ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl() {
      return this.IlIlIlllillIlIllli;
   }

   public void IilliliilIIi(double button, double mouseX, int mouseY) {
      if (mouseY == 0) {
         this.IlIlIlllillIlIllli = false;
      }

   }

   public int IlIlllIlilIl() {
      return this.lIIlIllliiIIlIllli;
   }

   public boolean IIIllIIliIIl(double mouseY, double mouseX) {
      return mouseY >= (double)this.lliIIllliiliIIllli && mouseY <= (double)(this.lliIIllliiliIIllli + this.iiiIIllliIIIlIllli) && mouseX >= (double)this.IiiIIllliliiIIllli && mouseX <= (double)(this.IiiIIllliliiIIllli + this.lIIlIllliiIIlIllli);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 24362) >>> 2 | (char)(var4[var5] + 24362) << 14) + var5) - var5) >>> 1 | (char)((char)((char)((char)(var4[var5] + 24362) >>> 2 | (char)(var4[var5] + 24362) << 14) + var5) - var5) << 15) - var5))))) - var5) ^ var5) ^ var5) + var5))) ^ var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 24362) >>> 2 | (char)(var4[var5] + 24362) << 14) + var5) - var5) >>> 1 | (char)((char)((char)((char)(var4[var5] + 24362) >>> 2 | (char)(var4[var5] + 24362) << 14) + var5) - var5) << 15) - var5))))) - var5) ^ var5) ^ var5) + var5))) ^ var5) << 6) ^ '賍') - '섅'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(double mouseX, double mouseY, int button) {
      if (this.IlIlIlllillIlIllli) {
         this.lIiiIiIlilli(mouseX);
      }

   }

   private void lIiiIiIlilli(double mouseX) {
      long var11 = 6027086713611552195L;
      long var13 = 4569012085518583677L;
      long var15 = -7306082613493363833L;
      var11 ^= ((long)(this.lliIIllliiliIIllli + 4) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(this.iiiIIllliIIIlIllli - 8) ^ var11) & -1L >>> 32;
      double var5 = (mouseX - (double)((int)(var11 >>> 32))) / (double)((int)var11);
      var5 = Math.max((double)0.0F, Math.min((double)1.0F, var5));
      var13 ^= ((long)(this.lilIIllliiilIIllli.Iiilliiliiil() - this.lilIIllliiilIIllli.Ililllililil()) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)((int)((double)this.lilIIllliiilIIllli.Ililllililil() + var5 * (double)((int)(var13 >>> 32)))) ^ var13) & -1L >>> 32;
      var15 ^= ((long)this.lilIIllliiilIIllli.IlIillIiilIi() << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(((int)var13 - this.lilIIllliiilIIllli.Ililllililil()) / (int)(var15 >>> 32) * (int)(var15 >>> 32) + this.lilIIllliiilIIllli.Ililllililil()) ^ var15) & -1L >>> 32;
      this.lilIIllliiilIIllli.IIillIiliIil((int)var15);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 31432) >>> 1 | (char)((char)(-var4[var5]) - 31432) << 15) - 10969) - var5))) - 19243))) - '캍') + var5) + var5))) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilliilIIiliil(iilliIlIIiliIl x, int setting, int height, int y, int width) {
      this.lilIIllliiilIIllli = x;
      this.lliIIllliiliIIllli = setting;
      this.IiiIIllliliiIIllli = height;
      this.iiiIIllliIIIlIllli = y;
      this.lIIlIllliiIIlIllli = width;
      this.IIiIIlllilIiIIllli = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, (double)x.Iilllilliill());
      this.iIiIIllliIliIIllli = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, (double)0.0F);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8065362983217674809L ^ Long.rotateLeft(8228213684921023592L, 40) ^ -2223161185057345462L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4429775981998313002L ^ Long.rotateLeft(4294701310896520878L, 4) ^ 5532006793013496367L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4438506613283523155L ^ Long.rotateLeft(-4460162962795005206L, 34) ^ 2055797525040588736L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6846024938919200933L ^ Long.rotateLeft(-2983543792269937553L, 62) ^ 9058022957829571001L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5593913058112284062L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -984585416749401183L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2550883988778018312L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6148482395485882997L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5776510250399893167L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7819913385164715865L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) >>> 8) << 14 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) >>> 8) >>> 2) - var5) - var5) + 16505) ^ var5)) - var5) ^ 'ꊧ') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) >>> 8) << 14 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] + '蓤'))) ^ 19030) ^ var5) ^ 27489) >>> 8) >>> 2) - var5) - var5) + 16505) ^ var5)) - var5) ^ 'ꊧ') >>> 5) - var5))) - 29855) ^ '\udb09'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
