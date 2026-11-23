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
import org.lwjgl.glfw.GLFW;

public class IiiIllIlliiIllIl {
   private final liIliIliiIliIl iIIlliIiIl;
   private static final int iiiIliIiIl = 5;
   private static final int IiiIliIiIl = 4;
   private int IlIlliIiIl;
   private int IiIlliIiIl;
   private int ilIlliIiIl;
   private final iiiiIilIIIIlil lIIlliIiIl;
   private final illlIlIlIillIlIl IIIlliIiIl;
   private int llIlliIiIl;
   private static final int liiIliIiIl = 18;

   private int Illlllllilll(int t, int c1, double c2) {
      long var17 = 4059096190004416347L;
      long var19 = 4757989968383674274L;
      long var13 = 5767137358594013156L;
      long var15 = -3867879085635099385L;
      c2 = Math.max((double)0.0F, Math.min((double)1.0F, c2));
      var13 ^= ((long)(t >> 24 & 255) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(t >> 16 & 255) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(t >> 8 & 255) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(t & 255) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(c1 >> 24 & 255) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(c1 >> 16 & 255) ^ var17) & -1L >>> 32;
      var19 ^= ((long)(c1 >> 8 & 255) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(c1 & 255) ^ var19) & -1L >>> 32;
      return (int)((double)((int)(var13 >>> 32)) + (double)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * c2) << 24 | (int)((double)((int)var13) + (double)((int)var17 - (int)var13) * c2) << 16 | (int)((double)((int)(var15 >>> 32)) + (double)((int)(var19 >>> 32) - (int)(var15 >>> 32)) * c2) << 8 | (int)((double)((int)var15) + (double)((int)var19 - (int)var15) * c2);
   }

   private int[] IilliliilIIi() {
      long var6 = -7255121403970619659L;
      long var8 = -6065428711841983978L;
      IIliiIlllIliiIll var1 = CorzClient.fontRenderer();
      var6 ^= ((long)Math.max((int)var1.iIlIlllllill(this.IliIlllilIi()), (int)var1.iIlIlllllill(Iilllilliill<invokedynamic>())) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.min(this.ilIlliIiIl - 8, Math.max(56, (int)(var6 >>> 32) + 18)) ^ var6) & -1L >>> 32;
      var8 ^= ((long)(this.IlIlliIiIl + this.ilIlliIiIl - 4 - (int)var6) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(this.llIlliIiIl + this.IiIlliIiIl / 2 - 9) ^ var8) & -1L >>> 32;
      return new int[]{(int)(var8 >>> 32), (int)var8, (int)var6, 18};
   }

