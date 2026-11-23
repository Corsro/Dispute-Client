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

public class IIIiIIlilIIiIIli {
   private static final int liIlilIlIi = 4;
   private final liIliIliiIliIl llllilIlIi;
   private final liIliIliiIliIl IillilIlIi;
   private final liIliIliiIliIl illlilIlIi;
   private static final int iiIlilIlIi = 4;
   private int iillilIlIi;
   private boolean IlililIlIi = false;
   private final Iiiliillliiliill IlllilIlIi;
   private boolean llililIlIi = false;
   private static final int iIllilIlIi = 9;
   private static final int lIllilIlIi = 9;
   private final liIliIliiIliIl lillilIlIi;
   private static final int IIllilIlIi = 4;
   private int IIililIlIi;
   private int iIililIlIi;
   private int lIililIlIi;

   private void iliIiiliiiii(double mouseX) {
      double var3 = this.lIiiIiIlilli(mouseX);
      this.IlllilIlIi.IIillIiliIil(var3);
   }

   private void IIIllIIliIIl(double mouseX) {
      double var3 = this.lIiiIiIlilli(mouseX);
      this.IlllilIlIi.Iiilliiliiil(var3);
   }

   public IIIiIIlilIIiIIli(Iiiliillliiliill height, int x, int y, int width, int setting) {
      this.IlllilIlIi = height;
      this.iillilIlIi = x;
      this.IIililIlIi = y;
      this.lIililIlIi = width;
      this.iIililIlIi = setting;
      this.llllilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, height.Iilllilliill());
      this.illlilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, height.Ililllililil());
      this.IillilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, (double)0.0F);
      this.lillilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, (double)0.0F);
   }

   public boolean IiIlliIliiIl(double mouseX, double mouseY) {
      return mouseX >= (double)this.iillilIlIi && mouseX <= (double)(this.iillilIlIi + this.lIililIlIi) && mouseY >= (double)this.IIililIlIi && mouseY <= (double)(this.IIililIlIi + this.iIililIlIi);
   }

   public void iIlIlllllill(double mouseY, double mouseX, int button) {
      if (this.IlililIlIi || this.llililIlIi) {
         double var6 = this.lIiiIiIlilli(mouseY);
         double var8 = this.IlllilIlIi.IiIiliIiiiIi();
         if (this.IlililIlIi) {
            if (var6 > this.IlllilIlIi.Ililllililil() + var8 * (double)0.5F) {
               this.IlililIlIi = false;
               this.llililIlIi = true;
               this.IIIllIIliIIl(mouseY);
            } else {
               this.iliIiiliiiii(mouseY);
            }

         } else {
            if (this.llililIlIi) {
               if (var6 < this.IlllilIlIi.Iilllilliill() - var8 * (double)0.5F) {
                  this.llililIlIi = false;
                  this.IlililIlIi = true;
                  this.iliIiiliiiii(mouseY);
               } else {
                  this.IIIllIIliIIl(mouseY);
               }
            }

         }
      }
   }

   public int IIlllIlliIll() {
      return this.iIililIlIi;
   }

   public void IliIlllilIi(class_332 mouseY, int ctx, int mouseX) {
      long var33 = -4618420212318287754L;
      long var35 = 3270951324135092745L;
      long var27 = 572986142808775084L;
      long var29 = -2651308615450135915L;
      long var31 = -6386449565521392502L;
      String var4 = String.format(Iilllilliill<invokedynamic>(), this.IlllilIlIi.IliIlllilIi(), this.IlllilIlIi.Iilllilliill(), this.IlllilIlIi.Ililllililil());
      CorzClient.fontRenderer().IliIlllilIi(var4, (float)(this.iillilIlIi + 4), (float)(this.IIililIlIi + 4), new Color(-3947581));
      var27 ^= ((long)(this.iillilIlIi + 4) << 32 ^ var27) & -1L << 32;
      var27 ^= ((long)(this.IIililIlIi + 4 + 9 + 9) ^ var27) & -1L >>> 32;
      var29 ^= ((long)(this.lIililIlIi - 8) << 32 ^ var29) & -1L << 32;
      IIiIllIllIiIllIl.Iilllilliill(mouseY, (int)(var27 >>> 32), (int)var27, (int)(var29 >>> 32), 4);
      if (Math.abs(this.llllilIlIi.IiIlliIliiIl() - this.IlllilIlIi.Iilllilliill()) > 0.001) {
         this.llllilIlIi.lIiiIiIlilli(this.IlllilIlIi.Iilllilliill());
      }

      if (Math.abs(this.illlilIlIi.IiIlliIliiIl() - this.IlllilIlIi.Ililllililil()) > 0.001) {
         this.illlilIlIi.lIiiIiIlilli(this.IlllilIlIi.Ililllililil());
      }

      double var8 = this.llllilIlIi.iIlIlllllill();
      double var10 = this.illlilIlIi.iIlIlllllill();
      double var12 = (var8 - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
      double var14 = (var10 - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
      var29 ^= ((long)((int)(var27 >>> 32) + (int)(var12 * (double)((int)(var29 >>> 32)))) ^ var29) & -1L >>> 32;
      var31 ^= ((long)((int)(var27 >>> 32) + (int)(var14 * (double)((int)(var29 >>> 32)))) << 32 ^ var31) & -1L << 32;
      var31 ^= ((long)((int)var27 + 2) ^ var31) & -1L >>> 32;
      var33 ^= ((long)(Math.abs(ctx - (int)var29) < 8 && Math.abs(mouseX - (int)var31) < 8 ? 1 : 0) << 32 ^ var33) & -1L << 32;
      var33 ^= ((long)(Math.abs(ctx - (int)(var31 >>> 32)) < 8 && Math.abs(mouseX - (int)var31) < 8 ? 1 : 0) ^ var33) & -1L >>> 32;
      this.IillilIlIi.lIiiIiIlilli((int)(var33 >>> 32) == 0 && !this.IlililIlIi ? (double)0.0F : (double)1.0F);
      this.lillilIlIi.lIiiIiIlilli((int)var33 == 0 && !this.llililIlIi ? (double)0.0F : (double)1.0F);
      double var21 = this.IillilIlIi.iIlIlllllill();
      double var23 = this.lillilIlIi.iIlIlllllill();
      var35 ^= ((long)Math.min((int)var29, (int)(var31 >>> 32)) << 32 ^ var35) & -1L << 32;
      var35 ^= ((long)Math.abs((int)(var31 >>> 32) - (int)var29) ^ var35) & -1L >>> 32;
      IIiIllIllIiIllIl.IIillIiliIil(mouseY, (int)(var35 >>> 32), (int)var27, (int)var35, 4);
      IIiIllIllIiIllIl.Ililllililil(mouseY, (int)var29, (int)var31, 4, Math.max(var21, this.IlililIlIi ? (double)1.0F : (double)0.0F));
      IIiIllIllIiIllIl.Ililllililil(mouseY, (int)(var31 >>> 32), (int)var31, 4, Math.max(var23, this.llililIlIi ? (double)1.0F : (double)0.0F));
   }

   public boolean liiiIIllIl(double mouseY, double mouseX, int button) {
      long var19 = -9145470668593412588L;
      long var21 = -4433160032299419764L;
      long var23 = -3753283496680226945L;
      if (button != 0) {
         return false;
      } else {
         var19 ^= ((long)(this.iillilIlIi + 4) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)(this.IIililIlIi + 4 + 9 + 9) ^ var19) & -1L >>> 32;
         var21 ^= ((long)(this.lIililIlIi - 8) << 32 ^ var21) & -1L << 32;
         if (mouseY >= (double)((int)(var19 >>> 32)) && mouseY <= (double)((int)(var19 >>> 32) + (int)(var21 >>> 32)) && mouseX >= (double)((int)var19 - 4) && mouseX <= (double)((int)var19 + 4 + 4)) {
            double var9 = (this.IlllilIlIi.Iilllilliill() - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
            double var11 = (this.IlllilIlIi.Ililllililil() - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
            var21 ^= ((long)((int)(var19 >>> 32) + (int)(var9 * (double)((int)(var21 >>> 32)))) ^ var21) & -1L >>> 32;
            var23 ^= ((long)((int)(var19 >>> 32) + (int)(var11 * (double)((int)(var21 >>> 32)))) << 32 ^ var23) & -1L << 32;
            double var15 = Math.abs(mouseY - (double)((int)var21));
            double var17 = Math.abs(mouseY - (double)((int)(var23 >>> 32)));
            if (Math.abs(var15 - var17) < 1.0E-4) {
               if (mouseY < (double)((int)var21)) {
                  this.IlililIlIi = true;
                  this.iliIiiliiiii(mouseY);
               } else {
                  this.llililIlIi = true;
                  this.IIIllIIliIIl(mouseY);
               }

               return true;
            } else {
               if (var15 < var17) {
                  this.IlililIlIi = true;
                  this.iliIiiliiiii(mouseY);
               } else {
                  this.llililIlIi = true;
                  this.IIIllIIliIIl(mouseY);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))))) << 1 | (char)(~((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))))) >>> 15) >>> 6 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))))) << 1 | (char)(~((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))))) >>> 15) << 10) ^ '\uf537') + var5))) - 28264))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3094214276220971803L ^ Long.rotateLeft(8876791800244258653L, 2) ^ -6721405552241012983L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1046621453474756060L ^ Long.rotateLeft(-1606956607088271398L, 20) ^ 5989567995592937965L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3294645986651696688L ^ Long.rotateLeft(-3746840441416047869L, 47) ^ 698744195905714383L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7424915490522089989L ^ Long.rotateLeft(6287724319608439102L, 43) ^ -5343141311337431726L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7554579012509035382L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5266073538845016866L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4055946688550661199L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5429483975942611330L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1378496803643229273L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3391144015308544985L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public void IilliliilIIi(double mouseX, double mouseY, int button) {
      if (button == 0) {
         this.IlililIlIi = false;
         this.llililIlIi = false;
      }

   }

   public boolean Illlllllilll() {
      return this.IlililIlIi || this.llililIlIi;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) >>> 6))) + var5))) >>> 14 | (char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) >>> 6))) + var5))) << 2) ^ 'רּ') >>> 14 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) >>> 6))) + var5))) >>> 14 | (char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') >>> 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 'ꇳ') << 1) ^ 27499))) ^ var5) >>> 6))) + var5))) << 2) ^ 'רּ') << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') >>> 4) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') >>> 4) >>> 10) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') >>> 4) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 15654) << 11 | (char)(var4[var5] ^ 15654) >>> 5) ^ '밸') ^ var5) + var5) ^ 8095) ^ 16389) - '쮙') + '춾') >>> 4) >>> 10) >>> 4) ^ var5))) + '\ue6f8') - 23381) ^ 1197) + '邖'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private double lIiiIiIlilli(double mouseX) {
      long var13 = -6041969314109054915L;
      var13 ^= ((long)(this.iillilIlIi + 4) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(this.lIililIlIi - 8) ^ var13) & -1L >>> 32;
      double var5 = (mouseX - (double)((int)(var13 >>> 32))) / (double)((int)var13);
      var5 = Math.max((double)0.0F, Math.min((double)1.0F, var5));
      double var7 = this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi();
      double var9 = this.IlllilIlIi.IIIilIIiiIIi() + var5 * var7;
      double var11 = this.IlllilIlIi.IiIiliIiiiIi();
      return (double)Math.round(var9 / var11) * var11;
   }

   public void IlIlllIlilIl(int y, int width, int x, int height) {
      this.iillilIlIi = y;
      this.IIililIlIi = width;
      this.lIililIlIi = x;
      this.iIililIlIi = height;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - 16415))) - var5))) + var5) - '\ude91') >>> 11 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - 16415))) - var5))) + var5) - '\ude91') << 5) + 31767) - var5) << 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - 16415))) - var5))) + var5) - '\ude91') >>> 11 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - 16415))) - var5))) + var5) - '\ude91') << 5) + 31767) - var5) >>> 8))) + 19629) - var5) - var5))) ^ '\ueb1e') + var5));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 28883) - 27718) + var5))) + '酮') - 27195) - var5) - 15627) - var5) + var5))) ^ '\uf728') - '\ue19e') + 'ꅺ') + var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 28883) - 27718) + var5))) + '酮') - 27195) - var5) - 15627) - var5) + var5))) ^ '\uf728') - '\ue19e') + 'ꅺ') + var5) >>> 11))) + '樓') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
