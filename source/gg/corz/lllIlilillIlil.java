package gg.corz;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
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
import net.minecraft.class_276;
import net.minecraft.class_310;

public final class lllIlilillIlil {
   private GpuTexture ilIlliiIiIiIlliiIi;
   private int IlilliiIillilliiIi = 0;
   private GpuTexture IlIlliiIillIlliiIi;
   private GpuTextureView iiiIliiIiIIIlliiIi;
   private GpuTexture IiiIliiIiliiIliiIi;
   private GpuTextureView liIlliiIiiiIlliiIi;
   private final GpuTextureView[] iillliiIiIIilliiIi = new GpuTextureView[4];
   private boolean ililliiIiIiilliiIi = false;
   private GpuTexture iIllliiIiIlllliiIi;
   private boolean liilliiIiiiilliiIi = false;
   private final GpuTexture[] IillliiIilillliiIi = new GpuTexture[4];
   public static final int IIiIliiIilIiIliiIi = 4;
   private final class_310 iIiIliiIiIliIliiIi = class_310.method_1551();
   private GpuTextureView IIllliiIilIllliiIi;
   private int lIilliiIiiIilliiIi = 0;
   private GpuTextureView llllliiIiilllliiIi;
   private GpuTexture lliIliiIiiliIliiIi;
   private GpuTextureView lIIlliiIiiIIlliiIi;

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) >>> 7) ^ 30905) ^ var5))) ^ var5) ^ 13206) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) >>> 7) ^ 30905) ^ var5))) ^ var5) ^ 13206) << 1) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) >>> 7) ^ 30905) ^ var5))) ^ var5) ^ 13206) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + '풭') ^ var5) << 7) - 7917) - '鴒') + 5142) >>> 7) ^ 30905) ^ var5))) ^ var5) ^ 13206) << 1) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static GpuTexture IIIilIIiiIIi(String label, int w, int h) {
      return RenderSystem.getDevice().createTexture(() -> label, 13, TextureFormat.DEPTH32, w, h, 1, 1);
   }

   private void Ililllililil(int h, int w) {
      long var4 = 3185742027770283873L;
      if (h != this.lIilliiIiiIilliiIi || w != this.IlilliiIillilliiIi || this.lliIliiIiiliIliiIi == null) {
         this.IlIillIiilIi();
         this.lliIliiIiiliIliiIi = Iiilliiliiil(IIiilIiiiIii<invokedynamic>(), h, w);
         this.iiiIliiIiIIIlliiIi = RenderSystem.getDevice().createTextureView(this.lliIliiIiiliIliiIi);
         this.IiiIliiIiliiIliiIi = Iiilliiliiil(IIiilIiiiIii<invokedynamic>(), h, w);
         this.lIIlliiIiiIIlliiIi = RenderSystem.getDevice().createTextureView(this.IiiIliiIiliiIliiIi);
         this.IlIlliiIillIlliiIi = IIIilIIiiIIi(IIiilIiiiIii<invokedynamic>(), h, w);
         this.liIlliiIiiiIlliiIi = RenderSystem.getDevice().createTextureView(this.IlIlliiIillIlliiIi);
         this.ilIlliiIiIiIlliiIi = IIIilIIiiIIi(IIiilIiiiIii<invokedynamic>(), h, w);
         this.IIllliiIilIllliiIi = RenderSystem.getDevice().createTextureView(this.ilIlliiIiIiIlliiIi);
         this.iIllliiIiIlllliiIi = Iiilliiliiil(IIiilIiiiIii<invokedynamic>(), h, w);
         this.llllliiIiilllliiIi = RenderSystem.getDevice().createTextureView(this.iIllliiIiIlllliiIi);

         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 4; var6 += 4294967296L) {
            this.IillliiIilillliiIi[(int)(var6 >>> 32)] = Iiilliiliiil(IIiilIiiiIii<invokedynamic>() + (int)(var6 >>> 32), h, w);
            this.iillliiIiIIilliiIi[(int)(var6 >>> 32)] = RenderSystem.getDevice().createTextureView(this.IillliiIilillliiIi[(int)(var6 >>> 32)]);
         }

         this.lIilliiIiiIilliiIi = h;
         this.IlilliiIillilliiIi = w;
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(-((char)((char)(-var4[var5]) + var5))) + 15234))))) ^ var5))) + 4955) - var5) >>> 11 | (char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(-((char)((char)(-var4[var5]) + var5))) + 15234))))) ^ var5))) + 4955) - var5) << 5))) - var5) >>> 13 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(-((char)((char)(-var4[var5]) + var5))) + 15234))))) ^ var5))) + 4955) - var5) >>> 11 | (char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(-((char)((char)(-var4[var5]) + var5))) + 15234))))) ^ var5))) + 4955) - var5) << 5))) - var5) << 3) + 26961) - 26291))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) ^ 1741) - var5))) + var5) + var5) - var5))) + '\ue4b5') + var5))))) + '\ue822'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public GpuTextureView iIlIlllllill() {
      return this.iiiIliiIiIIIlliiIi;
   }

   private void IlIillIiilIi() {
      long var2 = 7220774222504938374L;
      this.iiiIliiIiIIIlliiIi = IIlilIliiIli(this.iiiIliiIiIIIlliiIi);
      this.lliIliiIiiliIliiIi = IiIiliIiiiIi(this.lliIliiIiiliIliiIi);
      this.lIIlliiIiiIIlliiIi = IIlilIliiIli(this.lIIlliiIiiIIlliiIi);
      this.IiiIliiIiliiIliiIi = IiIiliIiiiIi(this.IiiIliiIiliiIliiIi);
      this.liIlliiIiiiIlliiIi = IIlilIliiIli(this.liIlliiIiiiIlliiIi);
      this.IlIlliiIillIlliiIi = IiIiliIiiiIi(this.IlIlliiIillIlliiIi);
      this.IIllliiIilIllliiIi = IIlilIliiIli(this.IIllliiIilIllliiIi);
      this.ilIlliiIiIiIlliiIi = IiIiliIiiiIi(this.ilIlliiIiIiIlliiIi);
      this.llllliiIiilllliiIi = IIlilIliiIli(this.llllliiIiilllliiIi);
      this.iIllliiIiIlllliiIi = IiIiliIiiiIi(this.iIllliiIiIlllliiIi);

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 4; var4 += 4294967296L) {
         this.iillliiIiIIilliiIi[(int)(var4 >>> 32)] = IIlilIliiIli(this.iillliiIiIIilliiIi[(int)(var4 >>> 32)]);
         this.IillliiIilillliiIi[(int)(var4 >>> 32)] = IiIiliIiiiIi(this.IillliiIilillliiIi[(int)(var4 >>> 32)]);
      }

   }

   public boolean IiIlliIliiIl() {
      return this.liilliiIiiiilliiIi;
   }

   public GpuTextureView IIIllIIliIIl() {
      return this.llllliiIiilllliiIi;
   }

   public void Iilllilliill() {
      this.ililliiIiIiilliiIi = false;
      this.liilliiIiiiilliiIi = false;
   }

   public GpuTextureView IilliliilIIi() {
      return this.lIIlliiIiiIIlliiIi;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) - 8915)) ^ var5) >>> 9 | (char)((char)((char)((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))) - 8915)) ^ var5) << 7) - '끊') + '鼦') ^ var5))) ^ 28334));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIlllIlliIll() {
      if (this.ililliiIiIiilliiIi) {
         return true;
      } else {
         class_276 var1 = this.iIiIliiIiIliIliiIi.method_1522();
         if (var1 != null && var1.method_30277() != null) {
            this.Ililllililil(var1.field_1482, var1.field_1481);
            CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
            var2.copyTextureToTexture(var1.method_30277(), this.lliIliiIiiliIliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            if (var1.method_30278() != null) {
               var2.copyTextureToTexture(var1.method_30278(), this.IlIlliiIillIlliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            }

            this.ililliiIiIiilliiIi = true;
            this.liilliiIiiiilliiIi = false;
            return true;
         } else {
            return false;
         }
      }
   }

   private static GpuTexture Iiilliiliiil(String label, int w, int h) {
      return RenderSystem.getDevice().createTexture(() -> label, 13, TextureFormat.RGBA8, w, h, 1, 1);
   }

   private static GpuTexture IiIiliIiiiIi(GpuTexture t) {
      if (t != null) {
         t.close();
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2654789615434503631L ^ Long.rotateLeft(-5101329367775197910L, 47) ^ 5093955399094397832L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8377907535521115128L ^ Long.rotateLeft(826185048924344722L, 56) ^ 9095981987656134344L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4197246999997372692L ^ Long.rotateLeft(-2751942733617430738L, 22) ^ 2697657501907258490L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7879558088204210056L ^ Long.rotateLeft(-1964809701002343981L, 51) ^ 9029283407419631944L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3665893794292721341L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8369295074882114309L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6304310103650096959L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2008436395687234660L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2810953693507279661L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7862326049812372863L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   public void IIillIiliIil() {
      this.IlIillIiilIi();
      this.lIilliiIiiIilliiIi = 0;
      this.IlilliiIillilliiIi = 0;
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6))) - var5))) << 2 | (char)(~((char)((char)(-((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6))) - var5))) >>> 14)) - 31881))) ^ 12444) >>> 8 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6))) - var5))) << 2 | (char)(~((char)((char)(-((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6))) - var5))) >>> 14)) - 31881))) ^ 12444) << 8))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IliIlllilIi() {
      return this.lIilliiIiiIilliiIi;
   }

   public int liiiIIllIl() {
      return this.IlilliiIillilliiIi;
   }

   private static GpuTextureView IIlilIliiIli(GpuTextureView v) {
      if (v != null) {
         v.close();
      }

      return null;
   }

   public GpuTextureView iliIiiliiiii() {
      return this.IIllliiIilIllliiIi;
   }

   public GpuTextureView IlIlllIlilIl(int slot) {
      return this.iillliiIiIIilliiIi[slot];
   }

   public boolean Illlllllilll() {
      if (!this.ililliiIiIiilliiIi) {
         return false;
      } else if (this.liilliiIiiiilliiIi) {
         return true;
      } else {
         class_276 var1 = this.iIiIliiIiIliIliiIi.method_1522();
         if (var1 != null && var1.method_30277() != null) {
            this.Ililllililil(var1.field_1482, var1.field_1481);
            CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
            var2.copyTextureToTexture(var1.method_30277(), this.IiiIliiIiliiIliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            if (var1.method_30278() != null) {
               var2.copyTextureToTexture(var1.method_30278(), this.ilIlliiIiIiIlliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            }

            this.liilliiIiiiilliiIi = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public GpuTextureView lIiiIiIlilli() {
      return this.liIlliiIiiiIlliiIi;
   }
}