   public void IlIlllIlilIl(int glfwButton) {
      this.IIIlliIiIl.Iiilliiliiil(IlIiliIlllIiliIl.iIlIlllllill(glfwButton));
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28916) + var5) << 3 | (char)((char)(var4[var5] ^ 28916) + var5) >>> 13) - var5) ^ 18006) - '뼤') >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 28916) + var5) << 3 | (char)((char)(var4[var5] ^ 28916) + var5) >>> 13) - var5) ^ 18006) - '뼤') << 10) ^ var5) ^ var5))) + '테'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll(int height, int x, int y, int width) {
      this.IlIlliIiIl = height;
      this.llIlliIiIl = x;
      this.ilIlliIiIl = y;
      this.IiIlliIiIl = width;
   }

   private static String liiiIIllIl() {
      long var1 = 9058485758169882063L;
      var1 ^= ((long)((int)(System.currentTimeMillis() / 400L % 4L)) << 32 ^ var1) & -1L << 32;
      return Iilllilliill<invokedynamic>() + Iilllilliill<invokedynamic>().repeat((int)(var1 >>> 32));
   }

   private String iIlIlllllill(boolean capturing) {
      return capturing ? liiiIIllIl() : this.IliIlllilIi();
   }

   public IiiIllIlliiIllIl(illlIlIlIillIlIl height, int setting, int x, int host, int y, iiiiIilIIIIlil width) {
      this.iIIlliIiIl = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 180, (double)0.0F);
      this.IIIlliIiIl = height;
      this.lIIlliIiIl = width;
      this.IlIlliIiIl = setting;
      this.llIlliIiIl = x;
      this.ilIlliIiIl = host;
      this.IiIlliIiIl = y;
   }

   public boolean iliIiiliiiii(double my, double mx, int button) {
      if (button != 0) {
         return false;
      } else {
         int[] var6 = this.IilliliilIIi();
         if (my >= (double)var6[0] && my <= (double)(var6[0] + var6[2]) && mx >= (double)var6[1] && mx <= (double)(var6[1] + var6[3])) {
            this.lIIlliIiIl.IliIlllilIi(this);
            return true;
         } else {
            return false;
         }
      }
   }

   public void IIIllIIliIIl(int key) {
      this.IIIlliIiIl.Iiilliiliiil(IlIiliIlllIiliIl.IilliliilIIi(key) ? -1 : key);
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8913873679534993598L ^ Long.rotateLeft(1286723071216424365L, 28) ^ 5559631270212102823L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4947437326513411420L ^ Long.rotateLeft(8200579808011116331L, 31) ^ 2660022632374481945L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 118679015983483351L ^ Long.rotateLeft(8185075841120965808L, 47) ^ -4262191677018468760L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3195224434549507219L ^ Long.rotateLeft(6717592597103044168L, 38) ^ 280010521932280956L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2866544434070531371L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8259475434119741352L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -866914769711938304L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7090726791937495589L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2132922525498628395L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8929473152028454398L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIilIIiiIIi<invokedynamic>());
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

   public void lIiiIiIlilli(class_332 ctx, int mouseX, int mouseY) {
      long var32 = -5727498468624343344L;
      long var22 = -8077169092694543999L;
      long var24 = 4140235093653687993L;
      long var26 = -4148936992419272538L;
      long var28 = 2562100490991959871L;
      long var30 = -3207062955396090553L;
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      var22 ^= ((long)((int)var4.IilliliilIIi()) << 32 ^ var22) & -1L << 32;
      var4.IliIlllilIi(this.IIIlliIiIl.IliIlllilIi(), (float)(this.IlIlliIiIl + 4), (float)var4.IlIillIiilIi(this.llIlliIiIl, this.IiIlliIiIl), new Color(-3947581));
      var22 ^= ((long)this.lIIlliIiIl.liiiIIllIl(this) ^ var22) & -1L >>> 32;
      int[] var7 = this.IilliliilIIi();
      var24 ^= ((long)var7[0] << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)var7[1] ^ var24) & -1L >>> 32;
      var26 ^= ((long)var7[2] << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)var7[3] ^ var26) & -1L >>> 32;
      var28 ^= ((long)(mouseX >= (int)(var24 >>> 32) && mouseX <= (int)(var24 >>> 32) + (int)(var26 >>> 32) && mouseY >= (int)var24 && mouseY <= (int)var24 + (int)var26 ? 1 : 0) << 32 ^ var28) & -1L << 32;
      if (Math.abs(this.iIIlliIiIl.IiIlliIliiIl() - (double)((int)(var28 >>> 32) != 0 ? 1 : 0)) > 0.01) {
         this.iIIlliIiIl.lIiiIiIlilli((int)(var28 >>> 32) != 0 ? (double)1.0F : (double)0.0F);
      }

      double var13 = this.iIIlliIiIl.iIlIlllllill();
      double var15 = (int)var22 != 0 ? (double)1.0F : var13;
      var28 ^= ((long)this.Illlllllilll(-15461350, -14737624, var13) ^ var28) & -1L >>> 32;
      var30 ^= ((long)IIIiiIillIIiiIil.IlIillIiilIi(var15) << 32 ^ var30) & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(ctx, (int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32), (int)var26, 5, (int)var28, (int)(var30 >>> 32));
      String var19 = this.iIlIlllllill((boolean)((int)var22));
      var30 ^= ((long)((int)var22 != 0 ? IlIIilIlllIIilIl.lliiIlliIl : this.Illlllllilll(-1, IlIIilIlllIIilIl.lliiIlliIl, var13 * 0.8)) ^ var30) & -1L >>> 32;
      var32 ^= ((long)((int)var4.iIlIlllllill(var19)) << 32 ^ var32) & -1L << 32;
      var4.IliIlllilIi(var19, (float)((int)(var24 >>> 32) + ((int)(var26 >>> 32) - (int)(var32 >>> 32)) / 2), (float)var4.IlIillIiilIi((int)var24, (int)var26), new Color((int)var30, true));
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) << 14) + '켑'))))) ^ var5) >>> 8 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) << 14) + '켑'))))) ^ var5) << 8) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) << 14) + '켑'))))) ^ var5) >>> 8 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '탐') + '\uf243'))) + var5) << 15) + var5) ^ 26877) + var5) << 14) + '켑'))))) ^ var5) << 8) << 11) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IiIlliIliiIl() {
      return this.IiIlliIiIl;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)(-var4[var5]) + var5))) - var5))))) - var5) ^ '鵃') ^ 6296) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String IliIlllilIi() {
      long var4 = 2396644437702369490L;
      var4 ^= ((long)this.IIIlliIiIl.Ililllililil() << 32 ^ var4) & -1L << 32;
      String var2 = IlIiliIlllIiliIl.IlIlllIlilIl((int)(var4 >>> 32));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = GLFW.glfwGetKeyName((int)(var4 >>> 32), 0);
         return var3 != null ? var3.toUpperCase() : IlIiliIlllIiliIl.IIIllIIliIIl((int)(var4 >>> 32));
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\uf54b') - var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] ^ '\uf54b') - var5) ^ var5) >>> 1))) ^ 8313) + var5) + 24228) ^ '职') + var5) + 19521) + var5) + '蔰') ^ 18939) + '\ue41c') - var5) - '밼'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) ^ var5) + 24898) - 12508) ^ var5) - var5) ^ '\ue40b') ^ '跮') - '薴') + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
