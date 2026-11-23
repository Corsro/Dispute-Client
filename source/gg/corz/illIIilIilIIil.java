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

public class illIIilIilIIil {
   private static final int lIIililIiiIIililIi = 4;
   private int IIIIiilIilIIIiilIi;
   private static final int iIlililIiIllililIi = 3;
   private static final int IIlililIilIlililIi = 20;
   private int IiIIiilIiliIIiilIi;
   private static final int lllililIiillililIi = 6;
   private static final int IilililIililililIi = 6;
   private static final int IlIililIillIililIi = 3;
   private final liIliIliiIliIl lIiililIiiIiililIi;
   private int liiililIiiiiililIi;
   private int iiIIiilIiIIlIiilIi = 0;
   private final iliiIiIiIiiiIiIi IliililIilliililIi = new iliiIiIiIiiiIiIi();
   private boolean llIIiilIiilIIiilIi;
   private static final int ilIililIiIiIililIi = 9;
   private int iliililIiIiiililIi;
   private static final int liIililIiiiIililIi = 7;
   private int iIIIiilIiIlIIiilIi;
   private final IIiiIIIllIiiIIIl iilililIiIIiililIi;

   public boolean lIiiIiIlilli(char modifiers, int chr) {
      if (this.llIIiilIiilIIiilIi && modifiers >= ' ' && modifiers != 127) {
         String var3 = this.iilililIiIIiililIi.Iilllilliill();
         this.iilililIiIIiililIi.IIillIiliIil(var3.substring(0, this.IiIIiilIiliIIiilIi) + modifiers + var3.substring(this.IiIIiilIiliIIiilIi));
         ++this.IiIIiilIiliIIiilIi;
         this.IliililIilliililIi.IliIlllilIi();
         return true;
      } else {
         return false;
      }
   }

   public void liiiIIllIl(class_332 ctx, int mouseX, int mouseY) {
      long var19 = 4668302022099550411L;
      long var21 = 3774709295680083307L;
      long var23 = 3570973577654989649L;
      long var25 = -9171024757920463883L;
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      var4.IliIlllilIi(this.iilililIiIIiililIi.IliIlllilIi(), (float)(this.iliililIiIiiililIi + 4), (float)(this.liiililIiiiiililIi + 3), new Color(-3947581));
      var19 ^= ((long)(this.iliililIiIiiililIi + 4) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)this.IliIlllilIi() ^ var19) & -1L >>> 32;
      var21 ^= ((long)(this.IIIIiilIilIIIiilIi - 8) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)(mouseX >= (int)(var19 >>> 32) && mouseX <= (int)(var19 >>> 32) + (int)(var21 >>> 32) && mouseY >= (int)var19 && mouseY <= (int)var19 + 20 ? 1 : 0) ^ var21) & -1L >>> 32;
      IIlllIlliIll(this.lIiililIiiIiililIi, (int)var21 == 0 && !this.llIIiilIiilIIiilIi ? (double)0.0F : (double)1.0F);
      double var9 = Illlllllilll(this.lIiililIiiIiililIi.iIlIlllllill());
      var23 ^= ((long)IilIIIIililIIIIi.Illlllllilll(Iilllilliill(16777215, 18), Iilllilliill(IlIIilIlllIIilIl.lliiIlliIl, 255), var9) << 32 ^ var23) & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(ctx, (int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32), 20, 6, IilIIIIililIIIIi.IlIlllIlilIl(), (int)(var23 >>> 32));
      var23 ^= ((long)((int)(var19 >>> 32) + 6) ^ var23) & -1L >>> 32;
      var25 ^= ((long)var4.IlIillIiilIi((int)var19, 20) << 32 ^ var25) & -1L << 32;
      String var14 = this.iilililIiIIiililIi.Iilllilliill();
      this.IiIIiilIiliIIiilIi = Math.max(0, Math.min(this.IiIIiilIiliIIiilIi, var14.length()));
      float var15 = (float)((int)(var19 >>> 32) + (int)(var21 >>> 32) - 6 - (int)var23);
      if (var14.isEmpty() && !this.llIIiilIiilIIiilIi) {
         var4.IliIlllilIi(Ililllililil<invokedynamic>(), (float)((int)var23), (float)((int)(var25 >>> 32)), new Color(-8421505));
         this.iiIIiilIiIIlIiilIi = 0;
      } else {
         if (this.IiIIiilIiliIIiilIi < this.iiIIiilIiIIlIiilIi) {
            this.iiIIiilIiIIlIiilIi = this.IiIIiilIiliIIiilIi;
         }

         while(this.iiIIiilIiIIlIiilIi < this.IiIIiilIiliIIiilIi && var4.iIlIlllllill(var14.substring(this.iiIIiilIiIIlIiilIi, this.IiIIiilIiliIIiilIi)) > var15) {
            ++this.iiIIiilIiIIlIiilIi;
         }

         if (this.iiIIiilIiIIlIiilIi > var14.length()) {
            this.iiIIiilIiIIlIiilIi = 0;
         }

         String var16 = IIillIiliIil(var14.substring(this.iiIIiilIiIIlIiilIi), var15);
         var4.IliIlllilIi(var16, (float)((int)var23), (float)((int)(var25 >>> 32)), new Color(-1));
         if (this.llIIiilIiilIIiilIi) {
            float var17 = (float)((int)var23) + var4.iIlIlllllill(var14.substring(this.iiIIiilIiIIlIiilIi, this.IiIIiilIiliIIiilIi));
            var25 ^= ((long)((int)var4.IilliliilIIi() - 2) ^ var25) & -1L >>> 32;
            this.IliililIilliililIi.iIlIlllllill(ctx, var17, (int)var19 + (20 - (int)var25) / 2, (int)var25, IlIIilIlllIIilIl.lliiIlliIl, llIilillilIilill.liiiIIllIl());
         }

      }
   }

   public boolean iIlIlllllill(double mouseX, double button, int mouseY) {
      long var20 = -4394422162878910817L;
      long var22 = -8547541478461534078L;
      long var24 = 311462089992001929L;
      long var26 = 556431829604955661L;
      if (mouseY != 0) {
         return false;
      } else {
         var20 ^= ((long)(this.iliililIiIiiililIi + 4) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)this.IliIlllilIi() ^ var20) & -1L >>> 32;
         var22 ^= ((long)(this.IIIIiilIilIIIiilIi - 8) << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)(mouseX >= (double)((int)(var20 >>> 32)) && mouseX <= (double)((int)(var20 >>> 32) + (int)(var22 >>> 32)) && button >= (double)((int)var20) && button <= (double)((int)var20 + 20) ? 1 : 0) ^ var22) & -1L >>> 32;
         if ((int)var22 != 0) {
            this.IlIlllIlilIl(true);
            var24 ^= ((long)((int)(var20 >>> 32) + 6) << 32 ^ var24) & -1L << 32;
            String var11 = this.iilililIiIIiililIi.Iilllilliill();
            var24 ^= ((long)var11.length() ^ var24) & -1L >>> 32;
            double var13 = Double.MAX_VALUE;

            for(long var34 = var26 ^ ((long)Math.min(this.iiIIiilIiIIlIiilIi, var11.length()) << 32 ^ var26) & -1L << 32; (int)(var34 >>> 32) <= var11.length(); var34 += 4294967296L) {
               double var16 = (double)((float)((int)(var24 >>> 32)) + CorzClient.fontRenderer().iIlIlllllill(var11.substring(Math.min(this.iiIIiilIiIIlIiilIi, var11.length()), (int)(var34 >>> 32))));
               double var18 = Math.abs(var16 - mouseX);
               if (var18 < var13) {
                  var13 = var18;
                  var24 ^= ((long)((int)(var34 >>> 32)) ^ var24) & -1L >>> 32;
               }
            }

            this.IiIIiilIiliIIiilIi = (int)var24;
            this.IliililIilliililIi.liiiIIllIl((float)((int)(var24 >>> 32)) + CorzClient.fontRenderer().iIlIlllllill(var11.substring(Math.min(this.iiIIiilIiIIlIiilIi, var11.length()), (int)var24)));
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else {
            this.IlIlllIlilIl(false);
            return false;
         }
      }
   }

   private static int Iilllilliill(int alpha, int argb) {
      return (argb & 255) << 24 | alpha & 16777215;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) >>> 9 | (char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) << 7) - '쓟') - var5) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) >>> 9 | (char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) << 7) - '쓟') - var5) ^ var5) >>> 5))) ^ '\udc2a') - 'ﮎ') << 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) >>> 9 | (char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) << 7) - '쓟') - var5) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) >>> 9 | (char)((char)(var4[var5] ^ '좿') >>> 2 | (char)(var4[var5] ^ '좿') << 14) << 7) - '쓟') - var5) ^ var5) >>> 5))) ^ '\udc2a') - 'ﮎ') >>> 14) + 2362) ^ '\uf6f3'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iliIiiliiiii(double mouseY, double mouseX) {
      return mouseY >= (double)this.iliililIiIiiililIi && mouseY <= (double)(this.iliililIiIiiililIi + this.IIIIiilIilIIIiilIi) && mouseX >= (double)this.liiililIiiiiililIi && mouseX <= (double)(this.liiililIiiiiililIi + this.iIIIiilIiIlIIiilIi);
   }

   public boolean IIIllIIliIIl() {
      return this.llIIiilIiilIIiilIi;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') >>> 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') << 10))) << 10 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') >>> 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') << 10))) >>> 6) << 7 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') >>> 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') << 10))) << 10 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') >>> 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + 7197) - var5))) ^ '趼') - '\ud805') << 10))) >>> 6) >>> 9) ^ 8322));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) >>> 10) << 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) >>> 10) >>> 5) >>> 9 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) >>> 10) << 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ufefd'))) + 18409) - 9685) - '룂') + var5) ^ var5) + 'ꌹ') << 13) + var5) ^ var5))) >>> 7) >>> 10) >>> 5) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) ^ 24293) ^ 16650) + 14040))) - var5) + var5) - var5) - var5))) ^ 15654) + var5) >>> 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) ^ 24293) ^ 16650) + 14040))) - var5) + var5) - var5) - var5))) ^ 15654) + var5) << 1) + '츫') + 30624));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public illIIilIilIIil(IIiiIIIllIiiIIIl width, int setting, int height, int x, int y) {
      this.iilililIiIIiililIi = width;
      this.iliililIiIiiililIi = setting;
      this.liiililIiiiiililIi = height;
      this.IIIIiilIilIIIiilIi = x;
      this.iIIIiilIiIlIIiilIi = y;
      this.IiIIiilIiliIIiilIi = width.Iilllilliill().length();
      this.llIIiilIiilIIiilIi = false;
      this.lIiililIiiIiililIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, (double)0.0F);
   }

   private int IliIlllilIi() {
      long var3 = -1829648551443584688L;
      var3 ^= ((long)(this.liiililIiiiiililIi + 3 + 9 + 7) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(this.liiililIiiiiililIi + this.iIIIiilIiIlIIiilIi - 20 - 3) ^ var3) & -1L >>> 32;
      return Math.min((int)(var3 >>> 32), (int)var3);
   }

   public void IiIlliIliiIl(int height, int y, int x, int width) {
      this.iliililIiIiiililIi = height;
      this.liiililIiiiiililIi = y;
      this.IIIIiilIilIIIiilIi = x;
      this.iIIIiilIiIlIIiilIi = width;
   }

   private static double Illlllllilll(double v) {
      return v < (double)0.0F ? (double)0.0F : (v > (double)1.0F ? (double)1.0F : v);
   }

   private static String IIillIiliIil(String s, float avail) {
      IIliiIlllIliiIll var2 = CorzClient.fontRenderer();
      if (avail <= 0.0F) {
         return "";
      } else if (var2.iIlIlllllill(s) <= avail) {
         return s;
      } else {
         String var3;
         for(var3 = s; var3.length() > 1 && var2.iIlIlllllill(var3) > avail; var3 = var3.substring(0, var3.length() - 1)) {
         }

         return var3;
      }
   }

   private static void IIlllIlliIll(liIliIliiIliIl a, double target) {
      if (Math.abs(a.IiIlliIliiIl() - target) > 0.001) {
         a.lIiiIiIlilli(target);
      }

   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) >>> 13) ^ var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) >>> 13) ^ var5) - var5) >>> 12) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) >>> 13) ^ var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) << 14 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - var5) >>> 2) - 26927) ^ var5) >>> 13) ^ var5) - var5) >>> 12) + var5) >>> 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3015782474406430233L ^ Long.rotateLeft(1940600482341853294L, 35) ^ 6466495145513652182L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5861986288746867302L ^ Long.rotateLeft(-3365017034187973167L, 12) ^ 4139337278422368786L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3822764781874037590L ^ Long.rotateLeft(3404792543312199989L, 9) ^ 2723888850722852264L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4227347995817997648L ^ Long.rotateLeft(-2185717588955276245L, 36) ^ 4603795888906496739L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6989094564329063877L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7993085138565085180L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3210694928191721331L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2626324032704010727L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6572044811567048757L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3479043775848892722L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public boolean IilliliilIIi(int scanCode, int keyCode, int modifiers) {
      if (!this.llIIiilIiilIIiilIi) {
         return false;
      } else {
         String var4 = this.iilililIiIIiililIi.Iilllilliill();
         if (scanCode == 259 && this.IiIIiilIiliIIiilIi > 0) {
            this.iilililIiIIiililIi.IIillIiliIil(var4.substring(0, this.IiIIiilIiliIIiilIi - 1) + var4.substring(this.IiIIiilIiliIIiilIi));
            --this.IiIIiilIiliIIiilIi;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 261 && this.IiIIiilIiliIIiilIi < var4.length()) {
            this.iilililIiIIiililIi.IIillIiliIil(var4.substring(0, this.IiIIiilIiliIIiilIi) + var4.substring(this.IiIIiilIiliIIiilIi + 1));
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 263 && this.IiIIiilIiliIIiilIi > 0) {
            --this.IiIIiilIiliIIiilIi;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 262 && this.IiIIiilIiliIIiilIi < var4.length()) {
            ++this.IiIIiilIiliIIiilIi;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 268) {
            this.IiIIiilIiliIIiilIi = 0;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 269) {
            this.IiIIiilIiliIIiilIi = var4.length();
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode != 257 && scanCode != 256) {
            return false;
         } else {
            this.llIIiilIiilIIiilIi = false;
            return true;
         }
      }
   }

   public void IlIlllIlilIl(boolean focused) {
      this.llIIiilIiilIIiilIi = focused;
      if (focused) {
         this.IiIIiilIiliIIiilIi = this.iilililIiIIiililIi.Iilllilliill().length();
         this.IliililIilliililIi.IliIlllilIi();
      }

   }
}
